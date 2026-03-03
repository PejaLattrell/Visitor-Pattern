public interface TelcoSubscription {
    public String accept(UsagePromo promo, double price);
    public String accept(UnliCallOffer unliPackage, boolean unliCallText);
    
    String getTelcoName();
    double getPromoPrice();
    int getDateAllowance();
    boolean getUnliCallText();
}
