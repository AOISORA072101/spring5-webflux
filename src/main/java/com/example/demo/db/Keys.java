/*
 * This file is generated by jOOQ.
*/
package com.example.demo.db;


import com.example.demo.db.tables.Faq;
import com.example.demo.db.tables.SchemaVersion;
import com.example.demo.db.tables.records.FaqRecord;
import com.example.demo.db.tables.records.SchemaVersionRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>spring</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<FaqRecord, Integer> IDENTITY_FAQ = Identities0.IDENTITY_FAQ;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FaqRecord> FAQ_PKEY = UniqueKeys0.FAQ_PKEY;
    public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = UniqueKeys0.SCHEMA_VERSION_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<FaqRecord, Integer> IDENTITY_FAQ = createIdentity(Faq.FAQ, Faq.FAQ.FAQ_ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<FaqRecord> FAQ_PKEY = createUniqueKey(Faq.FAQ, "faq_pkey", Faq.FAQ.FAQ_ID);
        public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = createUniqueKey(SchemaVersion.SCHEMA_VERSION, "schema_version_pk", SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
    }
}
