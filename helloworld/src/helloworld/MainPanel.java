package helloworld;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	//パネルサイズ
	private static final int WIDTH = 240;
	private static final int HEIGHT = 240;
	private String str;
	
	public MainPanel(){
		//パネルの推奨サイズを設定、pack()する時に必要
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		//変数などの初期化
		str = "Hello World";
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//盤面を描いたり、フィールドを描いたりする
		g.drawString(str, 20, 50);
	}

}
