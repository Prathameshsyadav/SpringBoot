package in.ashokit.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.entities.Quotes;
import reactor.core.publisher.Mono;

@Service
public class WebServices {
	
	public static final String API_URL="https://dummyjson.com/quotes/random";
	
	public void quote1() {
		
		WebClient webClient = WebClient.create();
		
		Mono<Quotes> bodyToMono = webClient.get().uri(API_URL)
							.retrieve()
								.bodyToMono(Quotes.class); // response in one shot
		//sync response
		Quotes quotes = bodyToMono.block();
		
		System.out.println(quotes);
						
		
	}
	
	
	//Async call
	public void quote2() {
		
		WebClient webClient = WebClient.create();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@Request Sent@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		webClient.get()
					.uri(API_URL)
						.retrieve()
							.bodyToMono(Quotes.class)
								.subscribe(response -> 
								System.out.println(response)
										);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@Request Complete@@@@@@@@@@@@@@@@@@@@@@@@@");
		
	}

}
