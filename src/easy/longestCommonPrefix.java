package easy;

import java.util.Arrays;

public class longestCommonPrefix {

    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0)
            return "";
        for(int i = 0; i < str[0].length(); i++ ) {
            char c = str[0].charAt(i);
            for ( int j = 1; j < str.length; j++) {
                if(i == str[j].length() || str[j].charAt(i) != c)
                    return str[0].substring(0, i);
            }
        }

        return str[0];
    }
}
