/*# Questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^||*()-+

*/
package desafio2;

import java.util.Scanner;

public class desafio2 {

	public static void main(String args[]) {

		int countUpper = 0;
		int countLower = 0;
		int countDigit = 0;
		int countCaracterSpecial = 0;
		int minimoCaracteres = 6;
		int countSafe = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua senha:");
		String pwd = sc.nextLine();

		if (pwd.length() < 6) {
			System.out
					.println("A senha deve conter no mínimo 6 digitos. Falta(m) " + (6 - pwd.length()) + " Dígito(s)");
		}
		if (pwd.toLowerCase() == pwd) { //Compara se possui letras maiúsculas
			System.out.println("É necessário ao menos 1 caractere maiúsculo");
			countSafe++;
		}
		if (pwd.toUpperCase() == pwd) { //compara se possui letras minusculas
			System.out.println("É necessário ao menos 1 caractere minúsculo");
			countSafe++;
		}
		if ((pwd.contains("!") || pwd.contains("@") || pwd.contains("#") || pwd.contains("$") || pwd.contains("%")
				|| pwd.contains("^") || pwd.contains("&") || pwd.contains("*") || pwd.contains("(") || pwd.contains(")")
				|| pwd.contains("-") || pwd.contains("+")) == false) { //verifica se possui os caracteres especiais
			System.out.println("É necessario ao menos 1 caractere especial");
			countSafe++;
		} else if (countSafe == 0) {
			System.out.println("Sua senha é segura!");
			sc.close();
		}
	}
}
