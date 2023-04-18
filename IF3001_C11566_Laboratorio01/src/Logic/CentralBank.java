package Logic;

import Logic.Account;
import java.util.ArrayList;

public class CentralBank {
    
    private ArrayList<CommercialBank> CommercialBanks;

    public CentralBank() {
        this.CommercialBanks = new ArrayList<>();;
    }
    
    public void sinpe(CommercialBank bank, Account account, String number, double money) {

        if (bank.getBalance() >= money) {

            for (int i = 0; i < this.CommercialBanks.size(); i++) {
                for (int j = 0; j < this.CommercialBanks.get(i).getAccounts().size(); j++) {
                    if (this.CommercialBanks.get(i).getAccounts().get(j).getClient().getPhone().equals(number)) {
                        account.sinpe(money, this.CommercialBanks.get(i).getAccounts().get(j));
                        return;
                    }// if equals
                }// for accounts
            }// for banks    
            System.out.println("THE DESTINATION NUMBER IS NOT VALID");
        } else {
            System.out.println("YOUR BANK DO NOT HAVE ENOUGH MONEY");
        }
    }

    public ArrayList<CommercialBank> getCommercialBanks() {
        return CommercialBanks;
    }

    public void setCommercialBanks(ArrayList<CommercialBank> CommercialBanks) {
        this.CommercialBanks = CommercialBanks;
    }
}