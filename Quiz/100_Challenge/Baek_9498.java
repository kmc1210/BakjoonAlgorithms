import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Sco = sc.nextInt();
        if(Sco>=90){
            System.out.println("A");}
                else if(Sco>=80){
                      System.out.println("B");}
                    else if(Sco>=70){
                        System.out.println("C");}
                        else if(Sco>=60){
                            System.out.println("D");}
                            else{
                                System.out.println("F");
                            }                
        
    }
}
