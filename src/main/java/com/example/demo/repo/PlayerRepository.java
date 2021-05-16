package com.example.demo.repo;

import com.example.demo.Player;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PlayerRepository extends ReactiveCrudRepository<Player, String> {
}
