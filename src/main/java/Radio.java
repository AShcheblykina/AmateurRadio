public class Radio {
    public int StationNumber;
    public int SoundVolume;

    public void ChooseLastStation() {
        StationNumber = 9;
    }

    public void ChooseMaxSoundVolume() {
        SoundVolume = 10;

    }

    public void ChooseFirstStation() {
        StationNumber = 1;
    }

    public void ChooseMiniSoundVolume() {
        SoundVolume = 1;
    }

    public void IncreaseSoundVolume() {
        if (SoundVolume < 10)
            SoundVolume = SoundVolume + 1;
    }

    public void IncreaseStationNumber() {
        if (StationNumber < 9)
            StationNumber = StationNumber + 1;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        StationNumber = newStationNumber;

    }

    public void NextLastStationNumber(int i) {
        if (StationNumber != 9) {
            StationNumber++;
        } else {
            StationNumber = 0;

        }
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 10) {
            return;
        }
        SoundVolume = newSoundVolume;
    }

        }
