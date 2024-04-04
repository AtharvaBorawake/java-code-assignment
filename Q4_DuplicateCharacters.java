public class Q4_DuplicateCharacters {

    public static void findDuplicateCharacters(String str) {
        char[] string = str.toCharArray();

        System.out.println("Duplicate characters in a given string: ");

        for (int i = 0; i < string.length; i++) {
            int count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    
                    string[j] = '0';
                }
            }
            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }

    public static void main(String[] args) {
        String string1 = "Atharva Borawake";
        findDuplicateCharacters(string1);
    }
}
