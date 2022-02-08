class BMI {
    private double inches;
    private double pounds;

    public BMI() {
    
    }

    public BMI(double inches, double pounds) {
        this.inches = inches;
        this.pounds = pounds;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public double getPounds() {
        return pounds;
    }

    public void setPounds(double pounds) {
        this.pounds = pounds;
    }

    public double getBMI(){
        return 703 * pounds / java.lang.Math.pow(inches, 2);
    }

    public String Interpretate(){
        if(getBMI() < 18.5)
            return "Underweight";
        else if(getBMI() < 25.0)
            return "Normal";
        else if(getBMI() < 30.0)
            return "Overweight";
        else
            return "Obese";
    }
}