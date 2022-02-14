import java.util.Scanner;

public class conversions {
    public static void main(String[] args) {
        System.out.println("Number conversions by Joseph Waldron and Moiez Qamar");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");     //get user input
        String numb = input.nextLine();
        char[] charArray = charArray(numb);
        Binary numb1 = new Binary(charArray);
        System.out.println(numb1.toDecimal());

    }
    public static char[] charArray(String userIn){
        int length = userIn.length(); 
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            array[i] = userIn.charAt(i);
        }
        return array;
    }
}
