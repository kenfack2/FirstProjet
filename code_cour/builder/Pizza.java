class Pizza {
    private String pate = "";
    private String sauce = "";
    private String garniture = "";

    public void setPate(String pate) {
        this.pate = pate;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setGarniture(String garniture) { 
        this.garniture = garniture;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pate='" + pate + '\'' +
                ", sauce='" + sauce + '\'' +
                ", garniture='" + garniture + '\'' +
                '}';
    }

    public void print() {
        System.out.println(this.toString());
    }
}