public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setAge(28);
        persona.setPhoneNumber(123456);
        persona.setName( "Franco" );

        System.out.println(persona.getAge());
        System.out.println(persona.getPhoneNumber());
        System.out.println(persona.getName());
    }
}
class Persona {
    private int age;
    private int phoneNumber;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
