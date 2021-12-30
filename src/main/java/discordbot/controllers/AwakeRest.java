package discordbot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
Created by IntelliJ IDEA.
@Project Name: DiscordBot 
@Author: Nazar Palijchuk
@DateTime: 28.12.2021 | 22:00
@Version MainChain: 1.0
*/

@RestController
public class AwakeRest
{
    @GetMapping("/awake")
    public String awake()
    {
        return "I`m awake.";
    }
}
