-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseFuncUnlock_pb', package.seeall)


local FUNCUNLOCK = protobuf.Descriptor();
local FUNCUNLOCK_FUNCTYPE_FIELD = protobuf.FieldDescriptor();
local FUNCUNLOCK_FUNCVALUE_FIELD = protobuf.FieldDescriptor();
local FUNCUNLOCK_FUNCDESC_FIELD = protobuf.FieldDescriptor();
local BSEFUNCUNLOCK = protobuf.Descriptor();
local BSEFUNCUNLOCK_ISNEW_FIELD = protobuf.FieldDescriptor();
local BSEFUNCUNLOCK_UNLOCKS_FIELD = protobuf.FieldDescriptor();

FUNCUNLOCK_FUNCTYPE_FIELD.name = "functype"
FUNCUNLOCK_FUNCTYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.FuncUnlock.functype"
FUNCUNLOCK_FUNCTYPE_FIELD.number = 1
FUNCUNLOCK_FUNCTYPE_FIELD.index = 0
FUNCUNLOCK_FUNCTYPE_FIELD.label = 2
FUNCUNLOCK_FUNCTYPE_FIELD.has_default_value = false
FUNCUNLOCK_FUNCTYPE_FIELD.default_value = 0
FUNCUNLOCK_FUNCTYPE_FIELD.type = 5
FUNCUNLOCK_FUNCTYPE_FIELD.cpp_type = 1

FUNCUNLOCK_FUNCVALUE_FIELD.name = "funcvalue"
FUNCUNLOCK_FUNCVALUE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.FuncUnlock.funcvalue"
FUNCUNLOCK_FUNCVALUE_FIELD.number = 2
FUNCUNLOCK_FUNCVALUE_FIELD.index = 1
FUNCUNLOCK_FUNCVALUE_FIELD.label = 2
FUNCUNLOCK_FUNCVALUE_FIELD.has_default_value = false
FUNCUNLOCK_FUNCVALUE_FIELD.default_value = 0
FUNCUNLOCK_FUNCVALUE_FIELD.type = 5
FUNCUNLOCK_FUNCVALUE_FIELD.cpp_type = 1

FUNCUNLOCK_FUNCDESC_FIELD.name = "funcdesc"
FUNCUNLOCK_FUNCDESC_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.FuncUnlock.funcdesc"
FUNCUNLOCK_FUNCDESC_FIELD.number = 3
FUNCUNLOCK_FUNCDESC_FIELD.index = 2
FUNCUNLOCK_FUNCDESC_FIELD.label = 1
FUNCUNLOCK_FUNCDESC_FIELD.has_default_value = false
FUNCUNLOCK_FUNCDESC_FIELD.default_value = ""
FUNCUNLOCK_FUNCDESC_FIELD.type = 9
FUNCUNLOCK_FUNCDESC_FIELD.cpp_type = 9

FUNCUNLOCK.name = "FuncUnlock"
FUNCUNLOCK.full_name = ".com.xinqihd.sns.gameserver.proto.FuncUnlock"
FUNCUNLOCK.nested_types = {}
FUNCUNLOCK.enum_types = {}
FUNCUNLOCK.fields = {FUNCUNLOCK_FUNCTYPE_FIELD, FUNCUNLOCK_FUNCVALUE_FIELD, FUNCUNLOCK_FUNCDESC_FIELD}
FUNCUNLOCK.is_extendable = false
FUNCUNLOCK.extensions = {}
BSEFUNCUNLOCK_ISNEW_FIELD.name = "isnew"
BSEFUNCUNLOCK_ISNEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFuncUnlock.isnew"
BSEFUNCUNLOCK_ISNEW_FIELD.number = 1
BSEFUNCUNLOCK_ISNEW_FIELD.index = 0
BSEFUNCUNLOCK_ISNEW_FIELD.label = 1
BSEFUNCUNLOCK_ISNEW_FIELD.has_default_value = true
BSEFUNCUNLOCK_ISNEW_FIELD.default_value = false
BSEFUNCUNLOCK_ISNEW_FIELD.type = 8
BSEFUNCUNLOCK_ISNEW_FIELD.cpp_type = 7

BSEFUNCUNLOCK_UNLOCKS_FIELD.name = "unlocks"
BSEFUNCUNLOCK_UNLOCKS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseFuncUnlock.unlocks"
BSEFUNCUNLOCK_UNLOCKS_FIELD.number = 2
BSEFUNCUNLOCK_UNLOCKS_FIELD.index = 1
BSEFUNCUNLOCK_UNLOCKS_FIELD.label = 3
BSEFUNCUNLOCK_UNLOCKS_FIELD.has_default_value = false
BSEFUNCUNLOCK_UNLOCKS_FIELD.default_value = {}
BSEFUNCUNLOCK_UNLOCKS_FIELD.message_type = FUNCUNLOCK
BSEFUNCUNLOCK_UNLOCKS_FIELD.type = 11
BSEFUNCUNLOCK_UNLOCKS_FIELD.cpp_type = 10

BSEFUNCUNLOCK.name = "BseFuncUnlock"
BSEFUNCUNLOCK.full_name = ".com.xinqihd.sns.gameserver.proto.BseFuncUnlock"
BSEFUNCUNLOCK.nested_types = {}
BSEFUNCUNLOCK.enum_types = {}
BSEFUNCUNLOCK.fields = {BSEFUNCUNLOCK_ISNEW_FIELD, BSEFUNCUNLOCK_UNLOCKS_FIELD}
BSEFUNCUNLOCK.is_extendable = false
BSEFUNCUNLOCK.extensions = {}

BseFuncUnlock = protobuf.Message(BSEFUNCUNLOCK)
FuncUnlock = protobuf.Message(FUNCUNLOCK)
_G.BSEFUNCUNLOCK_PB_BSEFUNCUNLOCK = BSEFUNCUNLOCK
_G.FUNCUNLOCK_PB_FUNCUNLOCK = FUNCUNLOCK

