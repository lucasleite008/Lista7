
public class Padawan extends Jedi {
	private boolean constroiSabre;

	public Padawan(String sexo, String especie, String dataNascimento, String planetaNatal, String nome,
			String jediSith, String midiChlorians, boolean telepatia, boolean telecinese, boolean persuasao,
			int percentualPaz, boolean constroiSabre) {
		super(sexo, especie, dataNascimento, planetaNatal, nome, jediSith, midiChlorians, telepatia, telecinese,
				persuasao, percentualPaz);
		this.constroiSabre = constroiSabre;
	}

	public boolean isConstroiSabre() {
		return constroiSabre;
	}
	public void setConstroiSabre(boolean constroiSabre) {
		this.constroiSabre = constroiSabre;
	}
}
