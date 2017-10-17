package com.lambda.enums;

import com.lambda.repository.adventurer;
import com.lambda.repository.frostMage;
import com.lambda.repository.priests;
import com.lambda.repository.warrior;

import java.util.function.Supplier;

/**
 * <p>Description : design-pattern-module
 * <p>Date : 2017/10/18 6:58
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public enum adventEnum {
    WARRIOR(warrior::new),
    MAGE_FROST(frostMage::new),
    PRIESTS(priests::new);

    private final Supplier<adventurer> constructor;

    adventEnum(Supplier<adventurer> constructor) {
        this.constructor = constructor;
    }

    public Supplier<adventurer> getConstructor() {
        return constructor;
    }
}
