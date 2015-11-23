import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
	private ArrayList<Integer> numbers;
	Random randomizer = new Random();
	
	public LotteryNumbers() {
		
		this.numbers = new ArrayList<Integer>();
		
		this.drawNumbers();
	}
	
	public ArrayList<Integer> numbers() {
		return this.numbers;
	}
	
	public void drawNumbers() {
		int i = 0;
		while (i < 7) {
			int lotto =	randomizer.nextInt(39);
			if (containsNumber(lotto) == true){
				numbers.remove(lotto);
				System.out.println("hi");
			}else{
				System.out.print(" " +randomizer.nextInt(39));
				i++;
			}
		}
	}
	
	public boolean containsNumber (int number) {
		if (numbers.contains(number)) {
			return true;
		} else {
			return false;
		}
	}
}
