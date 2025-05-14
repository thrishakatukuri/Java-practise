
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        // reverse doesn't work with string
        // concat doesn't work with stringBuilder,buffer
        // append doesn't work with string
        // concat,substring works only when assigned to a variable

        // s1,s2 store in stack memory , hello will be stored in string constant pool
        // (SCP),here 2 hello's combine into one
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);// true //coz string literals
        System.out.println(s1.equals(s2));// true coz,
        // both are in scp

        String s3 = "hello";
        String s4 = "helloworld";
        System.out.println(s3 == s4);// false coz even though string literals it dopent checks reference but it
                                     // checks value
        System.out.println(s3.equals(s4));// false coz value are different

        String s5 = new String("helloworld");
        String s6 = new String("helloworld");
        System.out.println(s5 == s6);// false coz different new objects in heap
        System.out.println(s5.equals(s6));// true coz eauals checks only value not reference

        String s7 = "helloworld";
        String s8 = new String("helloworld");
        System.out.println(s7 == s8);// false coz, s7 is in scp,s8 in heap
        System.out.println(s8.intern() == s7);// true coz initaially s7 is in scp,s8 in heap after s8 goes to scp using
                                              // intern()
        System.out.println(s7.equals(s8));// true coz eauals checks only value not reference
        System.out.println("---");

        String s9 = "thrisha";// scp
        s9.concat("katukuri");
        System.out.println(s9);// thrisha coz s9 is immutable coz stored in scp
        System.out.println(" ");

        String s10 = "thrishaa";// scp
        String s11 = s10.concat("thrishaa");// heap
        System.out.println(s11);
        System.out.println(s10);
        System.out.println(s10 == s11);// false coz different location memories and values
        System.out.println(s10.equals(s11));// false though it doesn't check reference i.e,location memories but values
                                            // are different
        System.out.println("---");

        String s12 = "thrisha";// scp
        s12.substring(0, 3);
        System.out.println(s12);// thrisha coz s9 is immutable, coz sttored in scp
        System.out.println("---");

        String s13 = "venni";// scp
        String s14 = s13.substring(0, 5);// scp coz same as s13
        System.out.println(s13);
        System.out.println(s14);// 0-4(0,5) DOENT PRINT LAST VALUE
        System.out.println(s13 == s14);// true coz, same value of venni.both are in scp
        System.out.println(s13.equals(s14));// true
        System.out.println(s13.intern() == s14); // true coz, s13 is already in scp
        System.out.println(s14.intern() == s13); // true coz, s13 is already in scp
        System.out.println("---");

        String s15 = "Venni";// scp
        String s16 = s15.substring(0, 4);// heap
        System.out.println(s15);
        System.out.println(s16);
        System.out.println(s15 == s16);// false coz,s15 is in scp and s16 is in heap
        System.out.println(s15.equals(s16));// false coz, values different values
        System.out.println(s16.intern() == s15); // false heap-> scp done but values aren't same
        System.out.println(s15.intern() == s16); // false heap-> scp done but values aren't same
        System.out.println("---");

        String s17 = new String("helloworld");
        String s18 = s17.substring(0, 10);
        System.out.println(s17);
        System.out.println(s18);
        System.out.println(s17 == s18); // true
        System.out.println(s17.equals(s18)); // true
        System.out.println(s17.intern() == s18);// false coz, it takes s15 to scp
        System.out.println(s18.intern() == s17);// false coz, it takes s15 to scp
        System.out.println("---");

        String s19 = new String("Helloworld");
        String s20 = s19.substring(0, 9);
        System.out.println(s19);
        System.out.println(s19 == s20); // false coz diffr values
        System.out.println(s19.equals(s20)); // false coz, diff values
        System.out.println(s19.intern() == s20);// false coz, it takes s15 to scp
        System.out.println(s20.intern() == s19);// false coz, it takes s15 to scp
        System.out.println("---");

        // StringBuffer s21 = new StringBuffer("Venni");
        // System.out.println(s21 == s15);//string,stringbuffer cant be equal coz one is
        // mutable and other is immutable

        StringBuffer s22 = new StringBuffer("hello");// heap
        StringBuffer s23 = new StringBuffer("hello");// in heap with new ojects
        System.out.println(s22);
        System.out.println(s22 == s23);// false coz dif obj in heap
        System.out.println(s22.equals(s23));// its not act like string so it again checks refence not value
        System.out.println(s22.toString().equals(s23.toString())); // true
        System.out.println("---");

        StringBuilder s24 = new StringBuilder("hello thrisha");// heap
        StringBuilder s25 = new StringBuilder("hello thrisha");// in heap with new ojects
        System.out.println(s24);
        System.out.println(s24 == s25);
        System.out.println(s24.equals(s25));// false its not act like string so it again checks refence not value
        System.out.println(s24.toString().equals(s25.toString())); // true
        System.out.println("---");

        String s26 = "katukuri";
        StringBuilder s27 = new StringBuilder("katukuri");// in heap with new ojects
        System.out.println(s26);
        // System.out.println(s26 == s27);//can't equalize sting and stringbuilder
        System.out.println(s26.equals(s27));// false its not act like string so it again checks refence not value
        System.out.println("--s26,s27-");

        StringBuilder s28 = new StringBuilder("world");// in heap with new ojects
        StringBuilder s29 = s28.append("earth");// modifies the previous data and add earth to worls= worldearth
        System.out.println(s28 == s29);// true
        System.out.println("---");

        StringBuilder s30 = new StringBuilder("world");// in heap with new ojects
        s30.append("earth");
        StringBuilder s31 = new StringBuilder("world");// in heap with new ojects
        System.out.println(s30 == s31);// false
        System.out.println("---");

        StringBuffer s32 = new StringBuffer("hello");// in heap with new ojects
        StringBuffer s33 = s32.reverse();
        System.out.println(s32 == s33);// true
        System.out.println("---");

        StringBuffer s34 = new StringBuffer("hello");// in heap with new ojects
        s34.reverse();
        System.out.println(s34);// olleh
        System.out.println("---");

        // StringBuilder s35 = new StringBuilder("world");//in heap with new ojects
        // s35.append(null);//modifies the previous data and add earth to worls=
        // worldearth
        // System.out.println(s35);//errorbut expected must be worldnull

        String s35 = "hello world";
        String reversed = new StringBuilder(s35).reverse().toString();
        // String[] s36 = reversed.split("");
        System.out.println(reversed);

        String s36 = "hello world";
        String reverse = new StringBuilder(s36).toString();
        String[] s37 = reverse.split("");
        System.out.println(Arrays.toString(s37));
        String[] sliced = Arrays.copyOfRange(s37, 6, s37.length);
        System.out.println(Arrays.toString(sliced));

        String s38 = "hello world";
        String result = s38.substring(6); // Extracts from index 6 to end
        System.out.println(result);
        System.out.println("____________");

        String s39 = "hello world hello";
        String[] parts = s39.split(" "); // Splitting by space
        System.out.println(parts[1]);

        String parts1 = parts[1];
        String res = new StringBuffer(parts1).reverse().toString();
        System.out.println( parts[0] + " "+ res +" "+ parts[2]); 

        // int[] freq = new int[26]; // For 26 lowercase letters
        // for (int i = 0; i < t.length(); i++) {
        //     char c = t.charAt(i);
        //     if (c >= 'a' && c <= 'z') { // Only count lowercase letters
        //         freq[c - 'a']++;
        //     }
        // }
        // Print non-zero frequencies
        // for (int i = 0; i < 26; i++) {
        //     if (freq[i] > 0) {
        //         System.out.println((char)(i + 'a') + " : " + freq[i]);
        //     }
        // }


        System.out.println("____________________");


        String t = "hey thrisha katukuri";
        int[] freq = new int[256]; // ASCII size to handle all characters
        int l = t.length();

        for (int i = 0; i < l; i++) {
            char a = t.charAt(i);
            freq[a]++;
        }
        boolean[] printed = new boolean[256]; // Track what's already printed
        for (int i = 0; i < l; i++) {
            char a = t.charAt(i);
            if (!printed[a]) {
                printed[a] = true; // Mark as printed
                if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
                    System.out.println("Letter '" + a + "' occurred " + freq[a] + " times.");
                } else if (a >= '0' && a <= '9') {
                    System.out.println("Digit '" + a + "' occurred " + freq[a] + " times.");
                }
            }
    }
}
}
