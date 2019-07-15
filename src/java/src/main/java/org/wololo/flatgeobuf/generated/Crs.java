package org.wololo.flatgeobuf.generated;
// automatically generated by the FlatBuffers compiler, do not modify

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Crs extends Table {
  public static Crs getRootAsCrs(ByteBuffer _bb) { return getRootAsCrs(_bb, new Crs()); }
  public static Crs getRootAsCrs(ByteBuffer _bb, Crs obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Crs __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int code() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String org() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer orgAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer orgInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public String wkt() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer wktAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer wktInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }

  public static int createCrs(FlatBufferBuilder builder,
      int code,
      int orgOffset,
      int wktOffset) {
    builder.startObject(3);
    Crs.addWkt(builder, wktOffset);
    Crs.addOrg(builder, orgOffset);
    Crs.addCode(builder, code);
    return Crs.endCrs(builder);
  }

  public static void startCrs(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addCode(FlatBufferBuilder builder, int code) { builder.addInt(0, code, 0); }
  public static void addOrg(FlatBufferBuilder builder, int orgOffset) { builder.addOffset(1, orgOffset, 0); }
  public static void addWkt(FlatBufferBuilder builder, int wktOffset) { builder.addOffset(2, wktOffset, 0); }
  public static int endCrs(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
