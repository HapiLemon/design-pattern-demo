import java.io.IOException;

/**
 * @author keminfeng
 * @date 2022-02-14 11:49
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        shallowClone();
        deepClone();
    }

    /**
     * 因为是浅拷贝，所以 Resume 对象在 clone() 之后在内存中存在3个不同的对象
     * 但 Resume 中的 WorkExperience 对象没有实现 Cloneable 接口，因此3个新的对象的 workExperience 属性指向同一个地址
     * 如果要实现深拷贝则需要让 WorkExperience 类也实现 Cloneable 接口
     * @throws CloneNotSupportedException
     */
    public static void shallowClone() throws CloneNotSupportedException {
        Resume aResume = new Resume();
        aResume.setName("浅拷贝");
        aResume.setGender("男");
        aResume.setAge(20);
        
        aResume.setWorkExperience("1999-2000","XX公司");
        Resume bResume = (Resume) aResume.clone();
        bResume.setWorkExperience("2000-2001","YY公司");
        Resume cResume = (Resume) aResume.clone();
        cResume.setWorkExperience("2001-2002","ZZ公司");
        System.out.println("---------浅拷贝");
        aResume.display();
        bResume.display();
        cResume.display();
        System.out.println(aResume == bResume);
    } 
    
    public static void deepClone() throws IOException, ClassNotFoundException {
        Resume aResume = new Resume();
        aResume.setName("深拷贝");
        aResume.setGender("男");
        aResume.setAge(21);

        aResume.setWorkExperience("1999-2000","XX公司");
        Resume bResume = (Resume) aResume.deepClone();
        bResume.setWorkExperience("2000-2001","YY公司");
        Resume cResume = (Resume) aResume.deepClone();
        cResume.setWorkExperience("2001-2002","ZZ公司");
        System.out.println("---------深拷贝");
        aResume.display();
        bResume.display();
        cResume.display();
    }
}
