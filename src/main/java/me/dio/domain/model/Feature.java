package me.dio.domain.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "tb_feature")
@NoArgsConstructor
@Getter
public class Feature extends BaseItem{

}
