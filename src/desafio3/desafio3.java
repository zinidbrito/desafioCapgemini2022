/* 
# Quest�o 03
Duas words podem ser consideradas anagramas de si mesmas se as letras de uma word podem ser realocadas para formar a outra word. Dada uma string qualquer, desenvolva um algoritmo que encontre o n�mero de pares de substrings que s�o anagramas.
Exemplo:
Exemplo 1)
Entrada:
ovo
Sa�da:
2
Explica��o:
A lista de todos os anagramas pares s�o: [o, o], [ov, vo] que est�o nas posi��es [[0], [2]], [[0, 1], [1, 2]] respectivamente. 

Exemplo 2)
Entrada:
ifailuhkqq

Sa�da:
3

Explica��o:
A lista de todos os anagramas pares s�o: [i, i], [q, q] e [ifa, fai] que est�o nas posi��es [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].
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

	static void numeroAnagaramas(String word) { //m�todo para percorrer a lista
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
	} //fim do m�todo
}