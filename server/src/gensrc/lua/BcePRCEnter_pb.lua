-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BcePRCEnter_pb', package.seeall)


local BCEPRCENTER = protobuf.Descriptor();
local BCEPRCENTER_PRCID_FIELD = protobuf.FieldDescriptor();
local BCEPRCENTER_PRCNAME_FIELD = protobuf.FieldDescriptor();

BCEPRCENTER_PRCID_FIELD.name = "prcID"
BCEPRCENTER_PRCID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BcePRCEnter.prcID"
BCEPRCENTER_PRCID_FIELD.number = 1
BCEPRCENTER_PRCID_FIELD.index = 0
BCEPRCENTER_PRCID_FIELD.label = 2
BCEPRCENTER_PRCID_FIELD.has_default_value = false
BCEPRCENTER_PRCID_FIELD.default_value = 0
BCEPRCENTER_PRCID_FIELD.type = 5
BCEPRCENTER_PRCID_FIELD.cpp_type = 1

BCEPRCENTER_PRCNAME_FIELD.name = "prcName"
BCEPRCENTER_PRCNAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BcePRCEnter.prcName"
BCEPRCENTER_PRCNAME_FIELD.number = 2
BCEPRCENTER_PRCNAME_FIELD.index = 1
BCEPRCENTER_PRCNAME_FIELD.label = 2
BCEPRCENTER_PRCNAME_FIELD.has_default_value = false
BCEPRCENTER_PRCNAME_FIELD.default_value = ""
BCEPRCENTER_PRCNAME_FIELD.type = 9
BCEPRCENTER_PRCNAME_FIELD.cpp_type = 9

BCEPRCENTER.name = "BcePRCEnter"
BCEPRCENTER.full_name = ".com.xinqihd.sns.gameserver.proto.BcePRCEnter"
BCEPRCENTER.nested_types = {}
BCEPRCENTER.enum_types = {}
BCEPRCENTER.fields = {BCEPRCENTER_PRCID_FIELD, BCEPRCENTER_PRCNAME_FIELD}
BCEPRCENTER.is_extendable = false
BCEPRCENTER.extensions = {}

BcePRCEnter = protobuf.Message(BCEPRCENTER)
_G.BCEPRCENTER_PB_BCEPRCENTER = BCEPRCENTER

