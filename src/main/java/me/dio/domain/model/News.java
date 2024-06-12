package me.dio.domain.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "tb_news")
@NoArgsConstructor
@Getter
public class News extends BaseItem{

}
