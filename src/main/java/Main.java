public class Main {
    public static void main(String[] args) {


        User user1 = new User("Jan", "Kowalski", 45);
        User user2 = new User("Ola", "Nowak", 23);
        User user3 = new User("Katarzyna", "Dobron", 67);
        User user4 = new User("Sebastian", "Samotny", 34);

        BankAccount bankAccount1 = new BankAccount(1, "BankDlaBogatych", 5555, 6555);
        BankAccount bankAccount2 = new BankAccount(2, "BankNowoczesny", 4555, 6555);
        BankAccount bankAccount3 = new BankAccount(3, "Bank", 3555, 6555);
        BankAccount bankAccount4 = new BankAccount(4, "BigBank", 6555, 6555);

        user1.setBankAccount(bankAccount1);
        user2.setBankAccount(bankAccount2);
        user3.setBankAccount(bankAccount3);
        user4.setBankAccount(bankAccount4);

        System.out.println(user1.getBankAccount().getBalance());
        System.out.println(user2.getBankAccount().getBalance());
        System.out.println(user3.getBankAccount().getName());
        System.out.println(user4.getBankAccount().getAccountNumber());


    }
}
