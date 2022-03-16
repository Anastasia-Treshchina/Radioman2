package ru.netology.domain.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radioman2 {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int quantityStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
}
