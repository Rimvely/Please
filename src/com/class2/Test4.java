package com.class2;

import java.util.Scanner;

class Rect{
	
	private int w,h;
	
	public void set(int w, int h){
		
		this.w = w;
		this.h = h;
		
	}
	
	public int area(){
		return w*h;
	}
	
	public int circumference(){
		return (w+h)*2;
	}
	
	public void print(int a, float c){
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: "+ a);
		System.out.println("�ѷ�: "+ c);
		
	}
	//�޼ҵ� overloading(�ߺ�����)
	//�޼ҵ��� �̸��� ���������� �Ű������� ������ �ٸ��ų�
	//������ Ÿ���� �ٸ��� �ٸ� �޼ҵ�� �ν��Ѵ�
	
	//�ϳ���Ŭ���� �ȿ��� ���� �۾��� �ϴ� �޼ҵ���
	//�̸��� ���Ͻ�Ŵ
	public void print(){
		
		System.out.println("����: " + w);
		System.out.println("����: " + h);
	}
	
	public void print(int a){
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: "+ a);
	}
	public void print(float c){
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("�ѷ�: "+ c);
	}
	
	
	
	
	
}
public class Test4 {

	public static void main(String[] args) {
		
		int w,h;
		Scanner sc = new Scanner(System.in);
		Rect ob = new Rect();
		
		System.out.print("����?");
		w = sc.nextInt();
		
		System.out.print("����?");
		h = sc.nextInt();
		System.out.println();
		
		ob.set(w, h);
		
		int a = ob.area();
		float c = ob.circumference();
		
		ob.print(a);
		ob.print(a, c);
		ob.print(c);
		
		
		
		
	}

}
