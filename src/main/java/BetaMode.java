import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.core.Settings;

@SpireInitializer
public class BetaMode {
    public static void initialize()
    {
        Settings.isBeta = true;
    }
}
