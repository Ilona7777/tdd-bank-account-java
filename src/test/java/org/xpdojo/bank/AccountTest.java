package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        Account testAccount=new Account();
        assertThat (testAccount.putAmountBalance(5)==5);
    }

    @Test
    public void testTheBalance() {

        Account testAccount=new Account();
        assertThat (testAccount.balance==0);
    }
}
