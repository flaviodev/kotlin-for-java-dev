package com.flaviodev;

import com.flaviodev.kfjd._02basics.Math;
import com.flaviodev.kfjd._02basics.NamedAndDefaultKt;

public class InvocationFromJava {

    public static void main(String[] args) {
        Math.printFirstAndSecondValuesAndMaxBetweenThem(1,3,Math.max(1,3));

        NamedAndDefaultKt.displaySeparator('#',5);
    }
}
