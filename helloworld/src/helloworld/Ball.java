package helloworld;

import java.awt.*;

public class Ball {
	//ボールの大きさ、位置、速度
	private static final int SIZE = 10;
	private int x,y;
	protected int vx,vy;
	
	//コンストラクタ
	public Ball(int x, int y, int vx, int vy){
		//ボールの属性を設定
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	
	public void move(){
		x += vx;
		y += vy;
		
		 // 左または右に当たったらx方向速度の符号を反転させる
        if (x < 0 || x > MainPanel.WIDTH - SIZE) {
            vx = -vx;
        }

        // 上または下に当たったらy方向速度の符号を反転させる
        if (y < 0 || y > MainPanel.HEIGHT - SIZE) {
            vy = -vy;
        }
		
	}
	
	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(x, y, SIZE, SIZE);
		
	}

}
