    package _02_JavaFundamentals.MidExamExtra;

    import java.util.Scanner;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    public class FancyBarcode {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                String line = scanner.nextLine();

                String regex = "(@#+([A-Z][a-z0-9A-Z]{4,}[A-Z])@#+)";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(line);

                StringBuilder sb = new StringBuilder();

                if (matcher.find()) {
                    String food = matcher.group(1);

                    for (char current : food.toCharArray()) {
                        if (Character.isDigit(current)) {
                            sb.append(current);
                        }
                    }
                    if (sb.length() == 0) {
                        sb.append("00");
                    }
                    System.out.printf("Product group: %s%n", sb);
                }
                else {
                    System.out.println("Invalid barcode");
                }
            }
        }
    }
