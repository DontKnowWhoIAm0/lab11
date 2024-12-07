package model;

public class MessageService {
/*
- Сообщение — Арина
    - Отправитель (пользователь)
    - Получатель  (пользователь)
    - Текст
    - Дата-время
 */
    public static Message[] create4Message(User user1, User user2) {
        Message[] messages = new Message[4];
        Message mes1 = new Message(user1, user2, "Привет!", "07.12.2024 9.53");
        messages[0] = mes1;
        Message mes2 = new Message(user1, user2, "Как дела?", "07.12.2024 10.01");
        messages[1] = mes2;
        Message mes3 = new Message(user1, user2, "Все хорошо! Ты как?", "07.12.2024 10.03");
        messages[2] = mes3;
        Message mes4 = new Message(user1, user2, "Супер", "07.12.2024 10.06");
        messages[3] = mes4;
        return messages;
    }
}
