/*
Group Anagrams 
Given an array of strings strs, group the anagrams together. You can return the answer in any 
order. 
Constraints: 
● 1 <= strs.length <= 104 
● 0 <= strs[i].length <= 100 
● strs[i] consists of lowercase English letters. 
Example 1: 
Input: strs = ["eat","tea","tan","ate","nat","bat"] 
Output: [["bat"],["nat","tan"],["ate","eat","tea"]] 
Explanation: There is no string in strs that can be rearranged to form "bat". 
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other. 
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other. 
Example 2: 
Input: strs = [""] 
Output: [[""]] 
Example 3: 
Input: strs = ["a"] 
Output: [["a"]] 
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class GroupAnagrams {
    public static List<List<String>> anagram(int n, String[] s){
        Map<String, List<String>> map = new HashMap<>();

        for(String cur:s){
            char[] arr = cur.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(cur);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i=0;i<n;i++) s[i] = sc.next();
        List<List <String>> list = anagram(n, s);
        System.out.print(list);
        sc.close();
    }

    
}
