package com.unicoin.java6.Repository;

import com.unicoin.java6.Entity.ColorsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorsRepository extends JpaRepository<ColorsEntity,Integer>{
}
