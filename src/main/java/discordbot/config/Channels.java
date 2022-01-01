package discordbot.config;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.TextChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * DiscordBot.Channels
 *
 * @Author: Palijchuk Nazar
 * @DateTime: 01.01.2022|18:05
 * @Version Channels: 1.0
 */

@Configuration
public class Channels
{
    @Autowired
    JDA bot;

    @Bean
    public TextChannel getGeneralChanel()
    {
       return bot.getTextChannelsByName("❄общий-чат❄", true).get(0);
    }
}
