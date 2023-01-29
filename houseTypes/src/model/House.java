package model;

import java.time.LocalDateTime;

public class House {
  private String noticeNo;
  private LocalDateTime creationDate;
  private RealtyType Realtytype; // emlak tipi
  private int squareMeter; //metre kare
  private int roomCount; //oda sayısı
  private HouseType houseType;
  private int price;

  public House() {
  }

  public House(String noticeNo, LocalDateTime creationDate, RealtyType realtytype, int squareMeter, int roomCount, HouseType houseType, int price) {
    this.noticeNo = noticeNo;
    this.creationDate = creationDate;
    Realtytype = realtytype;
    this.squareMeter = squareMeter;
    this.roomCount = roomCount;
    this.houseType = houseType;
    this.price = price;
  }

  public String getNoticeNo() {
    return noticeNo;
  }

  public void setNoticeNo(String noticeNo) {
    this.noticeNo = noticeNo;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public RealtyType getRealtytype() {
    return Realtytype;
  }

  public void setRealtytype(RealtyType realtytype) {
    Realtytype = realtytype;
  }

  public int getSquareMeter() {
    return squareMeter;
  }

  public void setSquareMeter(int squareMeter) {
    this.squareMeter = squareMeter;
  }

  public int getRoomCount() {
    return roomCount;
  }

  public void setRoomCount(int roomCount) {
    this.roomCount = roomCount;
  }

  public HouseType getHouseType() {
    return houseType;
  }

  public void setHouseType(HouseType houseType) {
    this.houseType = houseType;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }


  @Override
  public String toString() {
    String value="";
    value+="  noticeNo =" +this.noticeNo;
    value+="  creationDate =" +this.creationDate;
    value+="  Realtytype =" +this.Realtytype;
    value+="  squareMeter =" +this.squareMeter;
    value+="  roomCount =" +this.roomCount;
    value+="  houseType =" +this.houseType;
    value+="  price =" +this.price ;
    return value;
  }
}
