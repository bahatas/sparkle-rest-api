package com.accounting.sparklerestapi.service.imp;

import com.accounting.sparklerestapi.dto.ClientVendorDTO;
import com.accounting.sparklerestapi.entity.ClientVendor;
import com.accounting.sparklerestapi.service.ClientVendorService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientVendorServiceImpl implements ClientVendorService {


    @Override
    public ClientVendorDTO findById(Long id) {
        return null;
    }

    @Override
    public ClientVendorDTO save(ClientVendorDTO clientVendorDTO) {
        return null;
    }

    @Override
    public void delete(Long id) throws IllegalAccessException {

    }

    @Override
    public ClientVendorDTO update(ClientVendorDTO clientVendorDTO) {
        return null;
    }

    @Override
    public List<ClientVendorDTO> listAllClientVendors() {
        return null;
    }

    @Override
    public List<ClientVendor> findAllByClientVendorName(String name) {
        return null;
    }

    @Override
    public List<ClientVendorDTO> findAllClients() {
        return null;
    }

    @Override
    public List<ClientVendorDTO> findAllVendors() {
        return null;
    }

    @Override
    public boolean findIfCompanyHasOpenInvoices(Long id) {
        return false;
    }

    @Override
    public Optional<ClientVendor> findClientVendorById(Long id) {
        return Optional.empty();
    }
}
