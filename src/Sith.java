
public class Sith extends Ser{
	private boolean telepatia; // Poderes
	private boolean telecinese; // Poderes
	private boolean persuasao; // Poderes
	private int percentualRaiva;
	private String nome; // Novo nome
	private boolean lordAprendiz; // Se é lord ou é aprendiz
	private String nomeTreinador;
	
	public Sith(String sexo, String especie, String dataNascimento, String planetaNatal, String nome, String jediSith,
			String midiChlorians, boolean telepatia, boolean telecinese, boolean persuasao, int percentualRaiva,
			String nomeNovo, boolean lordAprendiz, String nomeTreinador) {
		super(sexo, especie, dataNascimento, planetaNatal, nome, jediSith, midiChlorians);
		this.telepatia = telepatia;
		this.telecinese = telecinese;
		this.persuasao = persuasao;
		this.percentualRaiva = percentualRaiva;
		nome = nomeNovo;
		if (lordAprendiz == true) {
			setNomeTreinador(nomeTreinador);
		}
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
	public int getPercentualRaiva() {
		return percentualRaiva;
	}
	public void setPercentualRaiva(int percentualRaiva) {
		this.percentualRaiva = percentualRaiva;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isLordAprendiz() {
		return lordAprendiz;
	}

	public void setLordAprendiz(boolean lordAprendiz) {
		this.lordAprendiz = lordAprendiz;
	}

	public String getNomeTreinador() {
		return nomeTreinador;
	}

	public void setNomeTreinador(String nomeTreinador) {
		this.nomeTreinador = nomeTreinador;
	}
}
