package com.unicoin.java6.Service.Impl;

import com.unicoin.java6.Entity.ColorsEntity;
import com.unicoin.java6.Repository.ColorsRepository;
import com.unicoin.java6.Service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColorServiceImp implements ColorService {
    @Autowired
    ColorsRepository colorsRepository;
    @Override
    public List<ColorsEntity> getListColors() {
        return colorsRepository.findAll();
    }

    @Override
    public Optional<ColorsEntity> getColorById(Integer id) {
        Optional<ColorsEntity> colorsEntity = colorsRepository.findById(id);
        if (colorsEntity.isPresent()){
            return colorsEntity;
        }
        return null;
    }
}
