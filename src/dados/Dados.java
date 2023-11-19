package dados;
import classes.*;

import java.util.*;

public class Dados {
	private Jogador[] jogadores;
	private int numJogadores = 11;
	private Tecnico[] tecnicos;
	private int numTecnicos = 3;
	private Time[] times;
	private int numTimes = 10;
	private Liga[] ligas;
	private int numLigas = 2;
	
	public Dados(){
		jogadores = new Jogador[100];
		tecnicos = new Tecnico[100];
		times = new Time[100];
		ligas = new Liga[100];
	}
	
	
	public Jogador[] getJogadores() {
		return jogadores;
	}
	
	public Jogador getJogador(int i) {
		return jogadores[i];
	}
	
	public String[] getNomeJogadores() {
		String[] s = new String[numJogadores];
		for(int i = 0; i < numJogadores; i++) {
			s[i] = jogadores[i].getNome();
		}
		return s;
	}
	
	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	
	public void setJogador(int i, Jogador a) {
		jogadores[i] = a;
	}
	
	public int getNumJogadores() {
		return numJogadores;
	}
	
	public void setNumJogadores(int numJogadores) {
		this.numJogadores = numJogadores;
	}
	
	public Tecnico[] getTecnicos() {
		return tecnicos;
	} 
	
	public Tecnico getTecnico(int i) {
		return tecnicos[i];
	}
	
	public String[] getNomeTecnicos() {
		String[] s = new String[numTecnicos];
		for(int i = 0; i < numTecnicos; i++) {
			s[i] = tecnicos[i].getNome();
		}
		return s;
	}
	
	public void setTecnicos(Tecnico[] tecnicos) {
		this.tecnicos = tecnicos;
	}
	
	public void setTecnico(int i, Tecnico t) {
		tecnicos[i] = t;
	}
	
	public int getNumTecnicos() {
		return numTecnicos;
	}
	
	public void setNumTecnicos(int numTecnico) {
		this.numTecnicos = numTecnico;
	}
	
	public Time[] getTimes() {
		return times;
	}
	
	public Time getTime(int i) {
		return times[i];
	}
	
	public String[] getNomeTimes() {
		String[] s = new String[numTimes];
		for(int i = 0; i < numTimes; i++) {
			s[i] = times[i].getNomeTime();
		}
		return s;
	}
	
	
	public void setTimes(Time[] times) {
		this.times = times;
	}
	
	public void setTime(int i, Time a) {
		times[i] = a;
	}
	
	public int getNumTimes() {
		return numTimes;
	}
	
	public void setNumTimes(int numTimes) {
		this.numTimes = numTimes;
	}
	
	public Liga[] getLigas() {
		return ligas;
	}
	        
	public Liga getLiga(int i) {
		return ligas[i];
	}
	
	public String[] getNomeLigas() {
		String[] s = new String[numLigas];
		for(int i = 0; i < numLigas; i++) {
			s[i] = ligas[i].getNomeLiga();
		}
		return s;
	}
	
	public void setLigas(Liga[] ligas) {
		this.ligas = ligas;
	}
	
	public void setLiga(int i, Liga a) {
		ligas[i] = a;
	}
	
	public int getNumLigas() {
		return numLigas;
	}
	
	public void setNumLigas(int numLigas) {
		this.numLigas = numLigas;
	}
	
	public Jogador buscarJogadorPorNome(String nome) {
	    for (int i = 0; i < numJogadores; i++) {
	        if (jogadores[i].getNome().equalsIgnoreCase(nome)) {
	            return jogadores[i];
	        }
	    }
	    return null;
	}
	
	public Tecnico buscarTecnicoPorNome(String nome) {
	    for (int i = 0; i < numTecnicos; i++) {
	        if (tecnicos[i].getNome().equalsIgnoreCase(nome)) {
	            return tecnicos[i];
	        }
	    }
	    return null;
	}
	
	public Liga buscarLigaPorNome(String nome) {
	    for (int i = 0; i < numLigas; i++) {
	        if (ligas[i].getNomeLiga().equalsIgnoreCase(nome)) {
	            return ligas[i];
	        }
	    }
	    return null;
	}
	
	public Time buscarTimePorNome(String nome) {
	    for (int i = 0; i < numTimes; i++) {
	        if (times[i].getNomeTime().equalsIgnoreCase(nome)) {
	            return times[i];
	        }
	    }
	    return null;
	}
	
    public void calcularPontuacaoDosTimes() {
        for (int i = 0; i < numTimes; i++) {
            Time time = times[i];
            time.setPontuacao(time.calcularPontuacao(time.getQtdVitorias(), time.getQtdEmpates()));
        }
    }
	
    public void classificarTimes() {
        calcularPontuacaoDosTimes();
        Arrays.sort(times, 0, numTimes, Comparator.comparingDouble(Time::getPontuacao).reversed());
    }
	public void preencherDados() {
		jogadores[0] = new Jogador("Weverton",35,189,"Brasileiro","Direito",21);
		jogadores[1] = new Jogador("Piquerez",25,184,"Uruguaio","Esquerdo",22);
		jogadores[2] = new Jogador("Gustavo Gómez",30,185,"Paraguaio","Direito",15);
		jogadores[3] = new Jogador("Murilo",26,188,"Brasileiro","Direito",26);
		jogadores[4] = new Jogador("Marcos Rocha",34,176,"Brasileiro","Esquerdo",2);
		jogadores[5] = new Jogador("Richard Rios",23,180,"Colombiano","Direito",27);
		jogadores[6] = new Jogador("Luan",30,189,"Brasileiro","Direito",13);
		jogadores[7] = new Jogador("Ze Rafael",30,175,"Brasileiro","Esquerdo",8);
		jogadores[8] = new Jogador("Rapgael Veiga",28,178,"Brasileiro","Direito",23);
		jogadores[9] = new Jogador("Endrick",17,173,"Brasileiro","Esquerdo",9);
		jogadores[10] = new Jogador("Dudu",31,167,"Brasileiro","Direito",7);
		ligas[0] = new Liga("Brasilerão", "Série A", "Brasil", "18/02/2023", "27/12/2023");
		ligas[1] = new Liga("Premiere League", "1° divisão", "Reino Unido", "20/03/2023", "28/09/2023");
    	tecnicos[0] = new Tecnico("Abel Ferreira", 44, 178, "Português", "001", 392, "4-2-1-2");
    	tecnicos[1] = new Tecnico("Tite", 62, 175, "Brasileiro", "002", 332, "4-3-3");
    	tecnicos[2] = new Tecnico("Guardiola",48,180,"Espanhol","003",435,"4-3-3");
    	times[0] = new Time("Palmeiras", 1914, 18, 8, 8);
    	times[1] = new Time("Flamengo", 1895, 16, 8, 9);
    	times[2] = new Time("Fluminense", 1902, 13, 12, 8);
    	times[3] = new Time("Santos", 1912, 11, 14, 9);
    	times[4] = new Time("Botafogo", 1904, 18, 9, 6);
    	times[5] = new Time("Grêmio",1902,18,11,5);
    	times[6] = new Time("Bragantino",1950,16,6,11);
    	times[7] = new Time("Atlético Mineiro",1908,16,9,9);
    	times[8] = new Time("São Paulo",1900,12,11,10);
    	times[9] = new Time("América Mineiro",1923,4,21,9);
    	
 
	}
    
}