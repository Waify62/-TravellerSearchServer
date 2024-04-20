package com.cyberhuskies.domain;

//import jakarta.persistence.*;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "photoUrl")
    private String photoUrl;

    @OneToMany(
        mappedBy="socialMediaName",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<ContactUri> contactUris = new ArrayList<>();

    @ManyToMany(
            mappedBy="city",
            cascade = CascadeType.ALL
    )
    private List<Travel> travels = new ArrayList<>();

    @Column(name = "profileDesc")
    private String profileDesc;
}