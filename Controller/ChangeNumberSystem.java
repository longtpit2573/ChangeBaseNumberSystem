package ChangeBaseNumber.Controller;

import ChangeBaseNumber.Common.Algorithm;
import ChangeBaseNumber.Common.Validate;
import ChangeBaseNumber.View.Menu;

public class ChangeNumberSystem extends Menu<String> {

    static String[] mc = {"Convert to binary", "Convert to Decimal", "Convert to hexadecimal"};
    static Validate validate = new Validate();
    static Algorithm algorithm = new Algorithm();
   


    public ChangeNumberSystem() {
        super("=====CONVERT BASE NUMBER SYSTEM=====", mc);
 
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                convertBinary();
                break;
            }
            case 2: {
                convertDecimal();
                break;
            }
            case 3: {
                convertHexadecimal();
                break;
            }
            case 4: {
                System.exit(0);
            }
        }
    }

    public void convertBinary() {
    
        int inputBase = validate.getBase("Choose the input base (2/10/16): ", "Invalid input base. Please choose 2, 10, or 16.");
        int outputBase = 2; 

        String inputValue = validate.getValue("Enter the input value: ", "Invalid input value.", inputBase);

        int decimalValue = algorithm.otherToDec(inputValue, inputBase);
        String binaryValue = algorithm.decToOther(decimalValue, outputBase);

        System.out.println("After changing base:");
        System.out.println("The output: " + binaryValue);
    }

    public void convertDecimal() {
        int inputBase = validate.getBase("Choose the input base (2/10/16): ", "Invalid input base. Please choose 2, 10, or 16.");
        
        String inputValue = validate.getValue("Enter the input value: ", "Invalid input value.", inputBase);
    
        int decimalValue = algorithm.otherToDec(inputValue, inputBase);
        
    
        System.out.println("After changing base:");
        System.out.println("The output: " + decimalValue); 
    }

    public void convertHexadecimal() {
        int inputBase = validate.getBase("Choose the input base (2/10/16): ", "Invalid input base. Please choose 2, 10, or 16.");
        int outputBase = 16;

        String inputValue = validate.getValue("Enter the input value: ", "Invalid input value.", inputBase);

        int decimalValue = algorithm.otherToDec(inputValue, inputBase);
        String hexValue = algorithm.decToOther(decimalValue, outputBase);

        System.out.println("After changing base:");
        System.out.println("The output: " + hexValue);
    }
}
