-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceUserStatusList_pb', package.seeall)


local BCEUSERSTATUSLIST = protobuf.Descriptor();
local BCEUSERSTATUSLIST_LIMIT_FIELD = protobuf.FieldDescriptor();

BCEUSERSTATUSLIST_LIMIT_FIELD.name = "limit"
BCEUSERSTATUSLIST_LIMIT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceUserStatusList.limit"
BCEUSERSTATUSLIST_LIMIT_FIELD.number = 1
BCEUSERSTATUSLIST_LIMIT_FIELD.index = 0
BCEUSERSTATUSLIST_LIMIT_FIELD.label = 1
BCEUSERSTATUSLIST_LIMIT_FIELD.has_default_value = true
BCEUSERSTATUSLIST_LIMIT_FIELD.default_value = 100
BCEUSERSTATUSLIST_LIMIT_FIELD.type = 5
BCEUSERSTATUSLIST_LIMIT_FIELD.cpp_type = 1

BCEUSERSTATUSLIST.name = "BceUserStatusList"
BCEUSERSTATUSLIST.full_name = ".com.xinqihd.sns.gameserver.proto.BceUserStatusList"
BCEUSERSTATUSLIST.nested_types = {}
BCEUSERSTATUSLIST.enum_types = {}
BCEUSERSTATUSLIST.fields = {BCEUSERSTATUSLIST_LIMIT_FIELD}
BCEUSERSTATUSLIST.is_extendable = false
BCEUSERSTATUSLIST.extensions = {}

BceUserStatusList = protobuf.Message(BCEUSERSTATUSLIST)
_G.BCEUSERSTATUSLIST_PB_BCEUSERSTATUSLIST = BCEUSERSTATUSLIST

