package di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOCDEmo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("projectbeans.xml");
        // Fetch bean from XML
        Engine engine1 = factory.getBean("engine1" , Engine.class);
        System.out.println(engine1);

        Engine engine2 = factory.getBean("engine2", Engine.class);
        System.out.println(engine2);

        // Both are different objects - pointing to different beans engine1 and engine2
        System.out.println(engine1 == engine2);

        // Both are same objects - pointing to same bean "engine1" . Bean by default is singleton.
        // We can create new objects after making scope to "prototype"
        Engine engineA = factory.getBean("engine1" , Engine.class);
        System.out.println(engine1 == engineA);

        Engine engine3 = factory.getBean("engine3", Engine.class);
        System.out.println(engine3);

        Car car1 = factory.getBean("car1", Car.class);
        System.out.println(car1);

        // By default, we keep is open as our app may run infinitely.
        // But there is an option to close the factory so that all the beans inside it can be destroyed.
        // destroyed method needs to be written in the xml and inside the class
        factory.close();
    }
}
