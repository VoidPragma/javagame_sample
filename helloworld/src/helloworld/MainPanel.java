package helloworld;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel implements Runnable {
	//�p�l���T�C�Y
	public static final int WIDTH = 240;
	public static final int HEIGHT = 240;
	//�{�[���̐�
	private static final int NUM_BALL = 6;
	//�{�[���i�[�z��
	private Ball[] ball;
	//�A�j���[�V�����p�X���b�h
	private Thread thread;
	
	public MainPanel(){
		//�p�l���̐����T�C�Y��ݒ�Apack()���鎞�ɕK�v
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		//�ϐ��Ȃǂ̏�����
		ball = new Ball[NUM_BALL];
		//�{�[���쐬
		ball[0] = new Ball(0,0,1,2);
		ball[1] = new Ball(10, 10, 3, -2);
	    ball[2] = new Ball(50, 0, -2, 3);
	    ball[3] = new Ball(0, 0, 12, 8);
	    ball[4] = new Ball(100,40,-1,5);
	    ball[5] = new Ball(230,10,2,1);
		
		//�X���b�h�N��
		thread = new Thread(this);
		thread.start();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//�Ֆʂ�`������A�t�B�[���h��`�����肷��
		for(int i = 0; i < NUM_BALL; i++){
			ball[i].draw(g);
		}
	}
	//���C�����[�v
	
	public void run(){
		//�v���O�������I������܂Ńt���[���������J��Ԃ�
		while(true){
			
		    for(int i = 0; i< NUM_BALL; i++){
		    	ball[i].move();
		    }
		    
			
			//�ĕ`��
			repaint();
			
			//20�~���b�����x�~
			try{
				Thread.sleep(20);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			
		}
	}

}
