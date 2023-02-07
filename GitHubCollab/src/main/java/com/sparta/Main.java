package com.sparta;

public class Main {
    public static void main(String[] args) {

        String result = githubCollab("Jade");

        System.out.println(result);


    }

    public static String githubCollab(String name) {
        return name + " is learning to collaborate with the team using GitHub!";
    }
}