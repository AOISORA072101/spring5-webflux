/*
 * This file is generated by jOOQ.
*/
package com.example.demo.db;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in spring
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>spring.faq_faq_id_seq</code>
     */
    public static final Sequence<Long> FAQ_FAQ_ID_SEQ = new SequenceImpl<Long>("faq_faq_id_seq", Spring.SPRING, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
