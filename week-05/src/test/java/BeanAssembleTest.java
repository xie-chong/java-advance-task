import chong.xie.homework05.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAssembleTest {
    public static void main(String[] args) {
        // XML实现 Spring Bean 的装配
//        xmlBeanAssembleTest();

        // Annotation实现 Spring Bean 的装配
        annotationBeanAssembleTest();
    }


    /**
     * XML实现 Spring Bean 的装配
     */
    static void xmlBeanAssembleTest() {
        // 加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationHomeWork05Context.xml");
        // 构造方式输出结果
        System.out.println(applicationContext.getBean("user1"));
        // 设值方式输出结果
        System.out.println(applicationContext.getBean("user2"));
    }


    /**
     * Annotation实现 Spring Bean 的装配
     */
    static void annotationBeanAssembleTest() {
        // 加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationHomeWork05Context.xml");
        // 获取UserController实例
        UserController userController =
                (UserController) applicationContext.getBean("userController");
        // 调用UserController中的saveUserInfo()方法
        userController.saveUserInfo();
    }
}
