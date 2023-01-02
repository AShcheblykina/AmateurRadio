import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void ChangeStations() {
        Radio cond = new Radio();

        cond.StationNumber = 9;

        int expected = 9;
        int actual = cond.StationNumber;

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void ChangeVolume() {
        Radio cond = new Radio();

        cond.SoundVolume = 10;

        int expected = 10;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ChooseLastToStation() {
        Radio cond = new Radio();

        cond.ChooseLastStation();

        int expected = 9;
        int actual = cond.StationNumber;

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void ChooseMaxToSoundVolume() {
        Radio cond = new Radio();

        cond.ChooseMaxSoundVolume();

        int expected = 10;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void ChooseFirstToStation() {
        Radio cond = new Radio();

        cond.ChooseFirstStation();

        int expected = 1;
        int actual = cond.StationNumber;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ChooseMiniToSoundVolume() {
        Radio cond = new Radio();

        cond.ChooseMiniSoundVolume();

        int expected = 1;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected,actual);
    }
}
