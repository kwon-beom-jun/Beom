package com.kitri.io;

import java.io.*;

public class FileReaderTest {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		try {
			File infile = new File("f:\\iotest\\hello.txt");
			fr = new FileReader(infile);
			long length = infile.length();
			char c[] = new char[(int)length];
			int x = fr.read(c);
			System.out.println(x + " characters read!!!");
			String str = new String(c);
			System.out.println(c);
			
			File outfile = new File("f:\\iotest\\hello_copy2.txt");
			fw = new FileWriter(outfile);
			fw.write(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();					
				}
				if (fr != null) {									// 안닫으면 복제가 안되나?
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
