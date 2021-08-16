package com.agency04.sbss.pizza.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "pizzaType",
        defaultImpl = EmptyPizza.class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Margherita.class, name = "Margherita"),
        @JsonSubTypes.Type(value = Marinara.class, name = "Marinara"),
        @JsonSubTypes.Type(value = QuattroStagioni.class,name = "QuattroStagioni")
})
public interface Pizza {

    public String getName();
    public String getIngredients();
}