package Calculator_1;
/**
 *
 * @author gourab  "Calculator"
 */
import java.util.Scanner;
public class Cal_1 {
    public static void main(String[] args)
    {
       int a,y;
       int b;
       char z;
       
   
       Scanner c= new Scanner(System.in);
       Scanner x= new Scanner(System.in);
       
       a=c.nextInt();
       
       z=x.next().charAt(0);
       y=z;
       
       b=c.nextInt();
       
       if(y==43)
       {
           Add addone =new Add();
           addone.addition(a,b);
       }
       
       else if(y==45)
       {
           Substract subone =new Substract();
           subone.substract(a,b);
       }    
       
       else if(y==42)
       {
           multiplication mulone =new multiplication();
           mulone.multiplication1(a,b);
       }
       
       else if(y==47)
       {
           Division divone =new Division();
           divone.division(a,b);
       }
       
       else if(y==37)
       {
           Modulas modone =new Modulas();
           modone.modulas(a,b);
       }
       else if(y==94)
       {
           Power powone =new Power();
           powone.power(a,b);
       }
       
       else
       {
        System.out.println(a);
        System.out.println(y);
           System.out.println(b);
        System.out.println("Something is wrong.");
       }   
               
    }
    
    
}
