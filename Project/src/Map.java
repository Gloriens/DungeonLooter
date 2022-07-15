import java.util.Scanner;

public class Map {
    static int savedpeople;


    public static  Room[][] gamemap(Hero Hero) {
        int room = 6;
        int level = 16;
        Room[][] newmap = new Room[level][room];
            for (int x = 1; x < level; x++) {
                for (int y = 1; y < room; y++ ) {
                    if(Hero.alive())
                    System.out.println("You are in Level:  " + x + " Room: " + y + "!");
                    newmap[x][y] = new Room();
                    System.out.println("Your are in a cold room");
                    newmap[x][y].info();
                    Scanner input = new Scanner(System.in);
                    boolean loop = true;
                    while (loop && Hero.alive()) {
                        System.out.println("What do you want to do?");
                        System.out.println("Attack monster 1 (1), Attack monster 2 (2), Leave (3)");
                        int choice = input.nextInt();
                        if (choice == 1) {
                            if (newmap[x][y].enemylist.get(0).hp == 0) {
                                System.out.println("This monster was already dead, you killed it, remember?");
                            } else {
                                Actions.Duel(Hero, newmap[x][y].enemylist.get(0));
                                if (newmap[x][y].enemylist.get(0).hp == 0) {
                                    System.out.println("This monster is dead");
                                    System.out.println("The " + newmap[x][y].enemylist.get(0).name + " have: ");
                                    System.out.println(newmap[x][y].enemylist.get(0).Dweapon.name + " and " + newmap[x][y].enemylist.get(0).Darmor.name);
                                    System.out.println("Dou you want to take items?");
                                    System.out.println("Yes(1) No(2)");
                                    int itemchoice = input.nextInt();
                                    if (itemchoice == 1) {
                                        System.out.println("Equip the Armor (1), Equip the Weapon (2), Equip both (3), Put your Inventory (4)");
                                        int take = input.nextInt();
                                        if (take == 1) {
                                            Hero.setCarmor(newmap[x][y].enemylist.get(0).Darmor);
                                            System.out.println("Now you are wearing the: " + Hero.getCarmor().name);
                                        } else if (take == 2) {
                                            if (Hero instanceof Warrior) {
                                                Hero.setCweapon(newmap[x][y].enemylist.get(0).Dweapon);
                                                System.out.println("Now you are using the: " + Hero.getCweapon().name);
                                            } else {
                                                System.out.println("You are not warrior, you can't use weapons");
                                            }
                                        } else if (take == 2) {
                                            System.out.println("You didn't take items.");
                                        }else if (take == 3){
                                            if (Hero instanceof Warrior) {
                                                Hero.setCweapon(newmap[x][y].enemylist.get(0).Dweapon);
                                                Hero.setCarmor(newmap[x][y].enemylist.get(0).Darmor);
                                                System.out.println("You are wearing the: " + Hero.getCweapon().name + " and " + Hero.getCarmor().name);
                                            } else {
                                                System.out.println("You are not warrior, you can't use weapons");
                                                Hero.setCarmor(newmap[x][y].enemylist.get(0).Darmor);
                                                System.out.println("But you are taking the Armor: " + Hero.getCarmor().name);
                                            }
                                        }else if (take == 4){
                                            System.out.println("Which ones do you want to take? Armor (1), Weapon (2), Both (3)");
                                            int takeinvs = input.nextInt();
                                            switch (takeinvs) {
                                                case 1 ->{ System.out.println("You put the Armor in your Inventory");
                                                    Hero.Inventoryadd(Hero,newmap[x][y].enemylist.get(0).Darmor);
                                                }case 2 ->{
                                                    System.out.println("You put the Weapon in your Inventory");
                                                    Hero.Inventoryadd(Hero,newmap[x][y].enemylist.get(0).Dweapon);

                                                }case 3 ->{
                                                    System.out.println("You put both of them in your Inventory.");
                                                    Hero.Inventoryadd(Hero,newmap[x][y].enemylist.get(0).Dweapon);
                                                    Hero.Inventoryadd(Hero,newmap[x][y].enemylist.get(0).Darmor);

                                                }
                                            }
                                        }
                                    }
                                }
                                if (newmap[x][y].enemylist.get(0).dead() && newmap[x][y].enemylist.get(1).dead()) {
                                    System.out.println("You killed both creature!");
                                    if (newmap[x][y].healertownspeople > 0) {
                                        System.out.println("You saved a doctor! He is healing you!");
                                        Hero.heal(Hero);
                                    }
                                    System.out.println("You saved " + Integer.sum(newmap[x][y].healertownspeople, newmap[x][y].townspeople) + " Townspeople! congratulations hero!");
                                    savedpeople += Integer.sum(newmap[x][y].healertownspeople, newmap[x][y].townspeople);
                                    int rewardchance = (int) (Math.random() * 100);
                                    if (rewardchance >= 90 && Integer.sum(newmap[x][y].healertownspeople, newmap[x][y].townspeople) > 0) {
                                        System.out.println("Townspeople are grateful to you! They give you an ARTIFACT11!");
                                        Hero.Inventoryadd(Hero,Items.randomitem());
                                    }else if(rewardchance > 60 && Integer.sum(newmap[x][y].healertownspeople, newmap[x][y].townspeople) > 0){
                                        System.out.println("Townspeople are grateful to you! They give you some gold!");
                                        Hero.reward(Hero); }
                                }
                            }

                        } else if (choice == 2) {
                            if (newmap[x][y].enemylist.get(1).hp == 0) {
                                System.out.println("This monster was already dead, you killed it, remember?");
                            } else {
                                Actions.Duel(Hero, newmap[x][y].enemylist.get(1));
                                if (newmap[x][y].enemylist.get(1).hp == 0) {
                                    System.out.println("This monster already dead");
                                    System.out.println("The " + newmap[x][y].enemylist.get(1).name + " drops: ");
                                    System.out.println(newmap[x][y].enemylist.get(1).Dweapon.name + " and " + newmap[x][y].enemylist.get(1).Darmor.name);
                                    System.out.println("Dou you want to take items?");
                                    System.out.println("Yes(1) No(2)");
                                    int itemchoice = input.nextInt();
                                    if (itemchoice == 1) {
                                        System.out.println("Equip the Armor (1), Equip the Weapon (2), Equip both (3), Put your Inventory (4)");
                                        int take = input.nextInt();
                                        if (take == 1) {
                                            Hero.setCarmor(newmap[x][y].enemylist.get(1).Darmor);
                                            System.out.println("Now you are wearing the: " + newmap[x][y].enemylist.get(1).Darmor.name);
                                            Hero.stats(Hero);
                                        } else if (take == 2) {
                                            if (Hero instanceof Warrior) {
                                                Hero.setCweapon(newmap[x][y].enemylist.get(1).Dweapon);
                                                System.out.println("Now you are using the: " + Hero.getCweapon().name);
                                            } else {
                                                System.out.println("You are not warrior, you can't use items");
                                            }
                                        } else if (take == 2) {
                                            System.out.println("You didn't take items.");
                                        }else if (take == 3){
                                            if (Hero instanceof Warrior) {
                                                Hero.setCweapon(newmap[x][y].enemylist.get(1).Dweapon);
                                                Hero.setCarmor(newmap[x][y].enemylist.get(1).Darmor);
                                                System.out.println("You are wearing the: " + Hero.getCweapon().name + " and " + Hero.getCarmor().name);
                                                System.out.println("************************************");
                                                Hero.stats(Hero);
                                            } else {
                                                System.out.println("You are not warrior, you can't use weapons");
                                                Hero.setCarmor(newmap[x][y].enemylist.get(1).Darmor);
                                                System.out.println("But you are taking the Armor: " + Hero.getCarmor().name);
                                            }
                                        }else if (take == 4){
                                            System.out.println("Which ones do you want to take? Armor (1), Weapon (2), Both (3)");
                                            int takeinvs = input.nextInt();
                                            switch (takeinvs) {
                                                case 1 ->{ System.out.println("You put the Armor in your Inventory");
                                                Hero.Inventoryadd(Hero,newmap[x][y].enemylist.get(1).Darmor);
                                                }case 2 ->{
                                                    System.out.println("You put the Weapon in your Inventory");
                                                    Hero.Inventoryadd(Hero,newmap[x][y].enemylist.get(1).Dweapon);
                                                }case 3 ->{
                                                    System.out.println("You put both of them in your Inventory.");
                                                    Hero.Inventoryadd(Hero,newmap[x][y].enemylist.get(1).Dweapon);
                                                    Hero.Inventoryadd(Hero,newmap[x][y].enemylist.get(1).Darmor);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (newmap[x][y].enemylist.get(0).dead() && newmap[x][y].enemylist.get(1).dead()) {
                                    System.out.println("You killed both creature!");
                                    if (newmap[x][y].healertownspeople > 0) {
                                        System.out.println("You saved a doctor! He is healing you!");
                                        Hero.heal(Hero);
                                    }
                                    System.out.println("You saved " + Integer.sum(newmap[x][y].healertownspeople, newmap[x][y].townspeople) + " Townspeople! congratulations hero!");
                                    savedpeople += Integer.sum(newmap[x][y].healertownspeople, newmap[x][y].townspeople);
                                    int rewardchance = (int) (Math.random() * 100);
                                    if (rewardchance >= 90 && Integer.sum(newmap[x][y].healertownspeople, newmap[x][y].townspeople) > 0) {
                                        System.out.println("Townspeople are grateful to you! They give you an ARTIFACT11!");
                                        Hero.Inventoryadd(Hero,Items.randomitem());
                                    }else if(rewardchance > 60 && Integer.sum(newmap[x][y].healertownspeople, newmap[x][y].townspeople) > 0){
                                        System.out.println("Townspeople are grateful to you! They give you some gold!");
                                        Hero.reward(Hero); }
                                }
                            }
                        } else if (choice == 3) {
                            System.out.println("You are leaving from the room!");
                            System.out.println("Left(1) or Right(2)");
                            int way = input.nextInt();
                            int runaway = (int) (Math.random() * 11);
                            if(x < 15){
                                if (runaway > 8) {
                                    System.out.println("You find yourself in next level!");
                                    x++;
                                }
                            }
                            loop = false;
                        }
                    }if(Hero.hp <= 0){
                        break; }



            }if(Hero.hp <= 0) {
                    break;
                }




        }
        System.out.println("You have finished the dungeon!");
            return newmap;
    }
}