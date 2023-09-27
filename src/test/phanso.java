J05033/Main.java
package J05033;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        int t = 1;
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Time> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
            }
            Collections.sort(a);
            for (Time i : a)
                System.out.println(i);
        }
        sc.close();
    }
}

J05033/Time.java
package J05033;

public class Time implements Comparable<Time> {

    private int h, m, s;

    Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override

    public String toString() {
        return h + " " + m + " " + s;
    }

    @Override
    public int compareTo(Time o) {
        int s1 = h * 60 * 60 + m * 60 + s, s2 = o.h * 60 * 60 + o.m * 60 + o.s;
        return s1 - s2;
    }
}

