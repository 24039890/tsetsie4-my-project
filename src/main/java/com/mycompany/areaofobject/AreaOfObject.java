/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areaofobject;

/**
 *
 * @author atset
 */
import java.util.Scanner;
class AreaOfObject{
    
 public static void main(String [] args) {
     
     //area of a triangle //
     
     Scanner AREA_CIRCLE = new Scanner(System.in);
     
     int radious;
     System.out.print("enter the radious :" );
     radious = AREA_CIRCLE.nextInt();
  
     double PI,area;
     
      PI = Math.PI;
     
     area = PI*radious*radious;
     
     System.out.println(" the area of the circle is  " + area);
     
     int square_lenght,area2;
     
     Scanner areaSquare = new Scanner(System.in);
     
     System.out.print(" enter the value of lenght : " );
     square_lenght = areaSquare.nextInt();
     
     area2 = square_lenght*square_lenght;
      
     System.out.println(  area2 + " is the area of the square ");
     
     
     
     
     
      
 }     
}



