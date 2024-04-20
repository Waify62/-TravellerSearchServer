package com.cyberhuskies.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "photoUrl")
    private String photoUrl;

    @OneToMany(
        mappedBy="socialMediaURI",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<ContactUri> contactInfo = new ArrayList<>();

    @Column(name = "profileDesc")
    private String profileDesc;
}