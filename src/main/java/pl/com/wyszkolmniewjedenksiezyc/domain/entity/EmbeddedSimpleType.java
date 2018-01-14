package pl.com.wyszkolmniewjedenksiezyc.domain.entity;

import lombok.Data;

@Data
public class EmbeddedSimpleType<T> {

    private T value;

    public EmbeddedSimpleType() {}

    public EmbeddedSimpleType(T value) {
        this.value = value;
    }
}
