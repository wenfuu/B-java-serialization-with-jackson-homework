package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonVo {

    private String id;
    private Integer age;
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String hobby;

    public Integer getAge() {
        if (age == null) {
            return 0;
        } else {
            return this.age;
        }
    }
}
