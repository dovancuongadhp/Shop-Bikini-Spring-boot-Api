package com.unicoin.java6.Service;

import com.unicoin.java6.Entity.ColorsEntity;

import java.util.List;
import java.util.Optional;

public interface ColorService {
    List<ColorsEntity> getListColors();
    Optional<ColorsEntity> getColorById(Integer id);
}
