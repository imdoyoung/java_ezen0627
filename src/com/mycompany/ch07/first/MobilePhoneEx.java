package com.mycompany.ch07.first;

public class MobilePhoneEx {

	public static void main(String[] args) {

		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.turnOffDmb();
		
		dmbCellPhone.powerOn();
		
		Mobile mobile = new Mobile();
		
		mobile.powerOff();	// CellPhone 클래스
		mobile.changeChannelDmb(1);	// DmbCellPhone 클래스
		mobile.aaa();	// Mobile 클래스
	}

}
