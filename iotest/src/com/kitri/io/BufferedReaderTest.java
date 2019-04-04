package com.kitri.io;

import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) {
		
//		InputStream is = System.in;
//		Reader r = new InputStreamReader(is);
//		BufferedReader in = new BufferedReader(r); // 만들려면 위에 조건들이 필요함. 									해석이 필요함.
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // 한줄로 바꿀 수 있음.
		BufferedReader fin = null;
		FileWriter fw = null;																				//??
		
		try {
			System.out.println("읽을 파일이름 : ");
			String infile = in.readLine();
			System.out.println("infile == " + infile); // 엔터전까지 읽어드림.										확인해보기.
			
			System.out.println("복사할 파일 이름 : ");
			String outfile = in.readLine();
			fw = new FileWriter(new File(outfile));
			
			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));//  		해석이 필요함.
			String str = null;
			while ((str = in.readLine()) != null) { // in.readLine을 읽어드려라
				System.out.println(str + "\r\n");		// \r\n 쳐줘야뎀 메모장은 원시적이라 \r을 붙여야뎀.
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
