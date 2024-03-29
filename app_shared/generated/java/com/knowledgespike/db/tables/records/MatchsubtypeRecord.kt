/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.tables.records


import com.knowledgespike.db.tables.Matchsubtype

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class MatchsubtypeRecord() : UpdatableRecordImpl<MatchsubtypeRecord>(Matchsubtype.MATCHSUBTYPE) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var matchtype: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var matchid: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    /**
     * Create a detached, initialised MatchsubtypeRecord
     */
    constructor(id: Int? = null, matchtype: String? = null, matchid: Int? = null): this() {
        this.id = id
        this.matchtype = matchtype
        this.matchid = matchid
        resetChangedOnNotNull()
    }
}
