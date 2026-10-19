public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        calcModel = model;
        idNumber = id;
    }

    public Solution(int id) {
        calcModel = "TI-84";
        idNumber = id;
    }

    public String getCalcModel() {
        return calcModel;
    }

    public void setCalcModel(String newModel) {
        calcModel = newModel;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int newId) {
        idNumber = newId;
    }

    public void incrementId() {
        idNumber++;
    }

    public double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public double subtract(double num1, double num2) {
        double difference = num1 - num2;
        return difference;
    }

    public double multiply(double num1, double num2) {
        double product = num1 * num2;
        return product;
    }

    public int quotient(int num1, int num2) {
        int division = num1/num2;
        return division;
    }

    public int remainder(int num1, int num2) {
        int remainder = num1 % num2;
        return remainder;
    }

    public String divisionResult(int num1, int num2) {
        int div = num1/num2;
        int rem = num1 % num2;
        String result = div + " R " + rem;
        return result;
    }

    public String coordinatePair(int x, int y) {
        String pair = "(" + x + ", " + y +")";
        return pair;
    }

    public int average(int num1, int num2) {
        int avg = (num1 + num2)/2 + (num1 + num2)%2;
        return avg;
    }

    public String info() {
        String information = "This calculator is a model " + calcModel + " with id " + idNumber; 
        return information;
    }

    public static void main(String[] args) {
        Solution calc = new Solution(10);

    }

}
