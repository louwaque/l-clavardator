import java.io.IOException;

import server.Server;

public class ServerApp {
	public static void main(String[] args) {
		try {
			(new Server()).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
