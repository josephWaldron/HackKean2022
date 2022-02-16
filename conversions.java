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
        System.out.println();
        System.out.println(String.valueOf(octalCharArray(output)));
        Binary test = new Binary(octalCharArray(output));
        System.out.println(test.toHex());
        
    }
    public static char[] charArray(String userIn){      //changes user input into char array
        int length = userIn.length(); 
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            array[i] = userIn.charAt(i);
        }
        return array;
    }
    public static char[] octalCharArray(String[] input){
        int length = input.length * 3;
        char[] array = new char[length];
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            array[j] = input[i].charAt(0);
            j++;
            array[j] = input[i].charAt(1);
            j++;
            array[j] = input[i].charAt(2);
            j++;
        }
        return array;
    }
    public static char[] hexCharArray(String[] input){
        int length = input.length * 4;
        char[] array = new char[length];
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            array[j] = input[i].charAt(0);
            j++;
            array[j] = input[i].charAt(1);
            j++;
            array[j] = input[i].charAt(2);
            j++;
            array[j] = input[i].charAt(3);
            j++;
        }
        return array;
    }
}
