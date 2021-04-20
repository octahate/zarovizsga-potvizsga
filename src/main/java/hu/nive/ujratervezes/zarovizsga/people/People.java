package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class People {

    private List<Person> people = new ArrayList<>();

    private void readAllLines (String name){
            Path path = Path.of(name);
            try (BufferedReader br = Files.newBufferedReader(path)) {
                String line;
                br.readLine();
                while ((line = br.readLine()) != null) {
                    addPersonToDatabase(line);
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("Cannot read line!", e);
            }
        }

    private void addPersonToDatabase (String line) {
        String[] data = line.split(",");
        people.add(new Person(data));
    }

    private int countMales(){
        int count = 0;
        for (Person currentPerson : people){
            if (currentPerson.getGender().equals(Gender.MALE)){
                count++;
            }
        }
        return count;
    }

    public int getNumberOfMales(String path){
        readAllLines(path);
        return countMales();
    }
}
