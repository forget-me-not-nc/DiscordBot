package discordbot.repos;

import discordbot.model.Trigger;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * DiscordBot.TriggersRepo
 *
 * @Author: Palijchuk Nazar
 * @DateTime: 01.01.2022|15:56
 * @Version TriggersRepo: 1.0
 */

public interface TriggersRepo extends MongoRepository<Trigger, String>
{
    Trigger findByTrigger(String trigger);
}
