// ORM class for table 'T_BusRevenue'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jan 26 10:37:08 CST 2018
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

public class T_BusRevenue extends SqoopRecord  implements DBWritable, Writable {
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
  public T_BusRevenue with_ID(String ID) {
    this.ID = ID;
    return this;
  }
  private String CarInfoID;
  public String get_CarInfoID() {
    return CarInfoID;
  }
  public void set_CarInfoID(String CarInfoID) {
    this.CarInfoID = CarInfoID;
  }
  public T_BusRevenue with_CarInfoID(String CarInfoID) {
    this.CarInfoID = CarInfoID;
    return this;
  }
  private String BusPointID;
  public String get_BusPointID() {
    return BusPointID;
  }
  public void set_BusPointID(String BusPointID) {
    this.BusPointID = BusPointID;
  }
  public T_BusRevenue with_BusPointID(String BusPointID) {
    this.BusPointID = BusPointID;
    return this;
  }
  private String Payment;
  public String get_Payment() {
    return Payment;
  }
  public void set_Payment(String Payment) {
    this.Payment = Payment;
  }
  public T_BusRevenue with_Payment(String Payment) {
    this.Payment = Payment;
    return this;
  }
  private java.sql.Timestamp PayTime;
  public java.sql.Timestamp get_PayTime() {
    return PayTime;
  }
  public void set_PayTime(java.sql.Timestamp PayTime) {
    this.PayTime = PayTime;
  }
  public T_BusRevenue with_PayTime(java.sql.Timestamp PayTime) {
    this.PayTime = PayTime;
    return this;
  }
  private String Lon;
  public String get_Lon() {
    return Lon;
  }
  public void set_Lon(String Lon) {
    this.Lon = Lon;
  }
  public T_BusRevenue with_Lon(String Lon) {
    this.Lon = Lon;
    return this;
  }
  private String Lat;
  public String get_Lat() {
    return Lat;
  }
  public void set_Lat(String Lat) {
    this.Lat = Lat;
  }
  public T_BusRevenue with_Lat(String Lat) {
    this.Lat = Lat;
    return this;
  }
  private Double PayMoney;
  public Double get_PayMoney() {
    return PayMoney;
  }
  public void set_PayMoney(Double PayMoney) {
    this.PayMoney = PayMoney;
  }
  public T_BusRevenue with_PayMoney(Double PayMoney) {
    this.PayMoney = PayMoney;
    return this;
  }
  private java.sql.Timestamp CreateTime;
  public java.sql.Timestamp get_CreateTime() {
    return CreateTime;
  }
  public void set_CreateTime(java.sql.Timestamp CreateTime) {
    this.CreateTime = CreateTime;
  }
  public T_BusRevenue with_CreateTime(java.sql.Timestamp CreateTime) {
    this.CreateTime = CreateTime;
    return this;
  }
  private java.sql.Timestamp UpdateTime;
  public java.sql.Timestamp get_UpdateTime() {
    return UpdateTime;
  }
  public void set_UpdateTime(java.sql.Timestamp UpdateTime) {
    this.UpdateTime = UpdateTime;
  }
  public T_BusRevenue with_UpdateTime(java.sql.Timestamp UpdateTime) {
    this.UpdateTime = UpdateTime;
    return this;
  }
  private String BusCardNo;
  public String get_BusCardNo() {
    return BusCardNo;
  }
  public void set_BusCardNo(String BusCardNo) {
    this.BusCardNo = BusCardNo;
  }
  public T_BusRevenue with_BusCardNo(String BusCardNo) {
    this.BusCardNo = BusCardNo;
    return this;
  }
  private String CarNum;
  public String get_CarNum() {
    return CarNum;
  }
  public void set_CarNum(String CarNum) {
    this.CarNum = CarNum;
  }
  public T_BusRevenue with_CarNum(String CarNum) {
    this.CarNum = CarNum;
    return this;
  }
  private String RegoinCode;
  public String get_RegoinCode() {
    return RegoinCode;
  }
  public void set_RegoinCode(String RegoinCode) {
    this.RegoinCode = RegoinCode;
  }
  public T_BusRevenue with_RegoinCode(String RegoinCode) {
    this.RegoinCode = RegoinCode;
    return this;
  }
  private String DownStationId;
  public String get_DownStationId() {
    return DownStationId;
  }
  public void set_DownStationId(String DownStationId) {
    this.DownStationId = DownStationId;
  }
  public T_BusRevenue with_DownStationId(String DownStationId) {
    this.DownStationId = DownStationId;
    return this;
  }
  private String DownStationName;
  public String get_DownStationName() {
    return DownStationName;
  }
  public void set_DownStationName(String DownStationName) {
    this.DownStationName = DownStationName;
  }
  public T_BusRevenue with_DownStationName(String DownStationName) {
    this.DownStationName = DownStationName;
    return this;
  }
  private String DownStationLon;
  public String get_DownStationLon() {
    return DownStationLon;
  }
  public void set_DownStationLon(String DownStationLon) {
    this.DownStationLon = DownStationLon;
  }
  public T_BusRevenue with_DownStationLon(String DownStationLon) {
    this.DownStationLon = DownStationLon;
    return this;
  }
  private String DownStationLat;
  public String get_DownStationLat() {
    return DownStationLat;
  }
  public void set_DownStationLat(String DownStationLat) {
    this.DownStationLat = DownStationLat;
  }
  public T_BusRevenue with_DownStationLat(String DownStationLat) {
    this.DownStationLat = DownStationLat;
    return this;
  }
  private String LineID;
  public String get_LineID() {
    return LineID;
  }
  public void set_LineID(String LineID) {
    this.LineID = LineID;
  }
  public T_BusRevenue with_LineID(String LineID) {
    this.LineID = LineID;
    return this;
  }
  private String LineName;
  public String get_LineName() {
    return LineName;
  }
  public void set_LineName(String LineName) {
    this.LineName = LineName;
  }
  public T_BusRevenue with_LineName(String LineName) {
    this.LineName = LineName;
    return this;
  }
  private String StationName;
  public String get_StationName() {
    return StationName;
  }
  public void set_StationName(String StationName) {
    this.StationName = StationName;
  }
  public T_BusRevenue with_StationName(String StationName) {
    this.StationName = StationName;
    return this;
  }
  private java.sql.Timestamp DownDate;
  public java.sql.Timestamp get_DownDate() {
    return DownDate;
  }
  public void set_DownDate(java.sql.Timestamp DownDate) {
    this.DownDate = DownDate;
  }
  public T_BusRevenue with_DownDate(java.sql.Timestamp DownDate) {
    this.DownDate = DownDate;
    return this;
  }
  private Double Distance;
  public Double get_Distance() {
    return Distance;
  }
  public void set_Distance(Double Distance) {
    this.Distance = Distance;
  }
  public T_BusRevenue with_Distance(Double Distance) {
    this.Distance = Distance;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T_BusRevenue)) {
      return false;
    }
    T_BusRevenue that = (T_BusRevenue) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.CarInfoID == null ? that.CarInfoID == null : this.CarInfoID.equals(that.CarInfoID));
    equal = equal && (this.BusPointID == null ? that.BusPointID == null : this.BusPointID.equals(that.BusPointID));
    equal = equal && (this.Payment == null ? that.Payment == null : this.Payment.equals(that.Payment));
    equal = equal && (this.PayTime == null ? that.PayTime == null : this.PayTime.equals(that.PayTime));
    equal = equal && (this.Lon == null ? that.Lon == null : this.Lon.equals(that.Lon));
    equal = equal && (this.Lat == null ? that.Lat == null : this.Lat.equals(that.Lat));
    equal = equal && (this.PayMoney == null ? that.PayMoney == null : this.PayMoney.equals(that.PayMoney));
    equal = equal && (this.CreateTime == null ? that.CreateTime == null : this.CreateTime.equals(that.CreateTime));
    equal = equal && (this.UpdateTime == null ? that.UpdateTime == null : this.UpdateTime.equals(that.UpdateTime));
    equal = equal && (this.BusCardNo == null ? that.BusCardNo == null : this.BusCardNo.equals(that.BusCardNo));
    equal = equal && (this.CarNum == null ? that.CarNum == null : this.CarNum.equals(that.CarNum));
    equal = equal && (this.RegoinCode == null ? that.RegoinCode == null : this.RegoinCode.equals(that.RegoinCode));
    equal = equal && (this.DownStationId == null ? that.DownStationId == null : this.DownStationId.equals(that.DownStationId));
    equal = equal && (this.DownStationName == null ? that.DownStationName == null : this.DownStationName.equals(that.DownStationName));
    equal = equal && (this.DownStationLon == null ? that.DownStationLon == null : this.DownStationLon.equals(that.DownStationLon));
    equal = equal && (this.DownStationLat == null ? that.DownStationLat == null : this.DownStationLat.equals(that.DownStationLat));
    equal = equal && (this.LineID == null ? that.LineID == null : this.LineID.equals(that.LineID));
    equal = equal && (this.LineName == null ? that.LineName == null : this.LineName.equals(that.LineName));
    equal = equal && (this.StationName == null ? that.StationName == null : this.StationName.equals(that.StationName));
    equal = equal && (this.DownDate == null ? that.DownDate == null : this.DownDate.equals(that.DownDate));
    equal = equal && (this.Distance == null ? that.Distance == null : this.Distance.equals(that.Distance));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof T_BusRevenue)) {
      return false;
    }
    T_BusRevenue that = (T_BusRevenue) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.CarInfoID == null ? that.CarInfoID == null : this.CarInfoID.equals(that.CarInfoID));
    equal = equal && (this.BusPointID == null ? that.BusPointID == null : this.BusPointID.equals(that.BusPointID));
    equal = equal && (this.Payment == null ? that.Payment == null : this.Payment.equals(that.Payment));
    equal = equal && (this.PayTime == null ? that.PayTime == null : this.PayTime.equals(that.PayTime));
    equal = equal && (this.Lon == null ? that.Lon == null : this.Lon.equals(that.Lon));
    equal = equal && (this.Lat == null ? that.Lat == null : this.Lat.equals(that.Lat));
    equal = equal && (this.PayMoney == null ? that.PayMoney == null : this.PayMoney.equals(that.PayMoney));
    equal = equal && (this.CreateTime == null ? that.CreateTime == null : this.CreateTime.equals(that.CreateTime));
    equal = equal && (this.UpdateTime == null ? that.UpdateTime == null : this.UpdateTime.equals(that.UpdateTime));
    equal = equal && (this.BusCardNo == null ? that.BusCardNo == null : this.BusCardNo.equals(that.BusCardNo));
    equal = equal && (this.CarNum == null ? that.CarNum == null : this.CarNum.equals(that.CarNum));
    equal = equal && (this.RegoinCode == null ? that.RegoinCode == null : this.RegoinCode.equals(that.RegoinCode));
    equal = equal && (this.DownStationId == null ? that.DownStationId == null : this.DownStationId.equals(that.DownStationId));
    equal = equal && (this.DownStationName == null ? that.DownStationName == null : this.DownStationName.equals(that.DownStationName));
    equal = equal && (this.DownStationLon == null ? that.DownStationLon == null : this.DownStationLon.equals(that.DownStationLon));
    equal = equal && (this.DownStationLat == null ? that.DownStationLat == null : this.DownStationLat.equals(that.DownStationLat));
    equal = equal && (this.LineID == null ? that.LineID == null : this.LineID.equals(that.LineID));
    equal = equal && (this.LineName == null ? that.LineName == null : this.LineName.equals(that.LineName));
    equal = equal && (this.StationName == null ? that.StationName == null : this.StationName.equals(that.StationName));
    equal = equal && (this.DownDate == null ? that.DownDate == null : this.DownDate.equals(that.DownDate));
    equal = equal && (this.Distance == null ? that.Distance == null : this.Distance.equals(that.Distance));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ID = JdbcWritableBridge.readString(1, __dbResults);
    this.CarInfoID = JdbcWritableBridge.readString(2, __dbResults);
    this.BusPointID = JdbcWritableBridge.readString(3, __dbResults);
    this.Payment = JdbcWritableBridge.readString(4, __dbResults);
    this.PayTime = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.Lon = JdbcWritableBridge.readString(6, __dbResults);
    this.Lat = JdbcWritableBridge.readString(7, __dbResults);
    this.PayMoney = JdbcWritableBridge.readDouble(8, __dbResults);
    this.CreateTime = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.UpdateTime = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.BusCardNo = JdbcWritableBridge.readString(11, __dbResults);
    this.CarNum = JdbcWritableBridge.readString(12, __dbResults);
    this.RegoinCode = JdbcWritableBridge.readString(13, __dbResults);
    this.DownStationId = JdbcWritableBridge.readString(14, __dbResults);
    this.DownStationName = JdbcWritableBridge.readString(15, __dbResults);
    this.DownStationLon = JdbcWritableBridge.readString(16, __dbResults);
    this.DownStationLat = JdbcWritableBridge.readString(17, __dbResults);
    this.LineID = JdbcWritableBridge.readString(18, __dbResults);
    this.LineName = JdbcWritableBridge.readString(19, __dbResults);
    this.StationName = JdbcWritableBridge.readString(20, __dbResults);
    this.DownDate = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.Distance = JdbcWritableBridge.readDouble(22, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ID = JdbcWritableBridge.readString(1, __dbResults);
    this.CarInfoID = JdbcWritableBridge.readString(2, __dbResults);
    this.BusPointID = JdbcWritableBridge.readString(3, __dbResults);
    this.Payment = JdbcWritableBridge.readString(4, __dbResults);
    this.PayTime = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.Lon = JdbcWritableBridge.readString(6, __dbResults);
    this.Lat = JdbcWritableBridge.readString(7, __dbResults);
    this.PayMoney = JdbcWritableBridge.readDouble(8, __dbResults);
    this.CreateTime = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.UpdateTime = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.BusCardNo = JdbcWritableBridge.readString(11, __dbResults);
    this.CarNum = JdbcWritableBridge.readString(12, __dbResults);
    this.RegoinCode = JdbcWritableBridge.readString(13, __dbResults);
    this.DownStationId = JdbcWritableBridge.readString(14, __dbResults);
    this.DownStationName = JdbcWritableBridge.readString(15, __dbResults);
    this.DownStationLon = JdbcWritableBridge.readString(16, __dbResults);
    this.DownStationLat = JdbcWritableBridge.readString(17, __dbResults);
    this.LineID = JdbcWritableBridge.readString(18, __dbResults);
    this.LineName = JdbcWritableBridge.readString(19, __dbResults);
    this.StationName = JdbcWritableBridge.readString(20, __dbResults);
    this.DownDate = JdbcWritableBridge.readTimestamp(21, __dbResults);
    this.Distance = JdbcWritableBridge.readDouble(22, __dbResults);
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
    JdbcWritableBridge.writeString(CarInfoID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BusPointID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Payment, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(PayTime, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Lon, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Lat, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(PayMoney, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CreateTime, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UpdateTime, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(BusCardNo, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CarNum, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(RegoinCode, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DownStationId, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DownStationName, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DownStationLon, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DownStationLat, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LineID, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LineName, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(StationName, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DownDate, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeDouble(Distance, 22 + __off, 8, __dbStmt);
    return 22;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(ID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CarInfoID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BusPointID, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Payment, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(PayTime, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Lon, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Lat, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(PayMoney, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CreateTime, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UpdateTime, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(BusCardNo, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CarNum, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(RegoinCode, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DownStationId, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DownStationName, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DownStationLon, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DownStationLat, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LineID, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LineName, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(StationName, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(DownDate, 21 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeDouble(Distance, 22 + __off, 8, __dbStmt);
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
        this.CarInfoID = null;
    } else {
    this.CarInfoID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BusPointID = null;
    } else {
    this.BusPointID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Payment = null;
    } else {
    this.Payment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PayTime = null;
    } else {
    this.PayTime = new Timestamp(__dataIn.readLong());
    this.PayTime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Lon = null;
    } else {
    this.Lon = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Lat = null;
    } else {
    this.Lat = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PayMoney = null;
    } else {
    this.PayMoney = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.CreateTime = null;
    } else {
    this.CreateTime = new Timestamp(__dataIn.readLong());
    this.CreateTime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.UpdateTime = null;
    } else {
    this.UpdateTime = new Timestamp(__dataIn.readLong());
    this.UpdateTime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.BusCardNo = null;
    } else {
    this.BusCardNo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CarNum = null;
    } else {
    this.CarNum = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RegoinCode = null;
    } else {
    this.RegoinCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DownStationId = null;
    } else {
    this.DownStationId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DownStationName = null;
    } else {
    this.DownStationName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DownStationLon = null;
    } else {
    this.DownStationLon = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DownStationLat = null;
    } else {
    this.DownStationLat = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LineID = null;
    } else {
    this.LineID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LineName = null;
    } else {
    this.LineName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.StationName = null;
    } else {
    this.StationName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DownDate = null;
    } else {
    this.DownDate = new Timestamp(__dataIn.readLong());
    this.DownDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Distance = null;
    } else {
    this.Distance = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ID);
    }
    if (null == this.CarInfoID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CarInfoID);
    }
    if (null == this.BusPointID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BusPointID);
    }
    if (null == this.Payment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Payment);
    }
    if (null == this.PayTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.PayTime.getTime());
    __dataOut.writeInt(this.PayTime.getNanos());
    }
    if (null == this.Lon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Lon);
    }
    if (null == this.Lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Lat);
    }
    if (null == this.PayMoney) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.PayMoney);
    }
    if (null == this.CreateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CreateTime.getTime());
    __dataOut.writeInt(this.CreateTime.getNanos());
    }
    if (null == this.UpdateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.UpdateTime.getTime());
    __dataOut.writeInt(this.UpdateTime.getNanos());
    }
    if (null == this.BusCardNo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BusCardNo);
    }
    if (null == this.CarNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CarNum);
    }
    if (null == this.RegoinCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RegoinCode);
    }
    if (null == this.DownStationId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DownStationId);
    }
    if (null == this.DownStationName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DownStationName);
    }
    if (null == this.DownStationLon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DownStationLon);
    }
    if (null == this.DownStationLat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DownStationLat);
    }
    if (null == this.LineID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LineID);
    }
    if (null == this.LineName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LineName);
    }
    if (null == this.StationName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, StationName);
    }
    if (null == this.DownDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DownDate.getTime());
    __dataOut.writeInt(this.DownDate.getNanos());
    }
    if (null == this.Distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Distance);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ID);
    }
    if (null == this.CarInfoID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CarInfoID);
    }
    if (null == this.BusPointID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BusPointID);
    }
    if (null == this.Payment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Payment);
    }
    if (null == this.PayTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.PayTime.getTime());
    __dataOut.writeInt(this.PayTime.getNanos());
    }
    if (null == this.Lon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Lon);
    }
    if (null == this.Lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Lat);
    }
    if (null == this.PayMoney) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.PayMoney);
    }
    if (null == this.CreateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CreateTime.getTime());
    __dataOut.writeInt(this.CreateTime.getNanos());
    }
    if (null == this.UpdateTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.UpdateTime.getTime());
    __dataOut.writeInt(this.UpdateTime.getNanos());
    }
    if (null == this.BusCardNo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BusCardNo);
    }
    if (null == this.CarNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CarNum);
    }
    if (null == this.RegoinCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RegoinCode);
    }
    if (null == this.DownStationId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DownStationId);
    }
    if (null == this.DownStationName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DownStationName);
    }
    if (null == this.DownStationLon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DownStationLon);
    }
    if (null == this.DownStationLat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DownStationLat);
    }
    if (null == this.LineID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LineID);
    }
    if (null == this.LineName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LineName);
    }
    if (null == this.StationName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, StationName);
    }
    if (null == this.DownDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DownDate.getTime());
    __dataOut.writeInt(this.DownDate.getNanos());
    }
    if (null == this.Distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Distance);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CarInfoID==null?"null":CarInfoID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BusPointID==null?"null":BusPointID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Payment==null?"null":Payment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PayTime==null?"null":"" + PayTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Lon==null?"null":Lon, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Lat==null?"null":Lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PayMoney==null?"null":"" + PayMoney, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CreateTime==null?"null":"" + CreateTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UpdateTime==null?"null":"" + UpdateTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BusCardNo==null?"null":BusCardNo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarNum==null?"null":CarNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RegoinCode==null?"null":RegoinCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DownStationId==null?"null":DownStationId, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DownStationName==null?"null":DownStationName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DownStationLon==null?"null":DownStationLon, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DownStationLat==null?"null":DownStationLat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LineID==null?"null":LineID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LineName==null?"null":LineName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StationName==null?"null":StationName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DownDate==null?"null":"" + DownDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Distance==null?"null":"" + Distance, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarInfoID==null?"null":CarInfoID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BusPointID==null?"null":BusPointID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Payment==null?"null":Payment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PayTime==null?"null":"" + PayTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Lon==null?"null":Lon, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Lat==null?"null":Lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PayMoney==null?"null":"" + PayMoney, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CreateTime==null?"null":"" + CreateTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UpdateTime==null?"null":"" + UpdateTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BusCardNo==null?"null":BusCardNo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarNum==null?"null":CarNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RegoinCode==null?"null":RegoinCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DownStationId==null?"null":DownStationId, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DownStationName==null?"null":DownStationName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DownStationLon==null?"null":DownStationLon, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DownStationLat==null?"null":DownStationLat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LineID==null?"null":LineID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LineName==null?"null":LineName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StationName==null?"null":StationName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DownDate==null?"null":"" + DownDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Distance==null?"null":"" + Distance, delimiters));
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
    if (__cur_str.equals("null")) { this.CarInfoID = null; } else {
      this.CarInfoID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BusPointID = null; } else {
      this.BusPointID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Payment = null; } else {
      this.Payment = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PayTime = null; } else {
      this.PayTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Lon = null; } else {
      this.Lon = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Lat = null; } else {
      this.Lat = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PayMoney = null; } else {
      this.PayMoney = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CreateTime = null; } else {
      this.CreateTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UpdateTime = null; } else {
      this.UpdateTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BusCardNo = null; } else {
      this.BusCardNo = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CarNum = null; } else {
      this.CarNum = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RegoinCode = null; } else {
      this.RegoinCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DownStationId = null; } else {
      this.DownStationId = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DownStationName = null; } else {
      this.DownStationName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DownStationLon = null; } else {
      this.DownStationLon = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DownStationLat = null; } else {
      this.DownStationLat = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LineID = null; } else {
      this.LineID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LineName = null; } else {
      this.LineName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.StationName = null; } else {
      this.StationName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DownDate = null; } else {
      this.DownDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Distance = null; } else {
      this.Distance = Double.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.CarInfoID = null; } else {
      this.CarInfoID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BusPointID = null; } else {
      this.BusPointID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Payment = null; } else {
      this.Payment = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PayTime = null; } else {
      this.PayTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Lon = null; } else {
      this.Lon = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Lat = null; } else {
      this.Lat = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PayMoney = null; } else {
      this.PayMoney = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CreateTime = null; } else {
      this.CreateTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UpdateTime = null; } else {
      this.UpdateTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BusCardNo = null; } else {
      this.BusCardNo = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CarNum = null; } else {
      this.CarNum = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RegoinCode = null; } else {
      this.RegoinCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DownStationId = null; } else {
      this.DownStationId = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DownStationName = null; } else {
      this.DownStationName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DownStationLon = null; } else {
      this.DownStationLon = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DownStationLat = null; } else {
      this.DownStationLat = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LineID = null; } else {
      this.LineID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LineName = null; } else {
      this.LineName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.StationName = null; } else {
      this.StationName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DownDate = null; } else {
      this.DownDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Distance = null; } else {
      this.Distance = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    T_BusRevenue o = (T_BusRevenue) super.clone();
    o.PayTime = (o.PayTime != null) ? (java.sql.Timestamp) o.PayTime.clone() : null;
    o.CreateTime = (o.CreateTime != null) ? (java.sql.Timestamp) o.CreateTime.clone() : null;
    o.UpdateTime = (o.UpdateTime != null) ? (java.sql.Timestamp) o.UpdateTime.clone() : null;
    o.DownDate = (o.DownDate != null) ? (java.sql.Timestamp) o.DownDate.clone() : null;
    return o;
  }

  public void clone0(T_BusRevenue o) throws CloneNotSupportedException {
    o.PayTime = (o.PayTime != null) ? (java.sql.Timestamp) o.PayTime.clone() : null;
    o.CreateTime = (o.CreateTime != null) ? (java.sql.Timestamp) o.CreateTime.clone() : null;
    o.UpdateTime = (o.UpdateTime != null) ? (java.sql.Timestamp) o.UpdateTime.clone() : null;
    o.DownDate = (o.DownDate != null) ? (java.sql.Timestamp) o.DownDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("CarInfoID", this.CarInfoID);
    __sqoop$field_map.put("BusPointID", this.BusPointID);
    __sqoop$field_map.put("Payment", this.Payment);
    __sqoop$field_map.put("PayTime", this.PayTime);
    __sqoop$field_map.put("Lon", this.Lon);
    __sqoop$field_map.put("Lat", this.Lat);
    __sqoop$field_map.put("PayMoney", this.PayMoney);
    __sqoop$field_map.put("CreateTime", this.CreateTime);
    __sqoop$field_map.put("UpdateTime", this.UpdateTime);
    __sqoop$field_map.put("BusCardNo", this.BusCardNo);
    __sqoop$field_map.put("CarNum", this.CarNum);
    __sqoop$field_map.put("RegoinCode", this.RegoinCode);
    __sqoop$field_map.put("DownStationId", this.DownStationId);
    __sqoop$field_map.put("DownStationName", this.DownStationName);
    __sqoop$field_map.put("DownStationLon", this.DownStationLon);
    __sqoop$field_map.put("DownStationLat", this.DownStationLat);
    __sqoop$field_map.put("LineID", this.LineID);
    __sqoop$field_map.put("LineName", this.LineName);
    __sqoop$field_map.put("StationName", this.StationName);
    __sqoop$field_map.put("DownDate", this.DownDate);
    __sqoop$field_map.put("Distance", this.Distance);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("CarInfoID", this.CarInfoID);
    __sqoop$field_map.put("BusPointID", this.BusPointID);
    __sqoop$field_map.put("Payment", this.Payment);
    __sqoop$field_map.put("PayTime", this.PayTime);
    __sqoop$field_map.put("Lon", this.Lon);
    __sqoop$field_map.put("Lat", this.Lat);
    __sqoop$field_map.put("PayMoney", this.PayMoney);
    __sqoop$field_map.put("CreateTime", this.CreateTime);
    __sqoop$field_map.put("UpdateTime", this.UpdateTime);
    __sqoop$field_map.put("BusCardNo", this.BusCardNo);
    __sqoop$field_map.put("CarNum", this.CarNum);
    __sqoop$field_map.put("RegoinCode", this.RegoinCode);
    __sqoop$field_map.put("DownStationId", this.DownStationId);
    __sqoop$field_map.put("DownStationName", this.DownStationName);
    __sqoop$field_map.put("DownStationLon", this.DownStationLon);
    __sqoop$field_map.put("DownStationLat", this.DownStationLat);
    __sqoop$field_map.put("LineID", this.LineID);
    __sqoop$field_map.put("LineName", this.LineName);
    __sqoop$field_map.put("StationName", this.StationName);
    __sqoop$field_map.put("DownDate", this.DownDate);
    __sqoop$field_map.put("Distance", this.Distance);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("ID".equals(__fieldName)) {
      this.ID = (String) __fieldVal;
    }
    else    if ("CarInfoID".equals(__fieldName)) {
      this.CarInfoID = (String) __fieldVal;
    }
    else    if ("BusPointID".equals(__fieldName)) {
      this.BusPointID = (String) __fieldVal;
    }
    else    if ("Payment".equals(__fieldName)) {
      this.Payment = (String) __fieldVal;
    }
    else    if ("PayTime".equals(__fieldName)) {
      this.PayTime = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("Lon".equals(__fieldName)) {
      this.Lon = (String) __fieldVal;
    }
    else    if ("Lat".equals(__fieldName)) {
      this.Lat = (String) __fieldVal;
    }
    else    if ("PayMoney".equals(__fieldName)) {
      this.PayMoney = (Double) __fieldVal;
    }
    else    if ("CreateTime".equals(__fieldName)) {
      this.CreateTime = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("UpdateTime".equals(__fieldName)) {
      this.UpdateTime = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("BusCardNo".equals(__fieldName)) {
      this.BusCardNo = (String) __fieldVal;
    }
    else    if ("CarNum".equals(__fieldName)) {
      this.CarNum = (String) __fieldVal;
    }
    else    if ("RegoinCode".equals(__fieldName)) {
      this.RegoinCode = (String) __fieldVal;
    }
    else    if ("DownStationId".equals(__fieldName)) {
      this.DownStationId = (String) __fieldVal;
    }
    else    if ("DownStationName".equals(__fieldName)) {
      this.DownStationName = (String) __fieldVal;
    }
    else    if ("DownStationLon".equals(__fieldName)) {
      this.DownStationLon = (String) __fieldVal;
    }
    else    if ("DownStationLat".equals(__fieldName)) {
      this.DownStationLat = (String) __fieldVal;
    }
    else    if ("LineID".equals(__fieldName)) {
      this.LineID = (String) __fieldVal;
    }
    else    if ("LineName".equals(__fieldName)) {
      this.LineName = (String) __fieldVal;
    }
    else    if ("StationName".equals(__fieldName)) {
      this.StationName = (String) __fieldVal;
    }
    else    if ("DownDate".equals(__fieldName)) {
      this.DownDate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("Distance".equals(__fieldName)) {
      this.Distance = (Double) __fieldVal;
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
    else    if ("CarInfoID".equals(__fieldName)) {
      this.CarInfoID = (String) __fieldVal;
      return true;
    }
    else    if ("BusPointID".equals(__fieldName)) {
      this.BusPointID = (String) __fieldVal;
      return true;
    }
    else    if ("Payment".equals(__fieldName)) {
      this.Payment = (String) __fieldVal;
      return true;
    }
    else    if ("PayTime".equals(__fieldName)) {
      this.PayTime = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("Lon".equals(__fieldName)) {
      this.Lon = (String) __fieldVal;
      return true;
    }
    else    if ("Lat".equals(__fieldName)) {
      this.Lat = (String) __fieldVal;
      return true;
    }
    else    if ("PayMoney".equals(__fieldName)) {
      this.PayMoney = (Double) __fieldVal;
      return true;
    }
    else    if ("CreateTime".equals(__fieldName)) {
      this.CreateTime = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("UpdateTime".equals(__fieldName)) {
      this.UpdateTime = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("BusCardNo".equals(__fieldName)) {
      this.BusCardNo = (String) __fieldVal;
      return true;
    }
    else    if ("CarNum".equals(__fieldName)) {
      this.CarNum = (String) __fieldVal;
      return true;
    }
    else    if ("RegoinCode".equals(__fieldName)) {
      this.RegoinCode = (String) __fieldVal;
      return true;
    }
    else    if ("DownStationId".equals(__fieldName)) {
      this.DownStationId = (String) __fieldVal;
      return true;
    }
    else    if ("DownStationName".equals(__fieldName)) {
      this.DownStationName = (String) __fieldVal;
      return true;
    }
    else    if ("DownStationLon".equals(__fieldName)) {
      this.DownStationLon = (String) __fieldVal;
      return true;
    }
    else    if ("DownStationLat".equals(__fieldName)) {
      this.DownStationLat = (String) __fieldVal;
      return true;
    }
    else    if ("LineID".equals(__fieldName)) {
      this.LineID = (String) __fieldVal;
      return true;
    }
    else    if ("LineName".equals(__fieldName)) {
      this.LineName = (String) __fieldVal;
      return true;
    }
    else    if ("StationName".equals(__fieldName)) {
      this.StationName = (String) __fieldVal;
      return true;
    }
    else    if ("DownDate".equals(__fieldName)) {
      this.DownDate = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("Distance".equals(__fieldName)) {
      this.Distance = (Double) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
