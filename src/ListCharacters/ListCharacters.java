package ListCharacters;

public class ListCharacters {
    public static void main(String[] args) {
        for(char c = 0; c < 128; c++) {
            if(Character.isLowerCase(c)) {
                System.out.println("Value: " + (int)c + ", symbol: " + c);
            }
        }
    }
}
