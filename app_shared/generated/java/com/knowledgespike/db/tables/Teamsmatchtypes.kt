/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.tables


import com.knowledgespike.db.Cricketarchive
import com.knowledgespike.db.indexes.TEAMSMATCHTYPES_MATCHTYPE
import com.knowledgespike.db.indexes.TEAMSMATCHTYPES_TEAMID
import com.knowledgespike.db.keys.KEY_TEAMSMATCHTYPES_PRIMARY
import com.knowledgespike.db.keys.TEAMSMATCHTYPES_IBFK_1
import com.knowledgespike.db.tables.Teams.TeamsPath
import com.knowledgespike.db.tables.records.TeamsmatchtypesRecord

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
open class Teamsmatchtypes(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, TeamsmatchtypesRecord>?,
    parentPath: InverseForeignKey<out Record, TeamsmatchtypesRecord>?,
    aliased: Table<TeamsmatchtypesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<TeamsmatchtypesRecord>(
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
         * The reference instance of <code>cricketarchive.TeamsMatchTypes</code>
         */
        val TEAMSMATCHTYPES: Teamsmatchtypes = Teamsmatchtypes()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TeamsmatchtypesRecord> = TeamsmatchtypesRecord::class.java

    /**
     * The column <code>cricketarchive.TeamsMatchTypes.Id</code>.
     */
    val ID: TableField<TeamsmatchtypesRecord, Int?> = createField(DSL.name("Id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>cricketarchive.TeamsMatchTypes.TeamId</code>.
     */
    val TEAMID: TableField<TeamsmatchtypesRecord, Int?> = createField(DSL.name("TeamId"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.TeamsMatchTypes.MatchType</code>.
     */
    val MATCHTYPE: TableField<TeamsmatchtypesRecord, String?> = createField(DSL.name("MatchType"), SQLDataType.VARCHAR(10).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<TeamsmatchtypesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<TeamsmatchtypesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<TeamsmatchtypesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>cricketarchive.TeamsMatchTypes</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>cricketarchive.TeamsMatchTypes</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>cricketarchive.TeamsMatchTypes</code> table reference
     */
    constructor(): this(DSL.name("TeamsMatchTypes"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, TeamsmatchtypesRecord>?, parentPath: InverseForeignKey<out Record, TeamsmatchtypesRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, TEAMSMATCHTYPES, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class TeamsmatchtypesPath : Teamsmatchtypes, Path<TeamsmatchtypesRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, TeamsmatchtypesRecord>?, parentPath: InverseForeignKey<out Record, TeamsmatchtypesRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<TeamsmatchtypesRecord>): super(alias, aliased)
        override fun `as`(alias: String): TeamsmatchtypesPath = TeamsmatchtypesPath(DSL.name(alias), this)
        override fun `as`(alias: Name): TeamsmatchtypesPath = TeamsmatchtypesPath(alias, this)
        override fun `as`(alias: Table<*>): TeamsmatchtypesPath = TeamsmatchtypesPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Cricketarchive.CRICKETARCHIVE
    override fun getIndexes(): List<Index> = listOf(TEAMSMATCHTYPES_MATCHTYPE, TEAMSMATCHTYPES_TEAMID)
    override fun getIdentity(): Identity<TeamsmatchtypesRecord, Int?> = super.getIdentity() as Identity<TeamsmatchtypesRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<TeamsmatchtypesRecord> = KEY_TEAMSMATCHTYPES_PRIMARY
    override fun getReferences(): List<ForeignKey<TeamsmatchtypesRecord, *>> = listOf(TEAMSMATCHTYPES_IBFK_1)

    private lateinit var _teams: TeamsPath

    /**
     * Get the implicit join path to the <code>cricketarchive.Teams</code>
     * table.
     */
    fun teams(): TeamsPath {
        if (!this::_teams.isInitialized)
            _teams = TeamsPath(this, TEAMSMATCHTYPES_IBFK_1, null)

        return _teams;
    }

    val teams: TeamsPath
        get(): TeamsPath = teams()
    override fun `as`(alias: String): Teamsmatchtypes = Teamsmatchtypes(DSL.name(alias), this)
    override fun `as`(alias: Name): Teamsmatchtypes = Teamsmatchtypes(alias, this)
    override fun `as`(alias: Table<*>): Teamsmatchtypes = Teamsmatchtypes(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Teamsmatchtypes = Teamsmatchtypes(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Teamsmatchtypes = Teamsmatchtypes(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Teamsmatchtypes = Teamsmatchtypes(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Teamsmatchtypes = Teamsmatchtypes(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Teamsmatchtypes = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Teamsmatchtypes = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Teamsmatchtypes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Teamsmatchtypes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Teamsmatchtypes = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Teamsmatchtypes = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Teamsmatchtypes = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Teamsmatchtypes = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Teamsmatchtypes = where(DSL.notExists(select))
}
