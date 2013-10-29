/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.thrift.hello.service;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloStruct implements org.apache.thrift.TBase<HelloStruct, HelloStruct._Fields>, java.io.Serializable, Cloneable, Comparable<HelloStruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HelloStruct");

  private static final org.apache.thrift.protocol.TField A_FIELD_DESC = new org.apache.thrift.protocol.TField("a", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField B_FIELD_DESC = new org.apache.thrift.protocol.TField("b", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField C_FIELD_DESC = new org.apache.thrift.protocol.TField("c", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField D_FIELD_DESC = new org.apache.thrift.protocol.TField("d", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField E_FIELD_DESC = new org.apache.thrift.protocol.TField("e", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField F_FIELD_DESC = new org.apache.thrift.protocol.TField("f", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField G_FIELD_DESC = new org.apache.thrift.protocol.TField("g", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField H_FIELD_DESC = new org.apache.thrift.protocol.TField("h", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HelloStructStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HelloStructTupleSchemeFactory());
  }

  public boolean a; // required
  public byte b; // required
  public short c; // required
  public int d; // required
  public long e; // required
  public double f; // required
  public String g; // optional
  public ByteBuffer h; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    A((short)1, "a"),
    B((short)2, "b"),
    C((short)3, "c"),
    D((short)4, "d"),
    E((short)5, "e"),
    F((short)6, "f"),
    G((short)7, "g"),
    H((short)8, "h");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // A
          return A;
        case 2: // B
          return B;
        case 3: // C
          return C;
        case 4: // D
          return D;
        case 5: // E
          return E;
        case 6: // F
          return F;
        case 7: // G
          return G;
        case 8: // H
          return H;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __A_ISSET_ID = 0;
  private static final int __B_ISSET_ID = 1;
  private static final int __C_ISSET_ID = 2;
  private static final int __D_ISSET_ID = 3;
  private static final int __E_ISSET_ID = 4;
  private static final int __F_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.G,_Fields.H};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.A, new org.apache.thrift.meta_data.FieldMetaData("a", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.B, new org.apache.thrift.meta_data.FieldMetaData("b", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.C, new org.apache.thrift.meta_data.FieldMetaData("c", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.D, new org.apache.thrift.meta_data.FieldMetaData("d", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.E, new org.apache.thrift.meta_data.FieldMetaData("e", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.F, new org.apache.thrift.meta_data.FieldMetaData("f", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.G, new org.apache.thrift.meta_data.FieldMetaData("g", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.H, new org.apache.thrift.meta_data.FieldMetaData("h", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HelloStruct.class, metaDataMap);
  }

  public HelloStruct() {
    this.a = false;

    this.b = (byte)0;

    this.c = (short)0;

    this.d = 0;

    this.e = 0L;

    this.f = 0;

    this.g = "hello";

  }

  public HelloStruct(
    boolean a,
    byte b,
    short c,
    int d,
    long e,
    double f)
  {
    this();
    this.a = a;
    setAIsSet(true);
    this.b = b;
    setBIsSet(true);
    this.c = c;
    setCIsSet(true);
    this.d = d;
    setDIsSet(true);
    this.e = e;
    setEIsSet(true);
    this.f = f;
    setFIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HelloStruct(HelloStruct other) {
    __isset_bitfield = other.__isset_bitfield;
    this.a = other.a;
    this.b = other.b;
    this.c = other.c;
    this.d = other.d;
    this.e = other.e;
    this.f = other.f;
    if (other.isSetG()) {
      this.g = other.g;
    }
    if (other.isSetH()) {
      this.h = org.apache.thrift.TBaseHelper.copyBinary(other.h);
;
    }
  }

  public HelloStruct deepCopy() {
    return new HelloStruct(this);
  }

  @Override
  public void clear() {
    this.a = false;

    this.b = (byte)0;

    this.c = (short)0;

    this.d = 0;

    this.e = 0L;

    this.f = 0;

    this.g = "hello";

    this.h = null;
  }

  public boolean isA() {
    return this.a;
  }

  public HelloStruct setA(boolean a) {
    this.a = a;
    setAIsSet(true);
    return this;
  }

  public void unsetA() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __A_ISSET_ID);
  }

  /** Returns true if field a is set (has been assigned a value) and false otherwise */
  public boolean isSetA() {
    return EncodingUtils.testBit(__isset_bitfield, __A_ISSET_ID);
  }

  public void setAIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __A_ISSET_ID, value);
  }

  public byte getB() {
    return this.b;
  }

  public HelloStruct setB(byte b) {
    this.b = b;
    setBIsSet(true);
    return this;
  }

  public void unsetB() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __B_ISSET_ID);
  }

  /** Returns true if field b is set (has been assigned a value) and false otherwise */
  public boolean isSetB() {
    return EncodingUtils.testBit(__isset_bitfield, __B_ISSET_ID);
  }

  public void setBIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __B_ISSET_ID, value);
  }

  public short getC() {
    return this.c;
  }

  public HelloStruct setC(short c) {
    this.c = c;
    setCIsSet(true);
    return this;
  }

  public void unsetC() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __C_ISSET_ID);
  }

  /** Returns true if field c is set (has been assigned a value) and false otherwise */
  public boolean isSetC() {
    return EncodingUtils.testBit(__isset_bitfield, __C_ISSET_ID);
  }

  public void setCIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __C_ISSET_ID, value);
  }

  public int getD() {
    return this.d;
  }

  public HelloStruct setD(int d) {
    this.d = d;
    setDIsSet(true);
    return this;
  }

  public void unsetD() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __D_ISSET_ID);
  }

  /** Returns true if field d is set (has been assigned a value) and false otherwise */
  public boolean isSetD() {
    return EncodingUtils.testBit(__isset_bitfield, __D_ISSET_ID);
  }

  public void setDIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __D_ISSET_ID, value);
  }

  public long getE() {
    return this.e;
  }

  public HelloStruct setE(long e) {
    this.e = e;
    setEIsSet(true);
    return this;
  }

  public void unsetE() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __E_ISSET_ID);
  }

  /** Returns true if field e is set (has been assigned a value) and false otherwise */
  public boolean isSetE() {
    return EncodingUtils.testBit(__isset_bitfield, __E_ISSET_ID);
  }

  public void setEIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __E_ISSET_ID, value);
  }

  public double getF() {
    return this.f;
  }

  public HelloStruct setF(double f) {
    this.f = f;
    setFIsSet(true);
    return this;
  }

  public void unsetF() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __F_ISSET_ID);
  }

  /** Returns true if field f is set (has been assigned a value) and false otherwise */
  public boolean isSetF() {
    return EncodingUtils.testBit(__isset_bitfield, __F_ISSET_ID);
  }

  public void setFIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __F_ISSET_ID, value);
  }

  public String getG() {
    return this.g;
  }

  public HelloStruct setG(String g) {
    this.g = g;
    return this;
  }

  public void unsetG() {
    this.g = null;
  }

  /** Returns true if field g is set (has been assigned a value) and false otherwise */
  public boolean isSetG() {
    return this.g != null;
  }

  public void setGIsSet(boolean value) {
    if (!value) {
      this.g = null;
    }
  }

  public byte[] getH() {
    setH(org.apache.thrift.TBaseHelper.rightSize(h));
    return h == null ? null : h.array();
  }

  public ByteBuffer bufferForH() {
    return h;
  }

  public HelloStruct setH(byte[] h) {
    setH(h == null ? (ByteBuffer)null : ByteBuffer.wrap(h));
    return this;
  }

  public HelloStruct setH(ByteBuffer h) {
    this.h = h;
    return this;
  }

  public void unsetH() {
    this.h = null;
  }

  /** Returns true if field h is set (has been assigned a value) and false otherwise */
  public boolean isSetH() {
    return this.h != null;
  }

  public void setHIsSet(boolean value) {
    if (!value) {
      this.h = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case A:
      if (value == null) {
        unsetA();
      } else {
        setA((Boolean)value);
      }
      break;

    case B:
      if (value == null) {
        unsetB();
      } else {
        setB((Byte)value);
      }
      break;

    case C:
      if (value == null) {
        unsetC();
      } else {
        setC((Short)value);
      }
      break;

    case D:
      if (value == null) {
        unsetD();
      } else {
        setD((Integer)value);
      }
      break;

    case E:
      if (value == null) {
        unsetE();
      } else {
        setE((Long)value);
      }
      break;

    case F:
      if (value == null) {
        unsetF();
      } else {
        setF((Double)value);
      }
      break;

    case G:
      if (value == null) {
        unsetG();
      } else {
        setG((String)value);
      }
      break;

    case H:
      if (value == null) {
        unsetH();
      } else {
        setH((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case A:
      return Boolean.valueOf(isA());

    case B:
      return Byte.valueOf(getB());

    case C:
      return Short.valueOf(getC());

    case D:
      return Integer.valueOf(getD());

    case E:
      return Long.valueOf(getE());

    case F:
      return Double.valueOf(getF());

    case G:
      return getG();

    case H:
      return getH();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case A:
      return isSetA();
    case B:
      return isSetB();
    case C:
      return isSetC();
    case D:
      return isSetD();
    case E:
      return isSetE();
    case F:
      return isSetF();
    case G:
      return isSetG();
    case H:
      return isSetH();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HelloStruct)
      return this.equals((HelloStruct)that);
    return false;
  }

  public boolean equals(HelloStruct that) {
    if (that == null)
      return false;

    boolean this_present_a = true;
    boolean that_present_a = true;
    if (this_present_a || that_present_a) {
      if (!(this_present_a && that_present_a))
        return false;
      if (this.a != that.a)
        return false;
    }

    boolean this_present_b = true;
    boolean that_present_b = true;
    if (this_present_b || that_present_b) {
      if (!(this_present_b && that_present_b))
        return false;
      if (this.b != that.b)
        return false;
    }

    boolean this_present_c = true;
    boolean that_present_c = true;
    if (this_present_c || that_present_c) {
      if (!(this_present_c && that_present_c))
        return false;
      if (this.c != that.c)
        return false;
    }

    boolean this_present_d = true;
    boolean that_present_d = true;
    if (this_present_d || that_present_d) {
      if (!(this_present_d && that_present_d))
        return false;
      if (this.d != that.d)
        return false;
    }

    boolean this_present_e = true;
    boolean that_present_e = true;
    if (this_present_e || that_present_e) {
      if (!(this_present_e && that_present_e))
        return false;
      if (this.e != that.e)
        return false;
    }

    boolean this_present_f = true;
    boolean that_present_f = true;
    if (this_present_f || that_present_f) {
      if (!(this_present_f && that_present_f))
        return false;
      if (this.f != that.f)
        return false;
    }

    boolean this_present_g = true && this.isSetG();
    boolean that_present_g = true && that.isSetG();
    if (this_present_g || that_present_g) {
      if (!(this_present_g && that_present_g))
        return false;
      if (!this.g.equals(that.g))
        return false;
    }

    boolean this_present_h = true && this.isSetH();
    boolean that_present_h = true && that.isSetH();
    if (this_present_h || that_present_h) {
      if (!(this_present_h && that_present_h))
        return false;
      if (!this.h.equals(that.h))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(HelloStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetA()).compareTo(other.isSetA());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetA()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.a, other.a);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetB()).compareTo(other.isSetB());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetB()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.b, other.b);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetC()).compareTo(other.isSetC());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetC()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.c, other.c);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetD()).compareTo(other.isSetD());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetD()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.d, other.d);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetE()).compareTo(other.isSetE());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetE()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.e, other.e);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetF()).compareTo(other.isSetF());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetF()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.f, other.f);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetG()).compareTo(other.isSetG());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetG()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.g, other.g);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetH()).compareTo(other.isSetH());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetH()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.h, other.h);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HelloStruct(");
    boolean first = true;

    sb.append("a:");
    sb.append(this.a);
    first = false;
    if (!first) sb.append(", ");
    sb.append("b:");
    sb.append(this.b);
    first = false;
    if (!first) sb.append(", ");
    sb.append("c:");
    sb.append(this.c);
    first = false;
    if (!first) sb.append(", ");
    sb.append("d:");
    sb.append(this.d);
    first = false;
    if (!first) sb.append(", ");
    sb.append("e:");
    sb.append(this.e);
    first = false;
    if (!first) sb.append(", ");
    sb.append("f:");
    sb.append(this.f);
    first = false;
    if (isSetG()) {
      if (!first) sb.append(", ");
      sb.append("g:");
      if (this.g == null) {
        sb.append("null");
      } else {
        sb.append(this.g);
      }
      first = false;
    }
    if (isSetH()) {
      if (!first) sb.append(", ");
      sb.append("h:");
      if (this.h == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.h, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'a' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'b' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'c' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'd' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'e' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'f' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HelloStructStandardSchemeFactory implements SchemeFactory {
    public HelloStructStandardScheme getScheme() {
      return new HelloStructStandardScheme();
    }
  }

  private static class HelloStructStandardScheme extends StandardScheme<HelloStruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HelloStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // A
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.a = iprot.readBool();
              struct.setAIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // B
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.b = iprot.readByte();
              struct.setBIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // C
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.c = iprot.readI16();
              struct.setCIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // D
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.d = iprot.readI32();
              struct.setDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // E
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.e = iprot.readI64();
              struct.setEIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // F
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.f = iprot.readDouble();
              struct.setFIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // G
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.g = iprot.readString();
              struct.setGIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // H
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.h = iprot.readBinary();
              struct.setHIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetA()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'a' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetB()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'b' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetC()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'c' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetD()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'd' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetE()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'e' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetF()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'f' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HelloStruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(A_FIELD_DESC);
      oprot.writeBool(struct.a);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(B_FIELD_DESC);
      oprot.writeByte(struct.b);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(C_FIELD_DESC);
      oprot.writeI16(struct.c);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(D_FIELD_DESC);
      oprot.writeI32(struct.d);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(E_FIELD_DESC);
      oprot.writeI64(struct.e);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(F_FIELD_DESC);
      oprot.writeDouble(struct.f);
      oprot.writeFieldEnd();
      if (struct.g != null) {
        if (struct.isSetG()) {
          oprot.writeFieldBegin(G_FIELD_DESC);
          oprot.writeString(struct.g);
          oprot.writeFieldEnd();
        }
      }
      if (struct.h != null) {
        if (struct.isSetH()) {
          oprot.writeFieldBegin(H_FIELD_DESC);
          oprot.writeBinary(struct.h);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HelloStructTupleSchemeFactory implements SchemeFactory {
    public HelloStructTupleScheme getScheme() {
      return new HelloStructTupleScheme();
    }
  }

  private static class HelloStructTupleScheme extends TupleScheme<HelloStruct> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HelloStruct struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.a);
      oprot.writeByte(struct.b);
      oprot.writeI16(struct.c);
      oprot.writeI32(struct.d);
      oprot.writeI64(struct.e);
      oprot.writeDouble(struct.f);
      BitSet optionals = new BitSet();
      if (struct.isSetG()) {
        optionals.set(0);
      }
      if (struct.isSetH()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetG()) {
        oprot.writeString(struct.g);
      }
      if (struct.isSetH()) {
        oprot.writeBinary(struct.h);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HelloStruct struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.a = iprot.readBool();
      struct.setAIsSet(true);
      struct.b = iprot.readByte();
      struct.setBIsSet(true);
      struct.c = iprot.readI16();
      struct.setCIsSet(true);
      struct.d = iprot.readI32();
      struct.setDIsSet(true);
      struct.e = iprot.readI64();
      struct.setEIsSet(true);
      struct.f = iprot.readDouble();
      struct.setFIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.g = iprot.readString();
        struct.setGIsSet(true);
      }
      if (incoming.get(1)) {
        struct.h = iprot.readBinary();
        struct.setHIsSet(true);
      }
    }
  }

}
