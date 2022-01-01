package discordbot.config;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * DiscordBot.StringConstants
 *
 * @Author: user
 * @DateTime: 30.12.2021|20:43
 * @Version StringConstants: 1.0
 */

@Component
public class StringConstants
{
    private final List<String> phrases = Arrays.asList(
      "WOW",
      "What a baby",
      "I love that",
      "I`d fuck you right there",
      "Ohh yess",
      "Nice body",
      "Gimme ur love",
      "Fuck yeahh",
      "Love you",
      "Sweet..",
      "Fit ass",
      "Lovely smile~",
      "Mommy",
      "MM milfs",
      "I want that",
      "Pretty girl~!",
      "What a beauty",
      "MMMmmmmm"
    );

    public List<String> getPhrases() { return phrases; }
}
