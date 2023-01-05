public class ArrayValueCalculator {
    public static void main(String[] args) throws ArrayDataException, ArraySizeException {
        String[][] inputList={{"1","1","1","1"},{"2","2","2","2"},{"3","3","3","3"},{"4","4","4","4"}};
        System.out.println(doCalc(inputList));
        //40

    }

    public static int doCalc(String[][] string) throws ArraySizeException, ArrayDataException {
        if (string.length != 4)
            throw new ArraySizeException();
        else {
            for (int i = 0; i < 4; i++) {
                if (string[i].length != 4)
                    throw new ArraySizeException();
            }
        }
        int result = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    result += Integer.parseInt(string[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }
            }
        }
        return result;
    }
}