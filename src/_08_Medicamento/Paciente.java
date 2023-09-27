package _08_Medicamento;

import java.util.ArrayList;

public class Paciente {
    private String nome;
    private String sintoma;
    ArrayList<String> CondSaude;
ArrayList<Medicamento> medicamentos;

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public ArrayList<String> getCondSaude() {
        return CondSaude;
    }

    public void setCondSaude(ArrayList<String> condSaude) {
        CondSaude = condSaude;
    }
}
