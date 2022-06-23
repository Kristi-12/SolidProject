package o.after;

public class Manager extends src.o.after.EmployeeType implements src.o.after.Worker {
    private boolean isManager;

    @Override
    public void setRole() {
        this.isManager = true;
    }

}
