public class P2469_ConvertTheTemperature {

    public static void main(String args[]) {
        var principal = new P2469_ConvertTheTemperature();

        var celsius = 36.50;

        var result = principal.convertTemperature(celsius);

        System.out.println("");

        for (double number : result)
            System.out.println(number);
    }

    public double[] convertTemperature(double celsius) {
        var result = new double[2];
        result[0] = celsius + 273.15;
        result[1] = celsius * 1.80 + 32.00;

        return result;
    }

}
