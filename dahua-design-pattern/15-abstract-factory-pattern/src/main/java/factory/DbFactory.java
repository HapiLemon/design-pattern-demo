package factory;

import dao.group.GroupDao;
import dao.user.UserDao;

/**
 * @author keminfeng
 * @date 2022-02-24 17:08
 */
public interface DbFactory {

    public UserDao getUserDao();

    public GroupDao getGroupDao();
    
}
