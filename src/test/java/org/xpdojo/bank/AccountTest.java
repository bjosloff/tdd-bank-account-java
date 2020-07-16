package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test").isBlank();
    }

    @Test
    public void CreateNewAccountWithZeroBalance()
    {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void IncreaseAccountBalance()
    {
        Account account = new Account();
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(20);
    }

    @Test
    public void DecreaseAccountBalance()
    {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(20);
        assertThat(account.balance()).isEqualTo(80);
    }
}
