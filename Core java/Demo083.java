class VC {
    String ch = "elephant";

    void display() {
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == 'a' || ch.charAt(i) == 'e' || ch.charAt(i) == 'i' || ch.charAt(i) == 'o'
                    || ch.charAt(i) == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }

    }

}

public class Demo083 {
    public static void main(String[] args) {
        VC obj = new VC();
        obj.display();

    }
}
