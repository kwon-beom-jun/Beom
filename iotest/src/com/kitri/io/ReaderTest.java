package com.kitri.io;

import java.io.*;

public class ReaderTest {
	
	public static void main(String[] args) {
		
		Reader in = null;
		try {
			in = new InputStreamReader(System.in);		// ���ͽ�Ʈ��, ĳ���ͽ�Ʈ���̶�� ��.
			char c[] = new char[100];					 // �迭�༭ ������ �ҷ��ٷ���.
			System.out.println("�Է� : ");
			int x = in.read(c);							// ���ڼ� (\r\n = enter)
			System.out.println("x == " + x);
			
			int len = c.length;
			for (int i = 0; i < len; i++) {
				System.out.println(c[i]);
			}
			//���ڰ� ����� ����� Ȯ��. ���� ���� ������ ����Ʈ�� �� ����༭ ����.
			
			String str = new String(c , 0 , x -2);		//	�Է±��ڸ� �״�� ����������ؼ� ��. �ڿ��� Ŀ����ġ �����ҷ���.
			System.out.println(str);					//	�Է±��ڸ� �״�� ����������ؼ� ��.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
