public class Dog {
    private String dogName;
    private int age = 1;

    public Dog (String name) {
        dogName = name;
    }

    public Dog (String name, int dogAge) {
        dogName = name;
        dogAge = age;
    }

    public void increaseAgeByOne() {
        age++;
    }

    public int getPeopleAge(int peopleAge) {
        return peopleAge * age;
    }

    public String getName() {
        return dogName;
    }

    public static void main(String[] args) {
        Dog d = new Dog("rover");
        System.out.println( d.getPeopleAge( 7 ) );
        d.increaseAgeByOne();

        d.increaseAgeByOne();

        System.out.println( d.getPeopleAge( 11 ) );

        System.out.println( d.getName() );

        d.increaseAgeByOne();

        d.increaseAgeByOne();

        d.increaseAgeByOne();

        d.increaseAgeByOne();

        System.out.println( d.getPeopleAge( 8 ) );

        Dog g = new Dog( "bob", 3 );

        System.out.println( g.getName() );

        System.out.println( g.getPeopleAge( 5 ) );
    }
}
