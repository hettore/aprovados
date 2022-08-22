package aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados: ");
		int n = sc.nextInt();
		
		String nome[] = new String[n];
		double nota1[] = new double[n];
		double nota2[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Dados do " + (i+1) + "º aluno: ");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.print("Primeira nota: ");
			nota1[i] = sc.nextDouble();
			
			System.out.print("Segunda nota: ");
			nota2[i] = sc.nextDouble();
			
			
		}
		
		System.out.println("Alunos aprovados: ");
		
		double media = 0.0;
		for (int i = 0; i < n; i++) {
			media = (nota1[i] + nota2[i]) / 2;  
			if (media >= 6.0) {
				System.out.println(nome[i]);
			}
			
		}
		
		System.out.println("Reprovados: ");
		for (int i = 0; i < n; i++) {
			media = (nota1[i] + nota2[i]) / 2;  
			if (media < 6.0) {
				System.out.println(nome[i]);
			}
		}
 		sc.close();
		
	}

}
