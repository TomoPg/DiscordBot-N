package Punishment;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.management.relation.Role;
import java.lang.reflect.Member;

public class Mute extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String[] args = e.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase("~mute")) {
            if (args.length > 1 && args.length < 3) {
                Member member = (Member) e.getGuild().getMemberById(args[1].replace("!", "").replace(">",""));
                Role role = (Role) e.getGuild().getRoleById("840604962047393813");


            } else if (args.length == 3) {

            } else {
                e.getChannel().sendMessage("Mute").queue();
            }
        }

    }
}
