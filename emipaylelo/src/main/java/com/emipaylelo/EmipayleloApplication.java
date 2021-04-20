package com.emipaylelo;



import java.util.Arrays;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.emipaylelo.controller.AdminController;
import com.emipaylelo.controller.CardTypeController;
import com.emipaylelo.model.CardType;
import com.emipaylelo.model.CardTypeEnum;

@SpringBootApplication
@ComponentScan("com.emipaylelo")
@EntityScan("com.emipaylelo.model")
public class EmipayleloApplication {
	

	@Autowired
	private AdminController adminController;

	@Autowired
	private CardTypeController cardTypeController;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(EmipayleloApplication.class, args);
	}
	 
	@Bean
	InitializingBean sendDatabase() {
	    return () -> {
	    	adminController.addAdmin();
			CardType goldCard = new CardType();
			goldCard.setCardType(CardTypeEnum.GOLD);
			goldCard.setCardExpiry(5);
			goldCard.setCardJoiningFee(500);
			goldCard.setCardLimit(50000);
			
			CardType titaniumCard = new CardType();
			titaniumCard.setCardType(CardTypeEnum.TITANIUM);
			titaniumCard.setCardExpiry(5);
			titaniumCard.setCardJoiningFee(1000);
			titaniumCard.setCardLimit(100000);
			
			cardTypeController.addOrUpdateCardType(goldCard);
			cardTypeController.addOrUpdateCardType(titaniumCard);
      };
   }
}
