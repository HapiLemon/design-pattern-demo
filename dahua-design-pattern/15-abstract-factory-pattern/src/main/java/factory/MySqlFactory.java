package factory;

import dao.group.GroupDao;
import dao.group.MySqlGroupDao;
import dao.user.MySqlUserDao;
import dao.user.UserDao;

/**
 * @author keminfeng
 * @date 2022-02-24 17:09
 */
public class MySqlFactory implements DbFactory{
    @Override
    public UserDao getUserDao() {
        return new MySqlUserDao();
    }

    @Override
    public GroupDao getGroupDao() {
        return new MySqlGroupDao();
    }
}
