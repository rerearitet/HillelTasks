package task32;

import javafx.util.Pair;
import java.util.ArrayList;

public class Chat {
    private ArrayList<Pair> messages = new ArrayList<>();

    public <T> void addMessage(T message, T nickName) {
        messages.add(new Pair(message, nickName));
    }

    public void printChat(PrintWithNickName printWithNickName) {
        while (messages.size() != 0) {
            printWithNickName.print(messages.get(0).getKey(), messages.remove(0).getValue());
        }
    }
}
