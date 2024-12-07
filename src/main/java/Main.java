import model.UserService;
import model.User;
import model.Message;
import model.MessageService;

public class Main {
    public static void main(String[] args) {
        //UserService userService = new UserService();
        User[] users = UserService.create4Users();

        //MessageService messageService = new MessageService();
        Message[] messages = MessageService.create4Message(users[0], users[1]);

        System.out.println("Пользователи:");
        for(int i = 0; i < users.length; i++) {
            System.out.println(users[i].getNickName());
        }

        System.out.println("Сообщения: ");
        for(int i = 0; i < messages.length; i++) {
            System.out.println("Отправитель: "  + messages[i].getSender() + " Получатель: " + messages[i].getRecipient() + " Текст: " + messages[i].getText() + " Дата и Время: " + messages[i].getDataAndTime());
        }
    }
}

