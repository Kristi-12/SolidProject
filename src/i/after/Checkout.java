package i.after;

public interface Checkout {

    void checkIn();

    void checkout(String borrower);

    int getCheckOutDurationInDays();

}
