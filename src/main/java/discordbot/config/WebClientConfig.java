package discordbot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Created by IntelliJ IDEA.
 * DiscordBot.WebClientConfig
 *
 * @Author: user
 * @DateTime: 30.12.2021|19:58
 * @Version WebClientConfig: 1.0
 */

@Configuration
public class WebClientConfig
{
    @Bean
    public WebClient webClient()
    {
        return WebClient.builder().baseUrl("https://nsfw-ds-bot.herokuapp.com").build();
    }
}
