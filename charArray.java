public class charArray {
    String Val;
    /*public static void main(String[] args) {
            System.out.println("Number conversions by Joseph Waldron and Moiez Qamar");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");     //get user input todo: let user select input base
            String numb = input.nextLine();
            //char[] charArray = charArray(numb);
            Binary numb1 = new Binary(charArray);
            System.out.print(numb1.toDecimal());        //calls function to convert Binary number to
            input.close();
        }*/
    public charArray(String userIn,String choice){      //changes user input into char array
        int length = userIn.length();
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            array[i] = userIn.charAt(i);
        }
        if (choice.equals("Base 10")) {
            Binary numb1 = new Binary(array);
            Val = numb1.toDecimal();

        }
    }

    public String getVal() {
        return Val;
    }
}
