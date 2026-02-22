package NewJavaFeatures;

sealed class Shape permits Circle,Triangle{

}

final class Circle extends Shape{

}

non-sealed class Triangle extends Shape{

}




public class Test {
    public static void main(String[] args) {
/*        String day="MONDAY";
        String result = switch (day) {
            case "MONDAY" -> {
                System.out.println("Start of week");
                yield "Start";
            }
            default -> "Other";
        };

        System.out.println(result);*/

        String json = """
                Hello\
                Atharva bhatkande
                """;

        System.out.println(json);
    }
}
