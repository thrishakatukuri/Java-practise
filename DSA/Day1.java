package DSA;

public class Day1 {
    public static void main(String[] args) {
        Day1 day = new Day1();
        day.str("thrisha katukuri");
        day.str1("thrisha katukuri");
        day.del("thrisha katukuri alias venni");
        day.insert("thrisha katukuri","alias venni" ,2);
        day.num(-1234123456);
    }

    void str(String a) {// reverse
        String res = new StringBuffer(a).reverse().toString();
        System.out.println(res);// using reverse method

        String[] A = a.split(" ");
        String result = new StringBuffer(A[1]).reverse().toString();
        System.out.println(A[0] + " " + result);// using reverse method

        String[] a1 = a.split(" ");// s-a
        String result1 = "";
        for (int i = a1[1].length() - 1; i >= 0; i--) {
            result1 += a1[1].charAt(i);
        }
        String f = a1[0] + " " + result1;
        System.out.println(f);
    }

    void str1(String a) {// reverse
        String[] a1 = a.split(" ");// s-a
        String result1 = "";
        for (int i = a1.length - 1; i >= 0; i--) {
            result1 += new StringBuffer(a1[i]).reverse().toString() + " ";
        }
        System.out.println("same words reverse : " + result1);
    }

    void del(String a) {
        String[] a1 = a.split(" ");
        String result = "";
        if (a1.length > 1) {
            for (int i = 0; i < a1.length; i++) {
                if (i != 1) {
                    result += a1[i] + " ";
                }
            }
            System.out.println("delete : " + result);
        }
    }
     void insert(String a) {
        String[] a1 = a.split(" ");
        String result = "";
        if (a1.length > 1) {
            for (int i = 0; i < a1.length; i++) {
                if (i != 1) {
                    result += a1[i] + " ";
                }
            }
            System.out.println("delete : " + result);
        }
    }
    void insert(String a, String wordToAdd, int position) {
    String[] a1 = a.split(" ");
    String result = "";

    for (int i = 0; i <= a1.length; i++) {
        if (i == position) {
            result += wordToAdd + " ";
        }
        if (i < a1.length) {
            result += a1[i] + " ";
        }
        }
    System.out.println("add    : " + result.trim());
    }

    //number length
    void num(int a){
        // int a1= String.valueOf(a).length();
        // System.out.println(a1);
        int count = 0;
            a = Math.abs(a); // handle negative numbers

        while(a>0){
            a /=10;
            count++;
        }
        System.out.println(count);

    }

}
