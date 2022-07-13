package fr.orsys.groupe1.sms.business;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// mise en place de la dépendance lombok dans le pom
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
	
	@JsonProperty("message")
	private String contenu;
	
	@JsonProperty("receivers")      // liste car on peut l'envoyer 
	private List<String> lstDestinataires; // à une ou plusieurs destinaitaires 
	
	@JsonProperty("priority")
	private String priorite;
	
	@JsonProperty("senderForResponse")
	private Boolean autoriseReponse;
	
	
}
