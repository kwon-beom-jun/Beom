package com.kitri.io;

import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) {
		
//		InputStream is = System.in;
//		Reader r = new InputStreamReader(is);
//		BufferedReader in = new BufferedReader(r); // ������� ���� ���ǵ��� �ʿ���. 									�ؼ��� �ʿ���.
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // ���ٷ� �ٲ� �� ����.
		BufferedReader fin = null;
		FileWriter fw = null;																				//??
		
		try {
			System.out.println("���� �����̸� : ");
			String infile = in.readLine();
			System.out.println("infile == " + infile); // ���������� �о�帲.										Ȯ���غ���.
			
			System.out.println("������ ���� �̸� : ");
			String outfile = in.readLine();
			fw = new FileWriter(new File(outfile));
			
			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));//  		�ؼ��� �ʿ���.
			String str = null;
			while ((str = in.readLine()) != null) { // in.readLine�� �о�����
				System.out.println(str + "\r\n");		// \r\n ����ߵ� �޸����� �������̶� \r�� �ٿ��ߵ�.
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();					
				}
				if (fin != null) {									
					fin.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}

}
