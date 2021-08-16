package abstraction.saturdaytutoring;

public class Wand extends Weapon{

    //to access field in constructor
    //initialize Wand to Wand specific damanage and damgeType
    public Wand(){// constructor
        damage = 5;
        damageType = "Cast Magic";
        damageQuote = "Swish, swish, swoosh";
    }
}
