
public class Clan {
	private String nome; // ex: Clã do Urso
	private String treinador; // ex: Mestre Yoda
	private String dataCriacao;
	private String dataFim;
	
	public Clan(String nome, String treinador, String dataCriacao, String dataFim) {
		super();
		this.nome = nome;
		this.treinador = treinador;
		this.dataCriacao = dataCriacao;
		this.dataFim = dataFim;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTreinador() {
		return treinador;
	}
	public void setTreinador(String treinador) {
		this.treinador = treinador;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
}
