package com.cyberhuskies.domain;

//import jakarta.persistence.*;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "travel")
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "startDate")
    private String startDate;
    @Column(name = "finishDate")
    private String finishDate;
    @Column(name = "city")
    private String city;
    @Column(name = "coordinates")
    private String coordinates;

//    @OneToMany(
//            mappedBy="name"
//    )
//    private List<User> users = new ArrayList<>();
}
