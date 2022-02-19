/*# Quest�o 02

D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. A p�gina de cadastro exigia o preenchimento dos campos de nome e senha, por�m a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes crit�rios:
Possui no m�nimo 6 caracteres.
Cont�m no m�nimo 1 digito.
Cont�m no m�nimo 1 letra em min�sculo.
Cont�m no m�nimo 1 letra em mai�sculo.
Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^||*()-+

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
					.println("A senha deve conter no m�nimo 6 digitos. Falta(m) " + (6 - pwd.length()) + " D�gito(s)");
		}
		if (pwd.toLowerCase() == pwd) { //Compara se possui letras mai�sculas
			System.out.println("� necess�rio ao menos 1 caractere mai�sculo");
			countSafe++;
		}
		if (pwd.toUpperCase() == pwd) { //compara se possui letras minusculas
			System.out.println("� necess�rio ao menos 1 caractere min�sculo");
			countSafe++;
		}
		if ((pwd.contains("!") || pwd.contains("@") || pwd.contains("#") || pwd.contains("$") || pwd.contains("%")
				|| pwd.contains("^") || pwd.contains("&") || pwd.contains("*") || pwd.contains("(") || pwd.contains(")")
				|| pwd.contains("-") || pwd.contains("+")) == false) { //verifica se possui os caracteres especiais
			System.out.println("� necessario ao menos 1 caractere especial");
			countSafe++;
		} else if (countSafe == 0) {
			System.out.println("Sua senha � segura!");
			sc.close();
		}
	}
}
