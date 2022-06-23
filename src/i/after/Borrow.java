package i.after;

import java.time.LocalDateTime;

public interface Borrow {

    LocalDateTime getBorrowDate();

    String getBorrower();
    String getLibraryId();

}
