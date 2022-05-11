public class test {
    private static int sum_natural_num(int n){
        int sum=0;
        for(int i=1; i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    private static  int factorial(int n){
        int ans = 1;
        for(int i=n;i>=1;i--){
            ans=ans * i;
        }
        return ans;
    }

    private static int n_to_m(int n, int m){
        int ans = 1;
        for(int i=1; i<=m;i++){
            ans*=n;
        }
        return ans;
    }

    private static int fib1(int n){

huj
    }
    public static void main(String[] args) {
        int ans = sum_natural_num(3);
       // System.out.println(ans);

        ans = factorial(10);
        System.out.println(ans);

        ans = n_to_m(2,8);
        System.out.println(ans);


    }
}
