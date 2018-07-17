public class CardEntity {

    private String cardName;
    private String flavorText;
    private CardType cardType;
    private List<Ability> cardAbilities;
    private List<Attribute> cardAttributes;
    private ManaCost manaCost;
    private boolean tapped;

    public String getCardName() {
        return this.getCardName;
    }

    public String getFlavorText() {
        return this.flavorText;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public List<Ability> getCardAbilities() {
        return this.cardAbilities;
    }

    public List<Attribute> getCardAttributes() {
        return this.cardAttributes;
    }

    public ManaCost getManaCost() {
        return this.manaCost;
    }

    public boolean IsTapped() {
        return this.tapped;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public void setCardAbilities(List<Ability> cardAbilities) {
        this.cardAbilities = cardAbilities;
    }

    public void setCardAttributes(List<Attribute> cardAttributes) {
        this.cardAttributes = cardAttributes;
    }

    public void setManaCost(ManaCost manaCost) {
        this.manaCost = manaCost;
    }

    public void setTapped(boolean tapped) {
        this.tapped = tapped;
    }
}