import java.util.Arrays;

public class Bases {

    int baseNum;

    public Bases(int num) {
        this.baseNum = num;
    }

    public String numInNewBase(int n2) {
        StringBuilder revStr = new StringBuilder();
        String[] cases = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "G", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        for(String[] currentCase = Arrays.copyOfRange(cases, 0, this.baseNum); n2 != 0; n2 /= this.baseNum) {
            int m = n2 % this.baseNum;
            revStr.append(currentCase[m]);
        }

        return (new StringBuffer(revStr.toString())).reverse().toString();
    }

}
