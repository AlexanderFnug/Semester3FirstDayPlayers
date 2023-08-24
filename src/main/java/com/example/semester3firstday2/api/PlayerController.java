package com.example.semester3firstday2.api;

import com.example.semester3firstday2.Entity.Player;
import com.example.semester3firstday2.Repos.PlayerRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    PlayerRepo playerRepo;

    public PlayerController(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    @GetMapping
    List<Player> getPlayers() {
        return  playerRepo.findAll();
    }
}

