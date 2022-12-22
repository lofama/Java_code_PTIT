/*
 * Click https://www.facebook.com/profile.php?id=100017104570541 to get to my profile
 *     [███ ███]▄▄▄▄▃ ♥ [̲̅A ̲̅][̲̅D ̲̅][̲̅D ̲̅]–[̲̅M ̲̅][̲̅E ̲̅] ♥
 *   ▄▅██ G.NAM █▅▄▃▂
 * [██████████████]
 * …◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤
 */
package javahello;

import java.util.*;

/**
 *
 * @author WINDOWS 10
 */
public class AJ08020_KTRA_NGOAC {

    public static int check(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (st.empty() || st.peek() != '(') {
                    return 0;
                }
                st.pop();
            } else {
                if (s.charAt(i) == ']') {
                    if (st.empty() || st.peek() != '[') {
                        return 0;
                    }
                    st.pop();
                } else {
                    if (s.charAt(i) == '}') {
                        if (st.empty() || st.peek() != '{') {
                            return 0;
                        }
                        st.pop();
                    } else st.push(s.charAt(i));
                    
                }
            }
        }
        if(!st.isEmpty()) return 0;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            if (check(s) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
