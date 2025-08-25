public class pattern {
    public static void main(String[] args) {
        int n = 5;
                for(int i=0;i<n/2;++i){
            System.out.print("*"+" ");
            for(int j=0;j<n+2;++j){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=i+1;++k){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
       // middle line 
       for(int l=0;l<n+3;++l){
        System.out.print("*"+" ");
       }
       for(int l=0;l<n/2+1;++l){
        System.out.print("*"+" ");
       }
       System.out.println();

       //lower half
        for(int i=n/2;i>0;--i){
            System.out.print("*"+" ");
            for(int j=0;j<n+2;++j){
                System.out.print(" "+" ") ;
            }
            for(int k=1;k<i+1;++k){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
