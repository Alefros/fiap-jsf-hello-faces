package hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloBean {

	private String time;
	private String mensagem;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String processar(){
		
		if(time.equals("SPFC")){
			mensagem = "Voc� � tri-mundial!";
		}
		else if(time.equals("Corinthians")){
			mensagem = "Voc� � campe�o paulista!";
		}
		else if(time.equals("Palmeiras")){
			mensagem = "Voc� est� triste!";
		}
		
		return "saidas";
	}
}
