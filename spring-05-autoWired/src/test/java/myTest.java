import org.example.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    @Test
    public void test1() {
        ApplicationContext content = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) content.getBean("person");
        person.getCat().shout();
        person.getDog().shout();
    }
}
