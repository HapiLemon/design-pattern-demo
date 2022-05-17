package org.example.element;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.visitor.Employer;

/**
 * @author keminfeng
 */
@Data
@AllArgsConstructor
public abstract class Staff {

    private String name;

    private int kpi;

    public abstract void accept(Employer employer);

}
