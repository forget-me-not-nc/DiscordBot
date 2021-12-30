package discordbot.services.text.impls;

import net.dv8tion.jda.api.JDA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import discordbot.services.text.BotTextService;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/*
Created by IntelliJ IDEA.
@Project Name: DiscordBot 
@Author: Nazar Palijchuk
@DateTime: 29.12.2021 | 20:50
@Version MainChain: 1.0
*/

@Component
public class BotTextServiceImpl implements BotTextService
{
    @Autowired
    private JDA bot;

    @Scheduled(cron = "*/10 * * * * *")
    @Override
    public void sendMessage() throws InterruptedException
    {
        //bot.awaitReady().getCategories().get(0).getTextChannels().get(2).sendMessage("a").timeout(5, TimeUnit.SECONDS).submit();
    }
}
