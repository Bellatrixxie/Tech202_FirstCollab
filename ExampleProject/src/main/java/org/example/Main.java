package org.example;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Character class - represents all possibilities of a single character
        boolean match1 = Pattern.matches("[abc]", "b");

// ^ Inside character class mean NOT this --- CAREFUL! Don't confuse with meaning of ^ OUTSIDE []
        boolean match1Negative = Pattern.matches("[^abc]", "o");

        // * means zero to many of the preceding character or character class
        boolean match2 = "abbabcacbcba".matches("[abc]*");
//
        // + means one to many of the preceding character or character class
        boolean match3 = Pattern.matches("[tkq]+", "qtkktqqtqqqkk");

        //  Ranges
        boolean match4 = Pattern.matches("[a-ct-w]", "u");

        // Nested character classes
        boolean match5 = Pattern.matches("[2-5[7-9]]", "8");

        // ^ at beginning means "starts with"
        boolean match6 = Pattern.matches("^[CLEN].*", "Elza Contieri");

        // $ at the end means "ends with"
        boolean match7 = Pattern.matches(".+[rhiRHI]$", "Nicole Akanbi");

        // More complex random example
        boolean match8 = Pattern.matches("[0-4[7-9]]*[djs].*[jser].*?", "234987dhnukjs345.[rdr.[");

        // Searching for one or more substrings in a document (have to be in order still)
        boolean match9 = Pattern.matches(".*s[mtpk]artaglobal.*David Rai[\\w ]*", "rimcsomsi www.startaglobal.com sirngfdfingsdfjgf CEO: David Rai ghujbyhtbvg");

        // Example of validation: Emails
        boolean match10 = Pattern.matches("[\\w]+@[a-z]+\\..+", "info@asos.co.uk");

        // Using regex with string replaceAll method
        String input = "...fgcionjrvoini LTozer@asos.co.uk drcgfijdrfo.... CFrench@gmail.com 54uyh0tgrhh EContiero@sky.com.br 4weu5ht0";

        var output = input.replaceAll("[\\w]+@[a-z]+(\\.\\w+){1,2}", "hr@spartaglobal.com");
        System.out.println(output);
    }
}