-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceGuildContributeQuery_pb', package.seeall)


local BCEGUILDCONTRIBUTEQUERY = protobuf.Descriptor();
local BCEGUILDCONTRIBUTEQUERY_GUILDID_FIELD = protobuf.FieldDescriptor();
local BCEGUILDCONTRIBUTEQUERY_YUANBAO_FIELD = protobuf.FieldDescriptor();
local BCEGUILDCONTRIBUTEQUERY_GOLDEN_FIELD = protobuf.FieldDescriptor();

BCEGUILDCONTRIBUTEQUERY_GUILDID_FIELD.name = "guildID"
BCEGUILDCONTRIBUTEQUERY_GUILDID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildContributeQuery.guildID"
BCEGUILDCONTRIBUTEQUERY_GUILDID_FIELD.number = 1
BCEGUILDCONTRIBUTEQUERY_GUILDID_FIELD.index = 0
BCEGUILDCONTRIBUTEQUERY_GUILDID_FIELD.label = 1
BCEGUILDCONTRIBUTEQUERY_GUILDID_FIELD.has_default_value = false
BCEGUILDCONTRIBUTEQUERY_GUILDID_FIELD.default_value = ""
BCEGUILDCONTRIBUTEQUERY_GUILDID_FIELD.type = 9
BCEGUILDCONTRIBUTEQUERY_GUILDID_FIELD.cpp_type = 9

BCEGUILDCONTRIBUTEQUERY_YUANBAO_FIELD.name = "yuanbao"
BCEGUILDCONTRIBUTEQUERY_YUANBAO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildContributeQuery.yuanbao"
BCEGUILDCONTRIBUTEQUERY_YUANBAO_FIELD.number = 2
BCEGUILDCONTRIBUTEQUERY_YUANBAO_FIELD.index = 1
BCEGUILDCONTRIBUTEQUERY_YUANBAO_FIELD.label = 1
BCEGUILDCONTRIBUTEQUERY_YUANBAO_FIELD.has_default_value = false
BCEGUILDCONTRIBUTEQUERY_YUANBAO_FIELD.default_value = 0
BCEGUILDCONTRIBUTEQUERY_YUANBAO_FIELD.type = 13
BCEGUILDCONTRIBUTEQUERY_YUANBAO_FIELD.cpp_type = 3

BCEGUILDCONTRIBUTEQUERY_GOLDEN_FIELD.name = "golden"
BCEGUILDCONTRIBUTEQUERY_GOLDEN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildContributeQuery.golden"
BCEGUILDCONTRIBUTEQUERY_GOLDEN_FIELD.number = 3
BCEGUILDCONTRIBUTEQUERY_GOLDEN_FIELD.index = 2
BCEGUILDCONTRIBUTEQUERY_GOLDEN_FIELD.label = 1
BCEGUILDCONTRIBUTEQUERY_GOLDEN_FIELD.has_default_value = false
BCEGUILDCONTRIBUTEQUERY_GOLDEN_FIELD.default_value = 0
BCEGUILDCONTRIBUTEQUERY_GOLDEN_FIELD.type = 13
BCEGUILDCONTRIBUTEQUERY_GOLDEN_FIELD.cpp_type = 3

BCEGUILDCONTRIBUTEQUERY.name = "BceGuildContributeQuery"
BCEGUILDCONTRIBUTEQUERY.full_name = ".com.xinqihd.sns.gameserver.proto.BceGuildContributeQuery"
BCEGUILDCONTRIBUTEQUERY.nested_types = {}
BCEGUILDCONTRIBUTEQUERY.enum_types = {}
BCEGUILDCONTRIBUTEQUERY.fields = {BCEGUILDCONTRIBUTEQUERY_GUILDID_FIELD, BCEGUILDCONTRIBUTEQUERY_YUANBAO_FIELD, BCEGUILDCONTRIBUTEQUERY_GOLDEN_FIELD}
BCEGUILDCONTRIBUTEQUERY.is_extendable = false
BCEGUILDCONTRIBUTEQUERY.extensions = {}

BceGuildContributeQuery = protobuf.Message(BCEGUILDCONTRIBUTEQUERY)
_G.BCEGUILDCONTRIBUTEQUERY_PB_BCEGUILDCONTRIBUTEQUERY = BCEGUILDCONTRIBUTEQUERY
