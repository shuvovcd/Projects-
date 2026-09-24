package tasktwo;
import java.util.Scanner;
 class tasktwo{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter the lenth of the room:");
   int lenth =  scanner.nextInt();
   System.out.print("Enger the width of the room :");
   int width =  scanner.nextInt();
   int area = lenth * width ;
   System.out.print("enter the price of per tiles :");
   float price = scanner.nextFloat();
   float tilesneeded = area *1.05f;
   float totalcost = tilesneeded * price;
   System.out.printf("total amount will be :%.2f%n", totalcost);
   System.out.printf("total area is :%d%n", area);
   scanner.close();
  }
 }
