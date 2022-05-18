public class test {
    private static int sum_natural_num(int n){
        int sum=0;
        for(int i=1; i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    private static int recursion_1(int n){
        if(n==1){
            return 1;
        }else{
            return n+recursion_1(n-1);
        }

    }

    private static  int factorial(int n){
        int ans = 1;
        for(int i=n;i>=1;i--){
            ans=ans * i;
        }
        return ans;
    }

    private static int recursion_2(int n){
        if(n==1){
            return 1;
        }else {
            return n*recursion_2(n-1);
        }
    }
    private static int n_to_m(int n, int m){
        int ans = 1;
        for(int i=1; i<=m;i++){
            ans*=n;
        }
        return ans;
    }

    private static int recursion_3(int n, int m){
        if(m==1){
            return n;
        }else{
            return n*recursion_3(n,m-1);
        }
    }





    private static int fib1(int n){
        if(n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else {
            return fib1(n-1)+fib1(n-2);
        }

    }
    public static void main(String[] args) {
        int ans = sum_natural_num(4);

       // ans = recursion_3(2,8);
        System.out.println(ans);

        ans = factorial(10);
     //   System.out.println(ans);

        ans = n_to_m(2,8);
      //  System.out.println(ans);

        ans = fib1(4);
     //   System.out.println(ans);
    }
}
