import model.UserService;
import model.User;
import model.Message;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User[] users = userService.create4users();

        MessageService messageService = new MessageService();
        Message[] messages = messageService.create4messages(users[0], users[1]);

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

