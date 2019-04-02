package org.openjfx;

import org.openjfx.models.FileManagement.InvalidPersonFormatException;
import org.openjfx.models.FileManagement.PersonReader;
import org.openjfx.models.FileManagement.PersonWriter;
import org.openjfx.models.FileManagement.PersonWriterSmall;
import org.openjfx.models.Person;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = null;

        try {
            people = PersonReader.readPersons("Data.csv");
        } catch (IOException e) {
            System.err.println("Could not read the requested file. Cause: " + e.getCause());
        } catch (InvalidPersonFormatException e) {
            System.err.println("The data is not formatted correctly. Message: " + e.getMessage());
        }

        if(people == null) { // some error has occurred
            System.exit(1);
        }

        System.out.println(people);

        // write:
        writePeople(new PersonWriterSmall(), people, "people-small.txt");

    }

    static void writePeople(PersonWriter writer, List<Person> people, String path) {
        try {
            writer.writePeople(people, path);
        } catch (IOException e) {
            System.err.println("Could not write people to file. Cause: " + e.getCause());
        }
    }
}
