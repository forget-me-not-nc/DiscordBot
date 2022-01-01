package discordbot.services.triggers;

import discordbot.model.Trigger;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * DiscordBot.TriggersService
 *
 * @Author: Palijchuk Nazar
 * @DateTime: 01.01.2022|16:01
 * @Version TriggersService: 1.0
 */

public interface TriggersService
{
    Trigger getByTrigger(String trigger);
    void setTrigger(String trigger, String answer);
    void deleteTrigger(String trigger);
    List<Trigger> getAll();
}
