import com.sun.javafx.collections.SortHelper;
import com.sun.javafx.image.IntPixelGetter;

import javax.lang.model.element.VariableElement;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    }
    public String longestPalindrome(String s) {
        if (s.length()<2) {
            return s;
        }
        int start=0,maxLen=0;
        int length = s.length();
        for (int i = 0; i <length ;) {
            if (length-i<=maxLen/2) {
                break;
            }
            int left=i,right=i;
            while (right<length-1 && s.charAt(right+1)==s.charAt(right)){
                right++;
            }
            i=right+1;
            while (right<length-1 && left>0 && s.charAt(left-1)==s.charAt(right+1)){
                left--;
                right++;
            }
            if (right-left+1>maxLen) {
                maxLen=right-left+1;
                start=left;
            }
        }
        return s.substring(start,start+maxLen);
    }
}
