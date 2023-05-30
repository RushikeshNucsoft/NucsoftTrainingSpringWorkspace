package mobile.company.mobile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class AppConfig {
    @Bean
    @Qualifier("airtelSIM")
    public SIM airtelSIM() {
        return new Airtel();
    }

    @Bean
    @Qualifier("jioSIM")
    public SIM jioSIM() {
        return new JIO();
    }

    @Bean
    @Qualifier("viSIM")
    public SIM viSIM() {
        return new VI();
    }

    @Bean
    public MobilePhone mobilePhone(@Qualifier("jioSIM") SIM sim) {
        return new MobilePhone(sim);
    }
}

