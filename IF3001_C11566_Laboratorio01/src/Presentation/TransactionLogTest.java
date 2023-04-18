package Presentation;

import Logic.Account;
import Logic.CentralBank;
import Logic.Client;
import Logic.CommercialBank;
import Logic.SavingAccount;
import java.util.ArrayList;
import java.util.Date;

public class TransactionLogTest {
    
    public TransactionLogTest(){
    }
    
    public void test(){
        
        //Se crean Los objetos
        ArrayList<Account> accounts1 = new ArrayList<>();
        ArrayList<Account> accounts2 = new ArrayList<>();
        ArrayList<CommercialBank> banks = new ArrayList<>();
        
        Client client1 = new Client("305370902", "VICTOR CAMPOS MARTINEZ", "JUAN VIÑAS", "83036349");
        Client client2 = new Client("303930029", "ARELIS MARTINEZ LOAIZA", "TURRIALBA", "60521045");
        
        Date date = new Date(2023, 3, 17);
        float currentInterest = (float)(0.02);
        accounts1.add(new SavingAccount(date, 12, currentInterest, "CR123", client1, 5000 ));
        accounts2.add(new SavingAccount(date, 12, currentInterest, "CR456", client2, 10000 ));
        
        banks.add(new CommercialBank("BCR", 10000, accounts1));
        banks.add(new CommercialBank("BN", 20000, accounts2));
        
        CentralBank centralBank = new CentralBank();
        centralBank.setCommercialBanks(banks);
        
        
        
        //Estado de las 2 cuentas antes del sinpe
        System.out.println("Before \n" + centralBank.getCommercialBanks().get(0).getAccounts().get(0).getClient().getName() + " "
                + centralBank.getCommercialBanks().get(0).getAccounts().get(0).getBalance() + "\n"
                + centralBank.getCommercialBanks().get(1).getAccounts().get(0).getClient().getName() + " "
                + centralBank.getCommercialBanks().get(1).getAccounts().get(0).getBalance());

        //Sinpe Simulation
        TransactionLog tl[] = new TransactionLog[1];
        centralBank.sinpe(banks.get(0), accounts1.get(0), "60521045", 5000);
        tl[0] = new TransactionLog("Sinpe", accounts1.get(0), 2000);

        //Estado de las 2 cuentas despues del sinpe
        System.out.println("After \n" + centralBank.getCommercialBanks().get(0).getAccounts().get(0).getClient().getName() + " "
                + centralBank.getCommercialBanks().get(0).getAccounts().get(0).getBalance() + "\n"
                + centralBank.getCommercialBanks().get(1).getAccounts().get(0).getClient().getName() + " "
                + centralBank.getCommercialBanks().get(1).getAccounts().get(0).getBalance());
        
//        Client clients[] = new Client[10];
//        clients [0] = new Client("305370902", "Victor", "Juan Viñas", "83036349");
//        
//        Date date = new Date(2023, 3, 17);
//        float currentInterest = (float)(0.02);
//        
//        Account accounts[] = new Account[10];
//        accounts[0] = new SavingAccount(date, 12, currentInterest, "1", clients[0], 1000000);
//        
//        //Bank simulation
//        TransactionLog tl[] = new TransactionLog[5];
//        accounts[0].withdraw(250000);
//        tl[0] = new TransactionLog("WithDraw", accounts[0], 250000);
//        
        for(int i =0; i < tl.length ; i++){
            if(tl[i] != null)
                System.out.println(tl[i].toString());
        }
        
    }
}
