import java.io.FileWriter;
import java.io.IOException;

public abstract class Text {
    static int invworth;
    static int savedpeople;
    static int gold;
    static int counter = 0;


    public static void enterthedungeon() {
        System.out.println("                              .     @$* @$3\n" +
                "                             '$Nueeed$$ed$$eeec$$\n" +
                "          ,            4$Lze@*$C2$b* ed(he*rb$CC$*$bc@$r              \n" +
                "    /@ |~~            .e$$\"W$$B$B$**  ^$  e\"\"##d?$Bd$$$Nc. ..      @\\/~\\ \n" +
                "    \\==|         4$kd*Cr$6F#\"`  **   .*==      # '\"**F#$I$b$*       |   I\n" +
                "       |         d$5N@$$\"   ....eu$$$$$$N$*$zbeuu     #$d$$$$b.     / @/\n" +
                "      @/     . z$Ted*\"$P zue$*9d$$$@##  .  #W$e@B$$L.    \"#@$E$b@N\n" +
                "            #d$Id*P#  'Nd$$B$**\"       .*,     \"#*N$$b$c   $$$*$$c\n" +
                "           .d#+C6J   @@$B$*\"          -***-        \"#$$$$c   *$$$#$u\n" +
                "        ..u$l4@\"^\"zJ$7W*\"              '*`            ^*$@$$$r \"$$E$@B>\n" +
                "        *@$l$P\"+Rd$$N#\"          *     /|\\     *        '\"$$$c.. ?E$*b\n" +
                "        z$ \"*.  .Jz$\"           ***   / | \\   ***         '*@N$b   d**N\n" +
                "      .z$JBR^bs@$$#          *   *   /  |  \\   *  *         \"$l*9N \"bN$Nee\n" +
                "     4$$.C*   dB@\"          ***    _/  /^\\  \\_   ***         '$$$z> 3$b$$#\n" +
                "      $\"$e$  @*$\"        *   *     \\\\^|   |^//    *   *        $$$u.^*$N$c\n" +
                "     JPd$%  @@d\"        ***        ***********       ***       '$Ni$  $EP$\n" +
                "   :e$\"*$  :et$          *         ***********        *         ^$$E  4$N$be\n" +
                "   ')$ud\"  @6$                                                   9$$   $*@$\"\n" +
                "    @F*$   *4P                       ./                          '$m#   .$$.\n" +
                " u*\"\"\"\"\"\"\"\"\"\"\"\"h                     ##=====                    e#\"\"\"\"\"\"\"\"\"\"#\n" +
                " E +e       ue. N                 ___##_______                 4F e=c     z*c\n" +
                " #e$@e.. ..z6+6d\"                #*************/               ^*cBe$u.  .$$@\n" +
                "    $ ^\"\"\"\" 4F\"  ze=eu              ********              z***hc ^\"$ \"\"*\"\" $\n" +
                "    $       ^F :*    3r                                  @\"  e \"b  $       $\n" +
                "  .e$        N $  'be$L...                            ...?be@F  $F $       9F\n" +
                " 4\" $        $ $.  zm$*****h.                      ue\"\"\"\"*h6   J$\" $       4%\n" +
                " $  $        $ $$u5e\" .     \"k                    d\"       #$bu$F  $       4F\n" +
                " \"N $        $ ^d%P  dF      $  .            .e   $     -c  \"N$F  .$       4F\n" +
                "  #$$        $  $4*. \"N.    zP  3r ..    ..  $c   *u     $  u$K$  4F       4L\n" +
                "   ^N$e.     3  F$k*. \"*C$$$# .z$\" '$    4L  \"$c. '#$eeedF  $$$9r JF       J$\n" +
                "    $'\"$$eu. 4  F3\"K$ .e=*CB$$$$L .e$    '$bc.u$***hd6C\"\"  4kF$4F $F     u@$F\n" +
                "    $   '\"*$*@u N'L$B*\"z*\"\"     \"$F\" 4k 4c '7$\"      \"*$eu 4'L$J\" $   .e$*\"4F\n" +
                "    $      '\"hC*$ \"$#.P\"          $me$\"  #$*$       .  ^*INJL$\"$  $e$$*#   4F\n" +
                "    $         $b\"h \".F     $\"     ^F        $       9r   #L#$FJEd#C@\"      4L\n" +
                "   .$         $Jb   J\"..  4b      uF        *k      J%    #c^ $\" d$        4L\n" +
                "  :\"$         $k9   $ $%4c $Bme.ze$         '*$+eee@*$\"  :r$    @L$        4$\n" +
                "  $ $         $$Jr  $d\" '$r \"*==*\"            \"#**\"\" $r  4$3r  db$F        4F\n" +
                "  $c$         $'*F  $\"   '$            /\\            $    *(L  $$$F         k\n" +
                "  #i*e.       $ 4>  $  ue $         \\`.||.'/         'L c  $$ .L$d         .$\n" +
                "   \"b.\"*e.    4 4   $  $%db=eL     `.<\\||/>.'      e*+$/$r  $ '$\"$       .d$$\n" +
                "    $^#+cC*mu 4r4   4r:6@F  $$    -----++-----    <$. \"N?N  F  $ $    ud$$* $\n" +
                "    $    \"*eJ\"@L4   4k*3Ic.*\"      .'</||\\>`.      #*5.J$$..F  $ $ ue#2*\"   $\n" +
                "    $       \"N.\"@r  4Fd\" '$r        /.'||`.\\        4$ '\"N*d\"  9.$#Ce*\"     $\n" +
                "    $         \"e^\"  'd\" uz$%           \\/           '$czr\"k#\"  4Pu@\"        $");
        try {             Thread.sleep(3500);         } catch (Exception e) { System.out.println("");         }
        System.out.println("｡★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★｡");
        System.out.println("You are entering the Dungeon!");


    }
    public static void score(Hero hero){
        invworth = 0;
        for (int x = 0; x<hero.Inventory.size() ; x++){
            invworth += hero.Inventory.get(x).value;
        }
        FileWriter writer = null;
        try {
            writer = new FileWriter("score.txt",true);
            writer.write("\n****************************************************************");
            writer.write( "\n"+hero.getName() +" have saved: " + Map.savedpeople + " Towns people");
            writer.write("\n"+hero.getName() +" have earned: " + hero.gold + " gold!");
            writer.write("\n"+hero.getName() +"'s inventory worth: " + invworth + " gold!");
            int z = Integer.sum(hero.gold*2,Map.savedpeople*10 );
            writer.write("\n"+ hero.getName() +"'s score is " + Integer.sum(z,invworth ));
            writer.write("\n****************************************************************");

            writer.close();
        } catch (IOException e) {
            System.out.println("An error has occured!");
        }
        System.out.println("You have saved " + Map.savedpeople + " Towns people");
        System.out.println("You have earned " + hero.gold + " gold!");
        int z = Integer.sum(hero.gold*2,Map.savedpeople*10 );
        System.out.println("You inventory worth: " + invworth + " gold!");
        System.out.println("Your score is " + Integer.sum(z,invworth ));
    }

    public static void writescore(Hero hero){
        System.out.println("You have saved " + Map.savedpeople + " Towns people");
        System.out.println("You have earned " + hero.gold + " gold!");
        System.out.println("Your score is " + Integer.sum(hero.gold*2,Map.savedpeople*10 ));
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Text.counter = counter;
    }
}
