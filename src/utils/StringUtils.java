package utils;

import java.util.Arrays;

public class StringUtils {

    public static StringBuilder[] toStringBuilderArray(String[] strings) {
        return Arrays.stream(strings).map(StringBuilder::new).toArray(StringBuilder[]::new);
    }

    public static String mergeStringBuilderArray(StringBuilder[] mergeStringArray) {
        StringBuilder sb = new StringBuilder();
        for (StringBuilder sbItem : mergeStringArray) {
            sb.append(sbItem);
        }
        return new String(sb);
    }
}
