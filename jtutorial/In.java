package jtutorial;
public class In {
	
	public static void main(String[] args) {
		Home.elevator.callForUp();
		String rp = Weather.rainfalProbability();
		Home.speaker.makeVoice("rainfal probability is "+rp);
		Boolean isClose = Home.window.close();
		if(isClose) {
			Home.window.lock();
		}
		for(int i = 0; i<Home.lights.length; i++) {
			Home.lights[i].off();
		}
		Home.aircon.off();
	}
}
