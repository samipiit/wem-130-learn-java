package learn_basics.singleton;

public class LearnSingleton {

    static LearnSingleton obj;

    private LearnSingleton() {

    }

    public static LearnSingleton getInstance() {
        if (obj == null) {
            obj = new LearnSingleton();
        }

        return obj;
    }

}
