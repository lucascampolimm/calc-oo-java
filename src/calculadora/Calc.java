package Calculadora;

import java.util.Scanner;
import java.io.IOException;

public class Calc {
	
	public int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	public int diminuir(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	public double dividir(double num1, double num2) {
		return num1 / num2;
	}
	
	public int resto(int num1, int num2) {
		return num1 % num2;
	}
	
	public void menu() {
		System.out.println("\nEscolha uma opção: ");
		System.out.println("1) Somar ");
		System.out.println("2) Diminuir ");
		System.out.println("3) Multiplicar ");
		System.out.println("4) Dividir ");
		System.out.println("5) Resto ");
		System.out.println("6) Sair \n");
		System.out.print(">> ");
	}
	
	public static void main(String[] xuxa) throws IOException {	
		
		Calc c = new Calc();
		int num1 = 0, num2 = 0, op;
		int sair = 0;
		Scanner input = new Scanner(System.in);
		
		while(sair == 0) {
			c.menu();
			op = input.nextInt();
			if (op >= 1 && op <= 5) {
				System.out.print("Digite o primeiro número: ");
				num1 = input.nextInt();
				System.out.print("Digite o segundo número: ");
				num2 = input.nextInt();
			}
			
			switch(op) {
				case 1:	
					System.out.print("O resultado da soma é: " + c.somar(num1, num2));
					break;
				case 2:
					System.out.print("O resultado da subtração é: " + c.diminuir(num1, num2));
					break;
				case 3:
					System.out.print("O resultado da multiplicação é: " + c.multiplicar(num1, num2));
					break;
				case 4:
					if (num2 == 0) {
						System.out.print("Não é possível dividir por zero!");
					} else {
						System.out.printf("O resultado da divisão é: %.2f", c.dividir((double)num1, (double)num2));
					}
					break;
				case 5:
					System.out.print("O resultado do resto da divisão inteira é: " + c.resto(num1, num2));
					break;
				case 6:
					sair = 1;
					input.close();
					System.out.print("Você saiu do programa!");
					return;
				default:
					System.out.print("Opção inválida!");
			}
			System.out.print("\n\nPrecione qualquer tecla para continuar...");
			System.in.read();
		}
		input.close();
	}
}