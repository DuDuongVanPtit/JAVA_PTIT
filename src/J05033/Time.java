/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05033;
public class Time {
    private int h, m, s;
    public Time(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }
    public int getH(){
        return this.h;
    }
    public int getM(){
        return this.m;
    }
    public int getS(){
        return this.s;
    }
    public void show(){
        System.out.println(this.h + " " + this.m + " " + this.s);
    }
}
