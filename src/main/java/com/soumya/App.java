package com.soumya;

import com.soumya.autowiring.Car;
import com.soumya.autowiring.StudentAutowire;
import com.soumya.beanLifecycle.Laptop;
import com.soumya.beanLifecycle.Mobile;
import com.soumya.beanLifecycle.Product;
import com.soumya.beans.*;
import com.soumya.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Creating Application context
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        //Creating Objects using Setter Injection

        Student student1= (Student) context.getBean("student1");
        System.out.println(student1);

        Student student2= (Student) context.getBean("student2");
        System.out.println(student2);

        Student student3= (Student) context.getBean("student3");
        System.out.println(student3);

        Student student4= (Student) context.getBean("student4");
        System.out.println(student4);
        System.out.println("-------");
        //Creating Objects using Collection injection

        ApplicationContext contextCollection= new ClassPathXmlApplicationContext("CollectionConfig.xml");

        Employee emp1= (Employee) contextCollection.getBean("emp1");

        System.out.println(emp1);
        System.out.println("-------");
        // Create objects using reference of a bean in another class/bean
        ApplicationContext contextReference= new ClassPathXmlApplicationContext("ReferenceConfig.xml");

        TestRef obj = (TestRef) contextReference.getBean("testRef");

        System.out.println(obj);
        System.out.println("-------");
        //Constructor Injection
        ApplicationContext contextConstructor= new ClassPathXmlApplicationContext("ConstructorConfig.xml");

        Person person1 = (Person) contextConstructor.getBean("person1");

        System.out.println(person1);
        System.out.println("-------");
        //BeanLifeCycle using XML
        AbstractApplicationContext contextBeanCycle= new ClassPathXmlApplicationContext("BeanLifecycle.xml");

        Product product1 = (Product) contextBeanCycle.getBean("product1");

        System.out.println(product1);

        contextBeanCycle.registerShutdownHook();
        System.out.println("-------");

        //BeanLifeCycle using Interface
        ApplicationContext contextInterface= new ClassPathXmlApplicationContext("BeanLifecycle.xml");

        Laptop laptop = (Laptop) contextInterface.getBean("laptop");

        System.out.println(laptop);

        System.out.println("-------");

        //BeanLifeCycle using annotation
        ApplicationContext contextAnnotation= new ClassPathXmlApplicationContext("BeanLifecycle.xml");

        Mobile mobile = (Mobile) contextAnnotation.getBean("mobile");

        System.out.println(mobile);
        System.out.println("-------");
        //Autowiring via XML
        ApplicationContext contextAutowire= new ClassPathXmlApplicationContext("AutowireConfig.xml");

        Car car = (Car) contextAutowire.getBean("car");

        System.out.println(car);

        Car car2 = (Car) contextAutowire.getBean("car2");

        System.out.println(car2);

        StudentAutowire student = (StudentAutowire) contextAutowire.getBean("student");

        System.out.println(student);

        System.out.println("-------");
        ApplicationContext contextStereotype= new ClassPathXmlApplicationContext("StereotypeConfig.xml");

        College college = (College) contextStereotype.getBean("college");

        System.out.println(college);

        College college2 = (College) contextStereotype.getBean("college");

        System.out.println(college.hashCode());  //As Prototype scope is available, both objects hashcode should be different
        System.out.println(college2.hashCode()); //If singleton scope was followed, only one object is created and used everywhere

        ApplicationContext configContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Address address= (Address) configContext.getBean("getAddress");
        System.out.println("-------");
        System.out.println(address);
        Person person= (Person) configContext.getBean("getPerson");
        System.out.println("-------");
        System.out.println(person);
    }
}
