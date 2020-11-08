package entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

public class Human {

    @Getter
    private long ID;

    @Getter
    @Setter
    private String FIO;

    @Getter
    @Setter
    private LocalDate birthDate;

    @Getter
    @Setter
    private Gender gender;

    @Getter
    @Setter
    private int passportSeries;

    @Getter
    @Setter
    private int passportNumber;

    @Getter
    @Setter
    private int age;

    public Human(long ID, String FIO, LocalDate birthDate, Gender gender, int passportSeries, int passportNumber) {
        this.ID = ID;
        this.FIO = FIO;
        this.birthDate = birthDate;
        this.gender = gender;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        calculateAge();
    }

    public void calculateAge() {
        age = Period.between(birthDate, LocalDate.now()).getYears();
    }
}
