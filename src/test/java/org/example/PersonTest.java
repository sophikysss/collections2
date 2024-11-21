package org.example;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void testPersonConstructorWithParameters() {
        Departament department = new Departament(1, "IT");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1990, Calendar.JANUARY, 1);
        Date dateOfBirth = calendar.getTime();

        Person person = new Person(1, "Ivan", "M", department, 50000, dateOfBirth);

        assertEquals(1, person.getId());
        assertEquals("Ivan", person.getName());
        assertEquals("M", person.getGender());
        assertEquals(department, person.getDepartament());
        assertEquals(50000, person.getSalary());
        assertEquals(dateOfBirth, person.getDateOfBirth());
    }

    @Test
    public void testPersonDefaultConstructor() {
        Person person = new Person();
        assertEquals(0, person.getId()); // Проверяем, что ID по умолчанию равен 0
        assertEquals(null, person.getName()); // Проверяем, что имя по умолчанию равно null
        assertEquals(null, person.getGender()); // Проверяем, что пол по умолчанию равен null
        assertEquals(null, person.getDepartament()); // Проверяем, что департамент по умолчанию равен null
        assertEquals(0.0, person.getSalary()); // Проверяем, что зарплата по умолчанию равна 0.0
        assertEquals(null, person.getDateOfBirth()); // Проверяем, что дата рождения по умолчанию равна null
    }

    @Test
    public void testSettersAndGetters() {
        Departament department = new Departament(1, "IT");
        Person person = new Person();

        person.setId(2);
        person.setName("Anna");
        person.setGender("F");
        person.setDepartament(department);
        person.setSalary(60000);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1992, Calendar.FEBRUARY, 2);
        person.setDateOfBirth(calendar.getTime());

        assertEquals(2, person.getId());
        assertEquals("Anna", person.getName());
        assertEquals("F", person.getGender());
        assertEquals(department, person.getDepartament());
        assertEquals(60000, person.getSalary());
        assertEquals(calendar.getTime(), person.getDateOfBirth());
    }
}
