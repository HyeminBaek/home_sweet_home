package com.hammm;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
���α׷� ����)
���� �ٹ� �� ��� ���� ������ ���� �����ϱ� ���� ���α׷��Դϴ�
���콺�� 10�� ������ ������, �ʷϺ��� �������ݴϴ�! ¯¯

���α׷� �����)
Run �Ͻʼ�

ver 1.0 - ���� ���α׷� �ۼ�(22/04/08)
�ۼ���: ������
*/
public class bacccine {
	private static void run(int minutes){
		Timer timer = new Timer();
		TimerTask timertask = new TimerTask() {
			@Override
			public void run() {
				PointerInfo pointerinfo = MouseInfo.getPointerInfo();

				try {
					Robot robot = new Robot();
					Random random = new Random();
					
					int x = random.nextInt()%1280;
					int y = random.nextInt()%960;
					robot.mouseMove(x, y);
					
					System.out.println("start");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}; //timertask class
		
		timer.schedule(timertask, 1000*minutes);
	}
	public static void main(String[] args) throws Exception{
		Dimension dimension = new Dimension(500,200);
		
		JFrame jframe = new JFrame("�谳���� Ȩ ���� Ȩ~");
		jframe.setPreferredSize(dimension);
		jframe.setLocationRelativeTo(null); //ȭ�� ����� ��ġ
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ������ �޸𸮿��� ����
		jframe.getContentPane().setLayout(null); //�θ� ���̾ƿ�
		
		//�ڽ� ������Ʈ
		JButton button = new JButton("����");
		JButton button2 = new JButton("����");
		final JTextField jtextfield = new JTextField();
		JLabel jlabel = new JLabel("���콺�� ������ �ð�(��)�� �Է����ּ���");
		
		//�ؽ�Ʈ ��ġ ����
		jlabel.setBounds(130,0,300,60);
		
		//input ��ġ ����
		jtextfield.setBounds(200, 50, 100, 30);
		
		//��ư ��ġ ����
		button.setBounds(85,85,150,60);
		button2.setBounds(250,85,150,60);
		
		//��ư �̺�Ʈ ����
		ActionListener btn_action = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				int minutes = Integer.parseInt(jtextfield.getText());
				System.out.println(minutes);
				
				run(minutes);
			}
		};
		button.addActionListener(btn_action);
		
		ActionListener btn2_action = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("end");
			}
		};
		button2.addActionListener(btn2_action);
		
		//�θ� �ڽ� ������Ʈ �߰�
		jframe.getContentPane().add(jlabel);
		jframe.getContentPane().add(jtextfield);
		jframe.getContentPane().add(button);
		jframe.getContentPane().add(button2);

		jframe.pack();
		jframe.setVisible(true);
	}

}
