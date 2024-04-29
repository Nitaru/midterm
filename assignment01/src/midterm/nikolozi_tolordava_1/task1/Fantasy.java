import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private final String nikolozi;

    public Fantasy(String studentName) {
        this.nikolozi = "";
    }

    @Override
    public String toString() {
        return "Fantasy: " + nikolozi;
    }

    @Override
    public String getJustice1() {
        return "Implementing justice in fantasy";
    }

    @Override
    public String getTrumpet2() {
        return "Trumpeting in fantasy";
    }

    @Override
    public String methodBackpack3(String argAir5) {
        return "Implementing methodBackpack3";
    }