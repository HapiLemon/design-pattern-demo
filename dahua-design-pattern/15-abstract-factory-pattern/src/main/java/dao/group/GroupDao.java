package dao.group;

import entity.Group;

/**
 * @author keminfeng
 * @date 2022-03-04 11:49
 */
public interface GroupDao {

    public void insert(Group group);

    public void findById(String id);
    
}
