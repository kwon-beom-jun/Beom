package com.kitri.io;

import java.io.*;

public class FileTest {
	
	public static void main(String[] args) {
		
		InputStream in = null; // try안에 넣으면 final때 사용못해서 빼줌.
		OutputStream out = null;
		try {
			File infile = new File("f:\\iotest\\hello.txt");
			in = new FileInputStream(infile); // in과 out을 쓰면 항상 닫아야뎀
			long length = infile.length();
//			long	length()
			byte b[] = new byte[(int)length];
			int x = in.read(b);	//	몇 바이트인지 체크함.
			String str = new String(b,0,x); // 있는 그대로 뿌려야됨.
			System.out.println(x + " bytes read!!!");
			System.out.println(str);
			
			File outfile = new File("f:\\iotest\\hello_copy.txt");
			out = new FileOutputStream(outfile);
			out.write(b);
//			void	write(byte[] b)
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();					
				}
				if (in != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		
	}

}
