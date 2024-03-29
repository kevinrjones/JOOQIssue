/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.tables.records


import com.knowledgespike.db.tables.Umpires

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class UmpiresRecord() : UpdatableRecordImpl<UmpiresRecord>(Umpires.UMPIRES) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var umpiresid: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var fullname: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var sortnamepart: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var othernamepart: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var debutmatchid: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    /**
     * Create a detached, initialised UmpiresRecord
     */
    constructor(id: Int? = null, umpiresid: Int? = null, fullname: String? = null, sortnamepart: String? = null, othernamepart: String? = null, debutmatchid: String? = null): this() {
        this.id = id
        this.umpiresid = umpiresid
        this.fullname = fullname
        this.sortnamepart = sortnamepart
        this.othernamepart = othernamepart
        this.debutmatchid = debutmatchid
        resetChangedOnNotNull()
    }
}
