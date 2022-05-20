public class LeadEngineer extends Engineer {
        String comp1;
        public String comp2;
        private String comp3;

        public LeadEngineer () {
            super.setPosition("Vacancy ");
        }

        public LeadEngineer (String name, String position, double public_salary, String comp1, String comp2, String comp3) {
            super(name, position, public_salary);
            this.comp1 = comp1;
            this.comp2 = comp2;
            this.comp3 = comp3;
        }

    public String getComp3() {
        return comp3;
    }

    public void setComp3(String comp3) {
        this.comp3 = comp3;
    }

    @Override
        public double personal_salary () {
            return public_salary * 4;
        }
}
