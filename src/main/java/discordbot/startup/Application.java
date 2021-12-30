package discordbot.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
Created by IntelliJ IDEA.
@Project Name: DiscordBot
@Author: Nazar Palijchuk
@DateTime: 28.12.2021 | 13:34
@Version MainChain: 1.0
*/

@SpringBootApplication
@EnableScheduling
public class Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
