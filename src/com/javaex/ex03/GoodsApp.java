package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(9000000);
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		camera.showinfo();
		cup.showinfo();
		computer.showinfo();
	}

}

//////다시 만들어보기