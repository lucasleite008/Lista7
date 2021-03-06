
public class Academia {
	private String ordem; // Sith ou Jedi
	private String nome; // ex: Academia Sith Korriban
	private String planeta;
	private String conselho; // ex: Conselho do Templo de Coruscant
	
	public Academia(String ordem, String nome, String planeta, String conselho) {
		super();
		this.ordem = ordem;
		this.nome = nome;
		this.planeta = planeta;
		this.conselho = conselho;
	}
	
	public String getOrdem() {
		return ordem;
	}
	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlaneta() {
		return planeta;
	}
	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}
	public String getConselho() {
		return conselho;
	}
	public void setConselho(String conselho) {
		this.conselho = conselho;
	}
}
