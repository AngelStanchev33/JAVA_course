package _04_JavaOOP._04_InterfacesAndAbstraction._01_DefineAnInterfacePerson.imp;

import _04_JavaOOP._04_InterfacesAndAbstraction._01_DefineAnInterfacePerson.Inferfaces.Birthable;
import _04_JavaOOP._04_InterfacesAndAbstraction._01_DefineAnInterfacePerson.Inferfaces.Identifiable;
import _04_JavaOOP._04_InterfacesAndAbstraction._01_DefineAnInterfacePerson.Inferfaces.Person;

public class Citizen implements Person, Identifiable, Birthable {

    private String name;
    private int age;
    private String id;
    private String birthDate;


    public Citizen(String name, int age,String id,String birthDate ) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }


}
