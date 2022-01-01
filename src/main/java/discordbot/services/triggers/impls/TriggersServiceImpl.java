package discordbot.services.triggers.impls;

import discordbot.model.Trigger;
import discordbot.repos.TriggersRepo;
import discordbot.services.triggers.TriggersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * DiscordBot.TriggersServiceImpl
 *
 * @Author: Palijchuk Nazar
 * @DateTime: 01.01.2022|16:02
 * @Version TriggersServiceImpl: 1.0
 */

@Service
public class TriggersServiceImpl implements TriggersService
{
    @Autowired
    TriggersRepo triggersRepo;

    @Override
    public String getByTrigger(String trigger)
    {
        return triggersRepo.findByTrigger(trigger).getTrigger();
    }

    @Override
    public void setTrigger(String trigger, String answer)
    {
        triggersRepo.save(Trigger.builder()
                .trigger(trigger)
                .answer(answer)
                .build());
    }

    @Override
    public void deleteTrigger(String trigger)
    {
        triggersRepo.delete(triggersRepo.findByTrigger(trigger));
    }

    @Override
    public List<Trigger> getAll()
    {
        return triggersRepo.findAll();
    }
}
