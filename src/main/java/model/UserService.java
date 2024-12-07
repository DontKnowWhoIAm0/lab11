package model;

public class UserService {

    public User[] create4Users() {
        User[] users = new User[4];
        User first = new User("dont_know_who_I_am", "Соня", "+79120124565", "qwerty1234");
        users[0] = first;
        User second = new User("atubien", "Ляйсан", "+79123456789", "Lays");
        users[1] = second;
        User third = new User("arinkmm", "Арина", "+79379874536", "fghksdkf");
        users[2] = third;
        User fourth = new User("Kkkkkkkkkk066", "Камила", "+79024569878", "password");
        users[3] = fourth;
        return users;
    }

}
