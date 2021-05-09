import Chat.Clear;
import Commands.*;
import Help.Help;
import Messages.Messages;
import Punishment.Mute;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class NS_Bot extends ListenerAdapter {

    public static void main(String[] args) {
        JDABuilder b = new JDABuilder();
        JDA jda = null;
        try {
            jda = b.setToken("ODQwNDA4NTAxNzc5NDMxNDQ0.YJXxaA.Bgb1KFm0kLSh8vAL5N2bWzmCGY0").build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
        //継承
        jda.addEventListener(new NS_Bot());

        jda.addEventListener(new Messages());

        jda.addEventListener(new Help());

        jda.addEventListener(new Clear());

        jda.addEventListener(new Start());

        jda.addEventListener(new End());

        jda.addEventListener(new Ping());

        jda.addEventListener(new Mute());

        jda.addEventListener(new Break());

        jda.addEventListener(new RestartBr());

        jda.addEventListener(new NShelp());
    }


}