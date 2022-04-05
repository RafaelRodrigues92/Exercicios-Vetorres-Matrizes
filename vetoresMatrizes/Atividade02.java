package vetoresMatrizes;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
// Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
//que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
//imprima a média aritmética dos lançamentos, contabilize e apresente também
//quantas foram as ocorrências da maior pontuação.
		
		Scanner valorDado = new Scanner(System.in);
		int[] vetor = new int[10];
		int maior=0, quantponto=0, media = 0, soma=0;
	    		
		System.out.println("Digite os valores dos lançamentos do dado: ");
		for(int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "º Lançamento: ");
			vetor[i] = valorDado.nextInt();
			soma = soma + vetor[i];
			media = soma / 10;
			if(vetor[i] > maior) {
                maior = vetor[i];
			} 
			
			
		}
		System.out.println("A soma dos lançamentos do Dado é : " + soma);
		System.out.println("A média dos Dados é : " + media);
		System.out.println("O maior lançamento foi: " + maior);
	}

}
