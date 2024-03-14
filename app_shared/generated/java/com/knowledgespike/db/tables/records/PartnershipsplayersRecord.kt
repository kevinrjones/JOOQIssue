/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.tables.records


import com.knowledgespike.db.tables.Partnershipsplayers

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PartnershipsplayersRecord() : UpdatableRecordImpl<PartnershipsplayersRecord>(Partnershipsplayers.PARTNERSHIPSPLAYERS) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var playerid: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var partnershipid: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    /**
     * Create a detached, initialised PartnershipsplayersRecord
     */
    constructor(id: Int? = null, playerid: Int? = null, partnershipid: Int? = null): this() {
        this.id = id
        this.playerid = playerid
        this.partnershipid = partnershipid
        resetChangedOnNotNull()
    }
}
