

public class toBinary {
    char[] numbs;
    String convertFrom;

    public toBinary(char[] numbs,String convertFrom){
        this.numbs = numbs;
        this.convertFrom = convertFrom;
    }

    public String[] doBinary(){
        if(convertFrom.equals("Base 10")){
            return toBinaryFromHex();
        }
        else if(convertFrom.equals("Base 8")){
            return toBinaryFromOctal();
        }
        else if(convertFrom.equals("Base 16")){
            return toBinaryFromHex();
        }
        else return null;

    }


    public String toBinaryFromDecimal(){ //decimal to binary
        return "";
    }

    public String[] toBinaryFromOctal(){ //Octal to binary
        String binary[] = new String[numbs.length];
        for (int i = 0; i < numbs.length; i++) {
            if(numbs[i] == '0'){
                binary[i] = "000";
            }
            else if (numbs[i] == '1'){
                binary[i] = "001";
            }
            else if (numbs[i] == '2'){
                binary[i] = "010";
            }
            else if (numbs[i] == '3'){
                binary[i] = "011";
            }
            else if (numbs[i] == '4'){
                binary[i] = "100";
            }
            else if (numbs[i] == '5'){
                binary[i] = "101";
            }
            else if (numbs[i] == '6'){
                binary[i] = "110";
            }
            else if (numbs[i] == '7'){
                binary[i] = "111";
            }
        }
        return binary;
    }

    public String[] toBinaryFromHex(){ //hex to binary
        String binary[] = new String[numbs.length];
        for (int i = 0; i < numbs.length; i++) {
            if(numbs[i] == '0'){
                binary[i] = "0000";
            }
            else if(numbs[i] == '1'){
                binary[i] = "0001";
            }
            else if(numbs[i] == '2'){
                binary[i] = "0010";
            }
            else if(numbs[i] == '3'){
                binary[i] = "0011";
            }
            else if(numbs[i] == '4'){
                binary[i] = "0100";
            }
            else if(numbs[i] == '5'){
                binary[i] = "0101";
            }
            else if(numbs[i] == '6'){
                binary[i] = "0110";
            }
            else if(numbs[i] == '7'){
                binary[i] = "0111";
            }
            else if(numbs[i] == '8'){
                binary[i] = "1000";
            }
            else if(numbs[i] == '9'){
                binary[i] = "1001";
            }
            else if(numbs[i] == 'A'){
                binary[i] = "1010";
            }
            else if(numbs[i] == 'B'){
                binary[i] = "1011";
            }
            else if(numbs[i] == 'C'){
                binary[i] = "1100";
            }
            else if(numbs[i] == 'D'){
                binary[i] = "1101";
            }
            else if(numbs[i] == 'E'){
                binary[i] = "1110";
            }
            else if(numbs[i] == 'F'){
                binary[i] = "1111";
            }
        }
        return binary;
    }
}
