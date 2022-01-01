package discordbot.services.random.impls;

import discordbot.config.StringConstants;
import discordbot.services.random.RandomService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * DiscordBot.RandomServiceImpl
 *
 * @Author: user
 * @DateTime: 30.12.2021|20:46
 * @Version RandomServiceImpl: 1.0
 */

@Service
public class RandomServiceImpl implements RandomService
{
    private final StringConstants phrase;
    private final Random random;

    public RandomServiceImpl(StringConstants phrase)
    {
        this.phrase = phrase;
        this.random = new Random();
    }

    @Override
    public String getRandomPhrase()
    {
        return phrase.getPhrases().get(
                random.nextInt(phrase.getPhrases().size())
        );
    }
}
