// import java.util.Scanner;
//todo add loop so user doesnt have to restart the program
public class conversions {
    public static void main(String[] args) {
        // System.out.println("Number conversions by Joseph Waldron and Moiez Qamar");
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number: ");     //get user input todo: let user select input base
        // String numb = input.nextLine();
        // char[] charArray = charArray(numb);
        // Binary numb1 = new Binary(charArray);
        // System.out.print(numb1.toDecimal());        //calls function to convert Binary number to 

        //to octal
        // String numoctal = "1";
        // char[] octalArray = charArray(numoctal);
        // Binary numOctalObj = new Binary(octalArray);
        // System.out.println("\n" + numOctalObj.toOctal());

        //to hex
        String numHex = "1234567";
        // numHex = numHex.toUpperCase();
        char[] hexArray = charArray(numHex);
        // Binary numHexObj = new Binary(hexArray);
        // System.out.println(numHexObj.toHex());
        // input.close();
        toBinary obj1 = new toBinary(hexArray, "Base 8");
        String[] output = obj1.doBinary();
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
        
    }
    public static char[] charArray(String userIn){      //changes user input into char array
        int length = userIn.length(); 
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            array[i] = userIn.charAt(i);
        }
        return array;
    }
}
