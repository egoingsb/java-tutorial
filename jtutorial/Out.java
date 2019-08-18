package jtutorial;

import java.net.ConnectException;

public class Out {
	public static void main(String[] args) {
		Home.elevator.callForDown();
		try {
			String rp = Weather.rainfalProbability();
			Home.speaker.makeVoice("rainfal probability is "+rp);
		} catch (ConnectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Boolean isClose = HOME.window.close();
//		if(isClose) {
//			HOME.window.lock();
//		}
//		for(int i = 0; i<HOME.lights.length; i++) {
//			HOME.lights[i].off();
//		}
		Home.aircon.off();
	}
}
