// ORM class for table 'T_BusForeData2'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Apr 11 15:55:37 CST 2018
// For connector: org.apache.sqoop.manager.SQLServerManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class T_BusForeData2 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String ID;
  public String get_ID() {
    return ID;
  }
  public void set_ID(String ID) {
    this.ID = ID;
  }
  public T_BusForeData2 with_ID(String ID) {
    this.ID = ID;
    return this;
  }
  private String LineID;
  public String get_LineID() {
    return LineID;
  }
  public void set_LineID(String LineID) {
    this.LineID = LineID;
  }
  public T_BusForeData2 with_LineID(String LineID) {
    this.LineID = LineID;
    return this;
  }
  private String CarID;
  public String get_CarID() {
    return CarID;
  }
  public void set_CarID(String CarID) {
    this.CarID = CarID;
  }
  public T_BusForeData2 with_CarID(String CarID) {
    this.CarID = CarID;
    return this;
  }
  private String StationID;
  public String get_StationID() {
    return StationID;
  }
  public void set_StationID(String StationID) {
    this.StationID = StationID;
  }
  public T_BusForeData2 with_StationID(String StationID) {
    this.StationID = StationID;
    return this;
  }
  private String StationName;
  public String get_StationName() {
    return StationName;
  }
  public void set_StationName(String StationName) {
    this.StationName = StationName;
  }
  public T_BusForeData2 with_StationName(String StationName) {
    this.StationName = StationName;
    return this;
  }
  private String UpNum;
  public String get_UpNum() {
    return UpNum;
  }
  public void set_UpNum(String UpNum) {
    this.UpNum = UpNum;
  }
  public T_BusForeData2 with_UpNum(String UpNum) {
    this.UpNum = UpNum;
    return this;
  }
  private String DownNum;
  public String get_DownNum() {
    return DownNum;
  }
  public void set_DownNum(String DownNum) {
    this.DownNum = DownNum;
  }
  public T_BusForeData2 with_DownNum(String DownNum) {
    this.DownNum = DownNum;
    return this;
  }
  private String PeopleNum;
  public String get_PeopleNum() {
    return PeopleNum;
  }
  public void set_PeopleNum(String PeopleNum) {
    this.PeopleNum = PeopleNum;
  }
  public T_BusForeData2 with_PeopleNum(String PeopleNum) {
    this.PeopleNum = PeopleNum;
    return this;
  }
  private String CreateTime;
  public String get_CreateTime() {
    return CreateTime;
  }
  public void set_CreateTime(String CreateTime) {
    this.CreateTime = CreateTime;
  }
  public T_BusForeData2 with_CreateTime(String CreateTime) {
    this.CreateTime = CreateTime;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T_BusForeData2)) {
      return false;
    }
    T_BusForeData2 that = (T_BusForeData2) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.LineID == null ? that.LineID == null : this.LineID.equals(that.LineID));
    equal = equal && (this.CarID == null ? that.CarID == null : this.CarID.equals(that.CarID));
    equal = equal && (this.StationID == null ? that.StationID == null : this.StationID.equals(that.StationID));
    equal = equal && (this.StationName == null ? that.StationName == null : this.StationName.equals(that.StationName));
    equal = equal && (this.UpNum == null ? that.UpNum == null : this.UpNum.equals(that.UpNum));
    equal = equal && (this.DownNum == null ? that.DownNum == null : this.DownNum.equals(that.DownNum));
    equal = equal && (this.PeopleNum == null ? that.PeopleNum == null : this.PeopleNum.equals(that.PeopleNum));
    equal = equal && (this.CreateTime == null ? that.CreateTime == null : this.CreateTime.equals(that.CreateTime));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T_BusForeData2)) {
      return false;
    }
    T_BusForeData2 that = (T_BusForeData2) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.LineID == null ? that.LineID == null : this.LineID.equals(that.LineID));
    equal = equal && (this.CarID == null ? that.CarID == null : this.CarID.equals(that.CarID));
    equal = equal && (this.StationID == null ? that.StationID == null : this.StationID.equals(that.StationID));
    equal = equal && (this.StationName == null ? that.StationName == null : this.StationName.equals(that.StationName));
    equal = equal && (this.UpNum == null ? that.UpNum == null : this.UpNum.equals(that.UpNum));
    equal = equal && (this.DownNum == null ? that.DownNum == null : this.DownNum.equals(that.DownNum));
    equal = equal && (this.PeopleNum == null ? that.PeopleNum == null : this.PeopleNum.equals(that.PeopleNum));
    equal = equal && (this.CreateTime == null ? that.CreateTime == null : this.CreateTime.equals(that.CreateTime));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ID = JdbcWritableBridge.readString(1, __dbResults);
    this.LineID = JdbcWritableBridge.readString(2, __dbResults);
    this.CarID = JdbcWritableBridge.readString(3, __dbResults);
    this.StationID = JdbcWritableBridge.readString(4, __dbResults);
    this.StationName = JdbcWritableBridge.readString(5, __dbResults);
    this.UpNum = JdbcWritableBridge.readString(6, __dbResults);
    this.DownNum = JdbcWritableBridge.readString(7, __dbResults);
    this.PeopleNum = JdbcWritableBridge.readString(8, __dbResults);
    this.CreateTime = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ID = JdbcWritableBridge.readString(1, __dbResults);
    this.LineID = JdbcWritableBridge.readString(2, __dbResults);
    this.CarID = JdbcWritableBridge.readString(3, __dbResults);
    this.StationID = JdbcWritableBridge.readString(4, __dbResults);
    this.StationName = JdbcWritableBridge.readString(5, __dbResults);
    this.UpNum = JdbcWritableBridge.readString(6, __dbResults);
    this.DownNum = JdbcWritableBridge.readString(7, __dbResults);
    this.PeopleNum = JdbcWritableBridge.readString(8, __dbResults);
    this.CreateTime = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LineID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CarID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(StationID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(StationName, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(UpNum, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DownNum, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PeopleNum, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CreateTime, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LineID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CarID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(StationID, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(StationName, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(UpNum, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DownNum, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PeopleNum, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CreateTime, 9 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ID = null;
    } else {
    this.ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LineID = null;
    } else {
    this.LineID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CarID = null;
    } else {
    this.CarID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.StationID = null;
    } else {
    this.StationID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.StationName = null;
    } else {
    this.StationName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UpNum = null;
    } else {
    this.UpNum = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DownNum = null;
    } else {
    this.DownNum = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PeopleNum = null;
    } else {
    this.PeopleNum = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CreateTime = null;
    } else {
    this.CreateTime = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ID);
    }
    if (null == this.LineID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LineID);
    }
    if (null == this.CarID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CarID);
    }
    if (null == this.StationID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, StationID);
    }
    if (null == this.StationName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, StationName);
    }
    if (null == this.UpNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UpNum);
    }
    if (null == this.DownNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DownNum);
    }
    if (null == this.PeopleNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PeopleNum);
    }
    if (null == this.CreateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CreateTime);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ID);
    }
    if (null == this.LineID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LineID);
    }
    if (null == this.CarID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CarID);
    }
    if (null == this.StationID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, StationID);
    }
    if (null == this.StationName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, StationName);
    }
    if (null == this.UpNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UpNum);
    }
    if (null == this.DownNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DownNum);
    }
    if (null == this.PeopleNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PeopleNum);
    }
    if (null == this.CreateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CreateTime);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LineID==null?"null":LineID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarID==null?"null":CarID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StationID==null?"null":StationID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StationName==null?"null":StationName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UpNum==null?"null":UpNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DownNum==null?"null":DownNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PeopleNum==null?"null":PeopleNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CreateTime==null?"null":CreateTime, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LineID==null?"null":LineID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarID==null?"null":CarID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StationID==null?"null":StationID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StationName==null?"null":StationName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UpNum==null?"null":UpNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DownNum==null?"null":DownNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PeopleNum==null?"null":PeopleNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CreateTime==null?"null":CreateTime, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ID = null; } else {
      this.ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LineID = null; } else {
      this.LineID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CarID = null; } else {
      this.CarID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.StationID = null; } else {
      this.StationID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.StationName = null; } else {
      this.StationName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.UpNum = null; } else {
      this.UpNum = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DownNum = null; } else {
      this.DownNum = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PeopleNum = null; } else {
      this.PeopleNum = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CreateTime = null; } else {
      this.CreateTime = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ID = null; } else {
      this.ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LineID = null; } else {
      this.LineID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CarID = null; } else {
      this.CarID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.StationID = null; } else {
      this.StationID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.StationName = null; } else {
      this.StationName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.UpNum = null; } else {
      this.UpNum = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DownNum = null; } else {
      this.DownNum = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PeopleNum = null; } else {
      this.PeopleNum = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CreateTime = null; } else {
      this.CreateTime = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T_BusForeData2 o = (T_BusForeData2) super.clone();
    return o;
  }

  public void clone0(T_BusForeData2 o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("LineID", this.LineID);
    __sqoop$field_map.put("CarID", this.CarID);
    __sqoop$field_map.put("StationID", this.StationID);
    __sqoop$field_map.put("StationName", this.StationName);
    __sqoop$field_map.put("UpNum", this.UpNum);
    __sqoop$field_map.put("DownNum", this.DownNum);
    __sqoop$field_map.put("PeopleNum", this.PeopleNum);
    __sqoop$field_map.put("CreateTime", this.CreateTime);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("LineID", this.LineID);
    __sqoop$field_map.put("CarID", this.CarID);
    __sqoop$field_map.put("StationID", this.StationID);
    __sqoop$field_map.put("StationName", this.StationName);
    __sqoop$field_map.put("UpNum", this.UpNum);
    __sqoop$field_map.put("DownNum", this.DownNum);
    __sqoop$field_map.put("PeopleNum", this.PeopleNum);
    __sqoop$field_map.put("CreateTime", this.CreateTime);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("ID".equals(__fieldName)) {
      this.ID = (String) __fieldVal;
    }
    else    if ("LineID".equals(__fieldName)) {
      this.LineID = (String) __fieldVal;
    }
    else    if ("CarID".equals(__fieldName)) {
      this.CarID = (String) __fieldVal;
    }
    else    if ("StationID".equals(__fieldName)) {
      this.StationID = (String) __fieldVal;
    }
    else    if ("StationName".equals(__fieldName)) {
      this.StationName = (String) __fieldVal;
    }
    else    if ("UpNum".equals(__fieldName)) {
      this.UpNum = (String) __fieldVal;
    }
    else    if ("DownNum".equals(__fieldName)) {
      this.DownNum = (String) __fieldVal;
    }
    else    if ("PeopleNum".equals(__fieldName)) {
      this.PeopleNum = (String) __fieldVal;
    }
    else    if ("CreateTime".equals(__fieldName)) {
      this.CreateTime = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("ID".equals(__fieldName)) {
      this.ID = (String) __fieldVal;
      return true;
    }
    else    if ("LineID".equals(__fieldName)) {
      this.LineID = (String) __fieldVal;
      return true;
    }
    else    if ("CarID".equals(__fieldName)) {
      this.CarID = (String) __fieldVal;
      return true;
    }
    else    if ("StationID".equals(__fieldName)) {
      this.StationID = (String) __fieldVal;
      return true;
    }
    else    if ("StationName".equals(__fieldName)) {
      this.StationName = (String) __fieldVal;
      return true;
    }
    else    if ("UpNum".equals(__fieldName)) {
      this.UpNum = (String) __fieldVal;
      return true;
    }
    else    if ("DownNum".equals(__fieldName)) {
      this.DownNum = (String) __fieldVal;
      return true;
    }
    else    if ("PeopleNum".equals(__fieldName)) {
      this.PeopleNum = (String) __fieldVal;
      return true;
    }
    else    if ("CreateTime".equals(__fieldName)) {
      this.CreateTime = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
