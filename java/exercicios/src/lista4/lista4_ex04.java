//Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
//ou seja, diagonal principal.

package lista4;

import java.util.Scanner;

public class lista4_ex04 {
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int [][] matriz = new int [3][3];
		int soma = 0;
		int somaDiagonal = 0;
		
		for(int linha=0; linha<3; linha++){
			for(int coluna=0; coluna<3; coluna++){
				System.out.printf("Insira: [%d] [%d] ", linha+1, coluna+1);
				matriz[linha][coluna]=leia.nextInt();
			}
		}
		
		System.out.println("\n\t\tRESULTADO MATRIZ\n");
		for(int linha=0; linha<3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                System.out.printf("\t %d \t",matriz[linha][coluna]);
            }
            System.out.println();
        }
		
		for(int linha=0; linha<3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                soma+= matriz[linha][coluna];
            }
		}

        System.out.printf("\nA soma das matriz é de: %d",soma);
        
        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){			

                if(linha == coluna){
                	somaDiagonal += matriz[linha][coluna];
                }
            }
        }
        
        System.out.printf("\nA soma da matriz diagonal é: %d ",somaDiagonal);
        
	}
}
        