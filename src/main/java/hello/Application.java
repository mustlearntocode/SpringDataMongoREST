
package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {

		SpringApplication.run(Application.class);
	}
	@Bean
	public CommandLineRunner demo(PersonRepository repository){
		return (args) -> {
			//save a couple of persons
			repository.save(new Person("Jack", "Bauer"));
			repository.save(new Person("Chloe", "O'Brain"));
			repository.save(new Person("Kim", "Bauer"));
			repository.save(new Person("Michelle", "Dessler"));
			
			//fetch all persons
			log.info("Persons found with findAll():");
			log.info("-------------------------------");
			for(Person person : repository.findAll()){
				log.info(person.toString());
			}
			log.info("");
			
			//fetch an individual person by ID
			/*Person person = repository.findOne(1L);
			log.info("Person found with findOne(1L)");
			log.info("-------------------------------");
			log.info(person.toString());
			log.info("");*/
			
			//fetch persons by last name
			log.info("Person found with findByLastName('Bauer'");
			log.info("------------------------------------------");
			for(Person bauer : repository.findByLastName("Bauer")){
				log.info(bauer.toString());
			}
			log.info("");
		};
	}
}
