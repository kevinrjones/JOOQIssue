/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.tables


import com.knowledgespike.db.Cricketarchive
import com.knowledgespike.db.indexes.TEAMS_TEAMID
import com.knowledgespike.db.keys.BATTINGDETAILS_IBFK_4
import com.knowledgespike.db.keys.BOWLINGDETAILS_IBFK_3
import com.knowledgespike.db.keys.BOWLINGDETAILS_IBFK_4
import com.knowledgespike.db.keys.EXTRAMATCHDETAILS_IBFK_1
import com.knowledgespike.db.keys.EXTRAMATCHDETAILS_IBFK_2
import com.knowledgespike.db.keys.FALLOFWICKETS_IBFK_3
import com.knowledgespike.db.keys.FALLOFWICKETS_IBFK_4
import com.knowledgespike.db.keys.FIELDING_IBFK_3
import com.knowledgespike.db.keys.FIELDING_IBFK_4
import com.knowledgespike.db.keys.INNINGS_IBFK_2
import com.knowledgespike.db.keys.INNINGS_IBFK_3
import com.knowledgespike.db.keys.KEY_TEAMS_PRIMARY
import com.knowledgespike.db.keys.MATCHES_IBFK_1
import com.knowledgespike.db.keys.MATCHES_IBFK_2
import com.knowledgespike.db.keys.MATCHES_IBFK_3
import com.knowledgespike.db.keys.MATCHES_IBFK_4
import com.knowledgespike.db.keys.MATCHES_IBFK_5
import com.knowledgespike.db.keys.PARTNERSHIPS_IBFK_2
import com.knowledgespike.db.keys.PARTNERSHIPS_IBFK_3
import com.knowledgespike.db.keys.PLAYERSTEAMS_IBFK_2
import com.knowledgespike.db.keys.TEAMSMATCHTYPES_IBFK_1
import com.knowledgespike.db.tables.Battingdetails.BattingdetailsPath
import com.knowledgespike.db.tables.Bowlingdetails.BowlingdetailsPath
import com.knowledgespike.db.tables.Extramatchdetails.ExtramatchdetailsPath
import com.knowledgespike.db.tables.Fallofwickets.FallofwicketsPath
import com.knowledgespike.db.tables.Fielding.FieldingPath
import com.knowledgespike.db.tables.Innings.InningsPath
import com.knowledgespike.db.tables.Matches.MatchesPath
import com.knowledgespike.db.tables.Partnerships.PartnershipsPath
import com.knowledgespike.db.tables.Playersteams.PlayersteamsPath
import com.knowledgespike.db.tables.Teamsmatchtypes.TeamsmatchtypesPath
import com.knowledgespike.db.tables.records.TeamsRecord

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
open class Teams(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, TeamsRecord>?,
    parentPath: InverseForeignKey<out Record, TeamsRecord>?,
    aliased: Table<TeamsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<TeamsRecord>(
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
         * The reference instance of <code>cricketarchive.Teams</code>
         */
        val TEAMS: Teams = Teams()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TeamsRecord> = TeamsRecord::class.java

    /**
     * The column <code>cricketarchive.Teams.Id</code>.
     */
    val ID: TableField<TeamsRecord, Int?> = createField(DSL.name("Id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>cricketarchive.Teams.Name</code>.
     */
    val NAME: TableField<TeamsRecord, String?> = createField(DSL.name("Name"), SQLDataType.VARCHAR(100).nullable(false), this, "")

    /**
     * The column <code>cricketarchive.Teams.TeamId</code>.
     */
    val TEAMID: TableField<TeamsRecord, Int?> = createField(DSL.name("TeamId"), SQLDataType.INTEGER.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<TeamsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<TeamsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<TeamsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>cricketarchive.Teams</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>cricketarchive.Teams</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>cricketarchive.Teams</code> table reference
     */
    constructor(): this(DSL.name("Teams"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, TeamsRecord>?, parentPath: InverseForeignKey<out Record, TeamsRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, TEAMS, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class TeamsPath : Teams, Path<TeamsRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, TeamsRecord>?, parentPath: InverseForeignKey<out Record, TeamsRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<TeamsRecord>): super(alias, aliased)
        override fun `as`(alias: String): TeamsPath = TeamsPath(DSL.name(alias), this)
        override fun `as`(alias: Name): TeamsPath = TeamsPath(alias, this)
        override fun `as`(alias: Table<*>): TeamsPath = TeamsPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Cricketarchive.CRICKETARCHIVE
    override fun getIndexes(): List<Index> = listOf(TEAMS_TEAMID)
    override fun getIdentity(): Identity<TeamsRecord, Int?> = super.getIdentity() as Identity<TeamsRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<TeamsRecord> = KEY_TEAMS_PRIMARY

    private lateinit var _battingdetails: BattingdetailsPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.BattingDetails</code> table
     */
    fun battingdetails(): BattingdetailsPath {
        if (!this::_battingdetails.isInitialized)
            _battingdetails = BattingdetailsPath(this, null, BATTINGDETAILS_IBFK_4.inverseKey)

        return _battingdetails;
    }

    val battingdetails: BattingdetailsPath
        get(): BattingdetailsPath = battingdetails()

    private lateinit var _bowlingdetailsIbfk_3: BowlingdetailsPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.BowlingDetails</code> table, via the
     * <code>bowlingdetails_ibfk_3</code> key
     */
    fun bowlingdetailsIbfk_3(): BowlingdetailsPath {
        if (!this::_bowlingdetailsIbfk_3.isInitialized)
            _bowlingdetailsIbfk_3 = BowlingdetailsPath(this, null, BOWLINGDETAILS_IBFK_3.inverseKey)

        return _bowlingdetailsIbfk_3;
    }

    val bowlingdetailsIbfk_3: BowlingdetailsPath
        get(): BowlingdetailsPath = bowlingdetailsIbfk_3()

    private lateinit var _bowlingdetailsIbfk_4: BowlingdetailsPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.BowlingDetails</code> table, via the
     * <code>bowlingdetails_ibfk_4</code> key
     */
    fun bowlingdetailsIbfk_4(): BowlingdetailsPath {
        if (!this::_bowlingdetailsIbfk_4.isInitialized)
            _bowlingdetailsIbfk_4 = BowlingdetailsPath(this, null, BOWLINGDETAILS_IBFK_4.inverseKey)

        return _bowlingdetailsIbfk_4;
    }

    val bowlingdetailsIbfk_4: BowlingdetailsPath
        get(): BowlingdetailsPath = bowlingdetailsIbfk_4()

    private lateinit var _extramatchdetailsIbfk_1: ExtramatchdetailsPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.ExtraMatchDetails</code> table, via the
     * <code>extramatchdetails_ibfk_1</code> key
     */
    fun extramatchdetailsIbfk_1(): ExtramatchdetailsPath {
        if (!this::_extramatchdetailsIbfk_1.isInitialized)
            _extramatchdetailsIbfk_1 = ExtramatchdetailsPath(this, null, EXTRAMATCHDETAILS_IBFK_1.inverseKey)

        return _extramatchdetailsIbfk_1;
    }

    val extramatchdetailsIbfk_1: ExtramatchdetailsPath
        get(): ExtramatchdetailsPath = extramatchdetailsIbfk_1()

    private lateinit var _extramatchdetailsIbfk_2: ExtramatchdetailsPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.ExtraMatchDetails</code> table, via the
     * <code>extramatchdetails_ibfk_2</code> key
     */
    fun extramatchdetailsIbfk_2(): ExtramatchdetailsPath {
        if (!this::_extramatchdetailsIbfk_2.isInitialized)
            _extramatchdetailsIbfk_2 = ExtramatchdetailsPath(this, null, EXTRAMATCHDETAILS_IBFK_2.inverseKey)

        return _extramatchdetailsIbfk_2;
    }

    val extramatchdetailsIbfk_2: ExtramatchdetailsPath
        get(): ExtramatchdetailsPath = extramatchdetailsIbfk_2()

    private lateinit var _fallofwicketsIbfk_3: FallofwicketsPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.FallOfWickets</code> table, via the
     * <code>fallofwickets_ibfk_3</code> key
     */
    fun fallofwicketsIbfk_3(): FallofwicketsPath {
        if (!this::_fallofwicketsIbfk_3.isInitialized)
            _fallofwicketsIbfk_3 = FallofwicketsPath(this, null, FALLOFWICKETS_IBFK_3.inverseKey)

        return _fallofwicketsIbfk_3;
    }

    val fallofwicketsIbfk_3: FallofwicketsPath
        get(): FallofwicketsPath = fallofwicketsIbfk_3()

    private lateinit var _fallofwicketsIbfk_4: FallofwicketsPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.FallOfWickets</code> table, via the
     * <code>fallofwickets_ibfk_4</code> key
     */
    fun fallofwicketsIbfk_4(): FallofwicketsPath {
        if (!this::_fallofwicketsIbfk_4.isInitialized)
            _fallofwicketsIbfk_4 = FallofwicketsPath(this, null, FALLOFWICKETS_IBFK_4.inverseKey)

        return _fallofwicketsIbfk_4;
    }

    val fallofwicketsIbfk_4: FallofwicketsPath
        get(): FallofwicketsPath = fallofwicketsIbfk_4()

    private lateinit var _fieldingIbfk_3: FieldingPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.Fielding</code> table, via the
     * <code>fielding_ibfk_3</code> key
     */
    fun fieldingIbfk_3(): FieldingPath {
        if (!this::_fieldingIbfk_3.isInitialized)
            _fieldingIbfk_3 = FieldingPath(this, null, FIELDING_IBFK_3.inverseKey)

        return _fieldingIbfk_3;
    }

    val fieldingIbfk_3: FieldingPath
        get(): FieldingPath = fieldingIbfk_3()

    private lateinit var _fieldingIbfk_4: FieldingPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.Fielding</code> table, via the
     * <code>fielding_ibfk_4</code> key
     */
    fun fieldingIbfk_4(): FieldingPath {
        if (!this::_fieldingIbfk_4.isInitialized)
            _fieldingIbfk_4 = FieldingPath(this, null, FIELDING_IBFK_4.inverseKey)

        return _fieldingIbfk_4;
    }

    val fieldingIbfk_4: FieldingPath
        get(): FieldingPath = fieldingIbfk_4()

    private lateinit var _inningsIbfk_2: InningsPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.Innings</code> table, via the
     * <code>innings_ibfk_2</code> key
     */
    fun inningsIbfk_2(): InningsPath {
        if (!this::_inningsIbfk_2.isInitialized)
            _inningsIbfk_2 = InningsPath(this, null, INNINGS_IBFK_2.inverseKey)

        return _inningsIbfk_2;
    }

    val inningsIbfk_2: InningsPath
        get(): InningsPath = inningsIbfk_2()

    private lateinit var _inningsIbfk_3: InningsPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.Innings</code> table, via the
     * <code>innings_ibfk_3</code> key
     */
    fun inningsIbfk_3(): InningsPath {
        if (!this::_inningsIbfk_3.isInitialized)
            _inningsIbfk_3 = InningsPath(this, null, INNINGS_IBFK_3.inverseKey)

        return _inningsIbfk_3;
    }

    val inningsIbfk_3: InningsPath
        get(): InningsPath = inningsIbfk_3()

    private lateinit var _matchesIbfk_1: MatchesPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.Matches</code> table, via the
     * <code>matches_ibfk_1</code> key
     */
    fun matchesIbfk_1(): MatchesPath {
        if (!this::_matchesIbfk_1.isInitialized)
            _matchesIbfk_1 = MatchesPath(this, null, MATCHES_IBFK_1.inverseKey)

        return _matchesIbfk_1;
    }

    val matchesIbfk_1: MatchesPath
        get(): MatchesPath = matchesIbfk_1()

    private lateinit var _matchesIbfk_2: MatchesPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.Matches</code> table, via the
     * <code>matches_ibfk_2</code> key
     */
    fun matchesIbfk_2(): MatchesPath {
        if (!this::_matchesIbfk_2.isInitialized)
            _matchesIbfk_2 = MatchesPath(this, null, MATCHES_IBFK_2.inverseKey)

        return _matchesIbfk_2;
    }

    val matchesIbfk_2: MatchesPath
        get(): MatchesPath = matchesIbfk_2()

    private lateinit var _matchesIbfk_3: MatchesPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.Matches</code> table, via the
     * <code>matches_ibfk_3</code> key
     */
    fun matchesIbfk_3(): MatchesPath {
        if (!this::_matchesIbfk_3.isInitialized)
            _matchesIbfk_3 = MatchesPath(this, null, MATCHES_IBFK_3.inverseKey)

        return _matchesIbfk_3;
    }

    val matchesIbfk_3: MatchesPath
        get(): MatchesPath = matchesIbfk_3()

    private lateinit var _matchesIbfk_4: MatchesPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.Matches</code> table, via the
     * <code>matches_ibfk_4</code> key
     */
    fun matchesIbfk_4(): MatchesPath {
        if (!this::_matchesIbfk_4.isInitialized)
            _matchesIbfk_4 = MatchesPath(this, null, MATCHES_IBFK_4.inverseKey)

        return _matchesIbfk_4;
    }

    val matchesIbfk_4: MatchesPath
        get(): MatchesPath = matchesIbfk_4()

    private lateinit var _matchesIbfk_5: MatchesPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.Matches</code> table, via the
     * <code>matches_ibfk_5</code> key
     */
    fun matchesIbfk_5(): MatchesPath {
        if (!this::_matchesIbfk_5.isInitialized)
            _matchesIbfk_5 = MatchesPath(this, null, MATCHES_IBFK_5.inverseKey)

        return _matchesIbfk_5;
    }

    val matchesIbfk_5: MatchesPath
        get(): MatchesPath = matchesIbfk_5()

    private lateinit var _partnershipsIbfk_2: PartnershipsPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.Partnerships</code> table, via the
     * <code>partnerships_ibfk_2</code> key
     */
    fun partnershipsIbfk_2(): PartnershipsPath {
        if (!this::_partnershipsIbfk_2.isInitialized)
            _partnershipsIbfk_2 = PartnershipsPath(this, null, PARTNERSHIPS_IBFK_2.inverseKey)

        return _partnershipsIbfk_2;
    }

    val partnershipsIbfk_2: PartnershipsPath
        get(): PartnershipsPath = partnershipsIbfk_2()

    private lateinit var _partnershipsIbfk_3: PartnershipsPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.Partnerships</code> table, via the
     * <code>partnerships_ibfk_3</code> key
     */
    fun partnershipsIbfk_3(): PartnershipsPath {
        if (!this::_partnershipsIbfk_3.isInitialized)
            _partnershipsIbfk_3 = PartnershipsPath(this, null, PARTNERSHIPS_IBFK_3.inverseKey)

        return _partnershipsIbfk_3;
    }

    val partnershipsIbfk_3: PartnershipsPath
        get(): PartnershipsPath = partnershipsIbfk_3()

    private lateinit var _playersteams: PlayersteamsPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.PlayersTeams</code> table
     */
    fun playersteams(): PlayersteamsPath {
        if (!this::_playersteams.isInitialized)
            _playersteams = PlayersteamsPath(this, null, PLAYERSTEAMS_IBFK_2.inverseKey)

        return _playersteams;
    }

    val playersteams: PlayersteamsPath
        get(): PlayersteamsPath = playersteams()

    private lateinit var _teamsmatchtypes: TeamsmatchtypesPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.TeamsMatchTypes</code> table
     */
    fun teamsmatchtypes(): TeamsmatchtypesPath {
        if (!this::_teamsmatchtypes.isInitialized)
            _teamsmatchtypes = TeamsmatchtypesPath(this, null, TEAMSMATCHTYPES_IBFK_1.inverseKey)

        return _teamsmatchtypes;
    }

    val teamsmatchtypes: TeamsmatchtypesPath
        get(): TeamsmatchtypesPath = teamsmatchtypes()
    override fun `as`(alias: String): Teams = Teams(DSL.name(alias), this)
    override fun `as`(alias: Name): Teams = Teams(alias, this)
    override fun `as`(alias: Table<*>): Teams = Teams(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Teams = Teams(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Teams = Teams(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Teams = Teams(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Teams = Teams(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Teams = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Teams = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Teams = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Teams = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Teams = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Teams = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Teams = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Teams = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Teams = where(DSL.notExists(select))
}
