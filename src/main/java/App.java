import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());

        Cat one = (Cat) applicationContext.getBean("cat");
        System.out.println(one.getName());
        Cat two = (Cat) applicationContext.getBean("cat");
        System.out.println(two.getName());

        System.out.println(bean == beanTwo);
        System.out.println(one == two);
    }
}