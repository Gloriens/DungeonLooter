import java.util.Scanner;

public class Actions {
    public static void Duel(Hero Hero, Darkraces darkraces){
        Scanner input = new Scanner(System.in);
        System.out.println("The "+ darkraces.name +" yelling and screaming to you! Prepare for battle!");
        try {             Thread.sleep(1000);         } catch (Exception e) { System.out.println("");}
            darkraces.stats(darkraces);
        System.out.println("*****************************************");
        try {             Thread.sleep(1000);         } catch (Exception e) { System.out.println("");}
        Hero.stats(Hero);
        try {             Thread.sleep(1000);         } catch (Exception e) { System.out.println("");}
        while (darkraces.alive() && Hero.alive()){
            System.out.println("Attack (1) or Run (2)?");
            int action = input.nextInt();
            if(action == 1){
                darkraces.beaten(Hero);
                if(darkraces.alive()){
                    Hero.beaten(darkraces);
                }
            }if(action == 2){
                System.out.println("You are running away, coward!");
                break;

            }
            System.out.println(darkraces.name+ " HP: "+ darkraces.hp + " Damage " + darkraces.damage);
            try {             Thread.sleep(1000);         } catch (Exception e) { System.out.println("");}
            System.out.println(Hero.name + " HP: " + Hero.hp + " Damage: " + Hero.getMaxdamage());
            try {             Thread.sleep(1000);         } catch (Exception e) { System.out.println("");}


        }if (!Hero.alive()) {
            System.out.println("Your lifeless body hits the floor");
            System.out.println("***********************************");
            System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                    "███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀\n" +
                    "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\n" +
                    "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\n" +
                    "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\n" +
                    "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\n" +
                    "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                    "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\n" +
                    "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" +
                    "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\n" +
                    "██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" +
                    "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄");
        } else if (!darkraces.alive()) {
            System.out.println("The monster has been defeated!");
            System.out.println("--------------------------------\n");
            darkraces.hp = 0;
        }


    }

    private static void sleep(int i) {
    }
}
