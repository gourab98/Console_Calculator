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
public class Division {
    int a;
    int b;
    double c;
    
    int division(int a, int b){
        c = (double)a / (double)b;
        
        System.out.print("The Division of "+a+" and "+b+" is = ");
        System.out.println(c);
        return 0;   
    

}
}