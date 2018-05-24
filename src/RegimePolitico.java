
public class RegimePolitico {
	private String dataInicio;
	private String dataFinal;
	private String capital;
	private String nome; // ex: República Galáctica
	private String planetas; // ex: Coruscant, Shili
	private String chefe; // ex: Tarsus Valorum
	
	public RegimePolitico(String dataInicio, String dataFinal, String capital, String nome, String planetas,
			String chefe) {
		super();
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.capital = capital;
		this.nome = nome;
		this.planetas = planetas;
		this.chefe = chefe;
	}
	
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlanetas() {
		return planetas;
	}
	public void setPlanetas(String planetas) {
		this.planetas = planetas;
	}
	public String getChefe() {
		return chefe;
	}
	public void setChefe(String chefe) {
		this.chefe = chefe;
	}
}
