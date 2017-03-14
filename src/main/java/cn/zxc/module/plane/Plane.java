package cn.zxc.module.plane;

import java.awt.Image;

import cn.zxc.module.bullet.Bullet;

public abstract class Plane {
	public Image image;
	public int x;
	public int y;
	public int speed;
	public boolean isDead;
	
	public abstract void move(int x,int y, int speed);
	public abstract void fire(Bullet bullet);
	
}
