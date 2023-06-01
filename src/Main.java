public class Main {
    enum tooltype {
    Barbell,
    dumbell,
    kettlebell
    };
    public static void main(String[] args) {
        for (tooltype type: tooltype.values()) {
            System.out.println(type);
        }


    }

}