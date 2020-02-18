package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		numbCheck(32, 45);
	}

	public static void numbCheck(int secretNumb, int numb) {
			if (numb == secretNumb) {
				System.out.println("You win its " + numb);
			} else {
				while (secretNumb != numb) {
					if (secretNumb < numb) {
						numb--;
					} else {
						numb++;
					}
				}
			System.out.println("You win its " + numb);
			}
	}
}