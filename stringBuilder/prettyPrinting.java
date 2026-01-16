
package stringBuilder;

public class prettyPrinting {

    public static void main(String[] args) {
        // float a = 453.12242f;
        // System.out.printf("Formated number is %.2f ", a);

        // System.out.printf("The pi value is : %.2f", Math.PI); // output is 3.14


        // operator value ********************************************************
        // System.out.println('a' + 'b'); //output : 195 , 
        // System.out.println("a" + "b"); // O : ab

        // STRING PERFORMANCE ****************************************************
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i); 
            System.out.println(ch); // o: a...z;
        }

    }
}