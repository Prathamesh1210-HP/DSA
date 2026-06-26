package AdvancePatterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4;

        //1st part
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //1st half 
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            //2nd half 
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd part
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //1st half
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            //2nd half 
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
