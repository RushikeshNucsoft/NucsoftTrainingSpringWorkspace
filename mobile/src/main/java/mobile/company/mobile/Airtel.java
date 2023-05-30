package mobile.company.mobile;

public class Airtel implements SIM {
    @Override
    public void phoneCall() {
        System.out.println("Making a phone call using Airtel SIM.");
    }
}