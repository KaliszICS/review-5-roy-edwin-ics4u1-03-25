import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double absnum = in.nextDouble();
		in.nextLine();
		System.out.println(Math.abs(absnum));
		
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double num2 = in.nextDouble();
		in.nextLine();
		System.out.println(Math.floor(num1/num2));
		System.out.println(Math.ceil(num1/num2));
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double sqrt = in.nextDouble();
		in.nextLine();
		System.out.println(Math.round(Math.sqrt(sqrt)));
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double power1 = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double power2 = in.nextDouble();
		in.nextLine();
		System.out.println(Math.pow(power1, power2));
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double max1 = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double max2 = in.nextDouble();
		in.nextLine();
		System.out.print("Input one more number: ");
		double max3 = in.nextDouble();
		in.nextLine();
		double max4 = Math.max(max1, max2);
		double min1 = Math.min(max1, max2);
		System.out.println(Math.max(max3, max4));
		System.out.println(Math.min(max3, min1));

	}
	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String on = in.nextLine();
		System.out.println(on.contains("on"));

	}
	public static void q7() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String mango = in.nextLine();
		System.out.println(mango.equalsIgnoreCase("mango"));
		
	}
	public static void q8() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: " );
		String wordone = in.nextLine();
		System.out.print("Input a letter: ");
		String letterone = in.nextLine();
		System.out.println(wordone.indexOf(letterone));
		System.out.println(wordone.lastIndexOf(letterone));
		
	}

	public static void q9() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: " );
		String sentencelength = in.nextLine();
		System.out.println("Your sentence is " + (sentencelength.length()) + " characters long"); 
		
	}
	public static void q10() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: " );
		String sent = in.nextLine();
		System.out.print("Input a word to replace: ");
		String sentrep = in.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String replace = in.nextLine();
		System.out.println(sent.replaceAll(sentrep, replace));
		
	}

	public static void q11() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: " );
		String lowerupper = in.nextLine();
		System.out.println(lowerupper.toUpperCase().trim());
		System.out.println(lowerupper.toLowerCase().trim());
		
	}

	public static void q12() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: " );
		String four = in.nextLine();
		System.out.println(four.substring(0,4));
		System.out.println(four.substring(four.length() - 4));

	}
	

}
