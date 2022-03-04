package factory;

import dao.group.GroupDao;
import dao.group.PostgreSqlGroupDao;
import dao.user.PostgreSqlUserDao;
import dao.user.UserDao;

/**
 * @author keminfeng
 * @date 2022-02-24 17:27
 */
public class PostgreSqlFactory implements DbFactory{
    @Override
    public UserDao getUserDao() {
        return new PostgreSqlUserDao();
    }

    @Override
    public GroupDao getGroupDao() {
        return new PostgreSqlGroupDao();
    }
}
