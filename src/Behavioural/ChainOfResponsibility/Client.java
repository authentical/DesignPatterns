package Behavioural.ChainOfResponsibility;


import java.util.Scanner;

class Money {

    private int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

// Method to handle requests
interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Money money);
}

class Dollar50Dispensor implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(Money money) {
        if (money.getAmount() >= 50) {  // 160 : How many 50s are in 160?
            int num = money.getAmount() / 50; // 3
            int remainder = money.getAmount() % 50; // 10
            System.out.println("Dispensing " + num + " $50 bills.");

            // Call Dollar20Dispensor dispense with remainder = 10
            if (remainder != 0) this.chain.dispense(new Money(remainder));
        } else {
            this.chain.dispense(money);
        }
    }
}

class Dollar20Dispensor implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(Money money) {
        if (money.getAmount() >= 20) {  // 10 ! >= 20
            int num = money.getAmount() / 20;
            int remainder = money.getAmount() % 20;
            System.out.println("Dispensing " + num + " $20 bills.");

            if (remainder != 0) this.chain.dispense(new Money(remainder));
        }else {
                this.chain.dispense(money); // chain = Dollar10Dispensor so dispense 10 from that

        }
    }
}

class Dollar10Dispensor implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(Money money) {
        if (money.getAmount() >= 10) { // amount = 10
            int num = money.getAmount() / 10;   // 1
            int remainder = money.getAmount() % 10; // remainder = 0
            System.out.println("Dispensing " + num + " $10 bills.");

            if (remainder != 0) this.chain.dispense(new Money(remainder)); // Nope
        }else {
                this.chain.dispense(money);

        }
    } // Done
}


public class Client {
    private DispenseChain c1;

    public Client() {

        this.c1 = new Dollar50Dispensor();
        DispenseChain c2 = new Dollar20Dispensor();
        DispenseChain c3 = new Dollar10Dispensor();


        c1.setNextChain(c2);
        c2.setNextChain(c3);

    }

    public static void main(String[] args) {

        Client atmDispensor = new Client();

        while (true) {


            int amount = 0;

            Scanner input = new Scanner(System.in);

            amount = input.nextInt();

            if (amount % 10 != 0) {

                System.out.println("Amount should be multiples of 10 (for this limited implementation.)");
                return;
            }

            atmDispensor.c1.dispense(new Money(amount));


        }

    }
}

