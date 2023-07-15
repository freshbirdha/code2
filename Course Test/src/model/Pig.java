package model;

public class Pig {
	public int  size;
	public String color;
	public int attack;
	public double accuary;
	
	
	public void show() {
		System.out.println(this.size + " : " 
							+ this.color + " : " + 
							this.attack  + " : " 
							+ this.accuary);
	}
}
