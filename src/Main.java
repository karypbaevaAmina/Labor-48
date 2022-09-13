import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new VoteMachine("localhost", 9689).start();
        } catch (IOException e) {
            e.printStackTrace();



        }
    }
}