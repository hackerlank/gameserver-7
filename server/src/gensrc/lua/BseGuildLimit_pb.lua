-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseGuildLimit_pb', package.seeall)


local BSEGUILDLIMIT = protobuf.Descriptor();
local BSEGUILDLIMIT_RESULT_FIELD = protobuf.FieldDescriptor();
local BSEGUILDLIMIT_GUILDINFO_FIELD = protobuf.FieldDescriptor();

BSEGUILDLIMIT_RESULT_FIELD.name = "result"
BSEGUILDLIMIT_RESULT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildLimit.result"
BSEGUILDLIMIT_RESULT_FIELD.number = 1
BSEGUILDLIMIT_RESULT_FIELD.index = 0
BSEGUILDLIMIT_RESULT_FIELD.label = 1
BSEGUILDLIMIT_RESULT_FIELD.has_default_value = false
BSEGUILDLIMIT_RESULT_FIELD.default_value = 0
BSEGUILDLIMIT_RESULT_FIELD.type = 5
BSEGUILDLIMIT_RESULT_FIELD.cpp_type = 1

BSEGUILDLIMIT_GUILDINFO_FIELD.name = "guildInfo"
BSEGUILDLIMIT_GUILDINFO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildLimit.guildInfo"
BSEGUILDLIMIT_GUILDINFO_FIELD.number = 2
BSEGUILDLIMIT_GUILDINFO_FIELD.index = 1
BSEGUILDLIMIT_GUILDINFO_FIELD.label = 1
BSEGUILDLIMIT_GUILDINFO_FIELD.has_default_value = false
BSEGUILDLIMIT_GUILDINFO_FIELD.default_value = nil
BSEGUILDLIMIT_GUILDINFO_FIELD.message_type = GUILDINFO_PB_GUILDINFO
BSEGUILDLIMIT_GUILDINFO_FIELD.type = 11
BSEGUILDLIMIT_GUILDINFO_FIELD.cpp_type = 10

BSEGUILDLIMIT.name = "BseGuildLimit"
BSEGUILDLIMIT.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildLimit"
BSEGUILDLIMIT.nested_types = {}
BSEGUILDLIMIT.enum_types = {}
BSEGUILDLIMIT.fields = {BSEGUILDLIMIT_RESULT_FIELD, BSEGUILDLIMIT_GUILDINFO_FIELD}
BSEGUILDLIMIT.is_extendable = false
BSEGUILDLIMIT.extensions = {}

BseGuildLimit = protobuf.Message(BSEGUILDLIMIT)
_G.BSEGUILDLIMIT_PB_BSEGUILDLIMIT = BSEGUILDLIMIT
