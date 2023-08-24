package com.example.semester3firstday2.Repos;

import com.example.semester3firstday2.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player, Integer> {
    Player findByName(String player);
    Player findByNameLike(String player);

}
