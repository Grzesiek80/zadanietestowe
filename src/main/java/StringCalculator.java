public class StringCalculator {

    private int result;

    public int add(String inputString) {
        String goodString = removeDelimeter(inputString);
        if (goodString == "") return 0;
        else {
            String[] numbers = goodString.split(",");
            for (String s : numbers) {
                int n = Integer.parseInt(s);
                result += n;
            }
            return result;
        }
    }

    public String removeDelimeter(String inputString) {
        String stringResult = inputString.replaceAll("\\n", ",");
        return stringResult;
    }
}
