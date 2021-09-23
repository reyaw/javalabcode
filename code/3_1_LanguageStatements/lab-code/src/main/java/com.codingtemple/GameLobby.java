package com.codingtemple;

public class GameLobby {
   public static void main(String[] args) {
      //LAB TASK:  Initialize New Players
      Player player1 = new Player("coffeedude21", 2300);
      Player player2 = new Player("exaltiora", 9999);
      Player player3 = new Player("myfloorboardsqueaks", 23);
      Player player4 = new Player("itsloudinhere", 645);
      Player player5 = new Player("icanfeeleverything", 1250);
      Player player6 = new Player("whenwillitend", 65);
      Player player7 = new Player("aaaaaaaaaa", 666);
      Player player8 = new Player("secondsun1999", 200);
      //LAB TASK:  Initialize a new gameRanking object
      GameRanking gr = new GameRanking();

      //LAB TASK:  Add players to the game lobby using the joinLobby method.
      gr.joinLobby(player1);
      gr.joinLobby(player2);
      gr.joinLobby(player3);
      gr.joinLobby(player4);
      gr.joinLobby(player5);
      gr.joinLobby(player6);
      gr.joinLobby(player7);
      gr.joinLobby(player8);
   }
}
