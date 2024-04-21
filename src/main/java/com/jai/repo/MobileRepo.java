package com.jai.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jai.entity.Mobile;

@Repository
public interface MobileRepo extends JpaRepository<Mobile, Serializable> {

}
