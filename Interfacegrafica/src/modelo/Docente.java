package modelo;

import java.time.LocalDate;

/**
 *
 * @author GLAUFER
 */
public class Docente {
    private String nomeD;
    private String cpfD;
    private String emailD;
    private String generoD;
    private String formacao;
    private LocalDate dataNascimentoD;

    public Docente() {
    }

    public Docente(String nomeD, String cpfD, String emailD, String generoD, String formacao, LocalDate dataNascimentoD) {
        this.nomeD = nomeD;
        this.cpfD = cpfD;
        this.emailD = emailD;
        this.generoD = generoD;
        this.formacao = formacao;
        this.dataNascimentoD = dataNascimentoD;
    }

    public String getNomeD() {
        return nomeD;
    }

    public void setNomeD(String nomeD) {
        this.nomeD = nomeD;
    }

    public String getCpfD() {
        return cpfD;
    }

    public void setCpfD(String cpfD) {
        this.cpfD = cpfD;
    }

    public String getEmailD() {
        return emailD;
    }

    public void setEmailD(String emailD) {
        this.emailD = emailD;
    }

    public String getGeneroD() {
        return generoD;
    }

    public void setGeneroD(String generoD) {
        this.generoD = generoD;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public LocalDate getDataNascimentoD() {
        return dataNascimentoD;
    }

    public void setDataNascimentoD(LocalDate dataNascimentoD) {
        this.dataNascimentoD = dataNascimentoD;
    }
    
    
}
