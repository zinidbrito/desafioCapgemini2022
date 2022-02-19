/*# Quest�o 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espa�os. A base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o deve conter nenhum espa�o.

Exemplo:

Entrada:

n = 6

Sa�da:

     *
    **
   ***
  ****
 *****
******
*
*/

package desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		List<String> degraus = new ArrayList<>();
		
		System.out.println("==================================");
		
		System.out.print("Quantos degraus sua escada ter�? ");
		int qDegraus = sc.nextInt(); //recebe a quantidade de degraus
		sc.close();
		for (int i = 0; i < qDegraus; i++) { //percorre a quantidade de degraus
		degraus.add(" ".repeat(qDegraus - i) + "*".repeat(i + 1));  //remove o espa�o antes do caractere *
		}
		
		for (String d : degraus ) {
		System.out.println(d);
		}

	}

}
