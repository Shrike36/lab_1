package businessLogic;

import entities.DefaultContract;
import lombok.Getter;

import java.util.Arrays;

public class Repository {

    @Getter
    private DefaultContract[] listOfContracts = new DefaultContract[10];

    @Getter
    private int contractsCount = 0;

    public void addContract(DefaultContract contract){
        if(contractsCount == listOfContracts.length){
            increaseArray();
        }
        listOfContracts[contractsCount] = contract;
        contractsCount++;
    }

    private void increaseArray(){
        listOfContracts = Arrays.copyOf(listOfContracts, listOfContracts.length * 2);
    }

    public DefaultContract getContractByID(int ID){
        return listOfContracts[ID];
    }

    public void removeContractByID(int ID){
        contractsCount--;
        for (int i = ID + 1; i <= contractsCount; i++){
            listOfContracts[i - 1] = listOfContracts[i];
        }
        listOfContracts[contractsCount] = null;
    }
}
