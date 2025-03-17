package com.tnsif.lamdademo;

@FunctionalInterface
public interface Palindrome<T> {
	boolean checkPalindrome(T data);

}
