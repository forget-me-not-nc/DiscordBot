package discordbot.config;

import discordbot.handlers.TriggersHandler;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.security.auth.login.LoginException;

/**
Created by IntelliJ IDEA.
@Project Name: DiscordBot 
@Author: Nazar Palijchuk
@DateTime: 28.12.2021 | 22:57
@Version MainChain: 1.0
*/

@Configuration
public class DiscordBot
{
    @Autowired
    TriggersHandler triggersHandler;

    @Bean
    JDA createAPIConnection() throws LoginException, InterruptedException
    {
        return JDABuilder.createDefault(System.getenv("API_KEY"))
                         .addEventListeners(triggersHandler)
                         .setActivity(Activity.playing("очке пальчиком"))
                         .build()
                         .awaitReady();
    }
}
