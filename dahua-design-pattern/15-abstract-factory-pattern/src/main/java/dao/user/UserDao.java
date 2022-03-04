package dao.user;

import entity.User;

/**
 * @author keminfeng
 * @date 2022-02-24 16:59
 */
public interface UserDao {

    public void insert(User user);

    public void findById(String id);
    
}
