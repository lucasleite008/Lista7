
public class Youngling extends Jedi {
	private String clan; // Pertencente de qual clã
	private boolean colheita; // Ja realizou a colheita
	
	public Youngling(String sexo, String especie, String dataNascimento, String planetaNatal, String nome,
			String jediSith, String midiChlorians, boolean telepatia, boolean telecinese, boolean persuasao,
			int percentualPaz, String clan, boolean colheita) {
		super(sexo, especie, dataNascimento, planetaNatal, nome, jediSith, midiChlorians, telepatia, telecinese,
				persuasao, percentualPaz);
		this.clan = clan;
		this.colheita = colheita;
	}
	
	public String getClan() {
		return clan;
	}
	public void setClan(String clan) {
		this.clan = clan;
	}
	public boolean isColheita() {
		return colheita;
	}
	public void setColheita(boolean colheita) {
		this.colheita = colheita;
	}
}
