package DSA;

public class Array {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.frequency(new int[] { 10, 2, 2, 11, 1, 2, 3, 4, 2, 2, 3 });
        obj.frequency1(new int[] { 10, 2, 2, 10, 10 });
        obj.frequency2(new int[] { 10, 2, 2, 11, 1, 2, 3, 4, 2, 2, 3 });
        obj.sumOfDigits(12341234);
        obj.target(new int[] { 1, 2, 5, 7, 4, 8, 3, 9 }, 12);
    }

    void frequency(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            if (a[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = -1;
                }
            }
            System.out.println(a[i] + " occurs : " + count + " times");
        }
    }

    void frequency1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            if (a[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = -1;
                }
            }
            if (count == 0) {
                System.out.println(a[i]);
            } else {
                System.out.println(a[i]);
                a[i] = -1;
            }
        }
    }

    void frequency2(int[] a) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            if (a[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = -1;
                }
            }
            if (count == 0) {
                result.append(a[i]).append(",");
            } else {
                result.append(a[i]).append(",");
                a[i] = -1;
            }
        }
        System.out.println(result.toString());
    }

    void sumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num); // To handle negative numbers if needed

        while (num > 0) {
            int digit = num % 10; // Extract last digit
            sum += digit; // Add digit to sum
            num = num / 10; // Remove last digit
        }
        System.out.println(sum);
    }

    void target(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
        if (count == 0) {
            System.out.println("No pair found with sum " + target);

        }

    }
}