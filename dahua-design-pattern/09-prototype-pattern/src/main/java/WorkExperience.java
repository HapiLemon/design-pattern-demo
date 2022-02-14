import lombok.Data;

import java.io.Serializable;

/**
 * @author keminfeng
 * @date 2022-02-14 11:36
 */
@Data
public class WorkExperience implements Serializable {

    private String workDate;

    private String workCompany;
    
}
