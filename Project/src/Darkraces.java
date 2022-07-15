public class Darkraces implements Alive {
    String name;
    int hp;
    int damage;
    int armor;
    int rarity;
    Weapon Dweapon;
    Armory Darmor;


    public Darkraces(String name, int hp, int damage, int armor, Weapon dweapon, Armory darmor) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
        Dweapon = dweapon;
        Darmor = darmor;
    }

    public Darkraces() {
    }

    public int beaten(Hero Hero) {
        hp -= Hero.getMaxdamage();
        return hp;
    }

    public static Darkraces randomdarkrace(){
        int x = 0;
        Darkraces rand = new Darkraces();
        x = (int) (Math.random() * 100);
        if( x < 50){
            rand = darkrace();
        }else if(x < 70){
            rand = darkracedps();
        }else if( x < 95){
            rand = oorz();
        }else if(x < 100){
            rand = demon();
        }
        return rand;


    }
    @Override
    public boolean alive(){
        return hp > 0;
    }
    public boolean dead() {
        return hp <=  0;
    }
    public void stats(Darkraces darkrace) {
        System.out.println("THE DARK RACE: ");
        System.out.println("Name: " + darkrace.name + "    HP: " + darkrace.hp + "    Damage: " + darkrace.damage);
        System.out.println("The " + darkrace.name + " have: ");
        System.out.println(darkrace.Dweapon.name + " and " + darkrace.Darmor.name);
    }
    public static Darkraces darkrace(){
        return new Darkraces("Dark Race Soldier",200,40,12,Weapon.randomweapon(),Armory.randomarmor());
    }
    public static Darkraces darkracedps(){
        return new Darkraces("Dark Race Mage",120,60,5,Weapon.randomweapon(),Armory.randomarmor());
    }
    public static Darkraces oorz(){
        return new Darkraces("Oorz",500,50,30,Weapon.randomweapon(),Armory.randomarmor());
    }
    public static Darkraces demon(){
        return new Darkraces("Demon",1000,70,50,Weapon.randomweapon(),Armory.randomarmor());
    }
}
