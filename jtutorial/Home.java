package jtutorial;

import java.net.ConnectException;

class Home {
	public static Light[] lights = {new Light("floor stand"), new Light("living room"), new Light("wall")};
	public static Aircon aircon = new Aircon();
	public static Window window = new Window();
	public static Elevator elevator = new Elevator();
	public static Speaker speaker = new Speaker();
}

class Weather {
	public static String rainfalProbability() throws ConnectException {
		throw new ConnectException();
	}
}

class Light {
	String name;
	Light(String _name){
		this.name = _name;
	}
	public Boolean on() {
		System.out.println("Light "+this.name+" on");
		return true;
	}

	public Boolean off() {
		System.out.println("Light "+this.name+" off");
		return true;
	}
}

class Aircon {
	public Boolean on() {
		System.out.println("Aircon on");
		return true;
	}

	public Boolean off() {
		System.out.println("Aircon off");
		return true;
	}
}

class Window {
	public Boolean open() {
		System.out.println("Window open");
		return true;
	}

	public Boolean close() {
		System.out.println("Window close");
		return true;
	}

	public Boolean lock() {
		System.out.println("Window lock");
		return true;
	}

	public Boolean unlock() {
		System.out.println("Window unlock");
		return true;
	}
}

class Blind {
	public Boolean down() {
		System.out.println("Blind open");
		return true;
	}

	public Boolean up() {
		System.out.println("Blind close");
		return true;
	}
}

class Elevator {
	public static Boolean callForDown() {
		System.out.println("Elevator callForDown");
		return true;
	}

	public static Boolean callForUp() {
		System.out.println("Elevator callForUp");
		return true;
	}
}

class Speaker {
	public static Boolean makeVoice(String content) {
		System.out.println("Speaker "+content);
		return true;
	}
}