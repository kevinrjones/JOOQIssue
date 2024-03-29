/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.tables


import com.knowledgespike.db.Cricketarchive
import com.knowledgespike.db.indexes.FIELDING_CAUGHTF
import com.knowledgespike.db.indexes.FIELDING_CAUGHTWK
import com.knowledgespike.db.indexes.FIELDING_DISMISSALS
import com.knowledgespike.db.indexes.FIELDING_MATCHID
import com.knowledgespike.db.indexes.FIELDING_MATCHTYPE
import com.knowledgespike.db.indexes.FIELDING_OPPONENTSID
import com.knowledgespike.db.indexes.FIELDING_PLAYERID
import com.knowledgespike.db.indexes.FIELDING_STUMPED
import com.knowledgespike.db.indexes.FIELDING_TEAMID
import com.knowledgespike.db.keys.FIELDING_IBFK_1
import com.knowledgespike.db.keys.FIELDING_IBFK_2
import com.knowledgespike.db.keys.FIELDING_IBFK_3
import com.knowledgespike.db.keys.FIELDING_IBFK_4
import com.knowledgespike.db.keys.KEY_FIELDING_PRIMARY
import com.knowledgespike.db.tables.Matches.MatchesPath
import com.knowledgespike.db.tables.Players.PlayersPath
import com.knowledgespike.db.tables.Teams.TeamsPath
import com.knowledgespike.db.tables.records.FieldingRecord

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
open class Fielding(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, FieldingRecord>?,
    parentPath: InverseForeignKey<out Record, FieldingRecord>?,
    aliased: Table<FieldingRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<FieldingRecord>(
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
         * The reference instance of <code>cricketarchive.Fielding</code>
         */
        val FIELDING: Fielding = Fielding()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<FieldingRecord> = FieldingRecord::class.java

    /**
     * The column <code>cricketarchive.Fielding.Id</code>.
     */
    val ID: TableField<FieldingRecord, Int?> = createField(DSL.name("Id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>cricketarchive.Fielding.MatchId</code>.
     */
    val MATCHID: TableField<FieldingRecord, Int?> = createField(DSL.name("MatchId"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.Fielding.PlayerId</code>.
     */
    val PLAYERID: TableField<FieldingRecord, Int?> = createField(DSL.name("PlayerId"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.Fielding.TeamId</code>.
     */
    val TEAMID: TableField<FieldingRecord, Int?> = createField(DSL.name("TeamId"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.Fielding.OpponentsId</code>.
     */
    val OPPONENTSID: TableField<FieldingRecord, Int?> = createField(DSL.name("OpponentsId"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.Fielding.InningsNumber</code>.
     */
    val INNINGSNUMBER: TableField<FieldingRecord, Int?> = createField(DSL.name("InningsNumber"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.Fielding.MatchType</code>.
     */
    val MATCHTYPE: TableField<FieldingRecord, String?> = createField(DSL.name("MatchType"), SQLDataType.VARCHAR(5).nullable(false), this, "")

    /**
     * The column <code>cricketarchive.Fielding.CaughtF</code>.
     */
    val CAUGHTF: TableField<FieldingRecord, Int?> = createField(DSL.name("CaughtF"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.Fielding.CaughtWk</code>.
     */
    val CAUGHTWK: TableField<FieldingRecord, Int?> = createField(DSL.name("CaughtWk"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.Fielding.Stumped</code>.
     */
    val STUMPED: TableField<FieldingRecord, Int?> = createField(DSL.name("Stumped"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.Fielding.Dismissals</code>.
     */
    val DISMISSALS: TableField<FieldingRecord, Int?> = createField(DSL.name("Dismissals"), SQLDataType.INTEGER.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<FieldingRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<FieldingRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<FieldingRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>cricketarchive.Fielding</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>cricketarchive.Fielding</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>cricketarchive.Fielding</code> table reference
     */
    constructor(): this(DSL.name("Fielding"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, FieldingRecord>?, parentPath: InverseForeignKey<out Record, FieldingRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, FIELDING, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class FieldingPath : Fielding, Path<FieldingRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, FieldingRecord>?, parentPath: InverseForeignKey<out Record, FieldingRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<FieldingRecord>): super(alias, aliased)
        override fun `as`(alias: String): FieldingPath = FieldingPath(DSL.name(alias), this)
        override fun `as`(alias: Name): FieldingPath = FieldingPath(alias, this)
        override fun `as`(alias: Table<*>): FieldingPath = FieldingPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Cricketarchive.CRICKETARCHIVE
    override fun getIndexes(): List<Index> = listOf(FIELDING_CAUGHTF, FIELDING_CAUGHTWK, FIELDING_DISMISSALS, FIELDING_MATCHID, FIELDING_MATCHTYPE, FIELDING_OPPONENTSID, FIELDING_PLAYERID, FIELDING_STUMPED, FIELDING_TEAMID)
    override fun getIdentity(): Identity<FieldingRecord, Int?> = super.getIdentity() as Identity<FieldingRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<FieldingRecord> = KEY_FIELDING_PRIMARY
    override fun getReferences(): List<ForeignKey<FieldingRecord, *>> = listOf(FIELDING_IBFK_1, FIELDING_IBFK_2, FIELDING_IBFK_3, FIELDING_IBFK_4)

    private lateinit var _matches: MatchesPath

    /**
     * Get the implicit join path to the <code>cricketarchive.Matches</code>
     * table.
     */
    fun matches(): MatchesPath {
        if (!this::_matches.isInitialized)
            _matches = MatchesPath(this, FIELDING_IBFK_1, null)

        return _matches;
    }

    val matches: MatchesPath
        get(): MatchesPath = matches()

    private lateinit var _players: PlayersPath

    /**
     * Get the implicit join path to the <code>cricketarchive.Players</code>
     * table.
     */
    fun players(): PlayersPath {
        if (!this::_players.isInitialized)
            _players = PlayersPath(this, FIELDING_IBFK_2, null)

        return _players;
    }

    val players: PlayersPath
        get(): PlayersPath = players()

    private lateinit var _fieldingIbfk_3: TeamsPath

    /**
     * Get the implicit join path to the <code>cricketarchive.Teams</code>
     * table, via the <code>fielding_ibfk_3</code> key.
     */
    fun fieldingIbfk_3(): TeamsPath {
        if (!this::_fieldingIbfk_3.isInitialized)
            _fieldingIbfk_3 = TeamsPath(this, FIELDING_IBFK_3, null)

        return _fieldingIbfk_3;
    }

    val fieldingIbfk_3: TeamsPath
        get(): TeamsPath = fieldingIbfk_3()

    private lateinit var _fieldingIbfk_4: TeamsPath

    /**
     * Get the implicit join path to the <code>cricketarchive.Teams</code>
     * table, via the <code>fielding_ibfk_4</code> key.
     */
    fun fieldingIbfk_4(): TeamsPath {
        if (!this::_fieldingIbfk_4.isInitialized)
            _fieldingIbfk_4 = TeamsPath(this, FIELDING_IBFK_4, null)

        return _fieldingIbfk_4;
    }

    val fieldingIbfk_4: TeamsPath
        get(): TeamsPath = fieldingIbfk_4()
    override fun `as`(alias: String): Fielding = Fielding(DSL.name(alias), this)
    override fun `as`(alias: Name): Fielding = Fielding(alias, this)
    override fun `as`(alias: Table<*>): Fielding = Fielding(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Fielding = Fielding(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Fielding = Fielding(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Fielding = Fielding(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Fielding = Fielding(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Fielding = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Fielding = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Fielding = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Fielding = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Fielding = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Fielding = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Fielding = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Fielding = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Fielding = where(DSL.notExists(select))
}
