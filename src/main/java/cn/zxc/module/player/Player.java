package cn.zxc.module.player;

import cn.zxc.module.bullet.Bullet;
import cn.zxc.module.plane.Plane;

public class Player extends Plane{

	@Override
	public void move(int x, int y, int speed) {
		
	}

	@Override
	public void fire(Bullet bullet) {
		bullet.move(1, 2, 3, 4);
	}

}
