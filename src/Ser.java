
public class Ser {
	private String sexo;
	private String especie;
	private String dataNascimento;
	private String planetaNatal;
	private String nome;
	private String jediSith; // 'Jedi' se Jedi, 'Sith' se Sith, '' se nenhum dos dois
	private String midiChlorians; // 'Alta' se alta quantidade, 'Baixa' se baixa quantidade
	
	public Ser(String sexo, String especie, String dataNascimento, String planetaNatal, String nome, String jediSith,
			String midiChlorians) {
		super();
		this.sexo = sexo;
		this.especie = especie;
		this.dataNascimento = dataNascimento;
		this.planetaNatal = planetaNatal;
		this.nome = nome;
		this.jediSith = jediSith;
		this.midiChlorians = midiChlorians;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getPlanetaNatal() {
		return planetaNatal;
	}
	public void setPlanetaNatal(String planetaNatal) {
		this.planetaNatal = planetaNatal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getJediSith() {
		return jediSith;
	}
	public void setJediSith(String jediSith) {
		this.jediSith = jediSith;
	}
	public String getMidiChlorians() {
		return midiChlorians;
	}
	public void setMidiChlorians(String midiChlorians) {
		this.midiChlorians = midiChlorians;
	}
}
