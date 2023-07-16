use crate::EXECUTE_UPDATE_CLIENT;
use crate::{ics03_connection::IbcClient, ContractError};
use cosmwasm_schema::cw_serde;
use cosmwasm_std::{to_binary, CosmosMsg, Deps, QueryRequest, SubMsg};
use cw_common::client_msg::{LightClientPacketMessage, VerifyConnectionState};
use cw_common::client_response::{OpenConfirmResponse, OpenTryResponse};
use cw_common::ibc_types::IbcClientId;
use cw_common::raw_types::Any;
use cw_common::types::{VerifyChannelState, VerifyPacketAcknowledgement, VerifyPacketData, MessageInfo};
use cw_common::{
    client_msg::VerifyConnectionPayload, client_response::OpenAckResponse,
    query_helpers::build_smart_query,
};
use prost::Message;
use cw_common::cw_types::CwEndpoint;

#[cw_serde]
pub struct LightClient {
    address: String,
}

impl LightClient {
    pub fn new(address: String) -> Self {
        Self { address }
    }

    pub fn update_client(
        &self,
        client_id: &IbcClientId,
        header: &Any,
    ) -> Result<SubMsg, ContractError> {
        let exec_message = cw_common::client_msg::ExecuteMsg::UpdateClient {
            client_id: client_id.as_str().to_string(),
            signed_header: header.encode_to_vec(),
        };
        let client_update_message: CosmosMsg = CosmosMsg::Wasm(cosmwasm_std::WasmMsg::Execute {
            contract_addr: self.address.clone(),
            msg: to_binary(&exec_message).map_err(ContractError::Std)?,
            funds: vec![],
        });
        let sub_msg: SubMsg = SubMsg::reply_always(client_update_message, EXECUTE_UPDATE_CLIENT);
        Ok(sub_msg)
    }

    pub fn verify_connection_open_ack(
        &self,
        deps: Deps,
        payload: VerifyConnectionPayload<OpenAckResponse>,
    ) -> Result<(), ContractError> {
        let msg = to_binary(&cw_common::client_msg::QueryMsg::VerifyConnectionOpenAck(
            payload,
        ))
        .unwrap();
        let query = build_smart_query(self.address.clone(), msg);
        let result: bool = deps.querier.query(&query).unwrap_or(false);
        self.to_validation_result(result, "verify connection open ack")
    }

    pub fn verify_connection_open_try(
        &self,
        deps: Deps,
        payload: VerifyConnectionPayload<OpenTryResponse>,
    ) -> Result<(), ContractError> {
        let msg = to_binary(&cw_common::client_msg::QueryMsg::VerifyConnectionOpenTry(
            payload,
        ))
        .unwrap();
        let query = build_smart_query(self.address.clone(), msg);
        let result: bool = deps.querier.query(&query).unwrap_or(false);
        self.to_validation_result(result, "verify connection open try")
    }

    pub fn verify_connection_open_confirm(
        &self,
        deps: Deps,
        verify_connection_state: VerifyConnectionState,
        client_id: &IbcClientId,
        expected_response: OpenConfirmResponse,
    ) -> Result<(), ContractError> {
        let msg = to_binary(&cw_common::client_msg::QueryMsg::VerifyOpenConfirm {
            client_id: client_id.to_string(),
            verify_connection_state,
            expected_response,
        })
        .unwrap();
        let query = build_smart_query(self.address.clone(), msg);
        let result: bool = deps.querier.query(&query).unwrap_or(false);
        self.to_validation_result(result, "verify connection open confirm")
    }

    pub fn verify_packet_acknowledge(
        &self,
        deps: Deps,
        verify_packet_acknowledge: VerifyPacketAcknowledgement,
        client_id: &IbcClientId,
        packet_data: Vec<u8>,
    ) -> Result<(), ContractError> {
        let msg = to_binary(
            &cw_common::client_msg::QueryMsg::VerifyPacketAcknowledgement {
                client_id: client_id.to_string(),
                verify_packet_acknowledge,
                packet_data,
            },
        )
        .unwrap();
        let query = build_smart_query(self.address.clone(), msg);
        let result: bool = deps.querier.query(&query).unwrap_or(false);
        self.to_validation_result(result, "verify packet ack")
    }

    pub fn verify_packet_data(
        &self,
        deps: Deps,
        verify_packet_data: VerifyPacketData,
        client_id: &IbcClientId,
        packet_data: Vec<u8>,
    ) -> Result<(), ContractError> {
        let msg = to_binary(&cw_common::client_msg::QueryMsg::VerifyPacketData {
            client_id: client_id.to_string(),
            verify_packet_data,
            packet_data,
        })
        .unwrap();
        let query = build_smart_query(self.address.clone(), msg);
        let result: bool = deps.querier.query(&query).unwrap_or(false);
        self.to_validation_result(result, "verify packet data")
    }

    pub fn verify_timeout_on_close(
        &self,
        deps: Deps,
        client_id: &IbcClientId,
        verify_channel_state: VerifyChannelState,
        next_seq_recv_verification_result: LightClientPacketMessage,
    ) -> Result<(), ContractError> {
        let msg = to_binary(&cw_common::client_msg::QueryMsg::TimeoutOnCLose {
            client_id: client_id.to_string(),
            verify_channel_state,
            next_seq_recv_verification_result,
        })
        .unwrap();
        let query = build_smart_query(self.address.clone(), msg);
        let result: bool = deps.querier.query(&query).unwrap_or(false);
        self.to_validation_result(result, "verify timeout on close")
    }

    pub fn verify_timeout(
        &self,
        deps: Deps,
        client_id: &IbcClientId,

        next_seq_recv_verification_result: LightClientPacketMessage,
    ) -> Result<(), ContractError> {
        let msg = to_binary(&cw_common::client_msg::QueryMsg::PacketTimeout {
            client_id: client_id.to_string(),
            next_seq_recv_verification_result,
        })
        .unwrap();
        let query = build_smart_query(self.address.clone(), msg);
        let result: bool = deps.querier.query(&query).unwrap_or(false);
        self.to_validation_result(result, "verify timeout on close")
    }

    pub fn verify_channel(
        &self,
        deps: Deps,
        message_info: MessageInfo, endpoint: CwEndpoint, verify_channel_state: VerifyChannelState 
    ) -> Result<(), ContractError> {
        let msg = to_binary(&cw_common::client_msg::QueryMsg::VerifyChannel {
           message_info,
           endpoint,
           verify_channel_state
        })
        .unwrap();
        let query = build_smart_query(self.address.clone(), msg);
        let result: bool = deps.querier.query(&query).unwrap_or(false);
        self.to_validation_result(result, "verify timeout on close")
    }

    pub fn get_address(&self) -> String {
        return self.address.clone();
    }

    pub fn get_client_state(
        &self,
        deps: Deps,
        client_id: &IbcClientId,
    ) -> Result<Vec<u8>, ContractError> {
        let query_message = cw_common::client_msg::QueryMsg::GetClientState {
            client_id: client_id.as_str().to_string(),
        };
        let msg = to_binary(&query_message).unwrap();

        let query = build_smart_query(self.address.clone(), msg);

        let response: Vec<u8> = deps.querier.query(&query).map_err(ContractError::Std)?;
        Ok(response)
    }

    fn to_validation_result(&self, result: bool, msg: &str) -> Result<(), ContractError> {
        match result {
            true => Ok(()),
            false => Err(ContractError::LightClientValidationFailed(msg.to_string())),
        }
    }
}
