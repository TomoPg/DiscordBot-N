package Commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Start extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String messageSent = e.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("!Start")){
            e.getChannel().sendMessage(e.getAuthor().getName() + "さんが勉強を始めました、頑張って下さい！:fire: ").queue();
        }
    }
}
