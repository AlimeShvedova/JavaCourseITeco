public abstract class Engineer {
    public String name;
    private String position;
    protected double public_salary;

    public Engineer() {
    }

    public Engineer(String name, String position, double public_salary) {
        this.name = name;
        this.position = position;
        this.public_salary = public_salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double personal_salary () {
        return public_salary;
    }

}
