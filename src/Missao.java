
public class Missao {
	private String nome;	
	private String objetivo;
	
	public Missao(String nome, String objetivo) {
		super();
		this.nome = nome;
		this.objetivo = objetivo;
	}
	
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
