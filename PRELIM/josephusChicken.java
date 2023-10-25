import java.util.Scanner;
class josephusChicken{

   final static double adultMealPrice = 109.00;
   final static double kiddieMealPrice = 250.00;
   final static double pesoToDollar = 56.00;

   public static void main(String[] a){
      System.out.println("Josephus Chicken: ");
      Scanner sc = new Scanner(System.in);
      
      /*Josephus Chicken
         Adultmeal = PHP 109.00
         KiddieMeal = PHP 250.00
      */
      
           
      
      System.out.println("Number of Adult Meals: ");
      int numberOfAdultMeal = sc.nextInt();
      
      System.out.println("Number of Kiddie Meals: ");
      int numberOfKiddieMeal = sc.nextInt();
      
      System.out.println("Number of Adult Meals: "+numberOfAdultMeal);
      System.out.println("Number of Kiddie Meals: "+numberOfKiddieMeal+"\n");
      
      double adultMealTotalPrice = numberOfAdultMeal * adultMealPrice;
      double kiddieMealTotalPrice = numberOfKiddieMeal * kiddieMealPrice;
      
      System.out.println("Total Adult Meal Price: "+adultMealTotalPrice);
      System.out.println("Total Kidde Meal Price: "+kiddieMealTotalPrice+"\n");
      
      double adultMealTotalPriceToDollar = adultMealTotalPrice / pesoToDollar;
      double kiddieMealTotalPriceToDollar = kiddieMealTotalPrice / pesoToDollar;
      
      System.out.println("Total Adult Meal Price to Dollar: " + adultMealTotalPriceToDollar);
      System.out.println("Total Kiddie Meal Price to Dollar: " + kiddieMealTotalPriceToDollar);
      
      
   }
   
}