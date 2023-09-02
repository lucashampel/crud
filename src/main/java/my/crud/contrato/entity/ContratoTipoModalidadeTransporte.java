package my.crud.contrato.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "CONTRATO_TP_MODALIDADE_TRANPORTE")
@Data
public class ContratoTipoModalidadeTransporte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sqContrato;

    @Column(name = "NR_CONTRATO")
    private String sqTipoModalidade;


}
