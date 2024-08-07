package com.mycompany.ch07.first.tr;

public class MobilePhoneEx_tr {

	public static void main(String[] args) {

		CellPhone_tr cellPhone_tr = new CellPhone_tr();
		
		DmbCellPhone_tr dmbCellPhone_tr = new DmbCellPhone_tr();
		
		Mobile_tr mobile_tr = new Mobile_tr();
		
		cellPhone_tr.powerOn();
		
		dmbCellPhone_tr.turnOffDmb();
		dmbCellPhone_tr.powerOn();
		
		mobile_tr.powerOff();
		mobile_tr.changeChannelDmb(2);
		mobile_tr.aaa();
	}

}
