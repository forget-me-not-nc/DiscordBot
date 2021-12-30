package discordbot.services.text.impls;
/*
Created by IntelliJ IDEA.
@Project Name: DiscordBot 
@Author: Nazar Palijchuk
@DateTime: 29.12.2021 | 20:50
@Version MainChain: 1.0
*/

import org.springframework.scheduling.annotation.Scheduled;
import discordbot.services.text.BotTextService;

public class BotTextServiceImpl implements BotTextService
{


    @Scheduled(cron = "*/5 * * * *")
    @Override
    public void sendMessage(String message)
    {

    }
}
