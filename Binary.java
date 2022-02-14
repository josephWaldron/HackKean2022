//todo create conversions to hex and to octal
public class Binary {
    //data fields
    char[] numb;
    //constructor
    public Binary(char[] numb){
        this.numb = numb;
    }
    //conversion methods
    public String toDecimal(){
        int total = 0;
        double[] powers = new double[numb.length];
        char[] reversed = reverseArray(numb);       //reverse array to perform calculations
        for (int i = 0; i < powers.length; i++) {       //for every element in char[] make an input for 2^i
            powers[i] = Math.pow(2, i);
        }
        for (int i = 0; i < reversed.length; i++) {
            if(reversed[i] == '1'){
                total += powers[i];     //if number is 1 add 2^i to total
            }
            else{       //if number is 0 add nothing
                total += 0;
            }
        }
        String out = String.valueOf(total);
        return  " in Decimal is " + out;
    }
    public char[] reverseArray(char[] in){  //take in char[] and reverse it
        char[] reversed = new char[numb.length];
        int temp = numb.length;
        for (int i = 0; i < reversed.length; i++) {
            reversed[temp - 1] = in[i];
            temp = temp - 1;
        }
        return reversed;
    }
    @Override
    public String toString() {
        return "Binary number: " + numb.toString();
    }
}
