package Food2Door;

import java.time.LocalDate;

public interface OrderRepository {

    public boolean processOrder(Client client, LocalDate localDate);
}
