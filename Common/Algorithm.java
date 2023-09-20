package ChangeBaseNumber.Common;

public class Algorithm {
    public int otherToDec(String other, int base) {
        int result = 0;
        String HEX = "0123456789ABCDEF";
        other = other.toUpperCase();
        for (int i = 0; i < other.length(); i++) {
            result += HEX.indexOf(other.charAt(i)) * Math.pow(base, other.length() - 1 - i);
        }
        return result;
    }

    public String decToOther(int dec, int base) {
        String result = "";
        String HEX = "0123456789ABCDEF";
        while (dec > 0) {
            result = HEX.charAt(dec % base) + result;
            dec /= base;
        }
        return result;
    }
}

