public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[7];
        animals[0] = new Dog("Burek");
        animals[1] = new Dog("Azor");
        animals[2] = new Cat("Filemon");
        animals[3] = new Pig("Prosiaczek");
        animals[4] = new Animal();
        animals[5] = new Bird("Skowronek");
        animals[6] = new Elephant("Bendżamin");

        for (Animal animal : animals) {
            animal.introduce();
        }




    }

}

class Animal {
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName() {
        return "zwierze " + name;
    }

    String makeSound() {
        return "????";
    }

    void introduce() {
        System.out.println("Jestem " + showName() + " Wydaje dzwiek: " + makeSound());
    }

}


class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}


class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "kot " + name;
    }

    @Override
    String makeSound() {
        return "miau miau";
    }
}


class Pig extends Animal {
    public Pig(String name) {
        this.name = name;
    }
}

class Bird extends Animal{
    public Bird(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "ptak " + name;
    }

    @Override
    String makeSound() {
        return "ćwir ćwir";
    }
}

class Elephant extends Animal {
    public Elephant(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "Sloń " + name;
    }
}