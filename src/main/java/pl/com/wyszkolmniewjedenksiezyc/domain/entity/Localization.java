package pl.com.wyszkolmniewjedenksiezyc.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Localization {

    private @Id @GeneratedValue Long id;
    private BigDecimal longitude;
    private BigDecimal latitude;
}
