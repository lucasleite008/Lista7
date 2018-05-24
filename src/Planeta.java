
public class Planeta {
	private String nome; // ex: Coruscant
	private String cor; // ex: metálica
	private String sistema; // ex: Coruscant
	private String diametro;
	private String regime; // ex: República Galáctica
	
	public Planeta(String nome, String cor, String sistema, String diametro, String regime) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.sistema = sistema;
		this.diametro = diametro;
		this.regime = regime;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public String getDiametro() {
		return diametro;
	}
	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}
	public String getRegime() {
		return regime;
	}
	public void setRegime(String regime) {
		this.regime = regime;
	}
}
