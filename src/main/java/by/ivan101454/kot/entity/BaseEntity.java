package by.ivan101454.kot.entity;

import java.io.Serializable;

public interface BaseEntity<T> extends Serializable {
    T getId();
    void setId(T id);
}
