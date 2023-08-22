public class Estudante {
  private String matricula;
  private String nome;
  private String curso;

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public Estudante() { }

  public Estudante(String matricula, String nome, String curso) {
    this.matricula = matricula;
    this.nome = nome;
    this.curso = curso;
  }
}
