package entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class DefaultContract {

    @Getter
    private int ID;

    @Getter
    @Setter
    private LocalDate startDate;

    @Getter
    @Setter
    private LocalDate endDate;

    @Getter
    @Setter
    private long number;

    @Getter
    @Setter
    private Human owner;

    public DefaultContract(int ID, LocalDate startDate, LocalDate endDate, long number, Human owner) {
        this.ID = ID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
        this.owner = owner;
    }
}
