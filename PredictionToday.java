package com.sara;

import java.util.Random;
import java.util.Scanner;

public class Add {
	public static void main(String args[]) {

		System.out.println("Welcome to the life today");
		
		Scanner s1 = new Scanner(System.in);

		System.out.println("enter your name");

		String name = s1.next();

		System.out.println("Hello  " + name);

		Scanner s2 = new Scanner(System.in);

		System.out.println("please enter your mobile number");

		String no = s2.next();

		if (no.length() == 10) {
			System.out.println("saved");
		} else {
			System.out.println("pleave provide 10 digit no");
		}

		Scanner s3 = new Scanner(System.in);
		System.out.println("please provide mail id");

		String mail = s3.next();

		if (mail.contains("@") && mail.contains(".")) {
			System.out.println("valid see your life prediction today");

		} else {
			System.out.println("invalid mail id");
		}

		Random r = new Random();

		int token = r.nextInt(5);

		System.out.println("Your lucky no is   " + token);

		if (token == 1) {
			System.out.println("Today you are blessed by the moon, you may perform well on your professional front.");
		}
		if (token == 2) {
			System.out.println("Today, you may feel nervous, you may have a lack of patience .");
		}
		if (token == 3) {
			System.out.println(
					"Today you may spend to buy some creative or artefacts torenovate your house, which may increase your social status");
		}
		if (token == 4) {
			System.out.println(
					"Today you are not blessed by the moon. You may feel unhappy,you may become impatient today, you may find it difficult to .");
		}
		if (token == 5) {
			System.out.println(
					"Today, you are blessed by the moon. Work-related pressuremay go off. Your earnings may convert into profits now");
		}

	}
}
