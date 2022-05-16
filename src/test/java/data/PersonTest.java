package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getName()
    {
        Person p = new Person("James");
        assertEquals("James", p.getName());
        assertEquals("John", p.getName());
    }
}