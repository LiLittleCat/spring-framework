import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author LiLittleCat
 */
public class Application {
	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());

	}
}
