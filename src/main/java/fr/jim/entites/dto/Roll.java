package fr.jim.entites.dto;

import java.util.ArrayList;
import java.util.List;

public class Roll {

    private List<String> resultats = new ArrayList<>();
    private List<String> resultatsRolls = new ArrayList<>();

    private StringBuilder total = new StringBuilder("**Total = ");

    private int nbLancers;

    private int nbFaces;

    private int modificateur = 0;

    private String symbole = "";

    public Roll() {
    }

    public List<String> getResultats() {
        return resultats;
    }

    public void setResultats(List<String> resultats) {
        this.resultats = resultats;
    }

    public List<String> getResultatsRolls() {
        return resultatsRolls;
    }

    public void setResultatsRolls(List<String> resultatsRolls) {
        this.resultatsRolls = resultatsRolls;
    }

    public StringBuilder getTotal() {
        return total;
    }

    public void setTotal(StringBuilder total) {
        this.total = total;
    }

    public int getNbLancers() {
        return nbLancers;
    }

    public void setNbLancers(int nbLancers) {
        this.nbLancers = nbLancers;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public void setNbFaces(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    public int getModificateur() {
        return modificateur;
    }

    public void setModificateur(int modificateur) {
        this.modificateur = modificateur;
    }

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    @Override public String toString() {

        if (this.getResultatsRolls().size() == 1 && this.getModificateur() == 0) {
            return this.getResultatsRolls().get(0) + " = " + this.getResultats().get(0) +
                    "\n-------------------\n";
        } else {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.getResultatsRolls().size(); i++) {
                sb.append(this.getResultatsRolls().get(i) + " = " + this.getResultats().get(i) + "\n");
            }

            sb.append(this.getTotal() + "\n-------------------\n");

            return sb.toString();

        }
    }
}
