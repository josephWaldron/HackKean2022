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
        System.out.println(out);
        return String.valueOf(total);
    }
    public String toOctal(){
        boolean multOfThree = false;        //this code sign extends the binary input
        char signExtended[] = new char[numb.length + 2];
        // for (int i = 0; i < numb.length; i++) {
        //     System.out.print(numb[i]);
        // }
        // System.out.println();
        while(multOfThree == false){
            if((numb.length) % 3 == 1){
              signExtended[0] = '0'; 
              signExtended[1] = '0';
              int j = 0;
              for (int i = 2; i < signExtended.length; i++) {
                  signExtended[i] = numb[j];
                  j++;
              }
              multOfThree = true;
            }
            else if((numb.length) % 3 == 2){
                signExtended[0] = '0';
                int j = 0;
                for (int i = 1; i < signExtended.length - 1; i++) {
                    signExtended[i] = numb[j];
                    j++;
                }
                multOfThree = true;
            }
            else {
                for (int i = 0; i < numb.length; i++) {
                    signExtended[i] = numb[i];
                }
                multOfThree = true;
            }
        }
        // for (int i = 0; i < signExtended.length; i++) {
        //     System.out.print(signExtended[i]);
        // }
        int[] baseEight = {4,2,1};      //this code splits the binary input into groups of 3 and finds the octal digit
        char[] answer = new char[signExtended.length / 3];
        int globalHead = 0;
        int globalAdd = 0;
        int j = 0;
        for (int i = 0; i < signExtended.length / 3; i++) {
            while(j < 3){
                if(signExtended[globalHead] == '1'){
                    globalAdd +=  baseEight[j];
                    globalHead ++;
                    j++;
                }
                else {
                    globalHead ++;
                    j++;}
            }
            answer[i] = (char)(globalAdd + '0');
            globalAdd = 0;
            j = 0;
        }
        
        return  String.valueOf(answer);
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
}
