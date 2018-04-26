package demo.ignite.client;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;

public class Application {

	public static void main(String[] args) {
		Ignite ignite = Ignition.start("config/ignite-config-client.xml");
	}

}
