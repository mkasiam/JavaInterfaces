package measureable;

public class Country implements Measurable{
    private String countryName;
    private double area;

    public double getArea() {
        return area;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Country(String countryName, double area) {
        this.countryName = countryName;
        this.area = area;
    }
    public Country() {
        countryName = "";
        area = 0;
    }

    @Override
    public double getMeasure() {
        return area;
    }
}
