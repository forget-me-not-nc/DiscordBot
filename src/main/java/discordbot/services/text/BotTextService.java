package discordbot.services.text;

import org.springframework.stereotype.Service;

/**
Created by IntelliJ IDEA.
@Project Name: DiscordBot 
@Author: Nazar Palijchuk
@DateTime: 29.12.2021 | 20:22
@Version MainChain: 1.0
*/

@Service
public interface BotTextService
{
    void sendMessage() throws InterruptedException;
}
