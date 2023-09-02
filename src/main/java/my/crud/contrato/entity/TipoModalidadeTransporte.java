package my.crud.contrato.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TP_MODALIDADE_TRANPORTE")
@Data
public class TipoModalidadeTransporte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sqTipoModalidade;

    @Column(name = "NM_MODALIDADE")
    private String nmModalidade;


}