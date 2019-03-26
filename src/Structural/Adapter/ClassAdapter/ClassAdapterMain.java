package Structural.Adapter.ClassAdapter;


interface FahrenheitValueInterface {

    double getTemperature(double kelvin);

}


class FahrenheitValue implements FahrenheitValueInterface {

    private double degrees;

    @Override
    public double getTemperature(double degreesKelvin) {
        return (degreesKelvin - 273.15) * 9 / 5 + 32;
    }
}



class CelsiusAdapter extends FahrenheitValue {


    public double getTemperature(double degreesKelvin) {
        return (super.getTemperature(degreesKelvin)-32) *.55;
    }
}




public class ClassAdapterMain {


    public static void main(String[] args) {

        FahrenheitValueInterface fvi = new FahrenheitValue();
        System.out.println(fvi.getTemperature(270));



        CelsiusAdapter ca = new CelsiusAdapter();

        System.out.println(ca.getTemperature(270));





    }
}
