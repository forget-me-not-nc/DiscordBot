package discordbot.scheduler;

import discordbot.services.image.BotImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * DiscordBot.ImageScheduler
 *
 * @Author: user
 * @DateTime: 30.12.2021|19:53
 * @Version ImageScheduler: 1.0
 */

@Service
public class ImageScheduler
{
    @Autowired
    BotImageService service;

    //@Scheduled(cron = "0 0 0/1 * * ?")
    @Scheduled(cron = "*/45 * * * * ?")
    public void postImage()
    {
        service.sendImage();
    }

}
