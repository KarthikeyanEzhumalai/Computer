package org.com;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("DesktopSize: 16 inch");		
	}
	public void desktopColor() {
		System.out.println("DesktopColor: Black");		
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.comModel1();
		d.compModel2();
		d.desktopColor();
		d.desktopSize();
	}

}
