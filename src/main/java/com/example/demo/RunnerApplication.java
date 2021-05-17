
package com.example.demo;




import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.util.BsonUtils;
import org.springframework.scheduling.annotation.EnableAsync;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


@Configuration
@EnableAsync
public class RunnerApplication {

    @Autowired
    PlayerService playerService;
    @Bean
    CommandLineRunner demo() {
        return args -> {

            //playerService.listAll().subscribe((player) -> System.out.println(player.toString()));
/*            List<Player> players = CsvUtilFile.getPlayers();
            Flux.fromIterable(players).flatMap(player -> playerService.insert(Mono.just(player))).subscribe(System.out::println);*/


            };


        }

    }

