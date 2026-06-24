package Patterns;

public class InvertedPyramid180 {
    public static void main(String[] args) {
        int n = 4;

        for(int i=1;i<=n;i++){
            //inner loop to print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop to print *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
