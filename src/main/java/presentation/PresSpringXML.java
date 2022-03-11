package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class PresSpringXML {
    public static void main (String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier=(IMetier) context.getBean("metier");
        System.out.println("Résultat: "+metier.calcul());
    }
}