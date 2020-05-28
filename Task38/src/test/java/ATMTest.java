import com.hillel.lombok.ATM;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATMTest {

    ATM atm;

    @BeforeEach
    void before() {
        atm = new ATM(" ");
    }


    @Test
    @DisplayName("Replenish: correct. ")
    void replenish_correct() {

        String result = atm.input("+ USD 100 10");
        assertEquals("OK", result);

    }

    @Test
    @DisplayName("Replenish: incorrect currency. ")
    void replenish_incorrectCurrency() {

        String result = atm.input("+ usd 100 10");

        assertEquals("Invalid currency. ", result);

    }

    @Test
    @DisplayName("Replenish: incorrect value. ")
    void replenish_incorrectValue() {

        String result = atm.input("+ USD 15 10");

        assertEquals("Invalid value", result);

    }

    @Test
    @DisplayName("Replenish: incorrect number. ")
    void replenish_incorrectNumber() {

        String result = atm.input("+ USD 100 -1");

        assertEquals("Invalid number. ", result);

    }

    @Test
    @DisplayName("Withdraw: incorrect currency. ")
    void withdraw_incorrectCurrency() {

        String result = atm.input("- usd 100");

        assertEquals("Oops, something went wrong, please try again:", result);

    }

    @Test
    @DisplayName("Withdraw: incorrect amount. ")
    void withdraw_incorrectAmount() {

        String result = atm.input("- USD 0");

        assertEquals("Oops, something went wrong, please try again:", result);

    }
}