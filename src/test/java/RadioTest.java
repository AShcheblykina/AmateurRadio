import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    private void ChangeStations() {
        Radio cond = new Radio();

        cond.StationNumber = 6;

        int expected = 6;
        int actual = cond.StationNumber;

        Assertions.assertEquals(expected, actual);

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

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ChooseMaxToSoundVolume() {
        Radio cond = new Radio();

        cond.ChooseMaxSoundVolume();

        int expected = 10;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ChooseFirstToStation() {
        Radio cond = new Radio();

        cond.ChooseFirstStation();

        int expected = 1;
        int actual = cond.StationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChooseMiniToSoundVolume() {
        Radio cond = new Radio();

        cond.ChooseMiniSoundVolume();

        int expected = 1;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotChooseSoundLargerMax() {
        Radio cond = new Radio();

        cond.SoundVolume = 10;

        int expected = 10;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldNotChooseLastStationLargerMax() {
        Radio cond = new Radio();

        cond.StationNumber = 9;

        int expected = 9;
        int actual = cond.StationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChooseMiniSoundVolumeLargerMini() {
        Radio cond = new Radio();

        cond.SoundVolume = 1;

        int expected = 1;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ChooseIncreaseSoundVolume() {
        Radio cond = new Radio();

        cond.SoundVolume = 5;

        int expected = 5;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void IncreaseStationNumber() {
        Radio cond = new Radio();

        cond.StationNumber = 6;

        int expected = 6;
        int actual = cond.StationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChooseIncreaseStationNumberLargeMax() {
        Radio cond = new Radio();

        cond.setStationNumber(10);

        int expected = 0;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChooseIncreaseSoundVolumeLargeMax() {
        Radio cond = new Radio();

        cond.setSoundVolume(10);

        int expected = 10;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChooseIncreaseSoundVolumeLargeMini() {
        Radio cond = new Radio();

        cond.setSoundVolume(-5);

        int expected = 0;
        int actual = cond.SoundVolume;

        Assertions.assertEquals(expected, actual);

    }
}
