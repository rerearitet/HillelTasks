package task32;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();
        chat.addMessage(true, "Bambaleilo");
        chat.addMessage(false, "Boomer");
        chat.addMessage("game ends in 5 minutes", null);
        chat.addMessage("hey guys, im 13", "lvl 80 boss");
        chat.addMessage(14, "lvl 81 boss");
        chat.addMessage(1.97, 'a');
        chat.printChat(((message, nickName) -> System.out.println("[" + nickName +"]: " + message)));
    }
}
