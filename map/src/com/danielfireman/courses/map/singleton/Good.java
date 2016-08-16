package com.danielfireman.courses.map.singleton;

/**
 * Good example of singleton design pattern. 
 */
class Good {
   private static Good singleInstance = new Good();

   // Making the constructor private. No other object could create more instances.
   private Good() {}

   String quote() {
       return "\"Be the change that you wish to see in the world.\" - Mahatma Gandhi";
   }

   // Static method to get the singleton instance.
   static Good getInstance() {
      return singleInstance;
   }

   public static void main(String []args) {
       Good good = Good.getInstance();
       System.out.println(good.quote());
   }
}