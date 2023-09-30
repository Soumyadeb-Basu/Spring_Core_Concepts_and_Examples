package com.soumya;

import com.soumya.beanLifecycle.Product;
import com.soumya.beans.Employee;
import com.soumya.beans.Person;
import com.soumya.beans.Student;
import com.soumya.beans.TestRef;
import org.springframework.context.ApplicationContext;
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
    }
}
