import java.util.Scanner;


public class Main {
    public static long convert(String hex){
        long decimal = 0;
        int i = 0;
        while (i < hex.length()){
            if (hex.charAt(i) == 'a' || hex.charAt(i) == 'A'){
                decimal += 10 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == 'b' || hex.charAt(i) == 'B'){
                decimal += 11 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == 'c' || hex.charAt(i) == 'C'){
                decimal += 12 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == 'd' || hex.charAt(i) == 'D'){
                decimal += 13 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == 'e' || hex.charAt(i) == 'E'){
                decimal += 14 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == 'f' || hex.charAt(i) == 'F'){
                decimal += 15 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == '0'){
                decimal += 0 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == '1'){
                decimal += 1 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == '2'){
                decimal += 2 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == '3'){
                decimal += 3 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == '4'){
                decimal += 4 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == '5'){
                decimal += 5 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == '6'){
                decimal += 6 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == '7'){
                decimal += 7 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == '8'){
                decimal += 8 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }else if (hex.charAt(i) == '9'){
                decimal += 9 * (Math.pow(16, hex.length() - (1 + i)));
                i++;
            }
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hexaDecimal = scnr.next();
        String newHex;
        if (hexaDecimal.charAt(0) == '0' && hexaDecimal.charAt(1) == 'x'){
            newHex = hexaDecimal.substring(2);
        }else {
            newHex = hexaDecimal;
        }
        System.out.println();
        long baseTen = convert(newHex);
        System.out.print("Your number is " + baseTen + " in decimal");
    }
}
