package by.teachmeskills.ga.repository;

import by.teachmeskills.ga.entity.User;

import java.util.Collection;
import java.util.List;

public interface ShopRepository {
    public void add(User user);
    public void deleteByld(Long userId);
    public Collection <User>allUsers();
    Collection<User> deserializeUsersFromFile(String filePath);
}
