import java.util.ArrayList;

public class Program {
	public static void main (String[] args) {
		System.out.println("Lottery numbers: ");
		LotteryNumbers lotteryNumbers = new LotteryNumbers();
		ArrayList<Integer> numbers = lotteryNumbers.numbers();
		
		
		for (int number: numbers) {
			System.out.print(number + " ");
		}
		System.out.println("");
	}

}
