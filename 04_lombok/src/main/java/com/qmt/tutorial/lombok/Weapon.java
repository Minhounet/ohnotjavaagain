package com.qmt.tutorial.lombok;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode
@Value
public class Weapon {
    String name;
    int size;
}
