package com.mycompany.ch07.first.tr;

public class ModelPhoneEx_tr {

	public static void main(String[] args) {

		CellPhone_tr cellPhone_tr = new CellPhone_tr();
		
		DmbCellPhone_tr dmbCellPhone_tr = new DmbCellPhone_tr();
		
		cellPhone_tr.powerOn();
		
		dmbCellPhone_tr.turnOffDmb();
		
		dmbCellPhone_tr.powerOn();
	}

}
