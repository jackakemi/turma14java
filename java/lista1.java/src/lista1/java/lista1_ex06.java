package lista1.java;

import java.util.Scanner;

public class lista1_ex06 {	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, p1, p2, d;
		
		System.out.println("Digite x1, x2, y1 e y2: ");
		x1 = leia.nextInt();
		x2 = leia.nextInt();
		y1 = leia.nextInt();
		y2 = leia.nextInt();
		
		p1 = Math.pow((x2-x1),2);
		p2 = Math.pow((y2-y1),2);
		
		
		d = Math.sqrt(p1 + p2);
		
		
		System.out.println(d);	
	}
}
