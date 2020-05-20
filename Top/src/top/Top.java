
package top;

import java.util.Arrays;

/**
 *
 * @author Hamza DAĞDELEN
 */
public class Top {

   
    public static void main(String[] args) {
     
  
      TopHareketleri b1 = new TopHareketleri(1, 2, 11, 12);
      System.out.println(b1);  // toString()
 
      b1.setX(3);
      b1.setY(4);
      b1.setXStep(13);
      b1.setYStep(14);
      System.out.println(b1);
  
      System.out.println("x giriniz: " + b1.getX());
  
      System.out.println("y giriniz: " + b1.getY());
   
      System.out.println("xAdımı giriniz: " + b1.getXStep());
     
      System.out.println("yAdımı giriniz: " + b1.getYStep());
      

     
      b1.setXY(5, 6);
      b1.setXYStep(15, 16);
      System.out.println(b1); 
     
      System.out.println("x ve y: " + Arrays.toString(b1.getXY())); 
 
      System.out.println("xAdım ve yAdımları: " + Arrays.toString(b1.getXYStep()));
     

      
      System.out.println(b1.hareket()); 
 
      System.out.println(b1.hareket().hareket().hareket());
      
    }
    
}
