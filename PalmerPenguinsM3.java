// Chris O'Dell
// COP2800C Module 3 GPA
// May 27, 2026
// PalmerPenguinsM3.java
// Program analyzes Palmer Penguin species populations.

public class PalmerPenguinsM3 {
   public static void main(String[] args) {
      final String SP_CHINSTRAP = "Chinstrap";
      final String SP_GENTOO = "Gentoo";
      final String SP_ADELIE = "Adelie";

      final int NUM_CHINSTRAP = 68;
      final int NUM_GENTOO = 151;
      final int NUM_ADELIE = 151;

      final int NUM_SPECIES = 3;

      int totalPenguins;
      String chosenSpecies;

      totalPenguins = NUM_CHINSTRAP + NUM_GENTOO + NUM_ADELIE;
      chosenSpecies = SP_GENTOO;

      // Display introductory penguin species information.
      System.out.println("Introducing the Palmer Penguins:");
      System.out.println("Chinstrap!");
      System.out.println("Gentoo!");
      System.out.println("and last but not least...");
      System.out.println("Adelie!");
      System.out.println("There are a total of " + NUM_SPECIES
            + " penguin species in this dataset.");
      System.out.println("There are a total of " + totalPenguins
            + " penguins in the dataset.");

      System.out.printf("%s: %d (%.2f%%)%n", SP_CHINSTRAP,
            NUM_CHINSTRAP,
            ((double) NUM_CHINSTRAP / totalPenguins * 100));
      System.out.printf("%s: %d (%.2f%%)%n", SP_GENTOO,
            NUM_GENTOO,
            ((double) NUM_GENTOO / totalPenguins * 100));
      System.out.printf("%s: %d (%.2f%%)%n", SP_ADELIE,
            NUM_ADELIE,
            ((double) NUM_ADELIE / totalPenguins * 100));

      // Use branching logic to find the most populous species.
      System.out.println();
      System.out.println("Branching Analysis:");

      if (NUM_CHINSTRAP > NUM_GENTOO && NUM_CHINSTRAP > NUM_ADELIE) {
         System.out.println(SP_CHINSTRAP
               + " penguins are the most populous.");
      } else if (NUM_GENTOO > NUM_CHINSTRAP
            && NUM_GENTOO > NUM_ADELIE) {
         System.out.println(SP_GENTOO
               + " penguins are the most populous.");
      } else if (NUM_ADELIE > NUM_CHINSTRAP
            && NUM_ADELIE > NUM_GENTOO) {
         System.out.println(SP_ADELIE
               + " penguins are the most populous.");
      } else {
         System.out.println("There is a tie between species for the "
               + "most populous.");
      }

      // Use a switch statement to analyze one selected species.
      System.out.println();
      System.out.println("Individual Species Switch Statement Analysis:");

      switch (chosenSpecies) {
         case SP_CHINSTRAP:
            System.out.printf("%s: %d (%.2f%%)%n", SP_CHINSTRAP,
                  NUM_CHINSTRAP,
                  ((double) NUM_CHINSTRAP / totalPenguins * 100));
            break;

         case SP_GENTOO:
            System.out.printf("%s: %d (%.2f%%)%n", SP_GENTOO,
                  NUM_GENTOO,
                  ((double) NUM_GENTOO / totalPenguins * 100));
            break;

         case SP_ADELIE:
            System.out.printf("%s: %d (%.2f%%)%n", SP_ADELIE,
                  NUM_ADELIE,
                  ((double) NUM_ADELIE / totalPenguins * 100));
            break;

         default:
            System.out.println("Species not recognized.");
            break;
      }
   }
}