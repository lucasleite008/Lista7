
public class Missao {
	private String nome;
	private String objetivo;
	private String autor;
	
	public Missao(String nome, String objetivo, String autor) {
		super();
		this.nome = nome;
		this.objetivo = objetivo;
		this.autor = autor;
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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
