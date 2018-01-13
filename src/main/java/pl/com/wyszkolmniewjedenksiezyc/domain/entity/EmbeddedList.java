package pl.com.wyszkolmniewjedenksiezyc.domain.entity;

import lombok.Data;

import java.util.List;

@Data
public class EmbeddedList<T> {

    private List<T> list;

    public EmbeddedList(List<T> list) {
        this.list = list;
    }
}
