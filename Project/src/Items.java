public class Items {
    String name;
    int weight;
    int value;

    public Items(String name, int weight, int value) {
        this.value = value;
        this.name = name;
        this.weight = weight;
    }

    public Items(String name, int weight) {
        this.value = weight;
        this.name = name;
    }

    public Items() {
    }

    public static Items HarryPotter(){ return new Items ("Book of Harry Potter",1,0);}
    public static Items Pstone(){return new Items("Philosopher's Stone",2,150);}
    public static Items RoLC(){return new Items("Lich King's Helm",5,200);}
    public static Items Diamond(){ return new Items ("Diamond",1,100);}
    public static Items Dragonballsz() {return new Items("Dragon Ball",5,120);}
    public static Items Narsil(){ return new Items ("Shards of Narsil",3,200);}
    public static Items LoTR(){ return new Items ("The One Ring",1,700);}

    public static Items randomitem() {
        int x = 0;
        Items rand = new Items();
        x = (int) (Math.random() * 100);
        if (x < 50) {
            rand = HarryPotter();
        } else if (x <= 60) {
            rand = RoLC();
        } else if (x <= 75) {
            rand = Diamond();
        } else if (x <= 87) {
            rand = Dragonballsz();
        } else if (x <= 95){
            rand = Pstone();
        }else if (x <= 99){
            rand = Narsil();
        }else if(x <= 100){
            rand = LoTR();

        }
        return rand;
    }



}
class Weapon extends Items{
    private int damage;
    private int crit;

    public Weapon(){

    }

    public Weapon(String name, int weight, int damage, int crit, int value) {
        super(name, weight, value);
        this.damage = damage;
        this.crit = crit;
    }

    public static Weapon randomweapon() {
        int x = 0;
        Weapon rand = new Weapon();
        x = (int) (Math.random() * 100);
        if (x < 40) {
            rand = lumberjackaxe();
        } else if (x <= 55) {
            rand = Quarterstaff();
        } else if (x <= 70) {
            rand = Gladius();
        } else if (x <= 83) {
            rand = Claymore();
        } else if (x <= 91){
            rand = OblivionStaff();
        }else if (x <= 96){
            rand = FalconBlade();
        }else if(x <= 100){
            rand = GlorienB();

        }
        return rand;
    }

    public static Weapon  lumberjackaxe (){
        return new Weapon("lumberjack Axe ",7,35,15,5);
    }
    public static Weapon  Quarterstaff(){
        return new Weapon("Quarterstaff",5,45,10,7);
    }
    public static Weapon  Gladius() { return new Weapon("Gladius", 6, 50, 15,15); }
    public static Weapon  Claymore(){
        return new Weapon("Claymore", 7,65,15,20);
    }
    public static Weapon  OblivionStaff(){
        return new Weapon("Oblivion staff",8,80,10,40);
    }
    public static Weapon FalconBlade (){
        return new Weapon("Falcon Blade",5,100,40,80);
    }
    public static Weapon GlorienB(){
        return new Weapon("Blade of Glorien",7,140,20,120);
    }




    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }



}
class Armory extends Items{
    private int armor;

    public Armory(){

    }

    public Armory(String name, int weight, int armor,int value) {
        super(name, weight, value);
        this.armor = armor;
    }

    public static Armory randomarmor() {
        int x = 0;
        Armory rand = new Armory();
        x = (int) (Math.random() * 100);
        if (x <= 25) {
            rand = Leather();
        } else if (x <= 50) {
            rand = Ranger();
        } else if (x <= 65) {
            rand = IronArmor();
        } else if (x <= 79) {
            rand = HelfArmor();
        } else if (x <= 90) {
            rand = SteelPArmor();
        }else if (x <= 98){
            rand = Mythril();
        }else if (x <= 100){
            rand =HighKingArmor();
        }
        return rand;
    }
    public static Armory Leather(){ return new Armory("Leather Armor",4,10,10); }
    public static Armory Ranger(){
        return new Armory("Ranger Armor",3,12,15);
    }
    public static Armory HelfArmor(){
        return new Armory("Hıgh Elf Armor",5,20,70);
    }
    public static Armory IronArmor(){
        return new Armory("Iron Armor",10,15,20);
    }
    public static Armory SteelPArmor(){
        return new Armory("Steel Plate Armor",7,20,50);
    }
    public static Armory Mythril(){
        return new Armory("Mythril Armor",7,35,100);
    }
    public static Armory HighKingArmor(){
        return new Armory("High King Armor",5,60,150);
    }


    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }



}





















