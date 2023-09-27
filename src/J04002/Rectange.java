/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04002;

/**
 *
 * @author Admin
 */
public class Rectange {
    private int width, height;
    private String color;
   public Rectange(int width, int height, String color){
       this.width = width;
       this.height = height;
       this.color = color;
   }
   public double getWidth(){
       return this.width;
   }
   public double getHeight(){
       return this.height;
   }
   public String getColor(){
       return this.color;
   }
   public  int chuvi(){
       return (this.height + this.width) * 2;
   }
   public int dientich(){
       return this.width*this.height;
   }
   public String changeColor(){
       return this.color.substring(0, 1).toUpperCase() + this.color.substring(1).toLowerCase();
   }
}
