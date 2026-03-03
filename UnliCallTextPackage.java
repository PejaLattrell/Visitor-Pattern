public class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText) {
            return telcoName + " offers unlimited calls & text.";
        } else {
            return telcoName + " does not offer unlimited calls & text.";
        }
    }
}
