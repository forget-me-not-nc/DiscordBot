package discordbot.config;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * DiscordBot.ConnectedGuilds
 *
 * @Author: user
 * @DateTime: 31.12.2021|15:07
 * @Version ConnectedGuilds: 1.0
 */

@Component
public class ConnectedGuilds
{
    @Autowired
    JDA bot;

    private List<String> connectedGuilds = null;

    @PostConstruct
    private void InitGuilds()
    {
        connectedGuilds = bot.getGuilds().stream().map(Guild::getId).collect(Collectors.toList());
    }

    public List<String> getConnectedGuilds() { return connectedGuilds; }
}
