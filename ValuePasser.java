public class ValuePasser {
    String Val;
    public ValuePasser(String userIn,String from, String to){      //changes user input into char array
        int length = userIn.length();
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            array[i] = String.valueOf(userIn.charAt(i));
        }
        if(!from.equals("Base 2")) {
            ToBinary B = new ToBinary(array,from);
            B.setBinary();
            array = B.getBinary();
        }

        setVal(to,array);
    }
    public void setVal(String to, String[] array){
        if (to.equals("Base 10")) {
            FromBinary numb1 = new FromBinary(array);
            Val = numb1.toDecimal();
        }
        if (to.equals("Base 2")) {
            FromBinary numb1 = new FromBinary(array);
            Val = numb1.toBinary();
        }
        if (to.equals("Base 8")) {
            FromBinary numb1 = new FromBinary(array);
            Val = numb1.toOctal();
        }
        if (to.equals("Base 16")) {
            FromBinary numb1 = new FromBinary(array);
            Val = numb1.toHex();
        }
    }


    public String getVal() {
        return Val;
    }
}