package ru.netology.radioman;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int quantityStations = 10;
    private int currentStation;
    private int volume;

    public Radio(int quantityStations) {
        this.quantityStations = quantityStations;
    }

    public int getQuantityStations() {
        return quantityStations - 1;
    }

    public void setQuantityStations() {
        quantityStations = quantityStations -1;
    }

    public void setNextStation() {
        if (currentStation < quantityStations && currentStation >= 0) {
            currentStation = currentStation + 1;
            return;
        } else {
            currentStation = 0;
        }
        return;
    }

    public void setPrevStation() {
        if (currentStation <= quantityStations && currentStation > 0) {
            currentStation = currentStation - 1;
            return;
        }
        if (currentStation == 0) {
            currentStation = quantityStations;
            return;
        } else {
            currentStation = 0;
        }
        return;

    }


    public void setUserStation(int userInstallation) {
        if (userInstallation >= 0 && userInstallation <= quantityStations) {
            currentStation = userInstallation;
        } else {
            currentStation = 0;
        }
    }

    public void setIncreaseVolume() {
        if (volume < 100 && volume >= 0) {
            volume = volume + 1;
            return;
        }
        if (volume == 100) {
            volume = volume;
            return;
        } else {
            volume = 0;
        }
        return;

    }

    public void setLowVolume() {
        if (volume <= 100 && volume > 0) {
            volume = volume - 1;
            return;
        }
        if (volume == 0) {
            volume = volume;
            return;
        } else {
            volume = 0;
        }
        return;
    }
}
