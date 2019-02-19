/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator_1;

/**
 *
 * @author gourab
 */
public class Power {
    int a;
    int b;
    double c=1;
    
    int power(int a, int b){
        for(int i=0;i<b;i++)
        {
            c=c*a;
        }
       
        System.out.print("The answer of "+a+" to the power "+b+" is = ");
        System.out.println(c);
        return 0;
    
}
}