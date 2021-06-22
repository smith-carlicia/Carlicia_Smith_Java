package com.company;

import java.util.Objects;

public class iceCreamFactory {

    private String  baseOfIcecream;
    private String flavor;;
    private double pricePerGallon;



    public iceCreamFactory(String baseOfIcecream, String flavor, double pricePerGallon) {
        this.baseOfIcecream = baseOfIcecream;
        this.flavor = flavor;
        this.pricePerGallon = pricePerGallon;
    }



    public String getBaseOfIcecream() {
        return baseOfIcecream;
    }

    public void setBaseOfIcecream(String baseOfIcecream) {
        this.baseOfIcecream = baseOfIcecream;

        if (baseOfIcecream.equals("almond milk")) {
            setPricePerGallon(25.00);
        } else {
            setPricePerGallon(15.00);
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPricePerGallon() {
        return pricePerGallon;
    }

    public void setPricePerGallon(double pricePerGallon) {
        this.pricePerGallon = pricePerGallon;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        iceCreamFactory that = (iceCreamFactory) o;
        return Double.compare(that.pricePerGallon, pricePerGallon) == 0 && Objects.equals(baseOfIcecream, that.baseOfIcecream) && Objects.equals(flavor, that.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseOfIcecream, flavor, pricePerGallon);
    }


    @Override
    public String toString() {
        return "iceCreamFactory{" +
                "baseOfIcecream='" + baseOfIcecream + '\'' +
                ", flavor='" + flavor + '\'' +
                ", pricePerGallon=" + pricePerGallon +
                '}';
    }
}
