package DSA;

import java.util.Arrays;

public class Eofapa {
    public static void main(String[] args) {
        Eofapa obj = new Eofapa();
        obj.evenodd(20);
        obj.prime(30);
        obj.fibonacci(10);
        obj.Armstrong(153);//A number that is equal to the sum of its digits, where each digit is powered by the number of digits.
        obj.Wholenum(5);
        obj.Naturalnum(5);
        obj.palindrome("MAda .m");// word, number, or phrase that reads the same forwards and backwards (ignoring spaces, punctuation, and case).
        obj.Anagram("MAdam", "adamm");//2 words have sameletters,quantity but arranged differntly

    }

    void evenodd(int a) {
        int count = 0;
        for (int i = 0; i <= a; i++) {
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
                System.out.println("Prime number    : " + i);
            }
        }
    }

    void fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Fibonacci num   : " + b);
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    void Armstrong(int a) {
        int b = String.valueOf(a).length();
        int temp = a;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, b);
            temp /= 10;
        }
        if (sum == a) {
            System.out.println(a + " -is an Armstrong");
        } else {
            System.out.println(a + " is Not an Armstrong");
        }
    }

    Object Wholenum(int n) {
        for (int i = -5; i <= n; i++) {
            if (i >= 0) {
                System.out.println("Whole numbers   : " + i);
            }
        }
        return null;
    }

    int Naturalnum(int n) {
        for (int i = -5; i <= n; i++) {
            if (i > 0) {
                System.out.println("Natural numbers : " + i);
            }
        }
        return 0;
    }

    Object palindrome(String a) {
        String a1 = a.replaceAll("\\s", "").replaceAll("[!@#$%^&*<>.,`~]","").toLowerCase();
        int mismatch = 0;
        for (int i = 0; i < a1.length() / 2; i++) {
            if (a1.charAt(i) != a1.charAt(a1.length() - 1 - i)) {
                mismatch ++;
                break;
            }
        }
        if(mismatch == 0){
        System.out.println(a1 + " is a palindrome");
        }else{
        System.out.println(a1 + " is not a palindrome");
        }
        return 0;
    }

    Object Anagram(String a, String b) {
        if (a.length() != b.length()) {
            System.out.println(a + " " + b + " are not anagrams");
            return 0;
        } else {
            char[] a1 = a.toLowerCase().toCharArray();
            char[] a2 = b.toLowerCase().toCharArray();

            Arrays.sort(a1);
            Arrays.sort(a2);

            String A = new String(a1);
            String B = new String(a2);
            if (A.equals(B)) {
                System.out.println(a + " " + b + " are anagrams");
            } else {
                System.out.println(a + " " + b + " are not anagrams");
            }
            return 0;
        }
    }

}
