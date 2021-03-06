/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.sidoh.wwf_api.types.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
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

/**
 * Metadata about a game - includes the user ID of the person making the request.
 */
public class GameIndex implements org.apache.thrift.TBase<GameIndex, GameIndex._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GameIndex");

  private static final org.apache.thrift.protocol.TField GAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("games", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GameIndexStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GameIndexTupleSchemeFactory());
  }

  /**
   * A list of games. Note that not necessarily all of these will be active (i.e., have moves
   * pending).
   */
  public List<GameMeta> games; // required
  /**
   * This corresponds to the user that requests the game index
   */
  public User user; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * A list of games. Note that not necessarily all of these will be active (i.e., have moves
     * pending).
     */
    GAMES((short)1, "games"),
    /**
     * This corresponds to the user that requests the game index
     */
    USER((short)2, "user");

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
        case 1: // GAMES
          return GAMES;
        case 2: // USER
          return USER;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GAMES, new org.apache.thrift.meta_data.FieldMetaData("games", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GameMeta.class))));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, User.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GameIndex.class, metaDataMap);
  }

  public GameIndex() {
  }

  public GameIndex(
    List<GameMeta> games,
    User user)
  {
    this();
    this.games = games;
    this.user = user;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GameIndex(GameIndex other) {
    if (other.isSetGames()) {
      List<GameMeta> __this__games = new ArrayList<GameMeta>();
      for (GameMeta other_element : other.games) {
        __this__games.add(new GameMeta(other_element));
      }
      this.games = __this__games;
    }
    if (other.isSetUser()) {
      this.user = new User(other.user);
    }
  }

  public GameIndex deepCopy() {
    return new GameIndex(this);
  }

  @Override
  public void clear() {
    this.games = null;
    this.user = null;
  }

  public int getGamesSize() {
    return (this.games == null) ? 0 : this.games.size();
  }

  public java.util.Iterator<GameMeta> getGamesIterator() {
    return (this.games == null) ? null : this.games.iterator();
  }

  public void addToGames(GameMeta elem) {
    if (this.games == null) {
      this.games = new ArrayList<GameMeta>();
    }
    this.games.add(elem);
  }

  /**
   * A list of games. Note that not necessarily all of these will be active (i.e., have moves
   * pending).
   */
  public List<GameMeta> getGames() {
    return this.games;
  }

  /**
   * A list of games. Note that not necessarily all of these will be active (i.e., have moves
   * pending).
   */
  public GameIndex setGames(List<GameMeta> games) {
    this.games = games;
    return this;
  }

  public void unsetGames() {
    this.games = null;
  }

  /** Returns true if field games is set (has been assigned a value) and false otherwise */
  public boolean isSetGames() {
    return this.games != null;
  }

  public void setGamesIsSet(boolean value) {
    if (!value) {
      this.games = null;
    }
  }

  /**
   * This corresponds to the user that requests the game index
   */
  public User getUser() {
    return this.user;
  }

  /**
   * This corresponds to the user that requests the game index
   */
  public GameIndex setUser(User user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GAMES:
      if (value == null) {
        unsetGames();
      } else {
        setGames((List<GameMeta>)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((User)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GAMES:
      return getGames();

    case USER:
      return getUser();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GAMES:
      return isSetGames();
    case USER:
      return isSetUser();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GameIndex)
      return this.equals((GameIndex)that);
    return false;
  }

  public boolean equals(GameIndex that) {
    if (that == null)
      return false;

    boolean this_present_games = true && this.isSetGames();
    boolean that_present_games = true && that.isSetGames();
    if (this_present_games || that_present_games) {
      if (!(this_present_games && that_present_games))
        return false;
      if (!this.games.equals(that.games))
        return false;
    }

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(GameIndex other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    GameIndex typedOther = (GameIndex)other;

    lastComparison = Boolean.valueOf(isSetGames()).compareTo(typedOther.isSetGames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.games, typedOther.games);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUser()).compareTo(typedOther.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, typedOther.user);
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
    StringBuilder sb = new StringBuilder("GameIndex(");
    boolean first = true;

    sb.append("games:");
    if (this.games == null) {
      sb.append("null");
    } else {
      sb.append(this.games);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (games == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'games' was not present! Struct: " + toString());
    }
    if (user == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'user' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GameIndexStandardSchemeFactory implements SchemeFactory {
    public GameIndexStandardScheme getScheme() {
      return new GameIndexStandardScheme();
    }
  }

  private static class GameIndexStandardScheme extends StandardScheme<GameIndex> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GameIndex struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list102 = iprot.readListBegin();
                struct.games = new ArrayList<GameMeta>(_list102.size);
                for (int _i103 = 0; _i103 < _list102.size; ++_i103)
                {
                  GameMeta _elem104; // required
                  _elem104 = new GameMeta();
                  _elem104.read(iprot);
                  struct.games.add(_elem104);
                }
                iprot.readListEnd();
              }
              struct.setGamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.user = new User();
              struct.user.read(iprot);
              struct.setUserIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GameIndex struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.games != null) {
        oprot.writeFieldBegin(GAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.games.size()));
          for (GameMeta _iter105 : struct.games)
          {
            _iter105.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        struct.user.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GameIndexTupleSchemeFactory implements SchemeFactory {
    public GameIndexTupleScheme getScheme() {
      return new GameIndexTupleScheme();
    }
  }

  private static class GameIndexTupleScheme extends TupleScheme<GameIndex> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GameIndex struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.games.size());
        for (GameMeta _iter106 : struct.games)
        {
          _iter106.write(oprot);
        }
      }
      struct.user.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GameIndex struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list107 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.games = new ArrayList<GameMeta>(_list107.size);
        for (int _i108 = 0; _i108 < _list107.size; ++_i108)
        {
          GameMeta _elem109; // required
          _elem109 = new GameMeta();
          _elem109.read(iprot);
          struct.games.add(_elem109);
        }
      }
      struct.setGamesIsSet(true);
      struct.user = new User();
      struct.user.read(iprot);
      struct.setUserIsSet(true);
    }
  }

}

