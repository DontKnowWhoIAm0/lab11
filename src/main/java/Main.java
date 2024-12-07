import model.UserService;
import model.User;
import model.Message;
import model.MessageService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User[] users = UserService.create4users();

        MessageService messageService = new MessageService();
        Message[] messages = MessageService.create4messages(users[0], users[1]);

        System.out.println("Пользователи:");
        for(int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }

        System.out.println("Сообщения: ");
        for(int i = 0; i < messages.length; i++) {
            System.out.println(messages[i]);
        }
    }
}

