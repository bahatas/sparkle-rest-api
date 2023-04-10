package com.accounting.sparklerestapi.repository;

import com.accounting.sparklerestapi.entity.ClientVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientVendorRepository extends JpaRepository<ClientVendor,Long> {

    @Override
    Optional<ClientVendor> findById(Long id);
}
