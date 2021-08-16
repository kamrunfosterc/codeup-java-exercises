package abstraction.saturdaytutoring;

public class Player {
    private String characterName;
    //how can we assign a weapon

    //This might be doing to much if we have a lot of weapons (50 weapons)
    //and player can only use one of them at a time/ becomes redundant
    //we have to have a class for each one

//    private Sword mySword;
//    private Club myClub;
//    private Dagger myDagger;
//    private Wand myWand;
//    private Bow myBow;
    //better to use abstract ref to hold some sort of a weapon

    //we can use abstraction by making all these have "something" in common
//    private Sword currentSword;
//    private Club currentClub;
//    private Dagger currentDagger;
//    private Wand currentWand;
//    private Bow currentBow;
    public Weapon currentWeapon;
    private int health;

    public Player(String characterName){
        //exception
        if(characterName.length() > 100 || characterName.length() < 4){// name must fit these parameters
            throw new IllegalArgumentException("Character name must be between 4 and 100 characters");// basically says you didn't follow our rules
            //SIMILAR TO ASSESSMENT
        }
        this.characterName = characterName;// optional
        health = 100;
    }


    public static void main(String[] args) {
//        Player currentPlayer = new Player();// new player old way when we didn't require a characterName
        Player currentPlayer = new Player("Kimi");// new player old way
//        currentPlayer.mySword = new Sword();//gives him a sword the old way
//        currentPlayer.currentWeapon = new Sword();// same as below, but
        currentPlayer.setCurrentWeapon(new Sword());
        System.out.println("Bob attacks with a "+currentPlayer.getCurrentWeapon().getDamage()+" damage");

        currentPlayer.useWeapon();
        //currentPlayer switches to a club
        currentPlayer.setCurrentWeapon(new Club());
        currentPlayer.useWeapon();

    }

    //ACCESSORS
    private void useWeapon(){
        System.out.println(getCharacterName()+" attacks with his/her weapon and it does "+
                this.getCurrentWeapon().getDamage()+ " damage" + "damage type: "+this.getCurrentWeapon().getDamageType());
    }

//    private void setCurrentWeapon(Sword sword) {
//    }

    public String getCharacterName(){
        return characterName;
    }

    public void setCharacterName(String characterName){
        this.characterName = characterName;
    }

    public Weapon getCurrentWeapon(){
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }
}
