package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_19 {

	/*
	 * EZEQUIEL QUEST�O 2
	 * 
	 * Crie um programa que leia o nome de 5 mat�rias e fa�a anota��es e informe:
	 * 
	 * A) Nome do Aluno; 
	 * B) Se todas as notas maiores ou iguais a 6, informar a mensagem: Aluno "Fulano de tal" foi aprovado; 
	 * C) Se 3 ou mais notas principais menores que 6, informar a mensagem: Aluno "Fulano de tal"
	 * foi reprovado; 
	 * D) Se houver at� 2 mat�rias com nota menor que 6, informe a mensagem: Aluno "Fulano de tal" 
	 * foi aprovado, mas possuipend�ncias de material (s): Nome das mat�rias;
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //Importar o LOCALE.US para utilizarmos o ponto como separador decimal
		Scanner sc = new Scanner(System.in); //Importar o SCANNER para o recebimento dos dados digitados

		System.out.println("Quantos alunos vamos avaliar?");
		int QA = sc.nextInt(); //QA = Quantidade de alunos
		String[] nomes = new String[QA];
		for (int i = 0; i < QA; i++) {
			System.out.println("Qual o nome do aluno(a)");
			nomes[i] = sc.next(); //Informe o nome do aluno

			int QM = 5; //Quantidade de Mat�rias
			String[] materias = new String[QM];
			for (int a = 0; a < QM; a++) {
				System.out.println("MAT�RIA " + (a + 1) + ": ");
				materias[a] = sc.next(); //Informe o nome da mat�ria correspondente
			}

			double[] notas = new double[QM];
			for (int a = 0; a < QM; a++) {
				System.out.println("Quanto " + nomes[i] + " tirou em " + materias[a] + "? ");
				notas[a] = sc.nextDouble(); //Informe a nota do aluno na mat�ria correspondente
			}

			int NI = 0; //NI = Notas Inferiores. Aqui armazenaremos a quantidade de notas inferiores a 6.0

			for (int a = 0; a < QM; a++) {
				if (notas[a] < 6.0) {

					NI++; //Aqui contaremos a quantidade de notas inferiores a 6.0
				}
			}

			if (NI >= 3) {
				System.out.println("Aluno(a) " + nomes[i] + " foi: REPROVADO(A) ");
			
			} else if (NI >= 1) {
				System.out.println("Aluno(a) " + nomes[i] + " foi aprovado(a), mas possui PEND�NCIA(S) DE MAT�RIA(S): ");
				for (int a = 0; a < QM; a++) {
					if (notas[a] < 6.0) {
						System.out.println(materias[a]);
					}
				}
			} else {
				System.out.println("Aluno " + nomes[i] + " foi APROVADO ");
			}
			System.out.println(" ");

		}

		sc.close();
	}

}
