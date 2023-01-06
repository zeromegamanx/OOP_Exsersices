package com.pattern.exsersice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy{
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signIn;

    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }

    @Override
    public void collectPaymentDetail() {
        try {
            while (!signIn){
                System.out.print("Enter the user's email: ");
                email = READER.readLine();
                System.out.print("");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignIn(email.equals(DATA_BASE.get(password)));
        return signIn;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (signIn) {
            System.out.println("Paying "  + paymentAmount + " using PayPal.");
            return true;
        }
        return false;
    }

    private void setSignIn(boolean signIn) {
        this.signIn = signIn;
    }
}
