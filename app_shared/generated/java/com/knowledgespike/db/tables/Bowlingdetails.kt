/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.tables


import com.knowledgespike.db.Cricketarchive
import com.knowledgespike.db.indexes.BOWLINGDETAILS_BALLS
import com.knowledgespike.db.indexes.BOWLINGDETAILS_DOTS
import com.knowledgespike.db.indexes.BOWLINGDETAILS_FOURS
import com.knowledgespike.db.indexes.BOWLINGDETAILS_GROUNDID
import com.knowledgespike.db.indexes.BOWLINGDETAILS_MAIDENS
import com.knowledgespike.db.indexes.BOWLINGDETAILS_MATCHID
import com.knowledgespike.db.indexes.BOWLINGDETAILS_MATCHTYPE
import com.knowledgespike.db.indexes.BOWLINGDETAILS_NOBALLS
import com.knowledgespike.db.indexes.BOWLINGDETAILS_OPPONENTSID
import com.knowledgespike.db.indexes.BOWLINGDETAILS_PLAYERID
import com.knowledgespike.db.indexes.BOWLINGDETAILS_RUNS
import com.knowledgespike.db.indexes.BOWLINGDETAILS_SIXES
import com.knowledgespike.db.indexes.BOWLINGDETAILS_TEAMID
import com.knowledgespike.db.indexes.BOWLINGDETAILS_WICKETS
import com.knowledgespike.db.indexes.BOWLINGDETAILS_WIDES
import com.knowledgespike.db.keys.BOWLINGDETAILS_IBFK_1
import com.knowledgespike.db.keys.BOWLINGDETAILS_IBFK_2
import com.knowledgespike.db.keys.BOWLINGDETAILS_IBFK_3
import com.knowledgespike.db.keys.BOWLINGDETAILS_IBFK_4
import com.knowledgespike.db.keys.BOWLINGDETAILS_IBFK_5
import com.knowledgespike.db.keys.KEY_BOWLINGDETAILS_PRIMARY
import com.knowledgespike.db.tables.Grounds.GroundsPath
import com.knowledgespike.db.tables.Matches.MatchesPath
import com.knowledgespike.db.tables.Players.PlayersPath
import com.knowledgespike.db.tables.Teams.TeamsPath
import com.knowledgespike.db.tables.records.BowlingdetailsRecord

