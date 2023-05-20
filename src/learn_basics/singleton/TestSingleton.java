package learn_basics.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        LearnSingleton obj = LearnSingleton.getInstance();
        LearnSingleton obj2 = LearnSingleton.getInstance();
        LearnSingleton obj3 = LearnSingleton.getInstance();

        System.out.println(obj == obj2);
        System.out.println(obj == obj3);
        System.out.println(obj2 == obj3);

    }

}
