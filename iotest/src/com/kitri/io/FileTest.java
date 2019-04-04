package com.kitri.io;

import java.io.*;

public class FileTest {
	
	public static void main(String[] args) {
		
		InputStream in = null; // try�ȿ� ������ final�� �����ؼ� ����.
		OutputStream out = null;
		try {
			File infile = new File("f:\\iotest\\hello.txt");
			in = new FileInputStream(infile); // in�� out�� ���� �׻� �ݾƾߵ�
			long length = infile.length();
//			long	length()
			byte b[] = new byte[(int)length];
			int x = in.read(b);	//	�� ����Ʈ���� üũ��.
			String str = new String(b,0,x); // �ִ� �״�� �ѷ��ߵ�.
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
