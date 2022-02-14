public class Binary {
    char[] numb;
    public Binary(char[] numb){
        setNumb(numb);
    }
    public char[] getNumb() {
        return numb;
    }
    public void setNumb(char[] numb) {
        this.numb = numb;
    }
    public String toDecimal(){
        String out;
        int total = 0;
        double[] powers = new double[numb.length];
        char[] reversed = reverseArray(numb);
        for (int i = 0; i < powers.length; i++) {
            powers[i] = Math.pow(2, i);
        }
        for (int i = 0; i < reversed.length; i++) {
            if(reversed[i] == '1'){
                total += powers[i];
            }
            else{
                total += 0;
            }
        }
        out = String.valueOf(total);
        return out;
    }
    public char[] reverseArray(char[] in){
        char[] reversed = new char[numb.length];
        int j = numb.length;
        for (int i = 0; i < reversed.length; i++) {
            reversed[j - 1] = in[i];
            j = j - 1;
        }
        return reversed;
    }
    @Override
    public String toString() {
        return "Binary number: " + numb.toString();
    }
}
