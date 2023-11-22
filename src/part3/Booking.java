package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
    public int l;
    public int r;

    public Booking(int l, int r){
        this.l = l;
        this.r = r;
    }

    @Override
    public String toString() {
        return "pag3.Booking{" +
                "l=" + l +
                ", r=" + r +
                '}';
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Booking> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lines.add(new Booking(sc.nextInt(),sc.nextInt()));
        }
        int count = 0;
        while(!lines.isEmpty()){
            Booking champ = getChamp(lines);
            removeOthers(lines,champ);
            count++;
        }
        System.out.println(count);
    }

    public static Booking getChamp(ArrayList<Booking> lines){
        int minR = Integer.MAX_VALUE;
        int minId=0;
        for (Booking line: lines) {
            if(line.r<minR){
                minR = line.r;
                minId = lines.indexOf(line);
            }
        }
        return lines.remove(minId);
    }

    public static void removeOthers(ArrayList<Booking> lines, Booking champ){
        lines.removeIf(line -> line.l <= champ.r || line.r == champ.r);
    }

}
