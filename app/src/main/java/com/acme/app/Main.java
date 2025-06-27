package com.acme.app;

import com.acme.module_a.ModuleA;
import com.acme.module_b.ModuleB;
import com.acme.module_c.ModuleC;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println();
            System.out.println();
            System.out.println(">>>>>>>>>>>>>>>>> START <<<<<<<<<<<<<<<<<<");
            System.out.println();


            ModuleA.useMethodFromCommons();

            ModuleA.useClassFromCommons();

            ModuleB.irrelevantMethodUsingCommons();

            ModuleC.irrelevantMethodNotUsingCommons();


            System.out.println();
            System.out.println(">>>>>>>>>>>>>>>>> SUCCESS! <<<<<<<<<<<<<<<<<<");
            System.out.println();

        } catch (Throwable e) {
            System.out.println();
            System.out.println(">>>>>>>>>>>>>>>>> FAILURE! <<<<<<<<<<<<<<<<<<");
            System.out.println();

            e.printStackTrace();
        }
    }
}