import java.math.BigDecimal

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Bowlingdetails(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, BowlingdetailsRecord>?,
    parentPath: InverseForeignKey<out Record, BowlingdetailsRecord>?,
    aliased: Table<BowlingdetailsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<BowlingdetailsRecord>(
    alias,
    Cricketarchive.CRICKETARCHIVE,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>cricketarchive.BowlingDetails</code>
         */
        val BOWLINGDETAILS: Bowlingdetails = Bowlingdetails()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<BowlingdetailsRecord> = BowlingdetailsRecord::class.java

    /**
     * The column <code>cricketarchive.BowlingDetails.Id</code>.
     */
    val ID: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("Id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.MatchId</code>.
     */
    val MATCHID: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("MatchId"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.GroundId</code>.
     */
    val GROUNDID: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("GroundId"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.SeriesDate</code>.
     */
    val SERIESDATE: TableField<BowlingdetailsRecord, String?> = createField(DSL.name("SeriesDate"), SQLDataType.VARCHAR(200).nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.MatchType</code>.
     */
    val MATCHTYPE: TableField<BowlingdetailsRecord, String?> = createField(DSL.name("MatchType"), SQLDataType.VARCHAR(5).nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.PlayerId</code>.
     */
    val PLAYERID: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("PlayerId"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.Name</code>.
     */
    val NAME: TableField<BowlingdetailsRecord, String?> = createField(DSL.name("Name"), SQLDataType.VARCHAR(200).nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.DidBowl</code>.
     */
    val DIDBOWL: TableField<BowlingdetailsRecord, Byte?> = createField(DSL.name("DidBowl"), SQLDataType.TINYINT.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.Position</code>.
     */
    val POSITION: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("Position"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.TeamId</code>.
     */
    val TEAMID: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("TeamId"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.OpponentsId</code>.
     */
    val OPPONENTSID: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("OpponentsId"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.IsNeutral</code>.
     */
    val ISNEUTRAL: TableField<BowlingdetailsRecord, Byte?> = createField(DSL.name("IsNeutral"), SQLDataType.TINYINT.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.InningsNumber</code>.
     */
    val INNINGSNUMBER: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("InningsNumber"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.InningsOrder</code>.
     */
    val INNINGSORDER: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("InningsOrder"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.Overs</code>.
     */
    val OVERS: TableField<BowlingdetailsRecord, String?> = createField(DSL.name("Overs"), SQLDataType.VARCHAR(10).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.Balls</code>.
     */
    val BALLS: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("Balls"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.Maidens</code>.
     */
    val MAIDENS: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("Maidens"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.Runs</code>.
     */
    val RUNS: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("Runs"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.Wickets</code>.
     */
    val WICKETS: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("Wickets"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.Wides</code>.
     */
    val WIDES: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("Wides"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.NoBalls</code>.
     */
    val NOBALLS: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("NoBalls"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.Dots</code>.
     */
    val DOTS: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("Dots"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.Fours</code>.
     */
    val FOURS: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("Fours"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.Sixes</code>.
     */
    val SIXES: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("Sixes"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.TenFor</code>.
     */
    val TENFOR: TableField<BowlingdetailsRecord, Byte?> = createField(DSL.name("TenFor"), SQLDataType.TINYINT.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.TINYINT)), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.Captain</code>.
     */
    val CAPTAIN: TableField<BowlingdetailsRecord, Byte?> = createField(DSL.name("Captain"), SQLDataType.TINYINT.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.BowlingDetails.TeamCaptain</code>.
     */
    val TEAMCAPTAIN: TableField<BowlingdetailsRecord, Int?> = createField(DSL.name("TeamCaptain"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column
     * <code>cricketarchive.BowlingDetails.SyntheticBestBowling</code>.
     */
    val SYNTHETICBESTBOWLING: TableField<BowlingdetailsRecord, BigDecimal?> = createField(DSL.name("SyntheticBestBowling"), SQLDataType.DECIMAL(14, 12).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.DECIMAL)), this, "")

    private constructor(alias: Name, aliased: Table<BowlingdetailsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<BowlingdetailsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<BowlingdetailsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>cricketarchive.BowlingDetails</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>cricketarchive.BowlingDetails</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>cricketarchive.BowlingDetails</code> table reference
     */
    constructor(): this(DSL.name("BowlingDetails"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, BowlingdetailsRecord>?, parentPath: InverseForeignKey<out Record, BowlingdetailsRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, BOWLINGDETAILS, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class BowlingdetailsPath : Bowlingdetails, Path<BowlingdetailsRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, BowlingdetailsRecord>?, parentPath: InverseForeignKey<out Record, BowlingdetailsRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<BowlingdetailsRecord>): super(alias, aliased)
        override fun `as`(alias: String): BowlingdetailsPath = BowlingdetailsPath(DSL.name(alias), this)
        override fun `as`(alias: Name): BowlingdetailsPath = BowlingdetailsPath(alias, this)
        override fun `as`(alias: Table<*>): BowlingdetailsPath = BowlingdetailsPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Cricketarchive.CRICKETARCHIVE
    override fun getIndexes(): List<Index> = listOf(BOWLINGDETAILS_BALLS, BOWLINGDETAILS_DOTS, BOWLINGDETAILS_FOURS, BOWLINGDETAILS_GROUNDID, BOWLINGDETAILS_MAIDENS, BOWLINGDETAILS_MATCHID, BOWLINGDETAILS_MATCHTYPE, BOWLINGDETAILS_NOBALLS, BOWLINGDETAILS_OPPONENTSID, BOWLINGDETAILS_PLAYERID, BOWLINGDETAILS_RUNS, BOWLINGDETAILS_SIXES, BOWLINGDETAILS_TEAMID, BOWLINGDETAILS_WICKETS, BOWLINGDETAILS_WIDES)
    override fun getIdentity(): Identity<BowlingdetailsRecord, Int?> = super.getIdentity() as Identity<BowlingdetailsRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<BowlingdetailsRecord> = KEY_BOWLINGDETAILS_PRIMARY
    override fun getReferences(): List<ForeignKey<BowlingdetailsRecord, *>> = listOf(BOWLINGDETAILS_IBFK_1, BOWLINGDETAILS_IBFK_5, BOWLINGDETAILS_IBFK_2, BOWLINGDETAILS_IBFK_3, BOWLINGDETAILS_IBFK_4)

    private lateinit var _matches: MatchesPath

    /**
     * Get the implicit join path to the <code>cricketarchive.Matches</code>
     * table.
     */
    fun matches(): MatchesPath {
        if (!this::_matches.isInitialized)
            _matches = MatchesPath(this, BOWLINGDETAILS_IBFK_1, null)

        return _matches;
    }

    val matches: MatchesPath
        get(): MatchesPath = matches()

    private lateinit var _grounds: GroundsPath

    /**
     * Get the implicit join path to the <code>cricketarchive.Grounds</code>
     * table.
     */
    fun grounds(): GroundsPath {
        if (!this::_grounds.isInitialized)
            _grounds = GroundsPath(this, BOWLINGDETAILS_IBFK_5, null)

        return _grounds;
    }

    val grounds: GroundsPath
        get(): GroundsPath = grounds()

    private lateinit var _players: PlayersPath

    /**
     * Get the implicit join path to the <code>cricketarchive.Players</code>
     * table.
     */
    fun players(): PlayersPath {
        if (!this::_players.isInitialized)
            _players = PlayersPath(this, BOWLINGDETAILS_IBFK_2, null)

        return _players;
    }

    val players: PlayersPath
        get(): PlayersPath = players()

    private lateinit var _bowlingdetailsIbfk_3: TeamsPath

    /**
     * Get the implicit join path to the <code>cricketarchive.Teams</code>
     * table, via the <code>bowlingdetails_ibfk_3</code> key.
     */
    fun bowlingdetailsIbfk_3(): TeamsPath {
        if (!this::_bowlingdetailsIbfk_3.isInitialized)
            _bowlingdetailsIbfk_3 = TeamsPath(this, BOWLINGDETAILS_IBFK_3, null)

        return _bowlingdetailsIbfk_3;
    }

    val bowlingdetailsIbfk_3: TeamsPath
        get(): TeamsPath = bowlingdetailsIbfk_3()

    private lateinit var _bowlingdetailsIbfk_4: TeamsPath

    /**
     * Get the implicit join path to the <code>cricketarchive.Teams</code>
     * table, via the <code>bowlingdetails_ibfk_4</code> key.
     */
    fun bowlingdetailsIbfk_4(): TeamsPath {
        if (!this::_bowlingdetailsIbfk_4.isInitialized)
            _bowlingdetailsIbfk_4 = TeamsPath(this, BOWLINGDETAILS_IBFK_4, null)

        return _bowlingdetailsIbfk_4;
    }

    val bowlingdetailsIbfk_4: TeamsPath
        get(): TeamsPath = bowlingdetailsIbfk_4()
    override fun `as`(alias: String): Bowlingdetails = Bowlingdetails(DSL.name(alias), this)
    override fun `as`(alias: Name): Bowlingdetails = Bowlingdetails(alias, this)
    override fun `as`(alias: Table<*>): Bowlingdetails = Bowlingdetails(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Bowlingdetails = Bowlingdetails(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Bowlingdetails = Bowlingdetails(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Bowlingdetails = Bowlingdetails(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Bowlingdetails = Bowlingdetails(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Bowlingdetails = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Bowlingdetails = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Bowlingdetails = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Bowlingdetails = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Bowlingdetails = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Bowlingdetails = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Bowlingdetails = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Bowlingdetails = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Bowlingdetails = where(DSL.notExists(select))
}