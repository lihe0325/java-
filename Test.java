package com;

public class Test {
	public static void main(String[] args) {
		CPU cpu = new CPU();   //实例化名字
		cpu.setSpeed(2200);   //调用建立速度方法
		HardDisk disk = new HardDisk();
		disk.setAmount(200);
		PC pc = new PC();
		pc.setCpu(cpu);
		pc.setDisk(disk);
		pc.show();
	}
	

}
