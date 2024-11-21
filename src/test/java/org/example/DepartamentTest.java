package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartamentTest {

    @Test
    public void testDepartamentConstructorWithParameters() {
        Departament departament = new Departament(1, "IT");
        assertEquals(1, departament.getId());
        assertEquals("IT", departament.getName());
    }

    @Test
    public void testDepartamentDefaultConstructor() {
        Departament departament = new Departament();
        assertEquals(1, departament.getId()); // Проверяем, что ID равен 1
        assertEquals("null", departament.getName()); // Проверяем, что имя равно "null"
    }

    @Test
    public void testSetId() {
        Departament departament = new Departament();
        departament.setId(2);
        assertEquals(2, departament.getId());
    }

    @Test
    public void testSetName() {
        Departament departament = new Departament();
        departament.setName("HR");
        assertEquals("HR", departament.getName());
    }
}

