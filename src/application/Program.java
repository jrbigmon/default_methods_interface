package application;

import services.BrazilInterestService;
import services.InterestServiceInterface;
import services.UsaInterestService;

public class Program {
    public static void main(String[] args) throws Exception {
        InterestServiceInterface bis = new BrazilInterestService(2.00);
        InterestServiceInterface uis = new UsaInterestService(1.00);

        System.out.println(bis.payment(200.00, 3));
        System.out.println(uis.payment(200.00, 3));
    }
}
