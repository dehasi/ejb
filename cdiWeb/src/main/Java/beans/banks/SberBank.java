package beans.banks;

import beans.qualifiers.Sber;

import javax.inject.Named;

@Sber
@Named("SberBank")
public class SberBank implements Bank {
    public void withdrawal(String name, int count) {

    }

    public void deposit(String name, int count) {

    }

    public int balance(String name) {
        return 0;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
