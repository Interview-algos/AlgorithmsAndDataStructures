package nihar;

import java.util.Random;

public class CardsShuffle {

	
	public static void shuffle() {
	    
		int cardsInDeck = 52;
		int newI;
		int temp;
	    int[] cards = {1,2,3,4,5,6,7,8,9,10,11,12,13,
			       14,15,16,17,18,19,20,21,22,23,24,25,26,
			       27,28,29,30,31,32,33,34,35,36,37,38,39,
	               40,41,42,43,44,45,46,47,48,49,50,52,52};;
	    
	    Random randIndex = new Random();

	    for (int i = 0; i < cardsInDeck; i++) {

	        // pick a random index between 0 and cardsInDeck - 1
	        newI = randIndex.nextInt(cardsInDeck);

	        // swap cards[i] and cards[newI]
	        temp = cards[i];
	        cards[i] = cards[newI];
	        cards[newI] = temp;
	    }
	}
	
	public static void cardShuffle(int[] cards, int[] p1, int[] p2, int[] p3, int[] p4){
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int turn = 0;
		
		Random random = new Random();
		
		for (int i=0; i<52; i++){
			
			int randomIndex = random.nextInt(52-i);
			
			if (turn%4 == 0){
				p1[a++] = cards[randomIndex];
			}else if (turn%4 ==1){
				p2[b++] = cards[randomIndex];
			}
			else if (turn%4 ==2){
				p3[c++] = cards[randomIndex];
			}
			else if (turn%4 ==3){
				p4[d++] = cards[randomIndex];
			}
			
			turn++;
			cards[randomIndex] = cards[51-i];
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] cards = {1,2,3,4,5,6,7,8,9,10,11,12,13,
				       14,15,16,17,18,19,20,21,22,23,24,25,26,
				       27,28,29,30,31,32,33,34,35,36,37,38,39,
		               40,41,42,43,44,45,46,47,48,49,50,52,52};
		int[] p1 = new int[13];
		int[] p2 = new int[13];
		int[] p3 = new int[13];
		int[] p4 = new int[13];
		
		cardShuffle(cards, p1, p2, p3, p4);
		System.out.println("P1");
		for (int i=0;i<p1.length;i++){
			System.out.print(p1[i] + " ");
			
		}
		System.out.println("\nP2");

		for (int i=0;i<p2.length;i++){
			System.out.print(p2[i] + " ");
		}
		System.out.println("\nP3");

		for (int i=0;i<p3.length;i++){
			System.out.print(p3[i] + " ");
		}
		System.out.println("\nP4");

		for (int i=0;i<p4.length;i++){
			System.out.print( p4[i] + " ");
		}

	}

}
