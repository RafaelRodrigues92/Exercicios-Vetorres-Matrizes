package vetoresMatrizes;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
// Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
//que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
//imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
//quantas foram as ocorr�ncias da maior pontua��o.
		
		Scanner valorDado = new Scanner(System.in);
		int[] vetor = new int[10];
		int maior=0, quantponto=0, media = 0, soma=0;
	    		
		System.out.println("Digite os valores dos lan�amentos do dado: ");
		for(int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "� Lan�amento: ");
			vetor[i] = valorDado.nextInt();
			soma = soma + vetor[i];
			media = soma / 10;
			if(vetor[i] > maior) {
                maior = vetor[i];
			} 
			
			
		}
		System.out.println("A soma dos lan�amentos do Dado � : " + soma);
		System.out.println("A m�dia dos Dados � : " + media);
		System.out.println("O maior lan�amento foi: " + maior);
	}

}
