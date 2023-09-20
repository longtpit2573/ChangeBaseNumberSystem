package ChangeBaseNumber.Common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Validate {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    Scanner sc = new Scanner(System.in);
    public int getBase(String msg, String err) {
        while (true) {
            try {
                System.out.println(msg);
                int base = Integer.parseInt(sc.nextLine());
                if (base == 2 || base == 10 || base == 16) {
                    return base;
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
            System.out.println(err);
        }
    }

    public String getValue(String msg, String err, int base) {
        while (true) {
            try {
                System.out.println(msg);
                String value = in.readLine();
                switch (base) {
                    case 2:
                        if (value.matches("[0-1]+")) {
                            return value;
                        }
                        break;
                    case 10:
                        if (value.matches("[0-9]+")) {
                            return value;
                        }
                        break;
                    case 16:
                        if (value.matches("[0-9a-fA-F]+")) {
                            return value;
                        }
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
            System.out.println(err);
        }
    }
    
    public int getInt(String promt, int m, int n) {
        int a = -1;
    
        while (true) {
            System.out.print(promt + ": ");
            try {
                
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
}
