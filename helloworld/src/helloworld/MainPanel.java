package helloworld;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel implements Runnable {
	//�p�l���T�C�Y
	private static final int WIDTH = 240;
	private static final int HEIGHT = 240;
	//�{�[���̑傫���A�ʒu�A���x
	private static final int SIZE = 10;
	private int x;
	private int y;
	private int vx;
	private int vy;
	//�A�j���[�V�����p�X���b�h
	private Thread thread;
	
	public MainPanel(){
		//�p�l���̐����T�C�Y��ݒ�Apack()���鎞�ɕK�v
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		//�ϐ��Ȃǂ̏�����
		x = 100;
		y = 100;
		vx = 1;
		vy = 1;
		
		//�X���b�h�N��
		thread = new Thread(this);
		thread.start();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//�Ֆʂ�`������A�t�B�[���h��`�����肷��
		g.setColor(Color.BLUE);
		g.fillOval(x - SIZE, y - SIZE, SIZE, SIZE);
	}
	
	//���C�����[�v
	
	public void run(){
		//�v���O�������I������܂Ńt���[���������J��Ԃ�
		while(true){
			x += vx;
			y += vy;
			
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
