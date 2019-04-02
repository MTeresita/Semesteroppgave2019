package org.openjfx.models.FileManagement;

import org.openjfx.models.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PersonReader {

        public static List<Person> readPersons(String path) throws IOException, InvalidPersonFormatException {
            ArrayList<Person> persons = new ArrayList<>();
            BufferedReader reader = null;

            try {
                reader = Files.newBufferedReader(Paths.get(path));
                String line = null; // read first line

                // read the rest and create Persons for each line
                while((line=reader.readLine()) != null) {
                    persons.add(parsePerson(line));
                }
            } finally { // if the reader is not null, close it.
                if(reader != null) {
                    reader.close();
                }
            }

            return persons;
        }

    private static Person parsePerson(String line) throws InvalidPersonFormatException {
        String[] split = line.split(";");
        if(split.length != 6) {
            throw new InvalidPersonFormatException("Must use semicolon ; to separate the three data fields");
        }

        String fornavn = split[0];
        String etternavn= split[0];
        String telefon = split[0];
        String epost = split[0];
        Person person = new Person(fornavn,etternavn,telefon,epost);
        return person;

    }
}
