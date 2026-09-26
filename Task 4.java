package taskfour;
import java.util.Scanner;
class taskfour {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the value of AB :");
        double AB = Scanner.nextDouble();
        System.out.print("Enter the value of BC :");
        double BC = Scanner.nextDouble();
        System.out.print("ENter the value of CA :");
        double CA = Scanner.nextDouble();

        if (AB<=0 || BC<=0 || CA<=0 ){
System.out.println("Error Value must be bigger than zero");

        } else if (AB+BC<CA || BC+CA<AB || AB+CA<BC ) {
            System.out.println("Error value must be smaller than the ohter two values combined ");

        }
        else{
            double S = (AB+BC+CA)/ 2.0;
            double Area = Math.sqrt(S*(S-AB)*(S-BC)*(S-CA));
            System.out.printf("The area will be : %.2f%n", Area);
            Scanner.close();
        }
    }
}
