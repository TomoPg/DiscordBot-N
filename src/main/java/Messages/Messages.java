package Messages;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Messages extends ListenerAdapter {

    //こんにちはと打つとこんにちはと返す
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String messageSent = e.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase(".おはよう")){
            e.getChannel().sendMessage(e.getAuthor().getName() + "さん、おはよう！:white_sun_cloud: ").queue();
        }
        if (messageSent.equalsIgnoreCase(".こんにちは")){
            e.getChannel().sendMessage(e.getAuthor().getName() + "さん、こんにちは！:sunny: ").queue();
        }
        if (messageSent.equalsIgnoreCase(".こんばんは")){
            e.getChannel().sendMessage(e.getAuthor().getName() + "さん、こんばんは！:crescent_moon: ").queue();
        }
        if (messageSent.equalsIgnoreCase(".おやすみ")){
            e.getChannel().sendMessage(e.getAuthor().getName() + "さん、おやすみ！:zzz: ").queue();
        }
    }
}
