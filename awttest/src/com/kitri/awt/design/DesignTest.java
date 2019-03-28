
package com.kitri.awt.design;

import java.awt.*;



/*
	1. Fame ���
	2. ����� �ʿ��� ��ü ����.
	3. ��ġ�ο��� design(component��ġ)
	** �۾��� �׻� �����ź��� ū�ż����� �ϴ°� ����.
*/

public class DesignTest extends Frame{
	
//	�����
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	Label l = new Label("�Է�",Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("����");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	
	
	
	public DesignTest() {	// Ŭ������ ������
		super("Design Test !!!");
//	��ġ��
//	1.setText("�Է�");
		pN.setLayout(new BorderLayout(10 , 0)); // BorderLayout()�� ��븸 �ϹǷ� setLayout pt = new BorderLayout(); ����
//		hgap�� component�� component�� �Ÿ�
		l.setBackground(new Color(210,210,150)); // R,G,B��
//		l.setForeground(new Color(255,0,0));
		l.setForeground(Color.orange); // static�� Ŭ������ ���� ������.
		Font f = new Font("����", Font.BOLD , 20); // �������� �����.
		l.setFont(f);
		pN.add(l, "West"); // default���� ����. 
		pN.add(tf, "Center");
		pN.add(send, "East");
		
		pS.setLayout(new GridLayout(1, 2, 10, 0));
		ch.add("����");
		ch.add("���, ��õ");
		ch.add("����");
		ch.add("��û");
		
		setLayout(new BorderLayout(0,10));
		pS.add(ch);
		exit.setFont(f);
		pS.add(exit);
		
		
		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH); // �̷��� �ص� ��.							?? ����Ʈ�� �� ���� ����.
//		�ݵ�� �빮�ڷ� �ؾߵ�.
//		�޸� �󿡼� ��ġ�۾���.
		
//		setVisible(boolean b) true ������ ���� �Ⱥ�����.
//		setSize(300, 500); // class window �׳ɾ��� ���� Frame ȣ��޾Ƽ�
//		setLocation(300,200);
		setBounds(300, 200, 300, 500); // ���� ��ģ��.
		setResizable(false); // ũ�� �����Ұ�.
		setVisible(true);
//		setVisible�� �׻� �������� �ؾߵ� 
		
	}
	
	public static void main(String[] args) {
		
		new DesignTest(); // �͸����� ��ü����. DesignTest dt = new DesignTest(); dt�� ����� ���� ��� �ȸ���. 
		
	}

}
