/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05033;
import java.util.*;
public class Main {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int t = sc.nextInt();
           List <Time> times = new ArrayList<Time>();
           while(t-- > 0){
               Time time = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
               times.add(time);
           }
           Collections.sort(times, new Comparator<Time>(){
               public int compare(Time a, Time b){
                   if(a.getH() != b.getH()) return a.getH() - b.getH();
                   if(a.getM() != b.getM()) return a.getM() - b.getM();
                   return a.getS() - b.getS();
               }
           });
           for(Time x : times) x.show();
    }
}
//3
//11 20 20
//14 20 14
//11 15 12
