package controle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Docente;
import visao.ListaDocente;
import visao.TelaCadastroDocente;

/**
 *
 * @author GLAUFER
 */
public class ControleDocente {
    private TelaCadastroDocente telaCadastroDocente;
    private ListaDocente listaDocente;
    private List<Docente> docentes = new ArrayList();
    private Docente docenteSelecionado;

    public ControleDocente() {
    }
    
    public List<Docente> getDocentes() {
        return docentes;
    }
    
    public TelaCadastroDocente getTelaCadastroDocente() {
        return telaCadastroDocente;
    }
    
     public ListaDocente getTelaListagem() {
        return listaDocente;
    }

    public void editarDocente(String nome, String cpf, String email,
            String genero, String formacao, LocalDate dataNascimento){
        if(docenteSelecionado != null){
            docenteSelecionado.setNomeD(nome);
            docenteSelecionado.setCpfD(cpf);
            docenteSelecionado.setEmailD(email);
            docenteSelecionado.setFormacao(formacao);
            docenteSelecionado.setGeneroD(genero);
            docenteSelecionado.setDataNascimentoD(dataNascimento);
        }
    }
    
    public void adicionarDocente(String nome, String cpf, String email,
            String genero, String formacao, LocalDate dataNascimento){
        
        Docente dc = new Docente(nome, cpf, email, genero, formacao, dataNascimento);
        docentes.add(dc);
        
    }
    
    public Docente getDocenteSelecionado(int index){
        if (index >= 0 && index < docentes.size()) {
            return docentes.get(index);
        }
        return null;
    }
    
    public void abrirTelaListaDocentes(){
        //listaDocente = new ListaDocentes(this);
        listaDocente.setVisible(true);
    }
     
    public void abrirTelaCadastroDocente(){
        //telaCadastroDocente = new TelaCadastroDocenteroDocente(this);
        telaCadastroDocente.setVisible(true);
    }
     
    public void abrirTelaCadastroDocenteParaEdicao(int index) {
        docenteSelecionado = getDocenteSelecionado(index);
        if (docenteSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Falha ao Editar Aluno!\nAluno não encontrado!", "Falha ao Editar", JOptionPane.ERROR_MESSAGE);
        }
        telaCadastroDocente = new TelaCadastroDocente(this, listaDocente,
                docenteSelecionado.getNomeD(),
                docenteSelecionado.getCpfD(),
                docenteSelecionado.getEmailD(),
                docenteSelecionado.getFormacao(),
                docenteSelecionado.getGeneroD(),
                docenteSelecionado.getDataNascimentoD()
        );
        telaCadastroDocente.setVisible(true);
    } 
    
    public void removerDocente(int index) {
        docentes.remove(index);
    }
    
}
