
public class Jedi extends Ser {
	private boolean telepatia;
	private boolean telecinese;
	private boolean persuasao;
	private int percentualPaz;
	private String nome;
	
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
