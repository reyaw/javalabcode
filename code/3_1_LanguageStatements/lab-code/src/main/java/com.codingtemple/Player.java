package com.codingtemple;

public class Player {
   String gamerTag;
   private int gamerPoints;
   private int gamerLevel;

   public Player(){ }

   public Player(String gamerTag, int gamerPoints){
      //LAB TASK:  Assign the global fields (gamerTag & gamerPoints) with the values passed into this overloaded constructor
      this.gamerTag = gamerTag;
      this.gamerPoints = gamerPoints;
      //LAB TASK:  Set the gamer level using the gamerPoints passed in.
      setGamerLevel(gamerPoints);
   }

   public String getGamerTag() {
      return gamerTag;
   }

   public void setGamerTag(String gamerTag) {
      this.gamerTag = gamerTag;
   }

   public int getGamerPoints() {
      return gamerPoints;
   }

   public void setGamerPoints(int gamerPoints) {
      this.gamerPoints = gamerPoints;
   }

   public int getGamerLevel() {
      return gamerLevel;
   }

   public void setGamerLevel(int gamerPoints) {
      //LAB TASK:  Using if else statements assign a gamer level depending on points (See Below).
         //LAB NOTE:  if(gamerPoints >= 0 && gamerPoints <= 99)
      if(0 <= gamerPoints && gamerPoints <= 99){
         this.gamerLevel = 1;
      } else if(100 <= gamerPoints && gamerPoints <= 499){
         this.gamerLevel = 2;
      } else if(500 <= gamerPoints && gamerPoints <= 2499){
         this.gamerLevel = 3;
      } else if(gamerPoints >= 2500){
         this.gamerLevel = 4;
      }
      /*
      * gamerLevel = 1 // (0 - 99)
      * gamerLevel = 2 // (100 - 499)
      * gamerLevel = 3 // (500 - 2499)
      * gamerLevel = 4 // (2500 and up)
      * */
   }
}
