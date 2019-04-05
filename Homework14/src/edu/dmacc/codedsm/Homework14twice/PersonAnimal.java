package edu.dmacc.codedsm.Homework14twice;

public class PersonAnimal {
    private String personName;
    private String animalName;

    {
        this.personName = personName;
        this.animalName = animalName;
    }

    public PersonAnimal( String person, String animal ) {
        personName = person;
        animalName = animal;

    }

    @Override
    public String toString() {
        return "PersonAnimal{" +
                "personName='" + personName + '\'' +
                ", animalName='" + animalName + '\'' +
                '}';
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName( String personName ) {
        this.personName = personName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName( String animalName ) {
        this.animalName = animalName;
    }
}