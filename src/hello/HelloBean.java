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
			mensagem = "Você é tri-mundial!";
		}
		else if(time.equals("Corinthians")){
			mensagem = "Você é campeão paulista!";
		}
		else if(time.equals("Palmeiras")){
			mensagem = "Você está triste!";
		}
		
		return "saidas";
	}
}
