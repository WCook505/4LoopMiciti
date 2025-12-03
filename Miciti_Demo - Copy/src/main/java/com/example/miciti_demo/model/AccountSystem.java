package com.example.miciti_demo.model;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountSystem {

    private ArrayList<Account> accountList;

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    private final String fileName = "data/accounts.txt";


    public AccountSystem(){

        accountList = new ArrayList<>();

    }


    public void addAccount(Account acc) {
        accountList.add(acc);
    }

    @Override
    public String toString() {
        return "AccountSystem{" +
                "accountList=" + accountList +
                ", fileName='" + fileName + '\'' +
                '}';
    }

    public boolean removeAccount(String user) {

        for(int i = 0; i<accountList.size(); i++){

            boolean removed = accountList.removeIf(a -> a.getUsername().equals(user));
            if(removed){

                return true;

            }

        }

        return false;

    }
    public Account findAccount(String acc) {

        for (Account account : accountList) {

            System.out.println("Find account: " + account + "Current account: " + account.getUsername());

            if (account.getUsername().equals(acc)) {

                return account;

            }

        }

        return null;

    }

            public void updateAccount (Account acc){
                for (int i = 0; i < accountList.size(); i++) {
                    if (accountList.get(i).getUsername().equals(acc.getUsername())) {
                        accountList.set(i, acc);
                        return;
                    }
                }
            }


            private Account convertLineToAccount (String line, String delimeter){

                String[] fields = line.split(delimeter);
                if (fields.length != 3) {

                    return null;

                }

                return new Account(fields[0], fields[1], fields[2]);

            }

            // This should allow us to load database/file later
            public void loadAccount () {
                Scanner scanner = null;
                try {
                    String line;
                    Account account;
                    scanner = new Scanner(new File(fileName));
                    if (scanner.hasNextLine()) {

                        scanner.nextLine();

                    }
                    while (scanner.hasNextLine()) {

                        line = scanner.nextLine();
                        System.out.println("Line: " + line);
                        account = convertLineToAccount(line, ",");
                        System.out.println("Ship: " + account);

                        if (account != null) {

                            accountList.add(account);

                        }

                    }
                } catch (IOException e) {

                    System.out.println("Error Message: " + e.getMessage());

                } finally {

                    scanner.close();

                }
            }

    private void saveDataToFile(){

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            for(Account acc : accountList){
                bw.write(convertAccountObjectToLine(acc, ","));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error saving clients data to file: " + e.getMessage());
        }
    }

    private String convertAccountObjectToLine(Account acc, String delimiter) {
        return acc.getUsername() + delimiter + acc.getPassword() + delimiter +
                acc.getDate() + delimiter;
    }

}




