package model;

public class Renda {

    private double renda;

    public Renda(double renda) {
        super();
        this.renda = renda;
    }
    
    public Renda() {
     
    }
    public String avaliaRenda() {
        if (renda >= 1212) {
            return "O cliente só pode solicitar empréstimos de até R$ 2 mil.";
        } else if (1213 < renda && renda > 5000) {
            return "O cliente só pode solicitar empréstimos entre R$ 2001 até R$ 5 mil.";
        } else {
            return "O cliente pode solicitar empréstimos entre R$ 5001 até R$ 10 mil.";
        }
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Renda: " + renda;
    }

}
