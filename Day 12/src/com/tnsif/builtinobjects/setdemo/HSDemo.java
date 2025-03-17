package com.tnsif.builtinobjects.setdemo;

import java.util.HashSet;
import java.util.Set;

public class HSDemo {

	public static void main(String[] args) {
			// Creating 2 hashsets and adding
        // some values using add() method
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(3);
        s1.add(5);
        s1.add(7);
        Set<Integer> s2 = new HashSet<>();
        s2.add(3);
        s2.add(6);
        s2.add(7);
        s2.add(8);

        // Create a intersection object from any hashset
        // use retainAll() method to retain only the values
        // present in both the sets.
        Set<Integer> intersection = new HashSet<>(s1);
        // pass the another object to retain the values
        intersection.retainAll(s2);
        System.out.println("Set s1: " + s1);
        System.out.println("Set s2: " + s2);
        System.out.println("Intersection set is: "
                           + intersection);
    }

	}


