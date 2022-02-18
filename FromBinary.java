//todo create conversions to hex and to octal
public class FromBinary {
    //data fields
    String[] numb;
    //constructor
    public FromBinary(String[] numb){
        this.numb = numb;
    }
    public String toDecimal(){
        String full="";
        for(int i =0; i<numb.length;i++){
            full+=numb[i];
        }
        String []xx = new String[full.length()];
        for (int i = 0; i < full.length(); i++) {
            xx[i] = String.valueOf(full.charAt(i));
        }


        int total = 0;
        double[] powers = new double[xx.length];
        String[] reversed = reverseArray(xx);       //reverse array to perform calculations
        for (int i = 0; i < powers.length; i++) {       //for every element in char[] make an input for 2^i
            powers[i] = Math.pow(2, i);
        }
        for (int i = 0; i < reversed.length; i++) {
            if(reversed[i].equals("1")){
                total += powers[i];     //if number is 1 add 2^i to total
            }
            else{       //if number is 0 add nothing
                total += 0;
            }
        }

        return String.valueOf(total);
    }

    public String toOctal(){
        String full="";
        for(int i =0; i<numb.length;i++){
            full+=numb[i];
        }
        String []xx = new String[full.length()];
        for (int i = 0; i < full.length(); i++) {
            xx[i] = String.valueOf(full.charAt(i));
        }

        boolean multOfThree = false;        //this code sign extends the binary input
        String signExtended[] = new String[xx.length + 2];

        while(multOfThree == false){
            if((xx.length) % 3 == 1){
                signExtended[0] = "0";
                signExtended[1] = "0";
                int j = 0;
                for (int i = 2; i < signExtended.length; i++) {
                    signExtended[i] = xx[j];
                    j++;
                }
                multOfThree = true;
            }
            else if((xx.length) % 3 == 2){
                signExtended[0] = "0";
                int j = 0;
                for (int i = 1; i < signExtended.length - 1; i++) {
                    signExtended[i] = xx[j];
                    j++;
                }
                multOfThree = true;
            }
            else {
                for (int i = 0; i < xx.length; i++) {
                    signExtended[i] = xx[i];
                }
                multOfThree = true;
            }
        }

        int[] baseEight = {4,2,1};      //this code splits the binary input into groups of 3 and finds the octal digit
        char[] answer = new char[signExtended.length / 3];
        int globalHead = 0;
        int globalAdd = 0;
        int j = 0;
        for (int i = 0; i < signExtended.length / 3; i++) {
            while(j < 3){
                if(signExtended[globalHead].equals("1")){
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

    // to hex
    public String toHex(){
        String full="";
        for(int i =0; i<numb.length;i++){
            full+=numb[i];
        }
        String []xx = new String[full.length()];
        for (int i = 0; i < full.length(); i++) {
            xx[i] = String.valueOf(full.charAt(i));
        }

        boolean multOfFour = false;     //sign extending
        String signExtended[] = new String[xx.length + 3];
        while(multOfFour == false){
            if((xx.length) % 4 == 1){
                signExtended[0] = "0";
                signExtended[1] = "0";
                signExtended[2] = "0";
                int j = 0;
                for (int i = 3; i < signExtended.length; i++) {
                    signExtended[i] = xx[j];
                    j++;
                }
                multOfFour = true;
            }
            else if((xx.length) % 4 == 2){
                signExtended[0] = "0";
                signExtended[1] = "0";
                int j = 0;
                for (int i = 2; i < signExtended.length - 1; i++) {
                    signExtended[i] = xx[j];
                    j++;
                }
                multOfFour = true;
            }
            else if((xx.length) % 4 == 3){
                signExtended[0] = "0";
                int j = 0;
                for (int i = 1; i < signExtended.length - 2; i++) {
                    signExtended[i] = xx[j];
                    j++;
                }
                multOfFour = true;
            }
            else {
                for (int i = 0; i < xx.length; i++) {
                    signExtended[i] = xx[i];
                }
                multOfFour = true;
            }
        }
        // calculations
        int[] baseSixteen = {8,4,2,1};
        char answer[] = new char[signExtended.length / 4];
        int globalHead = 0;
        int globalAdd = 0;
        int j = 0;
        for (int i = 0; i < signExtended.length / 4; i++) {
            while(j < 4){
                if(signExtended[globalHead].equals("1")){
                    globalAdd += baseSixteen[j];
                    globalHead ++;
                    j++;
                }
                else{
                    globalHead ++;
                    j++;
                }
            }
            if(globalAdd > 9){
                if(globalAdd == 10){
                    answer[i] = 'A';
                }
                else if(globalAdd == 11){
                    answer[i] = 'B';
                }
                else if(globalAdd == 12){
                    answer[i] = 'C';
                }
                else if(globalAdd == 13){
                    answer[i] = 'D';
                }
                else if(globalAdd == 14){
                    answer[i] = 'E';
                }
                else if(globalAdd == 15){
                    answer[i] = 'F';
                }
            }
            else{
                answer[i] = (char)(globalAdd + '0');
            }
            globalAdd = 0;
            j = 0;
        }
        return String.valueOf(answer);
    }

    public String toBinary(){
        String asString="";
        for(int i =0; i<numb.length;i++){
            asString+=numb[i];
        }
        return asString;
    }


    public String[] reverseArray(String[] in){  //take in char[] and reverse it
        String[] reversed = new String[in.length];
        int temp = in.length;
        for (int i = 0; i < reversed.length; i++) {
            reversed[temp - 1] = in[i];
            temp = temp - 1;
        }
        return reversed;
    }

}