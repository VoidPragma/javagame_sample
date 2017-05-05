package helloworld;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel implements Runnable {
	//パネルサイズ
	public static final int WIDTH = 240;
	public static final int HEIGHT = 240;
	//ボールの数
	private static final int NUM_BALL = 6;
	//ボール格納配列
	private Ball[] ball;
	//アニメーション用スレッド
	private Thread thread;
	
	public MainPanel(){
		//パネルの推奨サイズを設定、pack()する時に必要
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		//変数などの初期化
		ball = new Ball[NUM_BALL];
		//ボール作成
		ball[0] = new Ball(0,0,1,2);
		ball[1] = new Ball(10, 10, 3, -2);
	    ball[2] = new Ball(50, 0, -2, 3);
	    ball[3] = new Ball(0, 0, 12, 8);
	    ball[4] = new Ball(100,40,-1,5);
	    ball[5] = new Ball(230,10,2,1);
		
		//スレッド起動
		thread = new Thread(this);
		thread.start();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//盤面を描いたり、フィールドを描いたりする
		for(int i = 0; i < NUM_BALL; i++){
			ball[i].draw(g);
		}
	}
	//メインループ
	
	public void run(){
		//プログラムが終了するまでフレーム処理を繰り返す
		while(true){
			
		    for(int i = 0; i< NUM_BALL; i++){
		    	ball[i].move();
		    }
		    
			
			//再描写
			repaint();
			
			//20ミリ秒だけ休止
			try{
				Thread.sleep(20);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			
		}
	}

}
