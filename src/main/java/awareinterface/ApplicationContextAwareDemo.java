package awareinterface;
import com.stackroute.domain.Actor;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class ApplicationContextAwareDemo implements ApplicationContextAware {

    public void setApplicationContext(ApplicationContext ApplicationContext) throws BeansException {
        System.out.println(ApplicationContext);
        System.out.println(ApplicationContext.getBean("actor1"));

    }
}

