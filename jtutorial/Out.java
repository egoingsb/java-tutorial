package jtutorial;

class Weather{
}
class Light {
	public static Boolean on() {
		System.out.println("Light on");
		return true;
	}
	public static Boolean off() {
		System.out.println("Light off");
		return true;
	}
}
class Aircon {
	public static Boolean on() {
		System.out.println("Aircon on");
		return true;
	}
	public static Boolean off() {
		System.out.println("Aircon off");
		return true;
	}
}
class Window {
	public static Boolean open() {
		System.out.println("Window open");
		return true;
	}
	public static Boolean close() {
		System.out.println("Window close");
		return true;
	}
	public static Boolean lock() {
		System.out.println("WIndow lock");
		return true;
	}
	public static Boolean unlock() {
		System.out.println("Window unlock");
		return true;
	}
}
class Blind{
	public static Boolean down() {
		System.out.println("Blind open");
		return true;
	}
	public static Boolean up() {
		System.out.println("Blind close");
		return true;
	}
}
class Elevator{
	public static Boolean callForDown() {
		System.out.println("Elevator open");
		return true;
	}
	public static Boolean callForUp() {
		System.out.println("Elevator close");
		return true;
	}
}
class Home{
	public static Light light;
	public static Aircon aircon;
	public static Window window;
	public static Elevator elevator;
	public static Boolean elevator(String mode) {
		System.out.println("elevator "+mode);
		return true;
	}
	public static Boolean speak(String content) {
		System.out.println("Make sound "+content);
		return true;
	}
}


public class Out {

	public static void main(String[] args) {
		Home.elevator.callForDown();
		Home.window.close();
		Home.window.lock();
		Home.light.on();
		Home.aircon.on();
		
		
	}
}
