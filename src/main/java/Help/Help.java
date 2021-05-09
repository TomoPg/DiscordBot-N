package Help;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.awt.*;

public class Help extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String messageSent = e.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("!Help")){
            e.getChannel().sendMessage(new EmbedBuilder()
                    .addField("各ヘルプ","!Help",true)
                    .addField("コマンド関連","!CmdHelp",false)
                    .addField("チャット関連","!CtHelp",false)
                    .addField("タイマー関連","!TmHelp",false)
                    .addField("BOT関連","!BotHelp",false)
                    .addField("処罰関連", "!BHelp", false)
                    .addField("Ping確認", "!Ping", true)
                    .setTitle("Help")
                    .setDescription("各ヘルプコマンド一覧を表示しています")
                    .setThumbnail("https://illust8.com/wp-content/uploads/2018/08/mark_hatena_question_illust_902.png")
                    .setFooter("問題があった場合BOT制作者まで連絡してください -> @Tomo_N4_ / Tomo#5555","https://pbs.twimg.com/media/EojSTIyVoAcQCLm.jpg")
                    .setColor(Color.CYAN)
                    .setAuthor("") // アイコンを設定することもできます
                    .build()).queue();
        }
    }
}
