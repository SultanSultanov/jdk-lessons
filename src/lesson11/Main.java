package lesson11;

import java.lang.ref.PhantomReference;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       User user = new User();
        user.setLogin("eqwe");
        user.setPwd("gfdg");
        user.setRole(Role.ADMIN);

        System.out.println(Role.valueOf("ADMIN"));
        System.out.println(Arrays.toString(Role.values()));


        Operation operation = Operation.MULTI;
        System.out.println(operation.action(2,3));

        Operation operation1 = Operation.SUM;
        System.out.println(operation1.action(2,9));

        System.out.println(Prioryty.HIGH.getCode());
        System.out.println(Prioryty.LOW.getCode());


    }
}
