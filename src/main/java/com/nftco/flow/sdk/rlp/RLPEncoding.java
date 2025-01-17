package com.nftco.flow.sdk.rlp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Comparator;

@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RLPEncoding {
    Class<? extends RLPEncoder> value() default RLPEncoder.None.class;

    Class<? extends Comparator> keyOrdering() default None.class;

    class None implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
