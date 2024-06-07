package _04_JavaOOP._04_InterfacesAndAbstraction._01_DefineAnInterfacePerson;

import _04_JavaOOP._04_InterfacesAndAbstraction._01_DefineAnInterfacePerson.imp.Citizen;
import _04_JavaOOP._04_InterfacesAndAbstraction._01_DefineAnInterfacePerson.imp.Pet;
import _04_JavaOOP._04_InterfacesAndAbstraction._01_DefineAnInterfacePerson.imp.Robot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<String> birthDatList = new ArrayList<>();

        while (!"End".equals(line)) {
            String[] tokens = line.split(" ");
            String type = tokens[0];

            switch (type) {
                case "Citizen":
                    String name = tokens[1];
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthdate = tokens[4];

                    Citizen citizen = new Citizen(name,age,id,birthdate);
                    String citizenBirthDate = citizen.getBirthDate();
                    birthDatList.add(citizenBirthDate);
                    break;
                case "Robot":
                    String model = tokens[1];
                    String robotId = tokens[2];

                    Robot robot = new Robot(model,robotId);
                    break;
                case "Pet":
                    String petName = tokens[1];
                    String petBirthdate = tokens[2];

                    Pet pet = new Pet(petName,petBirthdate);
                    String petBirthDate = pet.getBirthDate();
                    birthDatList.add(petBirthDate);
                    break;
            }

            line = scanner.nextLine();
        }

        String year = scanner.nextLine();

        boolean noPrinting = true;

        for (String birthday : birthDatList) {
            if (birthday.endsWith(year)){
                System.out.println(birthday);
                noPrinting = false;
            }
        }
        if (noPrinting){
            System.out.println("<no output>");
        }
    }

}
