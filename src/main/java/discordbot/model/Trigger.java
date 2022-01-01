package discordbot.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by IntelliJ IDEA.
 * DiscordBot.Triggers
 *
 * @Author: Palijchuk Nazar
 * @DateTime: 01.01.2022|15:59
 * @Version Triggers: 1.0
 */

@Builder
@Data
@Document(collection = "triggers")
public class Trigger
{
    private String id;
    private String trigger;
    private String answer;
}
