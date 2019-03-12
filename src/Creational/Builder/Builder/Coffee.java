package Creational.Builder.Builder;

public class Coffee {

    private String name;
    private int acidity;
    private int sweetness;
    private String roastType;
    private int aromatic;
    private String quality;
    private int priceInDollarsPer100g;



    public Coffee(Builder builder) {
        this.name = builder.name;
        this.acidity = builder.acidity;
        this.sweetness = builder.sweetness;
        this.roastType = builder.roastType;
        this.aromatic = builder.aromatic;
        this.quality = builder.quality;
        this.priceInDollarsPer100g = builder.priceInDollarsPer100g;
    }

    public static class Builder{

        private String name;
        private int acidity;
        private int sweetness;
        private String roastType;
        private int aromatic;
        private String quality;
        private int priceInDollarsPer100g;


        // Only 1 field is mandatory
        public Builder(String name){
            this.name = name;
        }

        public Builder setAcidity(int acidity){
            this.acidity = acidity;

            return this;
        }

        public Builder setSweetness(int sweetness) {
            this.sweetness = sweetness;

            return this;
        }

        public Builder setRoastType(String roastType) {
            this.roastType = roastType;

            return this;
        }

        public Builder setAromatic(int aromatic) {
            this.aromatic = aromatic;

            return this;
        }

        public Builder setQuality(String quality) {
            this.quality = quality;

            return this;
        }

        public Builder setPriceInDollarsPer100g(int priceInDollarsPer100g) {
            this.priceInDollarsPer100g = priceInDollarsPer100g;

            return this;
        }

        public Coffee build(){

            return new Coffee(this);
        }
    }
}