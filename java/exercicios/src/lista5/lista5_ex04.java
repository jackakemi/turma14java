/*Faça um programa que calcula e escreve a seguinte soma: 
 * soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
gira 50 vezes (para = 50)
somar numero impar, sempre somar 2…(impar +=2)*/


package lista5;

public class lista5_ex04 {
	public static void main(String[] args) {
		
		int num = 0;
		int impar = -1;
		
		for(int i=0; i<50; i++) {
			impar+=2;
			num++;
			
			System.out.println(impar + "/" + num);
		}
	}
}

