public class BeerSong{
  //BeerSong - It is a cool program to see how "while", "if" and "else" works together
  
	public static void main (String args[]) {
		int beerNum = 99;
		String word = "bottles";

		while (beerNum > 0){
			if(beerNum == 1){
				word = "bottle"; //no singular, como UMA garrafa.
			}

			if(beerNum > 0){
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;	
			} else {
				System.out.println("No more bottles of beer on the wall");	

			}//fim do else

		}//fim do while

	}//fim do metodo main

}//fim da classe
