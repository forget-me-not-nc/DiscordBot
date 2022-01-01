package discordbot.handlers;

import discordbot.model.Trigger;
import discordbot.services.triggers.TriggersService;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * DiscordBot.MessageHandler
 *
 * @Author: user
 * @DateTime: 01.01.2022|2:39
 * @Version MessageHandler: 1.0
 */

@Component
public class TriggersHandler extends ListenerAdapter
{
    @Autowired
    TriggersService triggersService;

    @Autowired
    TextChannel general;

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event)
    {
        String message = event.getMessage().getContentDisplay();

        if(message.contains("~~add"))
        {
            message = message.substring(6);

            triggersService.setTrigger(message.split("-")[0], message.split("-")[1]);
        }
        else if(message.contains("~~remove"))
        {
            message = message.substring(9);

            triggersService.deleteTrigger(message);
        }
        else
        {
            if(!event.getChannel().equals(general)) return;

            List<Trigger> allTriggers = triggersService.getAll();

            List<String> keyWords = Arrays.stream(
                    message.split("[ /.,\";:!?()\\-“]")
            ).distinct().collect(Collectors.toList());

            keyWords.forEach(
                    keyWord -> allTriggers.stream()
                            .filter(el -> el.getTrigger().equals(keyWord))
                            .findFirst().ifPresent(
                            trigger -> general.sendMessage(trigger.getAnswer())
                                        .timeout(10, TimeUnit.SECONDS).submit()
                    )
            );

        }
    }

}
