package pl.com.wyszkolmniewjedenksiezyc.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Item {

    private @Id @GeneratedValue Long id;
    private @OneToOne Localization localization;
//    private @OneToOne ItemDict item;
    private String name;
    private int value;
    private boolean visibility;
}
