package com.kitri.lang;

public class StringBufferTest1 {
	public static void main(String[] args) {
		
		
		StringBuffer sb1 = new StringBuffer("hello "); 
		//16���� ���������� ��������. ���������� ���� / String�� ���ڸ� ������ �ÿ� ũ�Ⱑ �����Ǿ� ������ �Ұ�����.
		System.out.println("1. sb1 == " + sb1);
		
		int cap = sb1.capacity();
		System.out.println("�ʱ� ũ�� : " + cap + "\n ���ڿ� �� : " + sb1.length());
		sb1.append("java ");
		//�߰��ϴ�.
		System.out.println("2. sb1 == " + sb1); // �߰���.
		System.out.println("�ʱ� ũ�� : " + cap + "\n ���ڿ� �� : " + sb1.length());
		
		cap = sb1.capacity();
		sb1.append("!!!!!");
		System.out.println("3. sb1 == " + sb1); // �߰���.
		System.out.println("�ʱ� ũ�� : " + cap + "\n ���ڿ� �� : " + sb1.length());

//		cap = sb1.capacity();						?? ����� ���� �ȴþ�� ����, �� ũ�⸦ �Ѿ �� �ִ� ����	
		cap = sb1.capacity();
		sb1.append("!!!!!!!!");
		System.out.println("4. sb1 == " + sb1); // �߰���.
		System.out.println("�ʱ� ũ�� : " + cap + "\n ���ڿ� �� : " + sb1.length());
																					
		/*
		String s = "java";
		s.concat(hello);
		System.out.println(s);
		*/
		
//		StringBuffer sb1 = new StringBuffer(50);
//		StringBuffer(int capacity) ũ�⸦ ����. �ʱⰪ  + 16���� ũ�⸦ ����. �ʱⰪ + 16 ���� �� �������� �Ǵٽ� 16���� ������ ��
		
//		length() ���̸� �ǵ�����.		
//		capacity() ũ�⸦ �ǵ�����.	
//		StringBuffer() 0���� ĳ���� 16���� �ʱ�ũ��
		
		
		sb1.insert(10, "@@@");
		System.out.println("5. sb1 == " + sb1);
//		insert(int offset, boolean b) ó����
		
		sb1.delete(10, 12);
		System.out.println("6. sb1 == " + sb1);
//		delete(int start, int end) ��������
		
		sb1.deleteCharAt(10);
		System.out.println("7. sb1 == " + sb1);
//		deleteCharAt(int index) ���� �ϳ� ����
		
		sb1.replace(6, 10, "�ڹ�")	;	
		System.out.println("8. sb1 == " + sb1);
//		replace(int start, int end, String str) ���� ���� �� �ٲ��. 10������ �ٲ��.
		
		sb1.reverse();
		System.out.println("9. sb1 == " + sb1);
//		��������.
		
		sb1.setCharAt(9, '@');
		System.out.println("9. sb1 == " + sb1);
//		setCharAt(int index, char ch)
		
		String s1 = new String(sb1);
		String s2 = sb1.toString();
//		StringBuffer Ŭ������ String Ŭ������ �ٲ���
//		toString()
//		Returns a string representing the data in this sequence.
		
		String str = "hello �ڹ� !!!";
		String findstr = "�ڹ�";
//		String findstr = "����Ŭ";
		String restr = "java";
		
//		hello java !!!
//		����Ŭ�� �����ϴ�.
		
		StringBuffer str1 = new StringBuffer(str);			//	StringBuffer�� str�� �� �� �ִ� ����
		StringBuffer findstr1 = new StringBuffer(findstr);
		StringBuffer restr1 = new StringBuffer(restr);
		str1.delete(6,8);
		str1.insert(6, restr);
		System.out.println(str1);
		
		StringBuffer str2 = new StringBuffer(str);
		StringBuffer findstr2 = new StringBuffer(findstr);
		StringBuffer restr2 = new StringBuffer(restr);
		str2.delete(0,12);
		str2.insert(0, findstr + "�� �����ϴ�.");
		System.out.println(str2);
		
	
		
	}
}




//cap = sb1.capacity();						?? ����� ���� �ȴþ�� ����, �� ũ�⸦ �Ѿ �� �ִ� ����
//StringBuffer�� str�� �� �� �ִ� ����
//����԰� �ٽú��� �� Ŭ���� �����





















