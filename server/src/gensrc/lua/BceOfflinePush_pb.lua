-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceOfflinePush_pb', package.seeall)


local BCEOFFLINEPUSH = protobuf.Descriptor();
local BCEOFFLINEPUSH_USERID_FIELD = protobuf.FieldDescriptor();
local BCEOFFLINEPUSH_ROLENAME_FIELD = protobuf.FieldDescriptor();
local BCEOFFLINEPUSH_MESSAGE_FIELD = protobuf.FieldDescriptor();

BCEOFFLINEPUSH_USERID_FIELD.name = "userid"
BCEOFFLINEPUSH_USERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceOfflinePush.userid"
BCEOFFLINEPUSH_USERID_FIELD.number = 1
BCEOFFLINEPUSH_USERID_FIELD.index = 0
BCEOFFLINEPUSH_USERID_FIELD.label = 1
BCEOFFLINEPUSH_USERID_FIELD.has_default_value = false
BCEOFFLINEPUSH_USERID_FIELD.default_value = ""
BCEOFFLINEPUSH_USERID_FIELD.type = 9
BCEOFFLINEPUSH_USERID_FIELD.cpp_type = 9

BCEOFFLINEPUSH_ROLENAME_FIELD.name = "rolename"
BCEOFFLINEPUSH_ROLENAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceOfflinePush.rolename"
BCEOFFLINEPUSH_ROLENAME_FIELD.number = 2
BCEOFFLINEPUSH_ROLENAME_FIELD.index = 1
BCEOFFLINEPUSH_ROLENAME_FIELD.label = 1
BCEOFFLINEPUSH_ROLENAME_FIELD.has_default_value = false
BCEOFFLINEPUSH_ROLENAME_FIELD.default_value = ""
BCEOFFLINEPUSH_ROLENAME_FIELD.type = 9
BCEOFFLINEPUSH_ROLENAME_FIELD.cpp_type = 9

BCEOFFLINEPUSH_MESSAGE_FIELD.name = "message"
BCEOFFLINEPUSH_MESSAGE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceOfflinePush.message"
BCEOFFLINEPUSH_MESSAGE_FIELD.number = 3
BCEOFFLINEPUSH_MESSAGE_FIELD.index = 2
BCEOFFLINEPUSH_MESSAGE_FIELD.label = 1
BCEOFFLINEPUSH_MESSAGE_FIELD.has_default_value = false
BCEOFFLINEPUSH_MESSAGE_FIELD.default_value = ""
BCEOFFLINEPUSH_MESSAGE_FIELD.type = 9
BCEOFFLINEPUSH_MESSAGE_FIELD.cpp_type = 9

BCEOFFLINEPUSH.name = "BceOfflinePush"
BCEOFFLINEPUSH.full_name = ".com.xinqihd.sns.gameserver.proto.BceOfflinePush"
BCEOFFLINEPUSH.nested_types = {}
BCEOFFLINEPUSH.enum_types = {}
BCEOFFLINEPUSH.fields = {BCEOFFLINEPUSH_USERID_FIELD, BCEOFFLINEPUSH_ROLENAME_FIELD, BCEOFFLINEPUSH_MESSAGE_FIELD}
BCEOFFLINEPUSH.is_extendable = false
BCEOFFLINEPUSH.extensions = {}

BceOfflinePush = protobuf.Message(BCEOFFLINEPUSH)
_G.BCEOFFLINEPUSH_PB_BCEOFFLINEPUSH = BCEOFFLINEPUSH

