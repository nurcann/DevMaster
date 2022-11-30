public class PrimeNumber {
    public static void main(String[] args){
        int m;
        int flag = 0;

        for(int k = 2; k<=200;k++){
            flag = 0;
            m = k/2;
            for(int i = 2; i<=m; i++){
                if(k%i == 0){
                    flag = -1;
                }
            }
            if(flag == 0){
                System.out.print(" " + k);
            }
        }

    }

  /*  static void findPrime(int n){
        int i;
        int m = 0;
        int flag = 0;
        m = n/2;
        if(n==0||n==1){
            System.out.println(n + " is not prime number");
        }else {
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n + " is prime number");
            }
        }

    }
    public static void main(String[] args){
        findPrime(3);
        findPrime(2);
        findPrime(7);
        findPrime(13);
        findPrime(6);
    } */
}