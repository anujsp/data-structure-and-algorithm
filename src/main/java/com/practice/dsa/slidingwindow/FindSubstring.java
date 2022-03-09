package com.practice.dsa.slidingwindow;

public class FindSubstring {

    public FindSubstring() {
    }

    public boolean isSubstringPresent(String input, String findStr){

        if(input == null || input.length() == 0 || findStr.length() > input.length())
            return true;

        char[] chArr = input.toCharArray();
        int findStrLen = findStr.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < chArr.length; i++){

            sb.append(chArr[i]);

            if(i >= findStrLen - 1){

                if(sb.toString().equalsIgnoreCase(findStr))
                    return true;

                sb.deleteCharAt(0);
            }
        }

        return false;
    }
}
