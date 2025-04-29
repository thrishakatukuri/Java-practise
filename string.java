public class string {
  public static void main(String[] args) {

    String str = "thrishakatukuri";
    System.out.println(str.replaceAll("thrisha", "hello"));
    
    // String str1 = new String(str);
   

    StringBuilder str1 = new StringBuilder(str);
    System.out.println(str1.reverse());
    StringBuilder str2 = new StringBuilder(str);
    System.out.println(str.replace("thrisha",str1));
    String name= "hey thrisha";
    String name1 = "";
    for( int i= name.length()-1;i>=0;i--){
        name1+= name.charAt(i);
    }
    System.out.println(name1);


   //same poition but name reverse
//    String name2= "hey thrisha";
//    String name3 = "";
//    String name4 = "";
//    String word = "";

//    for (int i = 0; i <= name2.length(); i++) {
//        if (i == name2.length() || name2.charAt(i) == ' ') {
//         name3 += new StringBuilder(word).reverse().toString();
//            if (i != name2.length()) {
//                name3 += " ";
//            }
//            word = "";
//        } else {
//            word += name2.charAt(i);
//        }
//     System.out.println(name4);

//    for( int i= name2.length()-1;i>=0;i--)
//    {
//     char ch = name2.charAt(i);
//     if (ch !=' ') {
//         name3 += ch;        
//     }else{
//        String result = ch.reverse(name3)+ " ";
//         name2="";
//     }
//     System.out.println(result);
//        name1+= name.charAt(i);
//    }
//    System.out.println(name3);



//word length
// String word = "thrishakatukuri";
String word = "   thrisha";
String words = word.trim();


int count = 0;
String word1 = "";
    for( int i=0; i< words.length();i++){
        word1+= words.charAt(i);
        count++;
    }
System.out.println(count);

//ovels
    }}
    

