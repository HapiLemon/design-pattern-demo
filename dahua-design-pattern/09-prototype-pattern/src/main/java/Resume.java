import lombok.Data;
import lombok.ToString;

import java.io.*;

/**
 * @author keminfeng
 * @date 2022-02-14 11:40
 */
@Data
@ToString
public class Resume implements Cloneable, Serializable {

    private String name;

    private String gender;
    
    private int age;

    private WorkExperience workExperience;

    public Resume() {
        this.workExperience = new WorkExperience();
    }
    
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        return objectInputStream.readObject();
    }

    public void setWorkExperience(String workDate, String workCompany) {
        this.workExperience.setWorkDate(workDate);
        this.workExperience.setWorkCompany(workCompany);
    }
}
