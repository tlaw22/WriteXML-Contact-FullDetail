import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String FIELD_NAMES = "name,age,gender,address,city,state,zipcode,country,phone,email,website,ssn,driverslicense,passport,notes";

    public static void main(String[] args) throws IOException {
        // Get the person data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the person's name?");
        String name = scanner.nextLine();
        System.out.println("What is the person's age?");
        String name = scanner.nextLine();
        System.out.println("What is the person's gender?");
        String gender = scanner.next();
        System.out.println("What is the person's address?");
        String address = scanner.nextLine();
        System.out.println("What is the person's city?");
        String city = scanner.next();
        System.out.println("What is the person's state?");
        String state = scanner.next();
        System.out.println("What is the person's zipcode?");
        String zipcode = scanner.next();
        System.out.println("What is the person's country?");
        String country = scanner.next();
        System.out.println("What is the person's phone number?");
        String phone = scanner.next();
        System.out.println("What is the person's email address?");
        String email = scanner.next();
        System.out.println("What is the person's website?");
        String website = scanner.next();
        System.out.println("What is the person's social security number?");
        String ssn = scanner.next();
        System.out.println("What is the person's driver's license number?");
        String driverlicense = scanner.next();
        System.out.println("What is the person's passport number?");
        String passport = scanner.next();
        System.out.println("What are the person's notes?");
        String notes = scanner.nextLine();

        // Create a list of the person's data
        List<String> data = new ArrayList<>();
        data.add(name);
        data.add(age);
        data.add(gender);
        data.add(address);
        data.add(city);
        data.add(state);
        data.add(zipcode);
        data.add(country);
        data.add(phone);
        data.add(email);
        data.add(website);
        data.add(ssn);
        data.add(driverlicense);
        data.add(passport);
        data.add(notes);

        // Write the person's data to a file
        FileWriter fileWriter = new FileWriter("data.xml");
        fileWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        fileWriter.write("<person>");
        for (String field : data) {
            fileWriter.write("<field>" + field + "</field>");
        }
        fileWriter.write("</person>");
        fileWriter.close();

        System.out.println("The person's data has been saved successfully.");

        // Read the person's data from the file
        FileReader fileReader = new FileReader("data.xml");
        Scanner xmlScanner = new Scanner(fileReader);
        xmlScanner.nextLine(); // Skip the XML declaration
        while (xmlScanner.hasNext()) {
            String field = xmlScanner.nextLine();
            System.out.println(field);
        }
        xmlScanner.close();
    }
}