package atm.machine.main;

import java.util.Scanner;

public class atm {

    private static Account[] accounts = new Account[10];

    public static void main(String[] args) {
        accounts();
        mainMenuOptions();
    }
    //main menu option method
    public static void mainMenuOptions() {
        Scanner input = new Scanner(System.in);

        int enterchoice = -1;
        int id=-1;
        while (enterchoice != 4) {
            //выбор счета
            mainMenu();
            System.out.println("Номер счета: ");
            id = input.nextInt();
            System.out.println("Что сделать?  ");
            enterchoice = input.nextInt();

            int index = -1;
            for (int i = 0; i < accounts.length; i++) {
                if (accounts[i].getid() == id) {
                    index = i;
                    break;
                }
            }
            if (enterchoice == 1) {
                System.out.println("Ваш балланс: " + accounts[index].getbalance() + " руб.");
            } else if (enterchoice == 2) {
                System.out.println("Какую сумму вывести? ");
                //взнос денег
                double amount = input.nextDouble();
                accounts[index].withdraw(amount);
            } else if (enterchoice == 3) {
                //вывод денег
                System.out.println("Какую сумму внести? ");
                double amount = input.nextDouble();
                accounts[index].deposit(amount);
            }
        }
    }

    public static void accounts() {
        //Создать счет, и внести сумму
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 1000);
        }
    }
    //main menu method
    public static void mainMenu(){
        System.out.println("Главное меню"+"\n1:Проверить баланс"+"\n2:Вывести сумму"
                +"\n3:Внести сумму"+"\n4:Выход");

    }
}
