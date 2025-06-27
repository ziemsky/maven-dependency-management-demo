package com.acme.module_b;


import org.apache.commons.lang3.StringUtils;

public class ModuleB {

    static public void irrelevantMethodUsingCommons() {

        final int indexOfT = StringUtils.indexOfIgnoreCase("some Text", "t");

        System.out.println("ModuleB.irrelevantMethod: T is at offset " + indexOfT);
    }

}