package helloworld;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	//�p�l���T�C�Y
	private static final int WIDTH = 240;
	private static final int HEIGHT = 240;
	private String str;
	
	public MainPanel(){
		//�p�l���̐����T�C�Y��ݒ�Apack()���鎞�ɕK�v
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		//�ϐ��Ȃǂ̏�����
		str = "Hello World";
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//�Ֆʂ�`������A�t�B�[���h��`�����肷��
		g.drawString(str, 20, 50);
	}

}
