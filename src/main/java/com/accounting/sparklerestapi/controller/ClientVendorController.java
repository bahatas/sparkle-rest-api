package com.accounting.sparklerestapi.controller;

import com.accounting.sparklerestapi.dto.ClientVendorDTO;

import com.accounting.sparklerestapi.service.ClientVendorService;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/clientVendors")
public class ClientVendorController {

    private final ClientVendorService clientVendorService;

    public ClientVendorController(ClientVendorService clientVendorService) {
        this.clientVendorService = clientVendorService;
    }


//    @GetMapping("/list")
//    public ResponseEntity<ClientVendorDTO> clientVendorList(@PathVariable List<String> clientvendors){
//        List<ClientVendorDTO> clientVendors= clientVendorService.listAllClientVendors();
//
//        return ResponseEntity.ok(List<ClientVendorDTO>)
//
//    }
//    @GetMapping("/create")
//    public String createClientVendor(Model model){
//
//        model.addAttribute("newClientVendor", new ClientVendorDTO());
//        List<ClientVendorType> clientVendorTypes = Arrays.asList(ClientVendorType.values());
//        log.info("size of clientVendorTypes" +clientVendorTypes.size());
//        model.addAttribute("clientVendorTypes", Arrays.asList(ClientVendorType.values()));
//        model.addAttribute("countries", addressService.getListOfCountries() ); //added
//
//
//        return "clientVendor/clientVendor-create";
//    }
//    @PostMapping("/create")
//    public String insertClientVendor(@Valid @ModelAttribute("newClientVendor") ClientVendorDTO clientVendorDTO, BindingResult bindingResult, Model model){
//
//        if (bindingResult.hasErrors()){
//            List<ClientVendorType> clientVendorTypes = Arrays.asList(ClientVendorType.values());
//            log.info("size of clientVendorTypes" +clientVendorTypes.size());
//            model.addAttribute("clientVendorTypes", Arrays.asList(ClientVendorType.values()));
//            return "/clientVendor/clientVendor-create";
//        }
//        clientVendorService.save(clientVendorDTO);
//        return "redirect:/clientVendors/list";
//    }
//
//    @GetMapping("/update/{id}") //replaced clientVendorId with id
//    public String editClientVendor(@PathVariable("id") Long clientVendorId, Model model){
//
//        model.addAttribute("clientVendor", clientVendorService.findById(clientVendorId));
//        model.addAttribute("clientVendorTypes", Arrays.asList(ClientVendorType.values()));
//        model.addAttribute("countries", addressService.getListOfCountries() ); //added
//    return "clientVendor/clientVendor-update";
//    }
//
//    @PostMapping("/update/{id}") //replaced clientVendorId with id
//    public String editClientVendor( @Valid @ModelAttribute("clientVendor") ClientVendorDTO clientVendorDTO, @PathVariable("id") Long clientVendorId, BindingResult bindingResult, Model model){
//
//        if (bindingResult.hasErrors()){
//            model.addAttribute("clientVendor", clientVendorDTO);
//            model.addAttribute("clientVendor", clientVendorService.findById(clientVendorId));
//            model.addAttribute("clientVendorTypes", Arrays.asList(ClientVendorType.values()));
//            return "clientVendor/clientVendor-update";
//        }
//        clientVendorDTO.setId(clientVendorId);
//        clientVendorService.update(clientVendorDTO);
//        return "redirect:/clientVendors/list";
//
//    }
//    @GetMapping("/delete/{id}") //replaced clientVendorId with id
//    public String deleteClientVendorById(@PathVariable("id") Long clientVendorId, RedirectAttributes redirectAttributes, Model model) throws IllegalAccessException {
//        if (clientVendorService.findIfCompanyHasOpenInvoices(clientVendorId)){
//            String error="cannot delete client/vendor linked to open invoice";
//            redirectAttributes.addFlashAttribute("error", error);
//
//            model.addAttribute("error",error);
//;
//            return "redirect:/clientVendors/list";
//        }
//        clientVendorService.delete(clientVendorId);
//        return "redirect:/clientVendors/list";
//    }




}
