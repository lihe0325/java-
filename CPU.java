package com;

public class CPU {
	private int speed;    //CPU速度
	private float price;    //CPU价格
	private String type;  //CPU种类
	CPU(){
		
	}
	
	CPU(int speed,float price,String type){
		this.speed=speed;
		this.price=price;
		this.type=type;          //构造方法
	}
	
	public int getSpeed(){      //获取speed
		return speed;
	}
	 public void setSpeed(int n){   //设置speed
		 this.speed=n;
	 }
	 
	 private void judge (float price){            //私有方法  判断价格是否合理
		 if (price>=200 && price<=500){
		  System.out.println("CPU的价格是"+price);
		 }else {
			 System.out.println("CPU价格不合理");
			 }
	 }
	public static void main (String[] args){
		CPU c1=new CPU(4,400,"intel");
		c1.judge(c1.price);
	} 	
}