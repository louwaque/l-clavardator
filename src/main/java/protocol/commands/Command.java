package protocol.commands;

public class Command {
	public static Command fromString(String str) {
		Command c;

		c = Causal.fromString(str);
		if (c != null) {
			return c;
		}
		if (str.startsWith("CAUSAL")) {
			return null;
		}

		c = Message.fromString(str);
		if (c != null) {
			return c;
		}

		c = Connect.fromString(str);
		if (c != null) {
			return c;
		}

		c = ServerConnect.fromString(str);
		if (c != null) {
			return c;
		}

		c = Invalid.fromString(str);
		if (c != null) {
			return c;
		}

		return null;
	}
}
