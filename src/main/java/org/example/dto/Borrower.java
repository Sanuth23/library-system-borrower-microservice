package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Borrower {
    private Long id;
    private String name;
    private String contactNumber;
    private String nic;
    private String email;
    private String address;
    private String country;
    private String username;
    private String password;
}
