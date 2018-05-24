
public class Jedi extends Ser {
	private boolean telepatia;
	private boolean telecinese;
	private boolean persuasao;
	private int percentualPaz;

	public Jedi(String sexo, String especie, String dataNascimento, String planetaNatal, String nome, String jediSith,
			String midiChlorians, boolean telepatia, boolean telecinese, boolean persuasao, int percentualPaz) {
		super(sexo, especie, dataNascimento, planetaNatal, nome, jediSith, midiChlorians);
		this.telepatia = telepatia;
		this.telecinese = telecinese;
		this.persuasao = persuasao;
		this.percentualPaz = percentualPaz;
	}
	
	public boolean isTelepatia() {
		return telepatia;
	}
	public void setTelepatia(boolean telepatia) {
		this.telepatia = telepatia;
	}
	public boolean isTelecinese() {
		return telecinese;
	}
	public void setTelecinese(boolean telecinese) {
		this.telecinese = telecinese;
	}
	public boolean isPersuasao() {
		return persuasao;
	}
	public void setPersuasao(boolean persuasao) {
		this.persuasao = persuasao;
	}
	public int getPercentualPaz() {
		return percentualPaz;
	}
	public void setPercentualPaz(int percentualPaz) {
		this.percentualPaz = percentualPaz;
	}
}
