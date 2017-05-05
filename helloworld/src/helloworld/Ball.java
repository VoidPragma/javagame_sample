package helloworld;

import java.awt.*;

public class Ball {
	//�{�[���̑傫���A�ʒu�A���x
	private static final int SIZE = 10;
	private int x,y;
	protected int vx,vy;
	
	//�R���X�g���N�^
	public Ball(int x, int y, int vx, int vy){
		//�{�[���̑�����ݒ�
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	
	public void move(){
		x += vx;
		y += vy;
		
		 // ���܂��͉E�ɓ���������x�������x�̕����𔽓]������
        if (x < 0 || x > MainPanel.WIDTH - SIZE) {
            vx = -vx;
        }

        // ��܂��͉��ɓ���������y�������x�̕����𔽓]������
        if (y < 0 || y > MainPanel.HEIGHT - SIZE) {
            vy = -vy;
        }
		
	}
	
	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(x, y, SIZE, SIZE);
		
	}

}
