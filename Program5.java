import java.io.*;

public class Program5 {
    public static void main(String[] args) throws IOException {
        Stack < Account > checkingStack = new Stack < > ();
        Stack < Account > savingsStack = new Stack < > ();
        for (int i = 0; i < 25; i++) {
            Checking checkingAccount = new Checking("Insert name", 0, (int)(Math.random() * 1_000_000_000), 0);
            checkingStack.push(checkingAccount);
        }
        for (int i = 0; i < 25; i++) {
            Savings savingsAccount = new Savings("Insert name", 0, (int)(Math.random() * 1_000_000_000), 0);
            savingsStack.push(savingsAccount);
        }

        writeStackToFile(checkingStack, "checkings.out");
        writeStackToFile(savingsStack, "savings.out");

        System.out.println("Reading Checking Accounts:");
        readStackFromFile("checkings.out");

        System.out.println("Reading Savings Accounts:");
        readStackFromFile("savings.out");
    }

    public static void writeStackToFile(Stack < Account > stack, String filename) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename); ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            while (!stack.isEmpty()) {
                objectOutputStream.writeObject(stack.pop());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readStackFromFile(String filename) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) {
            while (true) {
                Account restoredAccount = (Account) objectInputStream.readObject();
                System.out.println(restoredAccount.info());
            }
        } catch (EOFException e) {
            // End of file reached, this is expected behavior
        } catch (Exception e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}