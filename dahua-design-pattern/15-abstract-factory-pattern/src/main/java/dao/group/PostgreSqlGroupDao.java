package dao.group;

import entity.Group;

/**
 * @author keminfeng
 * @date 2022-03-04 11:50
 */
public class PostgreSqlGroupDao implements GroupDao{
    @Override
    public void insert(Group group) {
        System.out.println("PostgreSql数据库插入Group。group.name=" + group.getName());
    }

    @Override
    public void findById(String id) {
        System.out.println("PostgreSql数据库找到Group。group.id=" + id);
    }
}
