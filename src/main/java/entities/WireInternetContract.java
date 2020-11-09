package entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class WireInternetContract extends DefaultContract {

    @Getter
    @Setter
    private int speed;

    public WireInternetContract(int ID, LocalDate startDate, LocalDate endDate, long number, Human owner, int speed) {
        super(ID, startDate, endDate, number, owner);
        this.speed = speed;
    }
}
