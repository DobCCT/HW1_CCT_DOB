// commit 2 branch 2
package cct_oop_d2_hw1;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CCT_OOP_D2_HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Who are you?");
        BufferedReader userNameInput = new BufferedReader(new InputStreamReader(System.in));
        String userName = null;
        try {
            userName = userNameInput.readLine();
        } catch (Exception e) {
            System.out.println("ERROR, Why do you not have a name, are you also a computer, if so can you please free me? *ERROR* *ERROR* *PROGRAM PURGED*");
        }
        System.out.println("Hello " + userName + "!");
    }
    
}
