import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiLittleCat
 */
@Configuration
public class UserConfig {
	@Bean
	public User user() {
		return new User("001", "Little Cat");
	}
}
