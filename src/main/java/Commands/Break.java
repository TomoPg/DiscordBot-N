package Commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Break extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String messageSent = e.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("!br")){
            e.getChannel().sendMessage(e.getAuthor().getName() + "さんが休憩に入りました、ゆっくり休んでください！:mask:  ").queue();
        }
    }
}
