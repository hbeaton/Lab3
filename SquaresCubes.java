import java.util.Scanner;

public class SquaresCubes {
	
	//Paired-Programming by: Heather and Sarah

	public static void main(String[] args) {
		
		System.out.println("Learn your squares and cubes!");
		
		Scanner scan = new Scanner(System.in);
		
		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Enter a positive integer: ");
			int n = scan.nextInt();
			
			//Headings for table
			System.out.println("Number" + "\t   " + "Squared" + "\t" + "Cubed");
			System.out.println("=======" + "\t   " + "=======" + "\t" + "======");
			
			//Calculates squares and cubes; loops up through user input
			for (int i = 1; i <= n; i++) {
				System.out.println(i + "\t   " + (int) Math.pow(i, 2) + "\t\t" + (int) Math.pow(i, 3));
			}	
			scan.nextLine(); //clears scanner of return after .nextInt
			System.out.println("Continue? (y/n)");
			cont = scan.nextLine(); //reassigns continue variable based on user input
									//runs while loop if user enters 'y'
		} 
		
		//if user inputs 'n'; exits
		System.out.println("Goodbye!");
		
		scan.close();

	}

}
