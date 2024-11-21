package org.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

public class PersonReaderTest {
    @Test
    public void testReadCsvFile() {
        PersonReader csvReader = new PersonReader();
        List<Person> people = csvReader.readCsvFile("foreign_names.csv", ";");
        assertEquals(25898, people.size());
    }
    @Test
    public void testPersonObjectCreation() {
        PersonReader csvReader = new PersonReader();
        List<Person> people = csvReader.readCsvFile("foreign_names.csv", ";");
        for (Person person : people) {
            assertNotNull(person.getId());
            assertNotNull(person.getName());
            assertNotNull(person.getGender());
            assertNotNull(person.getDateOfBirth());
            assertNotNull(person.getDepartament());
            assertNotNull(person.getSalary());
        }
    }
}
