package pl.sda.javawwa30.visits;

public class DiscountRate {

    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String membership) {
        switch(membership.toUpperCase()) {  //wszystkie litery 'membership' sa drukowane
            case "PREMIUM":
                return serviceDiscountPremium;
            case "GOLD":    //gld
                return serviceDiscountGold;
            case "SILVER":
                return serviceDiscountSilver;
            default:
                return 0.0;
        }
    }

    public static double getProductDiscountRate(String membership) {
        switch(membership.toUpperCase()) {  //wszystkie litery 'membership' sa drukowane
            case "PREMIUM":
                return productDiscountPremium;
            case "GOLD":    //gld
                return productDiscountGold;
            case "SILVER":
                return productDiscountSilver;
            default:
                return 0.0;
        }
    }

}
