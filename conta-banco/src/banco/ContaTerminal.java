package banco;

import java.util.Scanner;

import java.util.Locale;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO importar a classe scanner
		
		// Exibir as mensagens para o usu�rio
		
		// Obter pelo scanner valores digitados no terminal
		
		// Exibir a mensagem de conta criada
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		//pede para o cliente digitar o n�mero da conta de 4 digitos
		System.out.println("Por favor, digite o n�mero da conta: ");
		int numeroConta = scanner.nextInt();
		
		//pede para o cliente digitar seu nome
		System.out.println("Por favor, digite seu nome: ");
		String nomeCliente = scanner.next();
		
		//pede para o cliente digitar o n�mero da ag�ncia de 4 digitos com final separado por "-"
		System.out.println("Por favor, digite o n�mero da ag�ncia: ");
		String agencia = scanner.next();
		
		//pede para o cliente informar seu saldo 
		System.out.println("Por favor, digite o seu saldo: ");
		Double saldo = scanner.nextDouble();
		
		//mensagem da conclus�o da cria��o da conta
		System.out.println("Ol� " + nomeCliente + ", obrigado por criar uma conta em nosso "
				+ "banco, sua ag�ncia � " + agencia + ", conta " + numeroConta + " e seu saldo "
						+ saldo + "R$ j� est� dispon�vel para saque.");

	}

}
