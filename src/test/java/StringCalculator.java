public class StringCalculator {

    private int result;

    public int add(String inputString) {
        if (inputString == "") return 0;
        else {
            String[] numbers = inputString.split("\\+");
            for (String s : numbers) {
                int n = Integer.parseInt(s);
                result += n;
            }
            return result;
        }
    }
}
