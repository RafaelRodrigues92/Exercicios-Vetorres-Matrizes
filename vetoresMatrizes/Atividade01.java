package vetoresMatrizes;

import java.util.Scanner;

public class Atividade01 {
	
//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

	public static void main(String[] args) {
		
		Scanner pontuacao = new Scanner (System.in);
		int[] vetor = new int[5];
		int maior = 0;
		
		System.out.println("Digite os valores da pontuação ");
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + " º Valor:");
			vetor[i] = pontuacao.nextInt();
			if(vetor[i] > maior) {
                maior = vetor[i];
			}
			
		}
		System.out.println("O maior número é o " + maior);
        pontuacao.close();
		
	}

}
