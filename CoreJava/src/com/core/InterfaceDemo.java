package com.core;

interface ifs1
{
	void meth1();
}
interface ifs2 extends ifs1
{
	void meth2();
}
class IfsDemo implements ifs1
{
	public void meth1() {
		System.out.println("Meth1 Defined In IfsDemo");
	}
}
public class InterfaceDemo implements ifs2{

	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo();
		i.meth1();
		i.meth2();
		IfsDemo ifs=new IfsDemo();
		ifs.meth1();
	}
	public void meth2() {
		System.out.println("Meth2");
	}
	public void meth1() {
		System.out.println("Meth1");
	}
}
