//math
public class CalculatorEngine {

   public static String Calculate(String number) {
   System.out.print(number);
   return number;
   }
   
   public static boolean numCheck(char Curr) {
      switch(10) {
      case 1: Curr = '1'; 
      return true;
      case 2: Curr = '2'; 
      return true;
      case 3: Curr = '3'; 
      return true;
      case 4: Curr = '4'; 
      return true;
      case 5: Curr = '5'; 
      return true;
      case 6: Curr = '6'; 
      return true;
      case 7: Curr = '7'; 
      return true;
      case 8: Curr = '8'; 
      return true;
      case 9: Curr = '9'; 
      return true;
      case 10: Curr = '0'; 
      return true;   
      }    
   return false;    
   }
   
}