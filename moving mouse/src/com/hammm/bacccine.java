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
프로그램 설명)
재택 근무 중 노란 불이 켜지는 것을 방지하기 위한 프로그램입니다
마우스를 10분 단위로 움직여, 초록불을 유지해줍니다! 짱짱

프로그램 사용방법)
Run 하십쇼

ver 1.0 - 최초 프로그램 작성(22/04/08)
작성자: 백혜민
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
		
		JFrame jframe = new JFrame("배개민의 홈 스윗 홈~");
		jframe.setPreferredSize(dimension);
		jframe.setLocationRelativeTo(null); //화면 가운데에 배치
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 닫으면 메모리에서 제거
		jframe.getContentPane().setLayout(null); //부모 레이아웃
		
		//자식 컴포넌트
		JButton button = new JButton("시작");
		JButton button2 = new JButton("종료");
		final JTextField jtextfield = new JTextField();
		JLabel jlabel = new JLabel("마우스를 움직일 시간(분)를 입력해주세요");
		
		//텍스트 위치 설정
		jlabel.setBounds(130,0,300,60);
		
		//input 위치 설정
		jtextfield.setBounds(200, 50, 100, 30);
		
		//버튼 위치 설정
		button.setBounds(85,85,150,60);
		button2.setBounds(250,85,150,60);
		
		//버튼 이벤트 정의
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
		
		//부모에 자식 컴포넌트 추가
		jframe.getContentPane().add(jlabel);
		jframe.getContentPane().add(jtextfield);
		jframe.getContentPane().add(button);
		jframe.getContentPane().add(button2);

		jframe.pack();
		jframe.setVisible(true);
	}

}
