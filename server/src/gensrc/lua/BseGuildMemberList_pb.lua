-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseGuildMemberList_pb', package.seeall)


local BSEGUILDMEMBERLIST = protobuf.Descriptor();
local BSEGUILDMEMBERLIST_MEMBERS_FIELD = protobuf.FieldDescriptor();

BSEGUILDMEMBERLIST_MEMBERS_FIELD.name = "members"
BSEGUILDMEMBERLIST_MEMBERS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildMemberList.members"
BSEGUILDMEMBERLIST_MEMBERS_FIELD.number = 1
BSEGUILDMEMBERLIST_MEMBERS_FIELD.index = 0
BSEGUILDMEMBERLIST_MEMBERS_FIELD.label = 3
BSEGUILDMEMBERLIST_MEMBERS_FIELD.has_default_value = false
BSEGUILDMEMBERLIST_MEMBERS_FIELD.default_value = {}
BSEGUILDMEMBERLIST_MEMBERS_FIELD.message_type = GUILDMEMBER_PB_GUILDMEMBER
BSEGUILDMEMBERLIST_MEMBERS_FIELD.type = 11
BSEGUILDMEMBERLIST_MEMBERS_FIELD.cpp_type = 10

BSEGUILDMEMBERLIST.name = "BseGuildMemberList"
BSEGUILDMEMBERLIST.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildMemberList"
BSEGUILDMEMBERLIST.nested_types = {}
BSEGUILDMEMBERLIST.enum_types = {}
BSEGUILDMEMBERLIST.fields = {BSEGUILDMEMBERLIST_MEMBERS_FIELD}
BSEGUILDMEMBERLIST.is_extendable = false
BSEGUILDMEMBERLIST.extensions = {}

BseGuildMemberList = protobuf.Message(BSEGUILDMEMBERLIST)
_G.BSEGUILDMEMBERLIST_PB_BSEGUILDMEMBERLIST = BSEGUILDMEMBERLIST
