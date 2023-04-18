pub mod setup;
use std::str::FromStr;

use cw_common::types::PortId;
use cw_ibc_core::{
    context::CwIbcCoreContext, ics04_channel::ChannelMsg, keccak256, MsgChannelOpenInit,
};
use setup::*;

#[test]
fn test_store_module_by_port() {
    let mut deps = deps();
    let ctx = CwIbcCoreContext::default();
    let module_id =
        ibc::core::ics26_routing::context::ModuleId::from_str("contractaddress").unwrap();
    let port_id = PortId::default();
    ctx.store_module_by_port(&mut deps.storage, port_id.clone(), module_id.clone())
        .unwrap();

    let result = ctx.lookup_module_by_port(&mut deps.storage, port_id);
    assert_eq!(result.unwrap(), module_id);
}

#[test]
#[should_panic(expected = "error: UnknownPort { port_id: PortId(\"defaultPort\")")]
fn test_store_module_by_port_fail() {
    let mut deps = deps();
    let ctx = CwIbcCoreContext::default();
    let module_id =
        ibc::core::ics26_routing::context::ModuleId::from_str("contractaddress").unwrap();
    let port_id = PortId::default();

    let result = ctx.lookup_module_by_port(&mut deps.storage, port_id);
    assert_eq!(result.unwrap(), module_id);
}

#[test]
fn check_for_port_path() {
    let ctx = CwIbcCoreContext::default();

    let port_id = PortId::default();
    let port_path = ctx.port_path(port_id.ibc_port_id());

    assert_eq!("ports/defaultPort", String::from_utf8(port_path).unwrap())
}

#[test]
fn check_for_port_path_key() {
    let ctx = CwIbcCoreContext::default();

    let port_id = PortId::default();
    let port_path = ctx.port_path(port_id.ibc_port_id());
    let key = keccak256(port_path.clone());

    let port_path_key = ctx.port_commitment_key(port_id.ibc_port_id());

    assert_eq!(key, port_path_key)
}

#[test]
#[should_panic(
    expected = "DecodeError { error: \"identifier `s` has invalid length `1` must be between `2`-`128` characters\" }"
)]
fn fails_on_invalid_length_for_port_id() {
    PortId::from_str("s").unwrap();
}

#[test]
fn check_for_port_id() {
    let port_id = PortId::from_str("xcall");

    assert!(port_id.is_ok())
}

#[test]
fn test_lookup_module_channel() {
    let mut deps = deps();
    let ctx = CwIbcCoreContext::default();
    let module_id =
        ibc::core::ics26_routing::context::ModuleId::from_str("contractaddress").unwrap();
    let msg = MsgChannelOpenInit::try_from(get_dummy_raw_msg_chan_open_init(None)).unwrap();
    ctx.store_module_by_port(
        &mut deps.storage,
        msg.port_id_on_a.clone().into(),
        module_id.clone(),
    )
    .unwrap();
    let channel_msg = ChannelMsg::OpenInit(msg);
    let res = ctx.lookup_module_channel(&mut deps.storage, &channel_msg);

    assert!(res.is_ok());
    assert_eq!("contractaddress", res.unwrap().to_string())
}

#[test]
#[should_panic(expected = "UnknownPort")]
fn test_lookup_module_channel_fail() {
    let mut deps = deps();
    let ctx = CwIbcCoreContext::default();
    let msg = MsgChannelOpenInit::try_from(get_dummy_raw_msg_chan_open_init(None)).unwrap();
    let channel_msg = ChannelMsg::OpenInit(msg);
    ctx.lookup_module_channel(&mut deps.storage, &channel_msg)
        .unwrap();
}