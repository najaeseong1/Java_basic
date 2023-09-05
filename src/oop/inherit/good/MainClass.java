package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "전사1";
		w1.rage = 60;
		w1.characterInfo();
		
		System.out.println("--------------------------------");
		
		Hunter h1 = new Hunter();
		h1.level = 1;
		h1.atk = 4;
		h1.hp = 30;
		h1.name = "hunter1";
		h1.pet = "강아지";
		h1.characterInfo();
		
		System.out.println("--------------------------------");

		Mage m1 = new Mage();
		m1.level = 1;
		m1.atk = 2;
		m1.hp = 50;
		m1.name = "mage1";
		m1.mana = 20;
		m1.characterInfo();
		
	}
	

}
