public class PhraseOMatic{
  
  //PhraseOMatic - Create a crazy phrase by acessing 3 String with a list of words and combine them
  
	public static void main (String args[]){

		//criação de tres conjuntos de palavras onde será feita a selecao

		String[] wordListOne = {"falar", "comer", "ejetar", "furar", "morder", "beijar", "lavar", "arrancar", "arrumar", "amordaçar","cheirar", "degustar", "apreciar"
		};

		String[] wordListTwo = {"o hombre", "a casa", "a faca", "o amigo", "a juba", "o ovo", "a casa", "a lista", "o leitao", "a mina", "a porta","a maçaneta", "a gaveta", "o gelo", "o nudes", "o porco", "o leite", "a laranja", "a madrasta", "o ping pong", "o celular"
		};

		String[] wordListThree = {"gente", "chiclete", "televisao", "lapiseira", "chave", "mouse","JAVA", "graffiti", "", "bomba", "carro", "estrela", "espaço", "múmia","piscina"
		};

		//descobrindo quantas palavras existem em cada lista

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		//gera tres números aleatórios
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		//agora constrói uma frase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		//exibe a frase formada
		System.out.println("Precisamos de " + phrase);



	}
}
