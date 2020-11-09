package Test;

import businessLogic.Repository;
import entities.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class RepositoryTest {

    private Human human1;
    private Human human2;
    private Human human3;

    private DefaultContract contract1;
    private DefaultContract contract2;
    private DefaultContract contract3;
    private DefaultContract contract4;
    private DefaultContract contract5;
    private DefaultContract contract6;

    private Repository repository;

    private DefaultContract[] contracts;

    @Before
    public void setUp() throws Exception {
        human1 = new Human(0, "Селиверстов Никита Алексеевич", LocalDate.of(2000,11,24),
                Gender.MALE, 2014, 888888);
        human2 = new Human(1, "Иванова Марина Сергеевна", LocalDate.of(1986,6,13),
                Gender.FEMALE, 2000, 777777);
        human2 = new Human(1, "Иванов Иван Иванович", LocalDate.of(1970,3,26),
                Gender.MALE, 1995, 666666);

        contract1 = new MobileContract(0,LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 02, 01), 10000, human1, 100, 100, 30);

        contract2 = new WireInternetContract(1,LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 02, 01), 10001, human1, 25);

        contract3 = new DigitalTelevisionContract(2,LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 02, 01), 10002, human2, 100);

        contract4 = new MobileContract(3,LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 02, 01), 10003, human3, 50, 50, 15);

        contract5 = new WireInternetContract(4,LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 02, 01), 10004, human2, 30);

        contract6 = new DigitalTelevisionContract(5,LocalDate.of(2020, 01, 01),
                LocalDate.of(2020, 02, 01), 10005, human3, 150);

        contracts = new DefaultContract[]{contract1, contract2, contract3, contract4, contract5, contract6};
    }


    @Test
    public void addAndGetContract() {

        addContractsToRepository();

        boolean isTrue = true;

        for(int i = 0; i < 6; i++)
            isTrue = isTrue && repository.getContractByID(i).equals(contracts[i]);

        Assert.assertTrue(isTrue);
    }

    @Test
    public void removeContractByID() {

        addContractsToRepository();

        boolean isTrue = true;

        for(int i = 0; i < 6; i++) {
            repository.removeContractByID(i);
            isTrue = isTrue && !contains(contracts[i]) && repository.getContractsCount() == 5;
            addContractsToRepository();
        }
    }

    private boolean contains(DefaultContract contract){
        for (int i = 0; i < repository.getContractsCount(); i++)
            if(repository.getContractByID(i).equals(contract))
                return true;
        return false;
    }

    private void addContractsToRepository(){
        repository = new Repository();
        repository.addContract(contract1);
        repository.addContract(contract2);
        repository.addContract(contract3);
        repository.addContract(contract4);
        repository.addContract(contract5);
        repository.addContract(contract6);
    }
}