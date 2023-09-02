package my.crud.contrato.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CONTRATO")
@Data
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sqContrato;

    @Column(name = "NR_CONTRATO")
    private String nrContrato;


}
