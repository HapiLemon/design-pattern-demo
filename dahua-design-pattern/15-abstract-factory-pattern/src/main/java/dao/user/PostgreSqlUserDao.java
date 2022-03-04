package dao.user;

import entity.User;

/**
 * @author keminfeng
 * @date 2022-02-24 16:58
 */
public class PostgreSqlUserDao implements UserDao {
    
    @Override
    public void insert(User user) {
        System.out.println("Postgres数据库插入User。user.name=" + user.getName());
    }

    @Override
    public void findById(String id) {
        System.out.println("Postgres数据库找到User。user.id=" + id);
    }
}
