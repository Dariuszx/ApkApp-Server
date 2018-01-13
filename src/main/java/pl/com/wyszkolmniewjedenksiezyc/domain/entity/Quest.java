package pl.com.wyszkolmniewjedenksiezyc.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Quest {

    private @Id @GeneratedValue Long id;
    private @OneToOne Localization localization;
    private String name;
    private String imgUrl;
    private int value;

}
