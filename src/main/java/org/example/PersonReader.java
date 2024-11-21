package org.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PersonReader{
    public List<Person>readCsvFile(String csvFilePath, String separator)
    {
        List<Person> people = new ArrayList<>();
        InputStream inputStream=getClass().getClassLoader().getResourceAsStream(csvFilePath);
        if (inputStream != null) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                br.readLine(); // пропускаем заголовок
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(separator);
                    if (data.length == 6) {
                        Person person = new Person();
                        person.setId(Integer.parseInt(data[0]));
                        person.setName(data[1]);
                        person.setGender(data[2]);
                        person.setDateOfBirth(new SimpleDateFormat("dd.MM.yyyy").parse(data[3]));
                        Departament department = new Departament();
                        department.setId(generateDepartamentId());
                        department.setName(data[4]);
                        person.setDepartament(department);
                        person.setSalary(Integer.parseInt(data[5]));
                        people.add(person);
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return people;
    }

    private int generateDepartamentId()
    {
        return Math.abs(UUID.randomUUID().hashCode());
    }
}