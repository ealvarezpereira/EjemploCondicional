package ejemplocondicional1;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class EjemploCondicional1 {

    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero 1");
        int num1 = sc.nextInt();
        System.out.println("Introduce el numero 2");
        int num2 = sc.nextInt();
        
        
        
        //CONDICIONAL DOBLE
        
        if (num1>num2){
            
                System.out.println(num1+" Es mayor que "+num2);
        } else {
        
                System.out.println(num1+" Es menor que "+num2);
        }
        
        //También se puede hacer
        
        
        String resultado= (num1>num2) ? num1+" Es mayor que "+num2 : num1+" Es menor que "+num2;
        
            System.out.println(resultado);
            
        //CONDICIONAL COMPUESTO   
            
        if (num1>num2){
            
                System.out.println(num1+" Es mayor que "+num2);                
        }
        else if (num1==num2) {        
                System.out.println(num1+" Es igual que "+num2);
        } 
        else {            
                System.out.println(num1+" Es menor que "+num2);  
        }
  
    }
    
}
