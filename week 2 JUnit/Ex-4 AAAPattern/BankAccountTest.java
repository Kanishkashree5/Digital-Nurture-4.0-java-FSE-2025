import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        // Arrange
        account = new BankAccount(1000);
    }

    @After
    public void tearDown() {
        account = null;
    }

    @Test
    public void testWithdraw() {
        // Act
        account.withdraw(200);

        // Assert
        assertEquals("Balance after withdrawal should be 800", 800, account.getBalance());
    }

    @Test
    public void testDeposit() {
        // Act
        account.deposit(500);

        // Assert
        assertEquals("Balance after deposit should be 1500", 1500, account.getBalance());
    }
}
