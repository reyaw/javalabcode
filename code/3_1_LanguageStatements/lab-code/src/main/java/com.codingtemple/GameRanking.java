package com.codingtemple;

public class GameRanking {
   public void joinLobby(Player player){
      String gt = player.getGamerTag();
      //LAB TASK:  Using a switch statement, print out the gamers level name.

      /*
       *  1 = Silver
       *  2 = Gold
       *  3 = Platinum
       *  4 = Diamond
       */

      switch (player.getGamerLevel()){
         case 1:
            System.out.println(gt + ": Silver");
            break;
         case 2:
            System.out.println(gt + ": Gold");
            break;
         case 3:
            System.out.println(gt + ": Platinum");
            break;
         case 4:
            System.out.println(gt + ": Diamond");
            break;
      }

      //LAB TASK:  Print an empty line

   }
}


