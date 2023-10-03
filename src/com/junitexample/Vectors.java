package com.junitexample;
public class Vectors {
    public static boolean vectorEqual(int[] a, int[] b) {

        if ((a == null) || (b == null)) {

            throw new IllegalArgumentException("null argument");

        }

        if (a.length < 2 || a.length > 3 || b.length < 2 || b.length > 3) {

            throw new IllegalArgumentException("vector must have only 2 or 3 coordinate");

        }

        if (a.length != b.length) {

            return false;

        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {

                return false;

            }

        }

        return true;

    }

    public static int scalarMultiplication(int[] a, int[] b) {

        if ((a == null) || (b == null)) {

            throw new IllegalArgumentException("null argument");

        }

        if (a.length < 2 || a.length > 3 || b.length < 2 || b.length > 3) {

            throw new IllegalArgumentException("vector must have only 2 or 3 coordinate");

        }

        if (a.length != b.length) {

            throw new IllegalArgumentException("vectors length must equals (" + a.length + ", " + b.length + ')');

        }

        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            sum += a[i] * b[i];

        }

        return sum;

    }
}
