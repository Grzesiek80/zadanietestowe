public class StringCalculator {

    private int result;

    public int add(String inputString) throws NegativeNumbersException {
        String goodString = removeDelimeter(inputString);

        if (goodString == "") return 0;
        else {
            String[] numbers = goodString.split(",");
            for (String s : numbers) {
                int n = Integer.parseInt(s);
                if (n<0) throw new NegativeNumbersException("Liczba nie może być ujemna");
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
