public class ToBinary {
    String[] numbs;
    public String[] binary = new String[0];
    String convertFrom;

    public ToBinary(String[] numb,String convertFrom){
        this.numbs = new String[numb.length];
        for(int i = 0; i<numb.length; i++){
            this.numbs[i]=String.valueOf(numb[i]);
        }
        this.convertFrom=convertFrom;
    }

    public void setBinary(){
        if(convertFrom.equals("Base 10")){
            toBinaryFromDecimal();
        }
        if(convertFrom.equals("Base 8")){
            toBinaryFromOctal();
        }
        if(convertFrom.equals("Base 16")){
            toBinaryFromHex();
        }
    }

    public String[] getBinary(){
        return binary;
    }

    public void toBinaryFromDecimal(){ //decimal to binary
        String asString="";
        for(int i =0; i<numbs.length;i++){
            asString+=numbs[i];
        }

        int asNumb =Integer.parseInt(asString);
        int quotient=asNumb;
        int remainder;
        while(quotient!=0){
            remainder=quotient%2;

            quotient/=2;

            String[] arr1 = new String[binary.length];

            for(int i = 0;i< binary.length;i++){ //copy over binary to arr1
                arr1[i]=binary[i];
            }
            binary= new String[arr1.length+1];

            for(int i = 1; i<arr1.length+1;i++){
                binary[i]=arr1[i-1];
            }
            binary[0]= String.valueOf(remainder);
        }
    }

    public void toBinaryFromOctal(){ //Octal to binary
        binary = new String[numbs.length];
        for (int i = 0; i < numbs.length; i++) {
            if(numbs[i].equals("0")){
                binary[i] = "000";
            }
            else if (numbs[i].equals("1")){
                binary[i] = "001";
            }
            else if (numbs[i].equals("2")){
                binary[i] = "010";
            }
            else if (numbs[i].equals("3")){
                binary[i] = "011";
            }
            else if (numbs[i].equals("4")){
                binary[i] = "100";
            }
            else if (numbs[i].equals("5")){
                binary[i] = "101";
            }
            else if (numbs[i].equals("6")){
                binary[i] = "110";
            }
            else if (numbs[i].equals("7")){
                binary[i] = "111";
            }
        }

    }

    public void toBinaryFromHex(){ //hex to binary
        binary = new String[numbs.length];
        for (int i = 0; i < numbs.length; i++) {
            if(numbs[i].equals("0")){
                binary[i] = "0000";
            }
            else if(numbs[i].equals("1")){
                binary[i] = "0001";
            }
            else if(numbs[i].equals("2")){
                binary[i] = "0010";
            }
            else if(numbs[i].equals("3")){
                binary[i] = "0011";
            }
            else if(numbs[i].equals("4")){
                binary[i] = "0100";
            }
            else if(numbs[i].equals("5")){
                binary[i] = "0101";
            }
            else if(numbs[i].equals("6")){
                binary[i] = "0110";
            }
            else if(numbs[i].equals("7")){
                binary[i] = "0111";
            }
            else if(numbs[i].equals("8")){
                binary[i] = "1000";
            }
            else if(numbs[i].equals("9")){
                binary[i] = "1001";
            }
            else if(numbs[i].equals("A")){
                binary[i] = "1010";
            }
            else if(numbs[i].equals("B")){
                binary[i] = "1011";
            }
            else if(numbs[i].equals("C")){
                binary[i] = "1100";
            }
            else if(numbs[i].equals("D")){
                binary[i] = "1101";
            }
            else if(numbs[i].equals("E")){
                binary[i] = "1110";
            }
            else if(numbs[i].equals("F")){
                binary[i] = "1111";
            }
        }
    }
}
