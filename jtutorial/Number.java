package jtutorial;

public class Number {

	public static void main(String[] args) {
		Integer left = 1;
		Integer right = 10;
		System.out.println(left+right);
		System.out.println(left.compareTo(right));
		
		String name = "egoing";
		String letter = "Lorem ipsum "+name+" sit amet, consectetur adipiscing elit. "+name+" Donec eleifend diam ac iaculis placerat.";
		System.out.println(letter);
	}

}
