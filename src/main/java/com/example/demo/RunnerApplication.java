
package com.example.demo;




import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.util.BsonUtils;
import org.springframework.scheduling.annotation.EnableAsync;




@Configuration
@EnableAsync
public class RunnerApplication {

    @Autowired
    PlayerService playerService;
    @Bean
    CommandLineRunner demo() {
        return args -> {
                //Player{id=238570, name='Song Bum Keun', age=20, icon='https://cdn.sofifa.org/players/4/19/238570.png', national='Korea Republic', winners=64, games=75, club='Jeonbuk Hyundai Motors'}
                //Player{id=244677, name='M. Baldisimo', age=18, icon='https://cdn.sofifa.org/players/4/19/244677.png', national='Canada', winners=47, games=69, club='Vancouver Whitecaps FC'}
            //playerService.listAll().subscribe((player) -> System.out.println(player.toString()));

            };


        };

    }

