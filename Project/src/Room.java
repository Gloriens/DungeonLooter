import java.util.ArrayList;
import java.util.List;

public class Room {
    int townspeople;
    int healertownspeople;
    static List<Items> dropitem = new ArrayList<>();
    static List<Darkraces> enemylist = new ArrayList();


    public Room() {
        dropitem = new ArrayList<>();
        enemylist = new ArrayList<>();
        enemylist.add(Darkraces.randomdarkrace());
        enemylist.add(Darkraces.randomdarkrace());
        townspeople = (int) (Math.random() * 3);
        healertownspeople = (int) (Math.random() * 2);

    }

    public void info(){
        for(int z =0; z< enemylist.size(); z++){
            System.out.println("There is a/an " + enemylist.get(z).name + " in this room!");

        }
        System.out.println("Number of towns people: " + townspeople);
        System.out.println("Number of healer towns people: " + healertownspeople);

    }



}
