package com.practice.dsa;

import com.practice.dsa.slidingwindow.FindSubstring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

    public static void main(String[] args) {

        SpringApplication.run(DsaApplication.class, args);

        FindSubstring fs = new FindSubstring();
        boolean isSubStringPresent = fs.isSubstringPresent("tomandjerry","anuj");
        System.out.println("\nIs Substring Present in Input String? " + isSubStringPresent);
    }

}
