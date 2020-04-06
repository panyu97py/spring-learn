import org.example.pojo.Student;
import org.example.pojo.Teacher;
import org.example.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /*
        Student {
            name='测试名称',
            address=Address{address='美国'},
            books=[《水浒传》, 《西游记》, 《红楼梦》, 《三国演义》],
            hobbies=[打游戏, 看电影],
            card={身份证=5555523369774, 银行卡=5568823369774},
            games=[overWatch, crossFire],
            info={学号=1354, 性别=男},
            wife='null'
         }
             */
    }

    @Test
    public void userTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }
    @Test
    public void teacherTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher.toString());
    }
}
