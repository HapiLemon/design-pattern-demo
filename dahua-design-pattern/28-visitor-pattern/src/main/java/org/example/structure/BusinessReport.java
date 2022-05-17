package org.example.structure;

import org.example.element.Staff;
import org.example.visitor.Employer;

import java.util.List;

/**
 * @author keminfeng
 */
public class BusinessReport {

    public void showReport(Employer employer, List<Staff> staffList) {
        for (Staff staff : staffList) {
            staff.accept(employer);
        }
    }

}
