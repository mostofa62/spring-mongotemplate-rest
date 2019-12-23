package org.iedcr.champsdata.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("roundone")
public class Dss {
	
	@Id
	private String id;
		
	private int Vill;
	private int Bari;
	private int HH;
	private String UnName;
	private String VStatus;
	private int MSlNo;
	private String Edu;
	private String Sex;
	private String Rth;
	private int AgeY;
	private String VRound;
	private String VDatepreg;
	private String EvDate;
	private String CurPreg;
	private String EvType;
	private String Info1;
	private String ExType;
	private String ExDate;
	private String BDate;
	private String VisitVDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getVill() {
		return Vill;
	}
	public void setVill(int vill) {
		Vill = vill;
	}
	public int getBari() {
		return Bari;
	}
	public void setBari(int bari) {
		Bari = bari;
	}
	public int getHH() {
		return HH;
	}
	public void setHH(int hH) {
		HH = hH;
	}
	public String getUnName() {
		return UnName;
	}
	public void setUnName(String unName) {
		UnName = unName;
	}
	public String getVStatus() {
		return VStatus;
	}
	public void setVStatus(String vStatus) {
		VStatus = vStatus;
	}
	public int getMSlNo() {
		return MSlNo;
	}
	public void setMSlNo(int mSlNo) {
		MSlNo = mSlNo;
	}
	public String getEdu() {
		return Edu;
	}
	public void setEdu(String edu) {
		Edu = edu;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getRth() {
		return Rth;
	}
	public void setRth(String rth) {
		Rth = rth;
	}
	public int getAgeY() {
		return AgeY;
	}
	public void setAgeY(int ageY) {
		AgeY = ageY;
	}
	public String getVRound() {
		return VRound;
	}
	public void setVRound(String vRound) {
		VRound = vRound;
	}
	public String getVDatepreg() {
		return VDatepreg;
	}
	public void setVDatepreg(String vDatepreg) {
		VDatepreg = vDatepreg;
	}
	public String getEvDate() {
		return EvDate;
	}
	public void setEvDate(String evDate) {
		EvDate = evDate;
	}
	public String getCurPreg() {
		return CurPreg;
	}
	public void setCurPreg(String curPreg) {
		CurPreg = curPreg;
	}
	public String getEvType() {
		return EvType;
	}
	public void setEvType(String evType) {
		EvType = evType;
	}
	public String getInfo1() {
		return Info1;
	}
	public void setInfo1(String info1) {
		Info1 = info1;
	}
	public String getExType() {
		return ExType;
	}
	public void setExType(String exType) {
		ExType = exType;
	}
	public String getExDate() {
		return ExDate;
	}
	public void setExDate(String exDate) {
		ExDate = exDate;
	}
	public String getBDate() {
		return BDate;
	}
	public void setBDate(String bDate) {
		BDate = bDate;
	}
	public String getVisitVDate() {
		return VisitVDate;
	}
	public void setVisitVDate(String visitVDate) {
		VisitVDate = visitVDate;
	}
	
	

}
