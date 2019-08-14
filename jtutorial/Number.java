package jtutorial;

public class Number {

	public static void main(String[] args) {
		Integer left = 1;
		Integer right = 100;
		System.out.println(left+right);
		System.out.println(left.compareTo(right));
		System.out.println(10-1.2);
		
		String name = "egoing";
		String letter = "Lorem ipsum "+name+" sit amet, consectetur adipiscing elit. "+name+" Donec eleifend diam ac iaculis placerat.";
		System.out.println(letter);
		System.out.println(letter.indexOf(name));
		System.out.println(letter.length());
		System.out.println(letter.replace(name, "duru"));
	}

}
