public class BinaryOperations {

    int num;

    public BinaryOperations(int num) {
        this.num = num;
    }

    public String numToBin() {
        String revStr;
        for(revStr = ""; this.num != 0; this.num /= 2) {
            char ch;
            if (this.num % 2 == 0) {
                ch = '0';
            } else {
                ch = '1';
            }

            revStr = revStr + ch;
        }

        return (new StringBuffer(revStr)).reverse().toString();
    }

    public String sameLength(String str1, String str2) {
        int len;
        if (str1.length() > str2.length()) {
            for(len = str1.length(); str2.length() != str1.length(); str2 = '0' + str2) {
            }

            return str2;
        } else {
            for (len = str2.length(); str2.length() != str1.length(); str1 = '0' + str1) {
            }

            return str1;
        }
    }

    public String NOT() {
        char[] arr = this.numToBin().toCharArray();
        StringBuilder not = new StringBuilder();

        for (char c : arr) {
            if (c == '0') {
                not.append("1");
            } else {
                not.append("0");
            }
        }

        return not.toString();
    }

    public String AND(BinaryOperations num2) {
        String str1 = this.numToBin();
        String str2 = num2.numToBin();
        if (str1.length() != str2.length()) {
            if (str1.length() > str2.length()) {
                str2 = this.sameLength(str1, str2);
            } else {
                str1 = this.sameLength(str1, str2);
            }
        }

        StringBuilder AndS = new StringBuilder();

        for(int i = 0; i < str1.length(); ++i) {
            if (str1.charAt(i) == '1' && str2.charAt(i) == '1') {
                AndS.append('1');
            } else {
                AndS.append('0');
            }
        }

        return AndS.toString();
    }

    public String OR(BinaryOperations num2) {
        String str1 = this.numToBin();
        String str2 = num2.numToBin();
        if (str1.length() != str2.length()) {
            if (str1.length() > str2.length()) {
                str2 = this.sameLength(str1, str2);
            } else {
                str1 = this.sameLength(str1, str2);
            }
        }

        StringBuilder OrS = new StringBuilder();

        for(int i = 0; i < str1.length(); ++i) {
            if (str1.charAt(i) == '0' && str2.charAt(i) == '0') {
                OrS.append("0");
            } else {
                OrS.append("1");
            }
        }

        return OrS.toString();
    }

    public String XOR(BinaryOperations num2) {
        String str1 = this.numToBin();
        String str2 = num2.numToBin();
        if (str1.length() != str2.length()) {
            if (str1.length() > str2.length()) {
                str2 = this.sameLength(str1, str2);
            } else {
                str1 = this.sameLength(str1, str2);
            }
        }

        StringBuilder XorS = new StringBuilder();

        for(int i = 0; i < str1.length(); ++i) {
            if (str1.charAt(i) == str2.charAt(i)) {
                XorS.append("0");
            } else {
                XorS.append("1");
            }
        }

        return XorS.toString();
    }

}
