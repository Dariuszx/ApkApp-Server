package pl.com.wyszkolmniewjedenksiezyc.domain.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class UserQuest {

    private @Id @GeneratedValue Long id;
    private @OneToOne User userId;
    private @OneToOne Quest quest;
    private boolean status;
}
