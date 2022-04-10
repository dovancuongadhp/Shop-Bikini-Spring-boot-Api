package com.unicoin.java6.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ColorDto {
    private int colorId;
    private String name;
    private boolean status;
}
