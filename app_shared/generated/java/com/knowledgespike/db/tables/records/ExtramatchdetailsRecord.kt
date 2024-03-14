/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.tables.records


import com.knowledgespike.db.tables.Extramatchdetails

import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ExtramatchdetailsRecord() : TableRecordImpl<ExtramatchdetailsRecord>(Extramatchdetails.EXTRAMATCHDETAILS) {

    open var matchid: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var teamid: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var opponentsid: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var matchtype: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var result: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var homeaway: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    /**
     * Create a detached, initialised ExtramatchdetailsRecord
     */
    constructor(matchid: Int? = null, teamid: Int? = null, opponentsid: Int? = null, matchtype: String? = null, result: Int? = null, homeaway: Int? = null): this() {
        this.matchid = matchid
        this.teamid = teamid
        this.opponentsid = opponentsid
        this.matchtype = matchtype
        this.result = result
        this.homeaway = homeaway
        resetChangedOnNotNull()
    }
}
