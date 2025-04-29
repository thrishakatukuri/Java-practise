public class hey {
    public static void main(String[] args) {
        
// String vowel = "thrishakatukuri";
// String list = "AEIOUaeiou";
// String vowel2 = "";
// int count = 0;

// for(int i=0; i < vowel.length(); i++){
//    char ch = vowel.charAt(i);
//    if (list.indexOf(ch) != -1) { 
//        vowel2 += ch;
//    count++;

//    }
// }
//     System.out.println(count);
//     System.out.println(vowel2);

    //ovels

String vowel = "thrishakatukuri";
String list = "AEIOUaeiou";
String vowel2 = "";
int count = 0;

for(int i=0; i < vowel.length(); i++){
   char ch = vowel.charAt(i);
   if (list.indexOf(ch) != -1) { 
       vowel2 += ch;
   count++;

  
   }

    }
    System.out.println(count);

}}
