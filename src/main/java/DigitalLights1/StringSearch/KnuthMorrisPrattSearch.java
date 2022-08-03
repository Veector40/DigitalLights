package DigitalLights1.StringSearch;

public class KnuthMorrisPrattSearch implements StringSearchInterface{
    public static int[] calcPrefixLen(String pattern) {
        int patternLen = pattern.length();
        int[] arr = new int[patternLen + 1];
        arr[0] = -1;
        arr[1] = 0;

        int prefixLen = 0;
        int i = 1;

        while (i < patternLen) {
            if (pattern.charAt(prefixLen) == pattern.charAt(i)) {
                i++;
                prefixLen++;
                arr[i] = prefixLen;
            } else if (prefixLen > 0) {
                prefixLen = arr[prefixLen];
            } else {
                i++;
                arr[i] = 0;
            }
        }

        return arr;
    }
    @Override
    public int positionOf(String pattern, String text) {
        int t = 0;
        int p = 0;
        int tLen = text.length();
        int pLen = pattern.length();

        int match;
        int[] prefixLen = calcPrefixLen(pattern);
        while (t < tLen) {
            if (pattern.charAt(p) == text.charAt(t)) {
                p++;
                t++;

                if (p == pLen) {
                    match = t - p;
                    return match;
                }
            } else {
                p = prefixLen[p];
                if (p < 0) {
                    t++;
                    p++;
                }
            }
        }
        return -1;
    }
}