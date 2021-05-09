package Commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class RestartBr extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String messageSent = e.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("!Rs")){
            e.getChannel().sendMessage(e.getAuthor().getName() + "さんが勉強を再開しました、ファイトです！:fire:  ").queue();
        }
    }
}
