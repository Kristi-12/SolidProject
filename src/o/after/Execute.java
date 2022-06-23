package src.o.after;

import o.after.EmployeeType;

public class Execute extends EmployeeType implements src.o.after.Worker {

    private boolean isManager;
    private boolean isExecutive;

    @Override
    public void setRole() {
        this.isManager = true;
        this.isExecutive = true;
    }


}
