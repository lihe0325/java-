package com;

public class CPU {
	private int speed;    //CPU�ٶ�
	private float price;    //CPU�۸�
	private String type;  //CPU����
	CPU(){
		
	}
	
	CPU(int speed,float price,String type){
		this.speed=speed;
		this.price=price;
		this.type=type;          //���췽��
	}
	
	public int getSpeed(){      //��ȡspeed
		return speed;
	}
	 public void setSpeed(int n){   //����speed
		 this.speed=n;
	 }
	 
	 private void judge (float price){            //˽�з���  �жϼ۸��Ƿ����
		 if (price>=200 && price<=500){
		  System.out.println("CPU�ļ۸���"+price);
		 }else {
			 System.out.println("CPU�۸񲻺���");
			 }
	 }
	public static void main (String[] args){
		CPU c1=new CPU(4,400,"intel");
		c1.judge(c1.price);
	} 	
}