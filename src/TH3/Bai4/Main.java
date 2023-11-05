package TH3.Bai4;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        Scanner sc1 = new Scanner(new File("REGISTER.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList <Information> teams = new ArrayList<>();
        HashMap <String, School> mp = new HashMap<>();
        while(t-- > 0){
            School a = new School(sc.next(), sc.nextLine().trim());
            mp.put(a.getCode(), a);
        }
        int tdk = sc1.nextInt();
        sc1.nextLine();
        while(tdk-- > 0){
            String[] tmp = sc1.nextLine().split(" ");
            String schoolCode = tmp[0];
            int numbers = Integer.parseInt(tmp[1]);
            while(numbers-- > 0){
                Information x = new Information();
                x.setTeamName(sc1.nextLine());
                x.setSchoolName(mp.get(schoolCode).getName());
                teams.add(x);
            }
            
        }
        teams.sort((o1, o2)->{
            int nameComparison = o1.getSchoolName().compareTo(o2.getSchoolName());
            if(nameComparison != 0){
                return nameComparison;
            }
            return o1.getTeamName().compareTo(o2.getTeamName());
        });
        int cnt = 1;
        for(Information x : teams){
             if(cnt < 10){
                 System.out.println("team0"+ cnt + " " + x);
             }
             else{
                 System.out.println("team" + cnt + " " + x);
             }
             cnt++;
        }          
    }
}
