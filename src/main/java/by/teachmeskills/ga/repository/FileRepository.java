package by.teachmeskills.ga.repository;

import by.teachmeskills.ga.entity.User;

import java.util.ArrayList;

import java.io.*;
import java.util.Collection;
import java.util.List;

public class FileRepository implements ShopRepository {
    String filePath = "D:\\Projects\\GA\\src\\main\\resources"; // путь к папке
    String fileName = "serializedobj.xml";


    public FileRepository(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void add(User user) {
        Collection<User> allUsers = allUsers();
        allUsers.add(user);
        saveToFile(allUsers);
    }

    @Override
    public void deleteById(int i) {
        Collection<User> allUsers = allUsers();
        allUsers.removeIf(user -> user.getId() == i);
        saveToFile(allUsers);
    }

    @Override
    public Collection<User> allUsers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (Collection<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    private void saveToFile(Collection<User> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Collection<User> deserializeUsersFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (Collection<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}


