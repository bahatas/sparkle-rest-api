package com.accounting.sparklerestapi.service;


import com.accounting.sparklerestapi.dto.ClientVendorDTO;
import com.accounting.sparklerestapi.entity.ClientVendor;

import java.util.List;
import java.util.Optional;

public interface ClientVendorService {

    ClientVendorDTO findById(Long id);

    public ClientVendorDTO save(ClientVendorDTO clientVendorDTO);

    void delete(Long id) throws IllegalAccessException;

//    void update(ClientVendorDTO clientVendorDTO, Long clientVendorId);

//    ClientVendorDTO update(ClientVendorDTO clientVendorDTO, Long clientVendorId);
    ClientVendorDTO update(ClientVendorDTO clientVendorDTO);

    List<ClientVendorDTO> listAllClientVendors();

    public List<ClientVendor> findAllByClientVendorName(String name);

    public List<ClientVendorDTO> findAllClients();

    public List<ClientVendorDTO> findAllVendors();

    boolean findIfCompanyHasOpenInvoices(Long id);


    Optional<ClientVendor> findClientVendorById(Long id);

}
