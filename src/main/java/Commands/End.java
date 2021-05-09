package Commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class End extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String messageSent = e.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("!End")){
            e.getChannel().sendMessage(e.getAuthor().getName() + "さんが勉強を終えました、お疲れ様でした！:clap: ").queue();
        }
    }
}
