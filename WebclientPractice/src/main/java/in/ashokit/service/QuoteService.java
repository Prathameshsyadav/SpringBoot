package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.entities.Quote;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;

@Service
public class QuoteService {

	public static final String url = "https://dummyjson.com/quotes/random";

	public void syncResponseWebClient() {

		WebClient webClient = WebClient.create();

		Mono<Quote> bodyToMono = webClient.get().uri(url)
											.retrieve()
												.bodyToMono(Quote.class);

		Quote quote = bodyToMono.block();

		System.out.println("The new Quote is " + quote);

	}
	
	
	public void asyncResponseWebClient() {
		
		WebClient webClient = WebClient.create();
		
		System.out.println("@@@@@@@Before calling@@@@@@@@@");
		
		Disposable subscribe = webClient.get().uri(url).retrieve().bodyToMono(Quote.class).subscribe(System.out::println);
		
		System.out.println("@@@@@@@After calling@@@@@@@@@");
	}

}
