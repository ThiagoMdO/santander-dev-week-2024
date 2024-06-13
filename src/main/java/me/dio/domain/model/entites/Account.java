package me.dio.domain.model.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "tb_account")
@NoArgsConstructor
@Getter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(nullable = false,
            scale = 2)
    private Double balance;

    @Column(name = "additional_limit",
            nullable = false,
            precision = 2)
    private Double limit;

}
