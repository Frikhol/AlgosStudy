package part3;

public class Hanoi {

    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        for(int i = 3;i<11;i++) {
            System.out.println(hanoi(i,4));
        }
    }

    public static int hanoi(int n,int i){
        if (i == 4) {
            if (n == 3)
                return 5;
            else if (n == 4)
                return 9;
            else {
                int k = n - nearInteger(Math.sqrt(2 * n + 1)) + 1;
                int TKR = hanoi(k, i);
                int TNKR = hanoi(n-k, i-1);
                return 2 * TKR + TNKR;
            }
        } else {
            return (int)Math.pow(2,n) - 1;
        }
    }

    public static int nearInteger(double val) {
        double fractional = val%1;
        return (fractional>0.5)?(int)(val-val%1)+1:(int)(val-val%1);
    }

}
