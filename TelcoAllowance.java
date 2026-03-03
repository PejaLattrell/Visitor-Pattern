public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double price) {
        return telcoName + " promo price: " + price;
    }
}
