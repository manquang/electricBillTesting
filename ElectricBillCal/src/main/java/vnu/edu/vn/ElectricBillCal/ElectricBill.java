package vnu.edu.vn.ElectricBillCal;

import java.util.Scanner;

public class ElectricBill {
	public static final double VAT = 0.08;
	public static final double bac1 = 1.728;
	public static final double bac2 = 1.786;
	public static final double bac3 = 2.014;
	public static final double bac4 = 2.536;
	public static final double bac5 = 2.834;
	public static final double bac6 = 2.927;
	private double total = 0.0;
	private int electricIndex = 0;

	public ElectricBill() {
		super();
	}

	public ElectricBill(int electricIndex) {
		super();
		this.electricIndex = electricIndex;
	}

	public int getElectricIndex() {
		return electricIndex;
	}

	public void setElectricIndex(int electricIndex) {
		this.electricIndex = electricIndex;
	}

	public double calculateBill() throws IllegalArgumentException {
		if (this.electricIndex <= 0) {
			throw new IllegalArgumentException("Số điện không hợp lệ");
		} else if (this.electricIndex <= 50) {
			total = this.electricIndex * bac1;
		} else if (this.electricIndex <= 100) {
			total = 50 * this.bac1 + (this.electricIndex - 50) * this.bac2;
		} else if (this.electricIndex <= 200) {
			total = 50 * this.bac1 + 50 * this.bac2 + (this.electricIndex - 100) * this.bac3;
		} else if (this.electricIndex <= 300) {
			total = 50 * this.bac1 + 50 * this.bac2 + 100 * this.bac3 + (this.electricIndex - 200) * this.bac4;
		} else if (this.electricIndex <= 400) {
			total = 50 * this.bac1 + 50 * this.bac2 + 100 * this.bac3 + 100 * this.bac4
					+ (this.electricIndex - 300) * this.bac5;
		} else {
			total = 50 * this.bac1 + 50 * this.bac2 + 100 * this.bac3 + 100 * this.bac4 + 100 * this.bac5
					+ (this.electricIndex - 400) * this.bac6;
		}
		return total;
	}

	public static void main(String[] args) {
		ElectricBill cnt = new ElectricBill();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện: ");
		int number = scanner.nextInt();
		cnt.setElectricIndex(number);
		
		System.out.println("Hóa đơn tiền điện là: " + cnt.calculateBill());
	}
}
