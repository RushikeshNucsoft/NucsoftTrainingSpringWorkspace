package mobile.company.mobile;

import org.springframework.beans.factory.annotation.Qualifier;

public class MobilePhone {
    private SIM sim;

    public MobilePhone(@Qualifier("airtelSIM") SIM sim) {
        this.sim = sim;
    }

    public void makePhoneCall() {
        sim.phoneCall();
    }
}
