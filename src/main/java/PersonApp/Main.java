package PersonApp;

public class Main {
    public static void main(String[] args) {
        Language polish = new Polish();
        Language german = new German();
        Language russian = new Russian();
        Language english = new English();

        Person linguist = new Person (polish);
        linguist.learn(german);
        linguist.learn(english);
        linguist.learn(russian);

        Person littlelinguist = new Person (german);
        littlelinguist.learn(english);
        Person russianlinguist = new Person(russian);

        linguist.sayHello();
        littlelinguist.sayHello();
        russianlinguist.sayHello();
    }
}
