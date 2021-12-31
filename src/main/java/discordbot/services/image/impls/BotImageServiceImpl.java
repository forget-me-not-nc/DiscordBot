package discordbot.services.image.impls;

import discordbot.config.ConnectedGuilds;
import discordbot.services.image.BotImageService;
import discordbot.services.random.RandomService;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.TextChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/*
Created by IntelliJ IDEA.
@Project Name: DiscordBot 
@Author: Nazar Palijchuk
@DateTime: 29.12.2021 | 20:50
@Version MainChain: 1.0
*/

@Service
public class BotImageServiceImpl implements BotImageService
{
    @Autowired
    private JDA bot;

    @Autowired
    private WebClient webClient;

    @Autowired
    private RandomService randomService;

    @Autowired
    private ConnectedGuilds guilds;

    @Override
    public void sendImage()
    {
        webClient.get().uri("/image").retrieve().bodyToMono(String.class).subscribe(
                response ->
                        guilds.getConnectedGuilds().forEach(
                                el ->
                                        Objects.requireNonNull(bot
                                                .getGuildById(el))
                                                .getTextChannelsByName("nsfw-hentai-images", true)
                                                .get(0)
                                                .sendMessageEmbeds(
                                                    new EmbedBuilder()
                                                            .setImage(response)
                                                            .setTitle(randomService.getRandomPhrase()).build()
                                                )
                                                .timeout(10, TimeUnit.SECONDS)
                                                .submit()
                        )
        );
    }
}
