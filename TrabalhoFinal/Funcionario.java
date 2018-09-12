
package br.edu.ifcvideira.TrabalhoFinal;

public class Funcionario extends Pessoa{
	
	private String cargo;
	private String setor;
	private String carteiraTrabalho;
	private double salario;
	private int nDependentes;
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}
	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getnDependentes() {
		return nDependentes;
	}
	public void setnDependentes(int nDependentes) {
		this.nDependentes = nDependentes;
	}
}