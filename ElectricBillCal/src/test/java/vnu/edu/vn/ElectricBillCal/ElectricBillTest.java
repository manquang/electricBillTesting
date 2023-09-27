package vnu.edu.vn.ElectricBillCal;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElectricBillTest {

	@Test(expected = IllegalArgumentException.class)
	public void testCalculateBillNegativeNumber() {
		ElectricBill cnt = new ElectricBill();
		cnt.setElectricIndex(-10);
		cnt.calculateBill();
	}
	
	@Test
	public void testBac1() {
		ElectricBill cnt = new ElectricBill();
		cnt.setElectricIndex(20);
		assertEquals(34.56, cnt.calculateBill(), 0.01);
	}
	
	@Test
	public void testBac2() {
		ElectricBill cnt = new ElectricBill();
		cnt.setElectricIndex(80);
		assertEquals(139.98, cnt.calculateBill(), 0.01);
	}
	
	
	@Test
	public void testBac3() {
		ElectricBill cnt = new ElectricBill();
		cnt.setElectricIndex(150);
		assertEquals(276.4, cnt.calculateBill(), 0.01);
	}
	
	@Test
	public void testBac4() {
		ElectricBill cnt = new ElectricBill();
		cnt.setElectricIndex(250);
		assertEquals(503.9, cnt.calculateBill(), 0.01);
	}
	
	@Test
	public void testBac5() {
		ElectricBill cnt = new ElectricBill();
		cnt.setElectricIndex(350);
		assertEquals(772.4, cnt.calculateBill(), 0.01);
	}
	
	@Test
	public void testBac6() {
		ElectricBill cnt = new ElectricBill();
		cnt.setElectricIndex(468);
		assertEquals(1113.136, cnt.calculateBill(), 0.01);
	}

}
