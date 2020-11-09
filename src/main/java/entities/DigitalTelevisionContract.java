package entities;

import lombok.Setter;
import lombok.Getter;

import java.time.LocalDate;

public class DigitalTelevisionContract extends DefaultContract{

    @Getter
    @Setter
    private int channelsCount;

    public DigitalTelevisionContract(int ID, LocalDate startDate, LocalDate endDate, long number, Human owner, int channelsCount) {
        super(ID, startDate, endDate, number, owner);
        this.channelsCount = channelsCount;
    }
}
