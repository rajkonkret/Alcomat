class Drinker {
    private String name;
    private Sex sex;
    private double weight;
    private double pureAlko;

    Drinker(String name, Sex sex, double weight) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.pureAlko = 0.0;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public double getWeight() {
        return weight;
    }

    double drink(int quantity, Alcohol alcohol) {
        pureAlko += quantity * alcohol.getPower() * 0.8;
        double fractor = (sex == Sex.MAN) ? 0.7 : 0.6;
        return pureAlko / (weight * fractor);
    }

    void toSober() {
        pureAlko = 0.0;
    }
}
