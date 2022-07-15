import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Brawler sett = new Brawler(null,500,Armory.Ranger(),15,0);
        Warrior knight = new Warrior(null,400,Armory.Leather(),35,Weapon.lumberjackaxe(),0);
        Scanner uinput = new Scanner(System.in);
        System.out.println("  _________________________________________________________\n" +
                " /|     -_-                                             _-  |\\\n" +
                "/ |_-_- _                                         -_- _-   -| \\   \n" +
                "  |                            _-  _--                      | \n" +
                "  |                            ,                            |\n" +
                "  |      .-'````````'.        '(`        .-'```````'-.      |\n" +
                "  |    .` |           `.      `)'      .` |           `.    |          \n" +
                "  |   /   |   ()        \\      U      /   |    ()       \\   |\n" +
                "  |  |    |    ;         | o   T   o |    |    ;         |  |\n" +
                "  |  |    |     ;        |  .  |  .  |    |    ;         |  |\n" +
                "  |  |    |     ;        |   . | .   |    |    ;         |  |\n" +
                "  |  |    |     ;        |    .|.    |    |    ;         |  |\n" +
                "  |  |    |____;_________|     |     |    |____;_________|  |  \n" +
                "  |  |   /  __ ;   -     |     !     |   /     `'() _ -  |  |\n" +
                "  |  |  / __  ()        -|        -  |  /  __--      -   |  |\n" +
                "  |  | /        __-- _   |   _- _ -  | /        __--_    |  |\n" +
                "  |__|/__________________|___________|/__________________|__|\n" +
                " /                                             _ -        lc \\\n" +
                "/   -_- _ -             _- _---                       -_-  -_ \\\n" +
                " ");
        System.out.println("｡☆✼★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★✼☆｡");
        try {             Thread.sleep(3000);         }
        catch (Exception e) {
            System.out.println("");         }
        System.out.println("☆ （ • •）☆\n" +
                "╔uu══════════════════╗☆\n" +
                "❝   <━━━WELCOME━━━>  ❞\n" +
                "╚══════nn════════════╝");


        System.out.println("\nWelcome to the Dungeon Looter! ");
        try {             Thread.sleep(3500);         } catch (Exception e) { System.out.println("");         }
        System.out.println("There are two different class you can play:");

        try {             Thread.sleep(4000);         } catch (Exception e) { System.out.println("");         }

        System.out.println("Brawler: ");
        try {             Thread.sleep(1000);         } catch (Exception e) { System.out.println("");         }
        System.out.println("Brawler is a true Bruiser! This class is not using weapons, only trust his fists!");
        try {             Thread.sleep(4000);         } catch (Exception e) { System.out.println("");         }
        System.out.println("Brawler's damage depends on health and armor. Brawlers damage is: MAX HP * 1/10 + Armor*2");
        try {             Thread.sleep(4000);         } catch (Exception e) { System.out.println("");         }
        System.out.println("｡☆✼★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★✼☆｡");
        try {             Thread.sleep(500);         } catch (Exception e) { System.out.println("");         }
        System.out.println("Warrior: ");
        try {             Thread.sleep(1300);         } catch (Exception e) { System.out.println("");         }
        System.out.println("Warriors are the symbols of courage and leadership! They are the master of blades! ");
        try {             Thread.sleep(4000);         } catch (Exception e) { System.out.println("");         }
        System.out.println("You can find weapons for your warrior. Warriors damage depends on theirs blade");
        try {             Thread.sleep(4000);         } catch (Exception e) { System.out.println("");         }
        System.out.println("CHOOSE YOUR CHARACTER!");
        try {             Thread.sleep(3500);         } catch (Exception e) { System.out.println("");         }
        System.out.println("      _    ,-,    _\n" +
                "                 ,--, /: :\\/': :`\\/: :\\\n" +
                "                |`;  ' `,'   `.;    `: |\n" +
                "                |    |     |  '  |     |.\n" +
                "                | :. |  :  |  :  |  :  | \\\n" +
                "                 \\__/: :.. : :.. | :.. |  )\n" +
                "                      `---',\\___/,\\___/ /'\n" +
                "                           `==._ .. . /'\n" +
                "                                `-::-'" +
                "\n"+

                                                "BRAWLER\n"+
                                                  "(1)"+
                "                                                                                                       ");

        System.out.println("｡★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★｡");
        try {             Thread.sleep(3500);         } catch (Exception e) { System.out.println("");         }
        System.out.println(".m.\n" +
                "               (;)\n" +
                "               (;)\n" +
                "               (;)\n" +
                "            .  (;)  .\n" +
                "            |\\_(;)_/|\n" +
                "            |/ )|( \\|  \n" +
                "              ( o )\n" +
                "               )8(\n" +
                "              ( o )\n" +
                "               )8(\n" +
                "              ;|S|;\n" +
                "              ||S|| \n" +
                "              ||S||\n" +
                "              ||S|<\n" +
                "              ||S||\n" +
                "              ||S||\n" +
                "              ||S||\n" +
                "              ||S||\n" +
                "              >|S||\n" +
                "              ||S||\n" +
                "              ||S||\n" +
                "              \\\\ //       " +
                "               \\  \n" +
                "                V" +
                "                  " +
                "              \nWARRIOR" +
                "                \n(2)            ");






        int choice = uinput.nextInt();
        if(choice == 1){
            System.out.println("YOU HAVE CHOSEN THE BRAWLER! ");
            System.out.println("Give a name for your champion:");
            uinput.nextLine();
            String name = uinput.nextLine();
            sett.setName(name);
            Text.enterthedungeon();
            try {             Thread.sleep(4000);         } catch (Exception e) { System.out.println("");         }
            Map.gamemap(sett);
            Text.score(sett);


        }else if(choice == 2 ){
            System.out.println("YOU HAVE CHOSEN THE WARRIOR");
            System.out.println("Give a name for your champion:");
            uinput.nextLine();
            String name = uinput.nextLine();
            knight.setName(name);
            Text.enterthedungeon();
            try {             Thread.sleep(4000);         } catch (Exception e) { System.out.println("");         }
            Map.gamemap(knight);
            Text.score(knight);

        }



    }

    private static void sleep(int i) {
    }

}
