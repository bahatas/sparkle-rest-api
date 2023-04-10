package com.accounting.sparklerestapi.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientVendorDTO {

    private Long id;
  private String clientVendorName;

 private String phone;
 private String website;

// private ClientVendorType clientVendorType;
//private AddressDTO address;
// private CompanyDTO company;
}
