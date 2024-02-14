package by.teachmeskills.ga;

import by.teachmeskills.ga.entity.User;
import by.teachmeskills.ga.repository.FileRepository;
import by.teachmeskills.ga.repository.ShopRepository;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ShopRepository repository = new FileRepository("users.dat");
//        String filePath = "users.dat"; // Укажите путь к вашему файлу
//        Collection<User> users = repository.deserializeUsersFromFile(filePath);
//        for (User user : users) {
//            System.out.println(user.getName());
//        }

        User user1 = new User(1, "John", "Doe", "johndoe", "password");
        User user2 = new User(2, "Joe", "Voe", "lover11", "123456");
        User user3 = new User(3, "Michel", "Drake", "smartthings2", "112233");
        User user4 = new User(4, "Robert", "Stark", "password", "login");
        repository.add(user1);
        repository.add(user2);
        repository.add(user3);
        repository.add(user4);

        repository.deleteById(1);

        Collection<User> allUsers = repository.allUsers();
        for (User user : allUsers) {
            System.out.println(user.getName() + " " + user.getSurname());
        }
    }

}

