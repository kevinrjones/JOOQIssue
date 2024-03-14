/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.tables.records


import com.knowledgespike.db.tables.Partnerships

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PartnershipsRecord() : UpdatableRecordImpl<PartnershipsRecord>(Partnerships.PARTNERSHIPS) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var matchid: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var matchtype: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var teamid: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    open var opponentsid: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var innings: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    open var inningsorder: Int?
        set(value): Unit = set(6, value)
        get(): Int? = get(6) as Int?

    open var wicket: Int?
        set(value): Unit = set(7, value)
        get(): Int? = get(7) as Int?

    open var partnership: Int?
        set(value): Unit = set(8, value)
        get(): Int? = get(8) as Int?

    open var previouswicket: Int?
        set(value): Unit = set(9, value)
        get(): Int? = get(9) as Int?

    open var previousscore: Int?
        set(value): Unit = set(10, value)
        get(): Int? = get(10) as Int?

    open var playerids: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var playernames: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var currentscore: Int?
        set(value): Unit = set(13, value)
        get(): Int? = get(13) as Int?

    open var fifty: Byte?
        set(value): Unit = set(14, value)
        get(): Byte? = get(14) as Byte?

    open var hundred: Byte?
        set(value): Unit = set(15, value)
        get(): Byte? = get(15) as Byte?

    open var unbroken: Int?
        set(value): Unit = set(16, value)
        get(): Int? = get(16) as Int?

    open var multiple: Byte?
        set(value): Unit = set(17, value)
        get(): Byte? = get(17) as Byte?

    open var partial: Byte?
        set(value): Unit = set(18, value)
        get(): Byte? = get(18) as Byte?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    /**
     * Create a detached, initialised PartnershipsRecord
     */
    constructor(id: Int? = null, matchid: Int? = null, matchtype: String? = null, teamid: Int? = null, opponentsid: Int? = null, innings: Int? = null, inningsorder: Int? = null, wicket: Int? = null, partnership: Int? = null, previouswicket: Int? = null, previousscore: Int? = null, playerids: String? = null, playernames: String? = null, currentscore: Int? = null, fifty: Byte? = null, hundred: Byte? = null, unbroken: Int? = null, multiple: Byte? = null, partial: Byte? = null): this() {
        this.id = id
        this.matchid = matchid
        this.matchtype = matchtype
        this.teamid = teamid
        this.opponentsid = opponentsid
        this.innings = innings
        this.inningsorder = inningsorder
        this.wicket = wicket
        this.partnership = partnership
        this.previouswicket = previouswicket
        this.previousscore = previousscore
        this.playerids = playerids
        this.playernames = playernames
        this.currentscore = currentscore
        this.fifty = fifty
        this.hundred = hundred
        this.unbroken = unbroken
        this.multiple = multiple
        this.partial = partial
        resetChangedOnNotNull()
    }
}