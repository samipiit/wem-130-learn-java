package learn_basics.access_modifiers.second_package;

import learn_basics.access_modifiers.first_package.LearnAccessModifiers;

public class AccessAttempt {

    public static void main(String[] args) {
        LearnAccessModifiers obj = new LearnAccessModifiers();

        // Unable to access protected/default method from another package due to its access modifier
//        obj.doSomething();

    }

}
