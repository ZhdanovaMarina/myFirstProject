package lesson_23.task3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {
    static BankAccount account;
    static List <String> list = new ArrayList<>();
    String result;
    static String name;
    static String surname;

    @BeforeAll
    public static void beforeAll() throws IOException { // перед тестами один раз
        Path path = Path.of("1.txt");
        String s = Files.readString(path);
        name = s.split("\n")[0];
        surname = s.split("\n")[1];
    }

    @BeforeEach
    public void beforeEach() {
        account = new BankAccount("a", "b");// перед каждый тестом
        result = "result";
    }

    @AfterAll
    public static void afterAll() throws IOException { // после всех тестов один раз
       Path path = Path.of("2.txt");
       Files.write(path, list);

    }

    @AfterEach
    public void afterEach() { // после каждого теста
       list.add(result = "result");
    }


    @Test
    public void shouldNotBeBlockedWhenCreated() {
        assertFalse(account.isBlocked());
        result = "result";
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        account.activate("RUB");
        assertEquals(new Integer(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
        result = "result";
    }

    @Test
    public void shouldBeBlockedAfterBlockIsCalled() {
        account.block();
        assertTrue(account.isBlocked());
        result = "result";
    }


    @Test
    public void shouldReturnFirstNameThenSecondName() {
        assertArrayEquals(new String[]{"a", "b"}, account.getFullName());
        result = "result";
    }


    @Test
    public void shouldReturnNullAmountWhenNotActive() {
        final IllegalStateException exception = assertThrows(IllegalStateException.class, new Executable() {
            @Override
            public void execute() {
                account.getAmount();
            }
        });
        assertEquals("Счёт не активирован.", exception.getMessage());
        assertNull(account.getCurrency());
        result = "result";
    }

}
