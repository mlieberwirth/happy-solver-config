package happysolverconfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigLauncher {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigLauncher.class).run(args);
	}
}
