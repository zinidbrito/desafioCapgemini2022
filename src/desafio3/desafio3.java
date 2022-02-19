/* 
# Questão 03
Duas words podem ser consideradas anagramas de si mesmas se as letras de uma word podem ser realocadas para formar a outra word. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
Exemplo:
Exemplo 1)
Entrada:
ovo
Saída:
2
Explicação:
A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente. 

Exemplo 2)
Entrada:
ifailuhkqq

Saída:
3

Explicação:
A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].
*/

package desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class desafio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a palavra... ");

		String word = sc.nextLine();
		numeroAnagaramas(word);
		sc.close();
	}

	static void numeroAnagaramas(String word) { //método para percorrer a lista
		ArrayList<String> Anagramas = new ArrayList<String>();
		for (int i = 0; i < word.length(); i++) {
			for (int j = 1; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j) && i < j && i != j) {
					if (word.charAt(i) == word.charAt(i + 1)) {
						String x = word.substring(i, i + 1);
						Anagramas.add(x);
					} else {
						String y = word.substring(i, i + 1);
						Anagramas.add(y);
						String z = word.substring(i, j);
						Anagramas.add(z);
					}
				}
			}
		}
		System.out.println("A palavra digitada possui " + Anagramas.size() + " anagramas.");
	} //fim do método
}