/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopsmatriz;

/**
 *
 * @author CAMARGO
 */
public class ex7 {
    public static void main(String args[]) {
        // TODO code application logic here
        int[] n = {1,2,3,4,5,6,7,8,9,10};
        
        float soma_n = 0;
        float media_n;
        
        for(int i=0;i<n.length;i++)
        {
            soma_n = n[i]+soma_n;
            
        }
        media_n = soma_n/n.length;
        
        System.out.println("a soma de todos os numeros sera de "+soma_n);
        System.out.println("a media dos numeros e "+media_n);
        
    }
}
