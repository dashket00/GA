package by.teachmeskills.ga.repository;

import by.teachmeskills.ga.entity.User;

import java.util.Collection;

public interface ShopRepository {
    void add(User user);
    void deleteById(int i);
    Collection <User>allUsers();
    Collection<User> deserializeUsersFromFile(String filePath);


}
