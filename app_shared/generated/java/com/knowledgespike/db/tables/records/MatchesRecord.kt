/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.tables.records


import com.knowledgespike.db.tables.Matches

import java.time.LocalDate
import java.time.LocalDateTime

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class MatchesRecord() : UpdatableRecordImpl<MatchesRecord>(Matches.MATCHES) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var caid: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var caurl: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var filename: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var matchinseries: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var seriesnumber: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    open var matchtype: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var hometeamid: Int?
        set(value): Unit = set(7, value)
        get(): Int? = get(7) as Int?

    open var hometeamname: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var awayteamid: Int?
        set(value): Unit = set(9, value)
        get(): Int? = get(9) as Int?

    open var awayteamname: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var isneutral: Byte?
        set(value): Unit = set(11, value)
        get(): Byte? = get(11) as Byte?

    open var matchdesignator: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var matchtitle: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    open var tournament: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    open var location: String?
        set(value): Unit = set(15, value)
        get(): String? = get(15) as String?

    open var locationid: Int?
        set(value): Unit = set(16, value)
        get(): Int? = get(16) as Int?

    open var groundnameid: Int?
        set(value): Unit = set(17, value)
        get(): Int? = get(17) as Int?

    open var tossteamid: Int?
        set(value): Unit = set(18, value)
        get(): Int? = get(18) as Int?

    open var matchdate: String?
        set(value): Unit = set(19, value)
        get(): String? = get(19) as String?

    open var seriesdate: String?
        set(value): Unit = set(20, value)
        get(): String? = get(20) as String?

    open var matchstartyear: String?
        set(value): Unit = set(21, value)
        get(): String? = get(21) as String?

    open var matchstartdate: LocalDate?
        set(value): Unit = set(22, value)
        get(): LocalDate? = get(22) as LocalDate?

    open var matchstartdateasoffset: Long?
        set(value): Unit = set(23, value)
        get(): Long? = get(23) as Long?

    open var resultstring: String?
        set(value): Unit = set(24, value)
        get(): String? = get(24) as String?

    open var homecountryid: Int?
        set(value): Unit = set(25, value)
        get(): Int? = get(25) as Int?

    open var whowonid: Int?
        set(value): Unit = set(26, value)
        get(): Int? = get(26) as Int?

    open var wholostid: Int?
        set(value): Unit = set(27, value)
        get(): Int? = get(27) as Int?

    open var howmuch: Int?
        set(value): Unit = set(28, value)
        get(): Int? = get(28) as Int?

    open var marginforsort: Int?
        set(value): Unit = set(29, value)
        get(): Int? = get(29) as Int?

    open var victorytype: Int?
        set(value): Unit = set(30, value)
        get(): Int? = get(30) as Int?

    open var duration: Int?
        set(value): Unit = set(31, value)
        get(): Int? = get(31) as Int?

    open var ballsperover: Int?
        set(value): Unit = set(32, value)
        get(): Int? = get(32) as Int?

    open var daynight: Byte?
        set(value): Unit = set(33, value)
        get(): Byte? = get(33) as Byte?

    open var oversreduced: Byte?
        set(value): Unit = set(34, value)
        get(): Byte? = get(34) as Byte?

    open var addeddate: LocalDateTime?
        set(value): Unit = set(35, value)
        get(): LocalDateTime? = get(35) as LocalDateTime?

    open var addeddateasoffset: Long?
        set(value): Unit = set(36, value)
        get(): Long? = get(36) as Long?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    /**
     * Create a detached, initialised MatchesRecord
     */
    constructor(id: Int? = null, caid: String? = null, caurl: String? = null, filename: String? = null, matchinseries: Int? = null, seriesnumber: Int? = null, matchtype: String? = null, hometeamid: Int? = null, hometeamname: String? = null, awayteamid: Int? = null, awayteamname: String? = null, isneutral: Byte? = null, matchdesignator: String? = null, matchtitle: String? = null, tournament: String? = null, location: String? = null, locationid: Int? = null, groundnameid: Int? = null, tossteamid: Int? = null, matchdate: String? = null, seriesdate: String? = null, matchstartyear: String? = null, matchstartdate: LocalDate? = null, matchstartdateasoffset: Long? = null, resultstring: String? = null, homecountryid: Int? = null, whowonid: Int? = null, wholostid: Int? = null, howmuch: Int? = null, marginforsort: Int? = null, victorytype: Int? = null, duration: Int? = null, ballsperover: Int? = null, daynight: Byte? = null, oversreduced: Byte? = null, addeddate: LocalDateTime? = null, addeddateasoffset: Long? = null): this() {
        this.id = id
        this.caid = caid
        this.caurl = caurl
        this.filename = filename
        this.matchinseries = matchinseries
        this.seriesnumber = seriesnumber
        this.matchtype = matchtype
        this.hometeamid = hometeamid
        this.hometeamname = hometeamname
        this.awayteamid = awayteamid
        this.awayteamname = awayteamname
        this.isneutral = isneutral
        this.matchdesignator = matchdesignator
        this.matchtitle = matchtitle
        this.tournament = tournament
        this.location = location
        this.locationid = locationid
        this.groundnameid = groundnameid
        this.tossteamid = tossteamid
        this.matchdate = matchdate
        this.seriesdate = seriesdate
        this.matchstartyear = matchstartyear
        this.matchstartdate = matchstartdate
        this.matchstartdateasoffset = matchstartdateasoffset
        this.resultstring = resultstring
        this.homecountryid = homecountryid
        this.whowonid = whowonid
        this.wholostid = wholostid
        this.howmuch = howmuch
        this.marginforsort = marginforsort
        this.victorytype = victorytype
        this.duration = duration
        this.ballsperover = ballsperover
        this.daynight = daynight
        this.oversreduced = oversreduced
        this.addeddate = addeddate
        this.addeddateasoffset = addeddateasoffset
        resetChangedOnNotNull()
    }
}
