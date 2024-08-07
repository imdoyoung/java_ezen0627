package com.mycompany.ch07.first;

public class ModelPhoneEx {

	public static void main(String[] args) {

		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.turnOffDmb();
		
		dmbCellPhone.powerOn();
	}

}
