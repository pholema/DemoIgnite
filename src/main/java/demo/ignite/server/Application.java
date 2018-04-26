package demo.ignite.server;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ignite ignite = Ignition.start("config/ignite-conf.xml");
	}

}
