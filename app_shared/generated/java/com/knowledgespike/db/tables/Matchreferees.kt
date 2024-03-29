/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.tables


import com.knowledgespike.db.Cricketarchive
import com.knowledgespike.db.indexes.MATCHREFEREES_DEBUTMATCHID
import com.knowledgespike.db.indexes.MATCHREFEREES_REFEREESID
import com.knowledgespike.db.keys.KEY_MATCHREFEREES_PRIMARY
import com.knowledgespike.db.keys.MATCHREFEREESMATCHES_IBFK_1
import com.knowledgespike.db.tables.Matchrefereesmatches.MatchrefereesmatchesPath
import com.knowledgespike.db.tables.records.MatchrefereesRecord

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
open class Matchreferees(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, MatchrefereesRecord>?,
    parentPath: InverseForeignKey<out Record, MatchrefereesRecord>?,
    aliased: Table<MatchrefereesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<MatchrefereesRecord>(
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
         * The reference instance of <code>cricketarchive.MatchReferees</code>
         */
        val MATCHREFEREES: Matchreferees = Matchreferees()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<MatchrefereesRecord> = MatchrefereesRecord::class.java

    /**
     * The column <code>cricketarchive.MatchReferees.Id</code>.
     */
    val ID: TableField<MatchrefereesRecord, Int?> = createField(DSL.name("Id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>cricketarchive.MatchReferees.RefereesId</code>.
     */
    val REFEREESID: TableField<MatchrefereesRecord, Int?> = createField(DSL.name("RefereesId"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.MatchReferees.FullName</code>.
     */
    val FULLNAME: TableField<MatchrefereesRecord, String?> = createField(DSL.name("FullName"), SQLDataType.VARCHAR(200).nullable(false), this, "")

    /**
     * The column <code>cricketarchive.MatchReferees.SortNamePart</code>.
     */
    val SORTNAMEPART: TableField<MatchrefereesRecord, String?> = createField(DSL.name("SortNamePart"), SQLDataType.VARCHAR(200).nullable(false), this, "")

    /**
     * The column <code>cricketarchive.MatchReferees.OtherNamePart</code>.
     */
    val OTHERNAMEPART: TableField<MatchrefereesRecord, String?> = createField(DSL.name("OtherNamePart"), SQLDataType.VARCHAR(200).nullable(false), this, "")

    /**
     * The column <code>cricketarchive.MatchReferees.DebutMatchId</code>.
     */
    val DEBUTMATCHID: TableField<MatchrefereesRecord, String?> = createField(DSL.name("DebutMatchId"), SQLDataType.VARCHAR(20).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<MatchrefereesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<MatchrefereesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<MatchrefereesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>cricketarchive.MatchReferees</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>cricketarchive.MatchReferees</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>cricketarchive.MatchReferees</code> table reference
     */
    constructor(): this(DSL.name("MatchReferees"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, MatchrefereesRecord>?, parentPath: InverseForeignKey<out Record, MatchrefereesRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, MATCHREFEREES, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class MatchrefereesPath : Matchreferees, Path<MatchrefereesRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, MatchrefereesRecord>?, parentPath: InverseForeignKey<out Record, MatchrefereesRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<MatchrefereesRecord>): super(alias, aliased)
        override fun `as`(alias: String): MatchrefereesPath = MatchrefereesPath(DSL.name(alias), this)
        override fun `as`(alias: Name): MatchrefereesPath = MatchrefereesPath(alias, this)
        override fun `as`(alias: Table<*>): MatchrefereesPath = MatchrefereesPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Cricketarchive.CRICKETARCHIVE
    override fun getIndexes(): List<Index> = listOf(MATCHREFEREES_DEBUTMATCHID, MATCHREFEREES_REFEREESID)
    override fun getIdentity(): Identity<MatchrefereesRecord, Int?> = super.getIdentity() as Identity<MatchrefereesRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<MatchrefereesRecord> = KEY_MATCHREFEREES_PRIMARY

    private lateinit var _matchrefereesmatches: MatchrefereesmatchesPath

    /**
     * Get the implicit to-many join path to the
     * <code>cricketarchive.MatchRefereesMatches</code> table
     */
    fun matchrefereesmatches(): MatchrefereesmatchesPath {
        if (!this::_matchrefereesmatches.isInitialized)
            _matchrefereesmatches = MatchrefereesmatchesPath(this, null, MATCHREFEREESMATCHES_IBFK_1.inverseKey)

        return _matchrefereesmatches;
    }

    val matchrefereesmatches: MatchrefereesmatchesPath
        get(): MatchrefereesmatchesPath = matchrefereesmatches()
    override fun `as`(alias: String): Matchreferees = Matchreferees(DSL.name(alias), this)
    override fun `as`(alias: Name): Matchreferees = Matchreferees(alias, this)
    override fun `as`(alias: Table<*>): Matchreferees = Matchreferees(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Matchreferees = Matchreferees(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Matchreferees = Matchreferees(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Matchreferees = Matchreferees(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Matchreferees = Matchreferees(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Matchreferees = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Matchreferees = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Matchreferees = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Matchreferees = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Matchreferees = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Matchreferees = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Matchreferees = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Matchreferees = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Matchreferees = where(DSL.notExists(select))
}
