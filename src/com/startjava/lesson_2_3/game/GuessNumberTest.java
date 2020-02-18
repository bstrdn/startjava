package com.startjava.lesson2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Input first player name: ");
		Player firstPlayer = new Player(sc.nextLine());
	
		System.out.print("Input second player name: ");
		Player secondPlayer = new Player(sc.nextLine());

		GuessNumber guesNumb = new GuessNumber();
		
		while (true) {
		System.out.println(firstPlayer.getName() + " moving:");
		firstPlayer.setNumb(sc.nextInt());
		String answer;

		if (guesNumb.move(firstPlayer)) {
			System.out.print("Regame? y/n: ");
			answer = sc.next();
			if (answer.equals("y")) {
				guesNumb = new GuessNumber();
			} else {
				break;
			}
		}

		System.out.println(secondPlayer.getName()  + " moving:");
		secondPlayer.setNumb(sc.nextInt());

		if (guesNumb.move(secondPlayer)) {
			System.out.print("Regame? y/n: ");
			answer = sc.next();
			if (answer.equals("y")) {
				guesNumb = new GuessNumber();
			} else {
				break;
			}
		}

		}

	}
}