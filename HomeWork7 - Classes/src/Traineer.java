public class Traineer extends Engineer {
    protected String university;
    private double raitingU;
    double raitingT;

    public Traineer () {
        super.setPosition("No vacancy ");
    }

    public Traineer (String name, String position, double public_salary, String university, double raitingU, double raitingT) {
        super(name, position, public_salary);
        this.university = university;
        this.raitingU = raitingU;
        this.raitingT = raitingT;
    }

    public double getRaitingU() {
        return raitingU;
    }

    public void setRaitingU(double raitingU) {
        this.raitingU = raitingU;
    }

    @Override
    public double personal_salary () {
        return public_salary * 0.5;
    }

}
