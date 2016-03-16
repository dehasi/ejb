package beans.banks;

public interface Bank {
    void withdrawal(String name, int count);
    void deposit(String name, int count);
    int balance(String name);
    String getName();
}
