<h3>实验目的:</h3><br>
掌握Eclipse平台的使用方法<br>
理解引用类型参数的传值<br>
初步了解可变参数，组合与复用<br>
<h3>实验要求</h3><br>
用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC,CPU,HardDisk和Test,其中Test是主类。<br>
<h5>PC，CPU和HardDisk的要求：</h5><br>
CPU要求getSpeed()返回Speed的值，要求setSpeed(int m)方法将参数m的值赋值给Speed;<br>
HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount;<br>
PC类要求setCPU(CPU c)将参数c的值赋值费cpu，要求setHardDisk(HardDisk h)方法将参数h值赋值费HD，要求show()方法能显示cpu的速度和硬盘的容量;<br>
<h5>主类Test的要求：</h5><br>
1.main方法中创建一个CPU对象cpu，cpu将知己的speed设置为2200;<br>
2.main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200;<br>
3.main方法中创建一个PC对象pc;<br>
4.pc调用setCPU(CPU c)方法，调用实时参是cpu;<br>
5.pc调用setHardDisk(HardDisk h)方法，调用实时参是disk;<br>
6.pc调用show()方法;<br>
<h3>实验设计:</h3><br>
CPU定义三个属性分别为：CPU速度，CPU种类，CPU价格。<br>
PC 使用this表示调用当前对象,将参数h的值赋值给HD,建立show 先写访问要求+类型+方法名+小括号.<br>
HardDisk定义两个属性分别为:硬盘价格，硬盘品牌.<br>
Test 设置值 实例化.调用建立速度方法.<br>
<h3>核心方法:</h3><br>
构造方法 获取speed 设置speed<br>
![alt console](http://m.qpic.cn/psc?/V54cvp6h0srRYw1sRHqT4QtAdx1Tmx8H/ruAMsa53pVQWN7FLK88i5o68YILDQOE2K5U2udMyOjvSLHQJf9t8YbUCJbAGjmug.jUmwpC2GsbDg52JiK3tawDehmYNgnOeQuPSaf*HpmM!/mnull&bo=*QFCAQAAAAADB50!&rf=photolist&t=5)  <br>
私有方法 判断价格是否合理 <br>
![alt console](http://m.qpic.cn/psc?/V54cvp6h0srRYw1sRHqT4QtAdx1Tmx8H/45NBuzDIW489QBoVep5mcZbCF*vJsMh*4KRjvhJCZlOmKWm73LzOosYGO7tM0mAcdIa3RoeZiP4Snz331ikX45OLBVELC2cSHCwjhvHA8Tc!/b&bo=3gKyAAAAAAADF1w!&rf=viewer_4)<br>
实例化名字 调用建立速度方法<br>
![alt console](http://m.qpic.cn/psc?/V54cvp6h0srRYw1sRHqT4QtAdx1Tmx8H/45NBuzDIW489QBoVep5mcZbCF*vJsMh*4KRjvhJCZlPGM9UqjQE..pi.TZfFsGLnlSNkLnnBGutX6oQivdn6xr6UH4HhsMd*oUkHGNBiIJA!/b&bo=dQI1AAAAAAADF3A!&rf=viewer_4)<br>
<h3>实验结果:</h3>
CPU运行结果<br>
![alt console](http://m.qpic.cn/psc?/V54cvp6h0srRYw1sRHqT4QtAdx1Tmx8H/45NBuzDIW489QBoVep5mcaIj0SfXhbJ72xdzm.CtIlBnU1uL56Z04SR4v1qt2JJN1rmB0V3rQ6xdfo0EDMBFnwqj6DVfiq*ZYYSNMQhSu8c!/b&bo=8wF4AAAAAAADF7g!&rf=viewer_4)<br>
Test运行结果 <br>
![alt console](http://m.qpic.cn/psc?/V54cvp6h0srRYw1sRHqT4QtAdx1Tmx8H/45NBuzDIW489QBoVep5mcaIj0SfXhbJ72xdzm.CtIlDNAbeK6DWwTP13Jls9tyYimVs0nZrOtsS3T83*dK0Zjz2FlLkofYftRVtrNHJlmg0!/b&bo=3wGaAAAAAAADF3Y!&rf=viewer_4)<br>
<h3>实验感想:</h3>
注意：有参构造方法使用this表示调用当前对象，没有this的话，区分参数与速度。<br>
构造方法应合理化，属性类型修饰符应多样化。<br>
