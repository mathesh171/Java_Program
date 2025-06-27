/*
Expand the given string - The input string contains string (s) followed by (n) denotes s repeating n times 
Example: 
Input: a(b(c){2}){2}d 
Output: abccbccd 
Input: ((x){3}(y){2}z){2} 
Output xxxyyzxxxyyz
 */
import java.util.Scanner;
import java.util.Stack;
public class StringNStack{
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
    
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);


            if(c >= '}'){
                String num = "";
                while(st.peek() != ')'){
                    if(st.peek() == '{' || st.peek() == '}'){
                        st.pop();
                    }else{
                        num = st.pop() + num;
                    }
                }
                int n = Integer.parseInt(num);

                String cur = "";
                st.pop();
                while(st.peek() != '('){
                    cur = st.pop() + cur;
                }
                cur = cur.repeat(n);
                st.pop();
                for(int j=0;j<cur.length();j++){
                    st.push(cur.charAt(j));
                }
                // st.push(')');
            }
            
            
            else{
                st.push(c);
            }
        }

        String res = "";
        while(!st.isEmpty()){
            res = st.pop() + res;
        }
        System.out.println(res);
    }
}