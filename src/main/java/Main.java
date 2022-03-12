import com.sun.javafx.collections.SortHelper;
import com.sun.javafx.image.IntPixelGetter;

import javax.lang.model.element.VariableElement;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for (String str : strs) {
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String s = String.valueOf(cs);
            if (!map.containsKey(s)) {
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}








