package Pattern;
import java.util.Scanner;
class NumberDiamond{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int iterI=1;iterI<=n;iterI++){
            int temp=n-iterI;
            while(temp>0){
                System.out.print(" ");
                temp--;
            }
            for(int iterJ=1;iterJ<=iterI;iterJ++){
                System.out.print(iterI);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int iterI=n-1;iterI>0;iterI--){
            int temp=n-iterI;
            while(temp>0){
                System.out.print(" ");
                temp--;
            }
            for(int iterJ=1;iterJ<=iterI;iterJ++){
               System.out.print(iterI);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}