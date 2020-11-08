package entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class MobileContract extends DefaultContract{

    @Getter
    @Setter
    private long minutesCount;

    @Getter
    @Setter
    private long smsCount;

    @Getter
    @Setter
    private long gbCount;

    public MobileContract(long ID, LocalDate startDate, LocalDate endDate, long number, Human owner, long minutesCount, long smsCount, long gbCount) {
        super(ID, startDate, endDate, number, owner);
        this.minutesCount = minutesCount;
        this.smsCount = smsCount;
        this.gbCount = gbCount;
    }
}
