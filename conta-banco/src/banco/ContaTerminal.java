package banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO importar a classe scanner
		
		// Exibir as mensagens para o usuário
		
		// Obter pelo scanner valores digitados no terminal
		
		// Exibir a mensagem de conta criada
		
		Scanner scanner = new Scanner(System.in);
		
		//pede para o cliente digitar o número da agência de 4 digitos
		System.out.println("Por favor, digite o número da conta: ");
		int numero = scanner.nextInt();
		
		//pede para o cliente digitar seu nome
		System.out.println("Por favor, digite seu nome: ");
		String nomeCliente = scanner.next();
		
		//pede para o cliente digitar o número da agência de 4 digitos com final separado
		System.out.println("Por favor, digite o número da agência: ");
		String agencia = scanner.next();
		
		//pede para o cliente informar seu saldo 
		System.out.println("Por favor, digite o seu saldo: ");
		double saldo = scanner.nextDouble();
		
		

	}

}
