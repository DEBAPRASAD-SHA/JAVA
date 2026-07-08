public class ch2_operator_precedence {
    public static void main(String[] args) {
        int a = 6*5+3/3;
        /*
        this is precedence
        6*5=30  * is 1st evaluate bco'z its precedence is highest and follow associativity rule
        3/3=1
        30+1=31
         */
        int b = 60/5-3*5;
        /*
        this is associativity    
        12-3*5
        12-15
        =-3
        */
        System.out.println(a);
        System.out.println(b);
        // precedence & associativity
// precedence means compare the value of symbol
// associativity means which operation 1st come that opearation 1st operate L to R and it will arise when two same value are shown.
    }
}
