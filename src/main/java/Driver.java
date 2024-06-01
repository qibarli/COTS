import src.main.java.Tally;

public class Driver {

	public static void main(String[] args) {
		
		Tally tally = new Tally();
		
		System.out.println("Count result:" + tally.getTotal());
		
		tally.add();
		
		System.out.println("Count result:" + tally.getTotal());
		
		tally.subtract();
		
		System.out.println("Count result:" + tally.getTotal());
		
	}

}
