package DigitalLights1.StringSearch;

public class SimpleSearch implements StringSearchInterface {
    @Override
    public int positionOf(String part, String whole) {
            for (int i = 0; i <= whole.length() - part.length(); i++) {
                boolean found = true;
                for (int j = 0; j < part.length(); j++) {
                    if(whole.charAt(i + j) != part.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if(found) return i;
            }
            return -1;
    }
}
