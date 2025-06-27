package com.acme.module_a;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.function.FailableFunction;

public class ModuleA {

    public static void useMethodFromCommons() {

        // StringUtils.isAnyBlank introduced after 3.1
        final boolean isAnyBlank = StringUtils.isAnyBlank("", "default");

        System.out.println("    ModuleA.useNewMethod: Is any blank: " + isAnyBlank);
    }

    public static void useClassFromCommons() {

        // FailableFunction introduced after 3.1
        FailableFunction<String, Integer, NumberFormatException> parser = Integer::parseInt;

        final Integer parsedValue = parser.apply("1");
        System.out.println("     ModuleA.useNewClass: Parsed value: " + parsedValue);
    }
}