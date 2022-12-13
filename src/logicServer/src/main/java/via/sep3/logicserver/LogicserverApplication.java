package via.sep3.logicserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import via.sep3.logicserver.shared.Logger.Logger;

@SpringBootApplication
public class LogicserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogicserverApplication.class, args);

		Logger.writeLog("<<Started Logic Server>>", "info");
	}
}