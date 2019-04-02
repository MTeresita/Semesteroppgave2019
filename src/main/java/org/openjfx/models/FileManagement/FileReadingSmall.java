package org.openjfx.models.FileManagement;

import org.openjfx.models.Person;
import org.openjfx.models.FileManagement.PersonReader;

import java.io.IOException;
import java.util.List;

public class FileReadingSmall {

    public static void main(String[] args) {
        List<Person> persons = null;

        try {
            persons = PersonReader.readPersons("Data.csv");
        }

        catch (IOException e) {
            System.err.println("Could not read the requested file. Cause: " + e.getCause());
        }

        catch (InvalidPersonFormatException e) {
            System.err.println("The data is not formatted correctly. Message: " + e.getMessage());
        }

        if(persons == null) { // some error has occurred
            System.exit(1);
        }

        System.out.println(persons);
    }
}
