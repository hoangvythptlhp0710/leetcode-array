package src.Leetcode.Array;


import java.util.*;

/**
 *          820. SHORT ENCODING OF WORDS
 *
 *         A valid encoding of an array of words is any reference string s and array of indices indices such that:
 *         -    words. Length == indices.length;
 *         -    The reference string s ends with the '#' character.
 *         -    For each index indices[i], the substring of s starting from indices[i] and up to (but not including) the
 *         next '#' character is equal to words[i].
 */
public class _820_short_encoding_of_words {

    public static int minLengthEncoding(String[] words){
        Arrays.sort(words, (a, b) -> b.length() - a.length());
        StringBuilder sb = new StringBuilder();
        for (String s: words){
            if(sb.indexOf(s + "#") == -1){
                sb.append(s).append('#');
            }
        }
        return sb.length();
    }

    public static int minLengthEncodingOpt(String[] words){
        Set<String> prefix = new HashSet<>(Arrays.asList(words));
        for (String s: words){
            for(int i = 1; i < s.length(); i++){
                prefix.remove(s.substring(i));
            }
        }
        int len = 0;
        for (String s: prefix){
            len += s.length() + 1;
        }
        return len;
    }

    public static void main(String[] args) {
        String[] words = {"time", "me", "bell", "fame"};
        System.out.println(minLengthEncodingOpt(words));
        System.out.println(minLengthEncoding(words));
    }
}
