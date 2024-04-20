package com.cyberhuskies.domain;


//import jakarta.persistence.*;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contactUri")
public class ContactUri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "socialMediaName")
    private String socialMediaName;

    @Column(name = "socialMediaURI")
    private String socialMediaURI;

    @ManyToOne
    @JoinColumn(
            name="user_id"
    )
    private User user;
}
