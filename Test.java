package com;

public class Test {
	public static void main(String[] args) {
		CPU cpu = new CPU();   //ʵ��������
		cpu.setSpeed(2200);   //���ý����ٶȷ���
		HardDisk disk = new HardDisk();
		disk.setAmount(200);
		PC pc = new PC();
		pc.setCpu(cpu);
		pc.setDisk(disk);
		pc.show();
	}
	

}
