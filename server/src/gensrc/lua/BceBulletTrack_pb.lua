-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceBulletTrack_pb', package.seeall)


local POINT = protobuf.Descriptor();
local POINT_X_FIELD = protobuf.FieldDescriptor();
local POINT_Y_FIELD = protobuf.FieldDescriptor();
local BULLETTRACK = protobuf.Descriptor();
local BULLETTRACK_HITPOINT_FIELD = protobuf.FieldDescriptor();
local BULLETTRACK_TOPPOINT_FIELD = protobuf.FieldDescriptor();
local BULLETTRACK_FLYINGSECONDS_FIELD = protobuf.FieldDescriptor();
local BULLETTRACK_SPEEDX_FIELD = protobuf.FieldDescriptor();
local BULLETTRACK_SPEEDY_FIELD = protobuf.FieldDescriptor();
local BULLETTRACK_PNGNUM_FIELD = protobuf.FieldDescriptor();
local BULLETTRACK_RESULT_FIELD = protobuf.FieldDescriptor();
local BCEBULLETTRACK = protobuf.Descriptor();
local BCEBULLETTRACK_ROUNDNO_FIELD = protobuf.FieldDescriptor();
local BCEBULLETTRACK_BULLETTRACKS_FIELD = protobuf.FieldDescriptor();
local BCEBULLETTRACK_SESSIONID_FIELD = protobuf.FieldDescriptor();

POINT_X_FIELD.name = "x"
POINT_X_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Point.x"
POINT_X_FIELD.number = 1
POINT_X_FIELD.index = 0
POINT_X_FIELD.label = 2
POINT_X_FIELD.has_default_value = false
POINT_X_FIELD.default_value = 0
POINT_X_FIELD.type = 5
POINT_X_FIELD.cpp_type = 1

POINT_Y_FIELD.name = "y"
POINT_Y_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Point.y"
POINT_Y_FIELD.number = 2
POINT_Y_FIELD.index = 1
POINT_Y_FIELD.label = 2
POINT_Y_FIELD.has_default_value = false
POINT_Y_FIELD.default_value = 0
POINT_Y_FIELD.type = 5
POINT_Y_FIELD.cpp_type = 1

POINT.name = "Point"
POINT.full_name = ".com.xinqihd.sns.gameserver.proto.Point"
POINT.nested_types = {}
POINT.enum_types = {}
POINT.fields = {POINT_X_FIELD, POINT_Y_FIELD}
POINT.is_extendable = false
POINT.extensions = {}
BULLETTRACK_HITPOINT_FIELD.name = "hitpoint"
BULLETTRACK_HITPOINT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BulletTrack.hitpoint"
BULLETTRACK_HITPOINT_FIELD.number = 1
BULLETTRACK_HITPOINT_FIELD.index = 0
BULLETTRACK_HITPOINT_FIELD.label = 1
BULLETTRACK_HITPOINT_FIELD.has_default_value = false
BULLETTRACK_HITPOINT_FIELD.default_value = nil
BULLETTRACK_HITPOINT_FIELD.message_type = POINT
BULLETTRACK_HITPOINT_FIELD.type = 11
BULLETTRACK_HITPOINT_FIELD.cpp_type = 10

BULLETTRACK_TOPPOINT_FIELD.name = "toppoint"
BULLETTRACK_TOPPOINT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BulletTrack.toppoint"
BULLETTRACK_TOPPOINT_FIELD.number = 2
BULLETTRACK_TOPPOINT_FIELD.index = 1
BULLETTRACK_TOPPOINT_FIELD.label = 1
BULLETTRACK_TOPPOINT_FIELD.has_default_value = false
BULLETTRACK_TOPPOINT_FIELD.default_value = nil
BULLETTRACK_TOPPOINT_FIELD.message_type = POINT
BULLETTRACK_TOPPOINT_FIELD.type = 11
BULLETTRACK_TOPPOINT_FIELD.cpp_type = 10

BULLETTRACK_FLYINGSECONDS_FIELD.name = "flyingSeconds"
BULLETTRACK_FLYINGSECONDS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BulletTrack.flyingSeconds"
BULLETTRACK_FLYINGSECONDS_FIELD.number = 3
BULLETTRACK_FLYINGSECONDS_FIELD.index = 2
BULLETTRACK_FLYINGSECONDS_FIELD.label = 1
BULLETTRACK_FLYINGSECONDS_FIELD.has_default_value = true
BULLETTRACK_FLYINGSECONDS_FIELD.default_value = 0
BULLETTRACK_FLYINGSECONDS_FIELD.type = 5
BULLETTRACK_FLYINGSECONDS_FIELD.cpp_type = 1

BULLETTRACK_SPEEDX_FIELD.name = "speedx"
BULLETTRACK_SPEEDX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BulletTrack.speedx"
BULLETTRACK_SPEEDX_FIELD.number = 4
BULLETTRACK_SPEEDX_FIELD.index = 3
BULLETTRACK_SPEEDX_FIELD.label = 1
BULLETTRACK_SPEEDX_FIELD.has_default_value = false
BULLETTRACK_SPEEDX_FIELD.default_value = 0
BULLETTRACK_SPEEDX_FIELD.type = 5
BULLETTRACK_SPEEDX_FIELD.cpp_type = 1

