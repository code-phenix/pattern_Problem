package Pattern;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int tempStart=n;
        int tempMid=1;
        for(int iterI=1;iterI<=n;iterI++){
            tempStart=n-(iterI-1);
            while(tempStart>1){
                   System.out.print("_"); 
                   tempStart--;
            }
            System.out.print("*");
            if(iterI!=1){
                int temp=tempMid;
                // System.out.print(temp);
                while(temp>=1){
                    System.out.print("-"); 
                    temp--;
                }
                tempMid+=2;
                System.out.print("*");
            }
            if(tempMid>=(n*2)-1){
                break;
            }
            System.out.println();
        }
        System.out.println();
        for(int iterI=1;iterI<=n*2-1;iterI++){
            System.out.print("*");
        }
    }
}
