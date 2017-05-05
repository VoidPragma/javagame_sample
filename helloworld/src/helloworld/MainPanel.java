package helloworld;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel implements Runnable {
	//パネルサイズ
	private static final int WIDTH = 240;
	private static final int HEIGHT = 240;
	//ボールの大きさ、位置、速度
	private static final int SIZE = 10;
	private int x;
	private int y;
	private int vx;
	private int vy;
	//アニメーション用スレッド
	private Thread thread;
	
	public MainPanel(){
		//パネルの推奨サイズを設定、pack()する時に必要
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		//変数などの初期化
		x = 100;
		y = 100;
		vx = 1;
		vy = 1;
		
		//スレッド起動
		thread = new Thread(this);
		thread.start();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//盤面を描いたり、フィールドを描いたりする
		g.setColor(Color.BLUE);
		g.fillOval(x - SIZE, y - SIZE, SIZE, SIZE);
	}
	
	//メインループ
	
	public void run(){
		//プログラムが終了するまでフレーム処理を繰り返す
		while(true){
			x += vx;
			y += vy;
			
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
