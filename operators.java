public class operators {
    public static void main(String[] args) {
        // Operators in Java are special symbols that perform operations on variables and values. They help manipulate data and perform computations.
        // Operand	A value or variable on which an operator acts.	
        // Operator	A symbol that performs an action on operands.	
        // Operation	The complete computation performed using operators and operands.	

        // In a + b, 
        // a and b are operands.
        // +, -, *, /, % operators

        // Types of Operators in Java
        // Java has several types of operators:
        // 1.Arithmetic Operators (+, -, *, /, %)
        // 2.Assignment Operators (=, +=, -=, *=, /=, %=)
        // 3.Comparison (Relational) Operators (==, !=, >, <, >=, <=)
        // 4.Logical Operators (&&, ||, !)
        // 5.Unary Operators ( ++, --, )
        // 6.Ternary Operator (?:)
        // 7.Bitwise Operators (&, |, ^,  <<, >>,)(^, ~, >>)
        // Instanceof Operator (instanceof)

    
        //1. Arithmetic Operators
        // Arithmetic operators in Java are used to perform mathematical operations such as :
        // addition, subtraction, multiplication, division, and modulus.
        int age1 = 21;
        int age2 = 22;
        System.out.println(age1 + age2); // 43

        String name = "venni";
        String name1 = "venni";
        System.out.println(name + name1); // vennivenni
        // System.out.println(name - name1); // error
        System.out.println(age1 + name1); // 43
        // System.out.println(age1 - name1); // 43

        int age3 = 23;
        int age4 = 22;
        System.out.println(age3 - age4); // 1

        int age5 = 2;
        int age6 = 3;
        System.out.println(age5 * age6); // 6

         // - Divides the first number by the second number.
         // - If both operands are integers, the result will be an integer (decimal part is truncated).

        int price1 = 23;
        int price2 = 22;
        System.out.println(price1 % price2); // 1

        double priceA = 23;
        double priceB = 22;
        System.out.println(priceA % priceB); // 1.0 (Corrected comment: Modulus for floating point numbers)

        double priceC = 23;
        double priceD = 22;
        System.out.println(priceC / priceD); // 1.045...


        double price = 23;
        double price3 = 22;
        System.out.println(price / price3); // 1.045...

        // 2.Assignment Operators :
        // Assignment operators in Java are used to assign values to variables. 
        // These operators store the right-hand side (RHS) value into the left-hand side (LHS) variable. 
        // Java provides different types of assignment operators are: (+=, -=, *=, /=, %= etc.).
        int x = 2;
        x += 5;    //x = x + 5;
        System.out.println(x); // 7

        int y = 2;
        y -= 2;     //y= y - 2;
        System.out.println(y); // 0

        int z = 2;
        z *= 5;      //z= z * 5;
        System.out.println(z); // 10

        int p = 5;
        p %= 2;        //x = x % 5;
        System.out.println(p); // 1 (remainder)

        double q = 5;
        q /= 2;             //x = x / 5;
        System.out.println(q); // 2.5


        // 3.Comparison Operators
        // Comparison operators in Java are used to compare two values and return a boolean result (true or false). 
        // These operators are mainly used in decision-making (e.g., if-else statements, loops) and control flow statements.
        int a = 10, b = 20, c = 10;
        System.out.println(a == b); // false
        System.out.println(a == c);//true

        int i = 5, j = 10;
        System.out.println(i != j); // true
        System.out.println(i != 5); //false

        int o = 5;
        int s = 4;
        System.out.println(o > s); // true

        int r = 3;
        int t = 4;
        System.out.println(r >= t); // false

        int she = 5;
        int she1 = 4;
        System.out.println(she < she1); // false

        int rr = 4;
        int tr = 4;
        System.out.println(rr <= tr); // true

        // 4.Logical Operators (&&, ||, !)
        // Logical operators in Java are used to perform logical operations, primarily in conditional statements.
        //  These operators work with boolean values and return true or false.
        // && (Logical AND)	Returns true if both conditions are true	(a > 5 && b < 10) 
        // ||  (Logical OR) Returns true if any one of the condition is true	(a > 5 || b < 10)
        //  ! (Logical NOT)	Reverses the boolean value (true → false, false → true)	!(a > 5) 
        boolean bool1 = true;
        boolean boo12 = false;

        // Logical AND (&&) - Both conditions must be true
        System.out.println("a && b: " + (bool1 && boo12)); // Output: false

        // Logical OR (||) - At least one condition must be true
        System.out.println("a || b: " +(bool1 && boo12)); // Output: true

        // Logical NOT (!) - Negates the value
        System.out.println (!bool1); // Output: false
        System.out.println(!boo12); // Output: true

        int bool3 = 10, bool4 = 5;
        System.out.println (bool3 > 5 && bool4 < bool3); // Output: true
        System.out.println (bool4 < 5 || bool3 > bool4); // Output: true
        System.out.println(bool3 > 5 && bool4 != 0); // Output: true
        //5. Unary Operators
        // Unary operators in Java are operators that operate on a single operand (variable or value). 
        // These operators increase, decrease the value based on operations.
//   pre increment ++varible
//   post increment varible++
// pre decrement ++varible
//   post decrement varible++


        int thrisha = 10;
        System.out.println(thrisha); // 10

        //post-increment thrisha++;
        System.out.println(thrisha++); // 10
        System.out.println(thrisha); // 11


        // pre-decrement --thrisha;
        System.out.println(--thrisha); // 10
        System.out.println(thrisha); // 10


        //post-decrement thrisha--;
        System.out.println(thrisha--); // 10
        System.out.println(thrisha); // 9


        //pre-increment ++thrisha;
        System.out.println(++thrisha); // 10
        System.out.println(thrisha); // 10


         //6. Ternary operator
        // The ternary operator is a shorthand for the if-else statement in Java. 
        // It is a conditional operator that evaluates a condition and returns one of two values based on whether the condition is true or false.

        //  Variable = (condition) ? expression1 : expression2;
        // / condition: A boolean expression (evaluates to true or false).
        // / expression1: Value returned if the condition is true.
        // / expression2: Value returned if the condition is false.

        int value = 10 ;
        int value1 = 12 ;

        String min = (value > value1) ? "'12 is greater than 10'" : "'10 is not greater than 12'";
        System.out.println(min);

        //7. bitwise operators
        // Bitwise operators in Java perform operations at the bit level (binary representation of numbers).
        //  They manipulate individual bits of a number to perform operations like AND, OR, XOR, complement, left shift, and right shift.
        
        //AND & (Returns 1 if both bits are 1, otherwise 0)
        int bitwise = 5;  // 0101
        int bitwise1 = 3; // 0011
        System.out.println(bitwise & bitwise1); // Output: 1 (0001)

        //OR | (Returns 1 if at least one bit is 1, otherwise 0)+
        int bitwise2 = 6; // 0110 
        int bitwise3 = 8; // 1000 
        System.out.println(bitwise2 | bitwise3);//// Output:  14 (1110) 
  
        // XOR ^ (Returns 1 if bits are different, otherwise 0	)
        int bitwise4 = 5; // 0101
        int bitwise5 = 3; // 0011
        System.out.println(bitwise4 ^ bitwise5); // Output: 6 (0110)

        // left shit
        int bitwise6 = 5; // 0101
        System.out.println(bitwise6 << 2); // Output: 20

        // 5 in binary    =  0000 0101  (5 in decimal)
       //Left shift (<<2) =  0001 0100  (20 in decimal)

        // right shit
        int bitwise7 = 5; // 0101
        System.out.println(bitwise7 >> 2); // Output: 1

        // 5 in binary        =  0000 0101  (5 in decimal)
        // Right shift (>>2)  =  0000 0001 ,01 (1 in decimal)




        // Types of Operators
        // Number
        int num = 10;
        System.out.println(num); // 10

        // Null
        String venni = null;
        System.out.println(venni); // null

        // Undefined (Java doesn't have undefined, only null)
        String ven = null;
        System.out.println(ven); // null

        // Boolean
        int maths = 21;
        int ds = 22;
        System.out.println(maths == ds); // false

        // String
        String science = "important";
        System.out.println(science); // important
    }
}
