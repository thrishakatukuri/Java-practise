package DSA;

public class Eofapa {
    public static void main(String[] args) {
        Eofapa obj = new Eofapa();
        obj.evenodd(20);
        obj.prime(30);
        obj.fibonacci(10);
        obj.Armstrong(153);
    }

    void evenodd(int a) {
        int count = 0;
        for (int i = 0; i <=a; i++) {
            if (i % 2 == 0) {
                count++;
                System.out.println("Count:" + count + " even :(" + i + ")");
            } else {
                count++;
                System.out.println("Count:" + count + " odd  :(" + i + ")");
            }
        }
    }

    void prime(int a) {
        for (int i = 2; i <= a; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime number : " + i);
            }
        }
    }

    void fibonacci(int n) {
        int a = 0;
        int b = 1;
        for(int i=0; i<=n; i++){
        System.out.println(b);
            int temp = a+b;
            a =b;
            b =temp;
        }
    }

    void Armstrong(int a) {
        int b = String.valueOf(a).length();
        int temp = a;
        int sum = 0;

        while (temp > 0){
            int digit = temp% 10;
            sum+= Math.pow(digit, b);
            temp /=10;
        }
        if(sum == a){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not-Armstrong");
        }
    }
}
