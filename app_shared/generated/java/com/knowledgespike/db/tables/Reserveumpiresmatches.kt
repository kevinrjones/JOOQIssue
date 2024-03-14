/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.tables


import com.knowledgespike.db.Cricketarchive
import com.knowledgespike.db.indexes.RESERVEUMPIRESMATCHES_MATCHID
import com.knowledgespike.db.indexes.RESERVEUMPIRESMATCHES_PERSONID
import com.knowledgespike.db.keys.RESERVEUMPIRESMATCHES_IBFK_1
import com.knowledgespike.db.keys.RESERVEUMPIRESMATCHES_IBFK_2
import com.knowledgespike.db.tables.Matches.MatchesPath
import com.knowledgespike.db.tables.Reserveumpires.ReserveumpiresPath
import com.knowledgespike.db.tables.records.ReserveumpiresmatchesRecord

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
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
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Reserveumpiresmatches(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ReserveumpiresmatchesRecord>?,
    parentPath: InverseForeignKey<out Record, ReserveumpiresmatchesRecord>?,
    aliased: Table<ReserveumpiresmatchesRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ReserveumpiresmatchesRecord>(
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
         * The reference instance of
         * <code>cricketarchive.ReserveUmpiresMatches</code>
         */
        val RESERVEUMPIRESMATCHES: Reserveumpiresmatches = Reserveumpiresmatches()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ReserveumpiresmatchesRecord> = ReserveumpiresmatchesRecord::class.java

    /**
     * The column <code>cricketarchive.ReserveUmpiresMatches.PersonId</code>.
     */
    val PERSONID: TableField<ReserveumpiresmatchesRecord, Int?> = createField(DSL.name("PersonId"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cricketarchive.ReserveUmpiresMatches.MatchId</code>.
     */
    val MATCHID: TableField<ReserveumpiresmatchesRecord, Int?> = createField(DSL.name("MatchId"), SQLDataType.INTEGER.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<ReserveumpiresmatchesRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ReserveumpiresmatchesRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ReserveumpiresmatchesRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>cricketarchive.ReserveUmpiresMatches</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>cricketarchive.ReserveUmpiresMatches</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>cricketarchive.ReserveUmpiresMatches</code> table
     * reference
     */
    constructor(): this(DSL.name("ReserveUmpiresMatches"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, ReserveumpiresmatchesRecord>?, parentPath: InverseForeignKey<out Record, ReserveumpiresmatchesRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, RESERVEUMPIRESMATCHES, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class ReserveumpiresmatchesPath : Reserveumpiresmatches, Path<ReserveumpiresmatchesRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, ReserveumpiresmatchesRecord>?, parentPath: InverseForeignKey<out Record, ReserveumpiresmatchesRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<ReserveumpiresmatchesRecord>): super(alias, aliased)
        override fun `as`(alias: String): ReserveumpiresmatchesPath = ReserveumpiresmatchesPath(DSL.name(alias), this)
        override fun `as`(alias: Name): ReserveumpiresmatchesPath = ReserveumpiresmatchesPath(alias, this)
        override fun `as`(alias: Table<*>): ReserveumpiresmatchesPath = ReserveumpiresmatchesPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Cricketarchive.CRICKETARCHIVE
    override fun getIndexes(): List<Index> = listOf(RESERVEUMPIRESMATCHES_MATCHID, RESERVEUMPIRESMATCHES_PERSONID)
    override fun getReferences(): List<ForeignKey<ReserveumpiresmatchesRecord, *>> = listOf(RESERVEUMPIRESMATCHES_IBFK_1, RESERVEUMPIRESMATCHES_IBFK_2)

    private lateinit var _reserveumpires: ReserveumpiresPath

    /**
     * Get the implicit join path to the
     * <code>cricketarchive.ReserveUmpires</code> table.
     */
    fun reserveumpires(): ReserveumpiresPath {
        if (!this::_reserveumpires.isInitialized)
            _reserveumpires = ReserveumpiresPath(this, RESERVEUMPIRESMATCHES_IBFK_1, null)

        return _reserveumpires;
    }

    val reserveumpires: ReserveumpiresPath
        get(): ReserveumpiresPath = reserveumpires()

    private lateinit var _matches: MatchesPath

    /**
     * Get the implicit join path to the <code>cricketarchive.Matches</code>
     * table.
     */
    fun matches(): MatchesPath {
        if (!this::_matches.isInitialized)
            _matches = MatchesPath(this, RESERVEUMPIRESMATCHES_IBFK_2, null)

        return _matches;
    }

    val matches: MatchesPath
        get(): MatchesPath = matches()
    override fun `as`(alias: String): Reserveumpiresmatches = Reserveumpiresmatches(DSL.name(alias), this)
    override fun `as`(alias: Name): Reserveumpiresmatches = Reserveumpiresmatches(alias, this)
    override fun `as`(alias: Table<*>): Reserveumpiresmatches = Reserveumpiresmatches(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Reserveumpiresmatches = Reserveumpiresmatches(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Reserveumpiresmatches = Reserveumpiresmatches(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Reserveumpiresmatches = Reserveumpiresmatches(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Reserveumpiresmatches = Reserveumpiresmatches(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Reserveumpiresmatches = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Reserveumpiresmatches = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Reserveumpiresmatches = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Reserveumpiresmatches = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Reserveumpiresmatches = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Reserveumpiresmatches = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Reserveumpiresmatches = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Reserveumpiresmatches = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Reserveumpiresmatches = where(DSL.notExists(select))
}