BULLETTRACK_SPEEDY_FIELD.name = "speedy"
BULLETTRACK_SPEEDY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BulletTrack.speedy"
BULLETTRACK_SPEEDY_FIELD.number = 5
BULLETTRACK_SPEEDY_FIELD.index = 4
BULLETTRACK_SPEEDY_FIELD.label = 1
BULLETTRACK_SPEEDY_FIELD.has_default_value = false
BULLETTRACK_SPEEDY_FIELD.default_value = 0
BULLETTRACK_SPEEDY_FIELD.type = 5
BULLETTRACK_SPEEDY_FIELD.cpp_type = 1

BULLETTRACK_PNGNUM_FIELD.name = "pngNum"
BULLETTRACK_PNGNUM_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BulletTrack.pngNum"
BULLETTRACK_PNGNUM_FIELD.number = 6
BULLETTRACK_PNGNUM_FIELD.index = 5
BULLETTRACK_PNGNUM_FIELD.label = 1
BULLETTRACK_PNGNUM_FIELD.has_default_value = false
BULLETTRACK_PNGNUM_FIELD.default_value = 0
BULLETTRACK_PNGNUM_FIELD.type = 5
BULLETTRACK_PNGNUM_FIELD.cpp_type = 1

BULLETTRACK_RESULT_FIELD.name = "result"
BULLETTRACK_RESULT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BulletTrack.result"
BULLETTRACK_RESULT_FIELD.number = 7
BULLETTRACK_RESULT_FIELD.index = 6
BULLETTRACK_RESULT_FIELD.label = 1
BULLETTRACK_RESULT_FIELD.has_default_value = false
BULLETTRACK_RESULT_FIELD.default_value = 0
BULLETTRACK_RESULT_FIELD.type = 5
BULLETTRACK_RESULT_FIELD.cpp_type = 1

BULLETTRACK.name = "BulletTrack"
BULLETTRACK.full_name = ".com.xinqihd.sns.gameserver.proto.BulletTrack"
BULLETTRACK.nested_types = {}
BULLETTRACK.enum_types = {}
BULLETTRACK.fields = {BULLETTRACK_HITPOINT_FIELD, BULLETTRACK_TOPPOINT_FIELD, BULLETTRACK_FLYINGSECONDS_FIELD, BULLETTRACK_SPEEDX_FIELD, BULLETTRACK_SPEEDY_FIELD, BULLETTRACK_PNGNUM_FIELD, BULLETTRACK_RESULT_FIELD}
BULLETTRACK.is_extendable = false
BULLETTRACK.extensions = {}
BCEBULLETTRACK_ROUNDNO_FIELD.name = "roundNo"
BCEBULLETTRACK_ROUNDNO_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceBulletTrack.roundNo"
BCEBULLETTRACK_ROUNDNO_FIELD.number = 1
BCEBULLETTRACK_ROUNDNO_FIELD.index = 0
BCEBULLETTRACK_ROUNDNO_FIELD.label = 2
BCEBULLETTRACK_ROUNDNO_FIELD.has_default_value = false
BCEBULLETTRACK_ROUNDNO_FIELD.default_value = 0
BCEBULLETTRACK_ROUNDNO_FIELD.type = 5
BCEBULLETTRACK_ROUNDNO_FIELD.cpp_type = 1

BCEBULLETTRACK_BULLETTRACKS_FIELD.name = "bulletTracks"
BCEBULLETTRACK_BULLETTRACKS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceBulletTrack.bulletTracks"
BCEBULLETTRACK_BULLETTRACKS_FIELD.number = 2
BCEBULLETTRACK_BULLETTRACKS_FIELD.index = 1
BCEBULLETTRACK_BULLETTRACKS_FIELD.label = 3
BCEBULLETTRACK_BULLETTRACKS_FIELD.has_default_value = false
BCEBULLETTRACK_BULLETTRACKS_FIELD.default_value = {}
BCEBULLETTRACK_BULLETTRACKS_FIELD.message_type = BULLETTRACK
BCEBULLETTRACK_BULLETTRACKS_FIELD.type = 11
BCEBULLETTRACK_BULLETTRACKS_FIELD.cpp_type = 10

BCEBULLETTRACK_SESSIONID_FIELD.name = "sessionId"
BCEBULLETTRACK_SESSIONID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceBulletTrack.sessionId"
BCEBULLETTRACK_SESSIONID_FIELD.number = 3
BCEBULLETTRACK_SESSIONID_FIELD.index = 2
BCEBULLETTRACK_SESSIONID_FIELD.label = 1
BCEBULLETTRACK_SESSIONID_FIELD.has_default_value = false
BCEBULLETTRACK_SESSIONID_FIELD.default_value = ""
BCEBULLETTRACK_SESSIONID_FIELD.type = 9
BCEBULLETTRACK_SESSIONID_FIELD.cpp_type = 9

BCEBULLETTRACK.name = "BceBulletTrack"
BCEBULLETTRACK.full_name = ".com.xinqihd.sns.gameserver.proto.BceBulletTrack"
BCEBULLETTRACK.nested_types = {}
BCEBULLETTRACK.enum_types = {}
BCEBULLETTRACK.fields = {BCEBULLETTRACK_ROUNDNO_FIELD, BCEBULLETTRACK_BULLETTRACKS_FIELD, BCEBULLETTRACK_SESSIONID_FIELD}
BCEBULLETTRACK.is_extendable = false
BCEBULLETTRACK.extensions = {}

BceBulletTrack = protobuf.Message(BCEBULLETTRACK)
BulletTrack = protobuf.Message(BULLETTRACK)
Point = protobuf.Message(POINT)
_G.BCEBULLETTRACK_PB_BCEBULLETTRACK = BCEBULLETTRACK
_G.BULLETTRACK_PB_BULLETTRACK = BULLETTRACK
_G.POINT_PB_POINT = POINT
