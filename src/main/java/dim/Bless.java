package dim;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.game.state.GameStoppedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "bless",
        name = "Bless",
        version = "0.1",
        authors  = "DIM",
        description = "I can bless your server ~"
)
public class Bless {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        logger.info("  \n" +
                "§b * §e...............§cExperience tranquility§e............... \n" +
                "§b * §e                      \n" +
                "§b * §e                      _oo0oo_ \n" +
                "§b * §e                     o8888888o \n" +
                "§b * §e                     88\" . \"88 \n" +
                "§b * §e                     (| -_- |) \n" +
                "§b * §e                     0\\  =  /0 \n" +
                "§b * §e                   ___/`---'\\___ \n" +
                "§b * §e                 .' \\\\|     |// '. \n" +
                "§b * §e                / \\\\|||  :  |||// \\ \n" +
                "§b * §e               / _||||| -§6卍§e-|||||- \\ \n" +
                "§b * §e              |   | \\\\\\  -  /// |   | \n" +
                "§b * §e              | \\_|  ''\\---/''  |_/ | \n" +
                "§b * §e              \\  .-\\__  '-'  ___/-. / \n" +
                "§b * §e            ___'. .'  /--.--\\  `. .'___ \n" +
                "§b * §e         .\"\" '<  `.___\\_<|>_/___.' >' \"\". \n" +
                "§b * §e        | | :  `- \\`.;`\\ _ /`;.`/ - ` : | | \n" +
                "§b * §e        \\  \\ `_.   \\_ __\\ /__ _/   .-` /  / \n" +
                "§b * §e    =====`-.____`.___ \\_____/___.-`___.-'===== \n" +
                "§b * §e                      `=---=' \n" +
                "§b * §e                       \n" +
                "§b * §e.............§bTure self is without form§e.............. \n" +
                " ");
    }

    @Listener
    public void onServerStop(GameStoppedServerEvent event) {
        logger.info("  \n" +
                "§b *§e _ooOoo_\n" +
                "§b *§e o8888888o\n" +
                "§b *§e 88\" . \"88\n" +
                "§b *§e (| -_- |)\n" +
                "§b *§e  O\\ = /O\n" +
                "§b *§e ___/`---'\\____\n" +
                "§b *§e .   ' \\\\| |// `.\n" +
                "§b *§e / \\\\||| : |||// \\\n" +
                "§b *§e / _||||| -:- |||||- \\\n" +
                "§b *§e | | \\\\\\ - /// | |\n" +
                "§b *§e | \\_| ''\\---/'' | |\n" +
                "§b *§e \\ .-\\__ `-` ___/-. /\n" +
                "§b *§e ___`. .' /--.--\\ `. . __\n" +
                "§b *§e .\"\" '< `.___\\_<|>_/___.' >'\"\".\n" +
                "§b *§e | | : `- \\`.;`\\ _ /`;.`/ - ` : | |\n" +
                "§b *§e \\ \\ `-. \\_ __\\ /__ _/ .-` / /\n" +
                "§b *§e ======`-.____`-.___\\_____/___.-`____.-'======\n" +
                "§b *§e `=---='\n" +
                "§b *§e          .............................................\n" +
                "§b *§f            Pass into the iris~\n" +
                " ");
    }
}
