package taskone;
import java.util.Scanner;
class task1 {
    public static void main(String[] args){
        Scanner Scanner= new Scanner(System.in);
        System.out.printf("Enter the year :");
        int M= Scanner.nextInt();
        if(M>= 1896 && (M-1896) % 4 ==0){
            int Edition = (M-1896) / 4 + 1 ;
            System.out.println(M +"is an olympic year ");
            System.out.println(Edition +"is the edition number");

        }else {
            System.out.println("The year is not an olympic year");
        }
        Scanner.close();

    }

}
