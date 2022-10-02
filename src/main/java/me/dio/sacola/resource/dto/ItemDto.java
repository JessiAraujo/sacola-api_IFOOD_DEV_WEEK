package me.dio.sacola.resource.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@NoArgsConstructor

public class ItemDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long produtoid;
    private int quantidade;
    private long idsacola;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
