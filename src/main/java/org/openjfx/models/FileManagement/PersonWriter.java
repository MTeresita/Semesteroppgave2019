package org.openjfx.models.FileManagement;
import org.openjfx.models.Person;

import java.io.IOException;
import java.util.List;

public interface PersonWriter {
    void writePeople(List<Person> people, String path) throws IOException;
}