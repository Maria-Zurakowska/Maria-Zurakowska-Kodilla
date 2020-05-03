package Food2Door;

import java.time.LocalDate;

public interface Order {

    public boolean order(Client client, LocalDate localDate);
}
