package abstraction.saturdaytutoring;

//what all concrete weapons have in common

public abstract class Weapon {
    protected int damage;// give weapons a damage number when used
    protected String damageType;// describe the type of
    protected String damageQuote;// a saying when weapon is used

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getDamageQuote() {
        return damageQuote;
    }

    public void setDamageQuote(String damageQuote) {
        this.damageQuote = damageQuote;
    }
}
