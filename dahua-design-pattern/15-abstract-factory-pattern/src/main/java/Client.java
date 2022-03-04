import dao.user.UserDao;
import entity.User;
import factory.PostgreSqlFactory;

/**
 * @author keminfeng
 * @date 2022-02-24 17:08
 */
public class Client {
    public static void main(String[] args) {
        PostgreSqlFactory postgreSqlFactory = new PostgreSqlFactory();
        UserDao userDao = postgreSqlFactory.getUserDao();

        User user = new User("Bill");
        userDao.insert(user);
        userDao.findById("1");
    }
}
