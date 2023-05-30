package mobile.company.mobile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
  public static void main(String[] args) {
	  // Create the Spring application context
      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

      // Retrieve the MobilePhone bean from the context
      MobilePhone mobilePhone = context.getBean(MobilePhone.class);

      // Call the makePhoneCall() method for each SIM implementation
      mobilePhone.makePhoneCall();
  }
}
