package discordbot.config;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
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
    public JDA api;

    @Bean
    JDA createAPIConnection() throws LoginException
    {

        return api = JDABuilder.createDefault("OTI1MzQ2MDc3MzI5MTk1MDM5.YcrxsA.NC5Y_9j43T6636j2KPN1ZDoNShY").build();
        //return api = JDABuilder.createDefault(System.getenv("API_KEY")).build();
    }
}
