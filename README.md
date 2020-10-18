# 计G201 李赫 2020322061
# 实验目的:  
掌握Eclipse平台的使用方法
理解引用类型参数的传值  
初步了解可变参数，组合与复用  
# 实验要求  
用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC,CPU,HardDisk和Test,其中Test是主类。   
## PC，CPU和HardDisk的要求：  
CPU要求getSpeed()返回Speed的值，要求setSpeed(int m)方法将参数m的值赋值给Speed; 
HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount;  
PC类要求setCPU(CPU c)将参数c的值赋值费cpu，要求setHardDisk(HardDisk h)方法将参数h值赋值费HD，要求show()方法能显示cpu的速度和硬盘的容量;  
## 主类Test的要求：  
1.main方法中创建一个CPU对象cpu，cpu将知己的speed设置为2200;  
2.main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200;  
3.main方法中创建一个PC对象pc;  
4.pc调用setCPU(CPU c)方法，调用实时参是cpu;  
5.pc调用setHardDisk(HardDisk h)方法，调用实时参是disk;   
6.pc调用show()方法;  
# 实验设计:  
CPU定义三个属性分别为：CPU速度，CPU种类，CPU价格。  
PC 使用this表示调用当前对象,将参数h的值赋值给HD,建立show 先写访问要求+类型+方法名+小括号.  
HardDisk定义两个属性分别为:硬盘价格，硬盘品牌.  
Test 设置值 实例化.调用建立速度方法.  
# 核心方法:  
构造方法 获取speed 设置speed  
```
public int getSpeed(){      //获取speed
		return speed;
	}
	 public void setSpeed(int n){   //设置speed
		 this.speed=n;
	 }
```
私有方法 判断价格是否合理      
```
private void judge (float price){            //私有方法  判断价格是否合理
		 if (price>=200 && price<=500){
		  System.out.println("CPU的价格是"+price);
		 }else {
			 System.out.println("CPU价格不合理");
			 }
	 }
```
实例化名字 调用建立速度方法     
```
	CPU cpu = new CPU();   //实例化名字
		cpu.setSpeed(2200);   //调用建立速度方法
```
# 实验结果:  
CPU运行结果    
![alt console](http://m.qpic.cn/psc?/V54cvp6h0srRYw1sRHqT4QtAdx1Tmx8H/45NBuzDIW489QBoVep5mcaIj0SfXhbJ72xdzm.CtIlBnU1uL56Z04SR4v1qt2JJN1rmB0V3rQ6xdfo0EDMBFn6ElCgEbuxLXbwPJNwVO7Pg!/b&bo=8wF4AAAAAAADF7g!&rf=viewer_4)  
Test运行结果      
![alt console](http://m.qpic.cn/psc?/V54cvp6h0srRYw1sRHqT4QtAdx1Tmx8H/45NBuzDIW489QBoVep5mcaIj0SfXhbJ72xdzm.CtIlDNAbeK6DWwTP13Jls9tyYimVs0nZrOtsS3T83*dK0Zj6mY*thTzL0i*MFWDSE2eQw!/b&bo=3wGaAAAAAAADF3Y!&rf=viewer_4)   
# 实验感想:  
注意：有参构造方法使用this表示调用当前对象，没有this的话，区分参数与速度。  
构造方法应合理化，属性类型修饰符应多样化。  
