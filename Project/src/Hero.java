import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract public class Hero implements Alive {
    String name;
    int maxhp;
    int hp;
    Armory carmor;
    private int maxdamage;
    Weapon cweapon;
    int damage;
    Items item;
    List<Items> Inventory = new ArrayList<>();
    int gold;


    public Hero(String name, int maxhp, Armory carmor, int damage, int gold) {
        this.name = name;
        this.maxhp = maxhp;
        this.carmor = carmor;
        this.damage = damage;
        this.hp = maxhp;
        this.gold = gold;
        Inventory = new ArrayList<>();
    }


    public int beaten(Darkraces darkraces) {
        int enemydamage = darkraces.damage;
        hp = hp - (enemydamage - carmor.getArmor()/2);
        return hp;
    }

    @Override
    public boolean alive(){
        return hp > 0;
    }

    public void stats(Hero hero){
        System.out.println("YOUR CHARACTER: ");
        System.out.println("Name: " + name + "    HP: " + hp + "    Damage: "+ getMaxdamage()
                );
        System.out.println("Your Armor: " + carmor.name + "    Armor: " + carmor.getArmor());;
        System.out.println("In your inventory you have:");
        showinventory(hero);


    }
    public static void showinventory(Hero hero){
        for (int i =0; i<hero.Inventory.size(); i++){
            System.out.println("Item name: " + hero.Inventory.get(i).name + "       " + "Item weight: " + hero.Inventory.get(i).weight);

        }

    }
    public void heal(Hero hero){
        if(hero.hp != hero.maxhp){
            if((hero.hp + 40) >= hero.maxhp){
                hero.hp = hero.maxhp;
                System.out.println("Now your health is recovered. Thanks Doctor!");
            }else{
                hero.hp += 40;
                System.out.println("Now your health is recovered. Thanks Doctor!");
            }
        }else if(hero.maxhp == hero.maxhp){
            System.out.println("Your health was already full. Doctor gives you a magical Heart Crystal! Your max HP increased 20!");
            hero.hp += 20;
            hero.maxhp += 20;
        }
        System.out.println("Your HP: " + hero.hp);
    }
    public void reward(Hero Hero){
        int pos = (int) (Math.random() * 100);
        Hero.gold += pos;
        System.out.println("You earned " + pos + " gold!");
    }
    public void Inventoryadd(Hero hero, Items item){
        Scanner input = new Scanner(System.in);
        int invweight = 0;
        for(int x = 0; x<hero.Inventory.size(); x++){
            invweight += hero.Inventory.get(x).weight;
            if(x == hero.Inventory.size()-1){
                try {
                    invweight += carmor.weight + cweapon.weight;
                } catch (Exception e) {

                }

            }if(invweight + item.weight > 60){
                System.out.println("Your inventory is full!");
                System.out.println("Do you want to remove an item?");
                System.out.println("Yes (1), No (2)");
                int invchoice = input.nextInt();
                if(invchoice == 1){
                    for (int i =2; i<hero.Inventory.size(); i++) {
                        System.out.println("Item name: " + hero.Inventory.get(i).name + "       " + "Item weight: " + hero.Inventory.get(i).weight);
                    }
                    System.out.println("Which item do you want to remove? Please enter it's number.");
                    int removeit = input.nextInt() + 1;
                    hero.Inventory.remove(removeit);
                }else if(invchoice == 2){
                    break;
                }

            }
        }hero.Inventory.add(item);


    }



    public Armory getCarmor() {
        return carmor;
    }
    public void setCarmor(Armory carmor) {
        this.carmor = carmor;
    }
    public int getMaxdamage() {
        return maxdamage;
    }
    public void setMaxdamage(int maxdamage) {
        this.maxdamage = maxdamage;
    }

    public Weapon getCweapon() {
        return cweapon;
    }

    public void setCweapon(Weapon cweapon) {
        this.cweapon = cweapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Warrior extends Hero {
    private int maxdamage;

    @Override
    public int getMaxdamage() {
        maxdamage = cweapon.getDamage() + damage;
        return maxdamage;
    }

    @Override
    public void setMaxdamage(int maxdamage) {
        this.maxdamage = maxdamage;
    }

    public Warrior(String name, int hp, Armory carmor, int damage, Weapon cweapon, int gold) {
        super(name, hp, carmor, damage, gold);
        this.cweapon = cweapon;
        Inventory.add(carmor);
        Inventory.add(cweapon);
    }


    @Override
    public void stats(Hero hero) {
        System.out.println("YOUR CHARACTER: ");
        System.out.println("Name: " + name + "    HP: " + hp + "     Damage: "+ getMaxdamage());
        System.out.println("Your Weapon: " + cweapon.name + "    Weapon Damage: " + cweapon.getDamage());
        System.out.println("Your Armor: " + carmor.name + "    Armor: " + carmor.getArmor());

        System.out.println("In your inventory you have:");
        showinventory(hero);
    }

    public Weapon equip(Weapon weapon){
        System.out.println("Your charachter equiped " + weapon.name);
        return weapon;
    }


    @Override
    public boolean dead() {
        return hp <=  0;
    }
}
class Brawler extends Hero {
    private int maxdamage;

    @Override
    public int getMaxdamage() {
        maxdamage = (maxhp * 1 / 10) + damage + 2*carmor.getArmor();
        return maxdamage;
    }

    @Override
    public void setMaxdamage(int maxdamage) {
        this.maxdamage = maxdamage;
    }

    public Brawler(String name, int hp, Armory carmor, int damage, int gold) {
        super(name, hp, carmor, damage, gold);
        Inventory.add(carmor);
    }

    @Override
    public boolean dead() {
        return hp > 0;
    }
}

