/*
 * This file is generated by jOOQ.
 */
package com.knowledgespike.db.routines


import com.knowledgespike.db.Cricketarchive

import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FowCareerRecords : AbstractRoutine<java.lang.Void>("fow_career_records", Cricketarchive.CRICKETARCHIVE) {
    companion object {

        /**
         * The parameter <code>cricketarchive.fow_career_records.team_id</code>.
         */
        val TEAM_ID: Parameter<Int?> = Internal.createParameter("team_id", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fow_career_records.opponents_id</code>.
         */
        val OPPONENTS_ID: Parameter<Int?> = Internal.createParameter("opponents_id", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fow_career_records.match_type</code>.
         */
        val MATCH_TYPE: Parameter<String?> = Internal.createParameter("match_type", SQLDataType.VARCHAR(20), false, false)

        /**
         * The parameter
         * <code>cricketarchive.fow_career_records.match_subtype</code>.
         */
        val MATCH_SUBTYPE: Parameter<String?> = Internal.createParameter("match_subtype", SQLDataType.VARCHAR(20), false, false)

        /**
         * The parameter
         * <code>cricketarchive.fow_career_records.ground_id</code>.
         */
        val GROUND_ID: Parameter<Int?> = Internal.createParameter("ground_id", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fow_career_records.homecountry_id</code>.
         */
        val HOMECOUNTRY_ID: Parameter<Int?> = Internal.createParameter("homecountry_id", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fow_career_records.homeOrAway</code>.
         */
        val HOMEORAWAY: Parameter<Int?> = Internal.createParameter("homeOrAway", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fow_career_records.startDate</code>.
         */
        val STARTDATE: Parameter<String?> = Internal.createParameter("startDate", SQLDataType.CLOB, false, false)

        /**
         * The parameter <code>cricketarchive.fow_career_records.endDate</code>.
         */
        val ENDDATE: Parameter<String?> = Internal.createParameter("endDate", SQLDataType.CLOB, false, false)

        /**
         * The parameter <code>cricketarchive.fow_career_records.season</code>.
         */
        val SEASON: Parameter<String?> = Internal.createParameter("season", SQLDataType.VARCHAR(10), false, false)

        /**
         * The parameter
         * <code>cricketarchive.fow_career_records.matchResult</code>.
         */
        val MATCHRESULT: Parameter<Int?> = Internal.createParameter("matchResult", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fow_career_records.runs_limit</code>.
         */
        val RUNS_LIMIT: Parameter<Int?> = Internal.createParameter("runs_limit", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>cricketarchive.fow_career_records.sort_by</code>.
         */
        val SORT_BY: Parameter<Int?> = Internal.createParameter("sort_by", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fow_career_records.sort_direction</code>.
         */
        val SORT_DIRECTION: Parameter<String?> = Internal.createParameter("sort_direction", SQLDataType.VARCHAR(5), false, false)

        /**
         * The parameter
         * <code>cricketarchive.fow_career_records.start_row</code>.
         */
        val START_ROW: Parameter<Int?> = Internal.createParameter("start_row", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fow_career_records.page_size</code>.
         */
        val PAGE_SIZE: Parameter<Int?> = Internal.createParameter("page_size", SQLDataType.INTEGER, false, false)
    }

    init {
        addInParameter(FowCareerRecords.TEAM_ID)
        addInParameter(FowCareerRecords.OPPONENTS_ID)
        addInParameter(FowCareerRecords.MATCH_TYPE)
        addInParameter(FowCareerRecords.MATCH_SUBTYPE)
        addInParameter(FowCareerRecords.GROUND_ID)
        addInParameter(FowCareerRecords.HOMECOUNTRY_ID)
        addInParameter(FowCareerRecords.HOMEORAWAY)
        addInParameter(FowCareerRecords.STARTDATE)
        addInParameter(FowCareerRecords.ENDDATE)
        addInParameter(FowCareerRecords.SEASON)
        addInParameter(FowCareerRecords.MATCHRESULT)
        addInParameter(FowCareerRecords.RUNS_LIMIT)
        addInParameter(FowCareerRecords.SORT_BY)
        addInParameter(FowCareerRecords.SORT_DIRECTION)
        addInParameter(FowCareerRecords.START_ROW)
        addInParameter(FowCareerRecords.PAGE_SIZE)
    }

    /**
     * Set the <code>team_id</code> parameter IN value to the routine
     */
    fun setTeamId(value: Int?): Unit = setValue(FowCareerRecords.TEAM_ID, value)

    /**
     * Set the <code>opponents_id</code> parameter IN value to the routine
     */
    fun setOpponentsId(value: Int?): Unit = setValue(FowCareerRecords.OPPONENTS_ID, value)

    /**
     * Set the <code>match_type</code> parameter IN value to the routine
     */
    fun setMatchType(value: String?): Unit = setValue(FowCareerRecords.MATCH_TYPE, value)

    /**
     * Set the <code>match_subtype</code> parameter IN value to the routine
     */
    fun setMatchSubtype(value: String?): Unit = setValue(FowCareerRecords.MATCH_SUBTYPE, value)

    /**
     * Set the <code>ground_id</code> parameter IN value to the routine
     */
    fun setGroundId(value: Int?): Unit = setValue(FowCareerRecords.GROUND_ID, value)

    /**
     * Set the <code>homecountry_id</code> parameter IN value to the routine
     */
    fun setHomecountryId(value: Int?): Unit = setValue(FowCareerRecords.HOMECOUNTRY_ID, value)

    /**
     * Set the <code>homeOrAway</code> parameter IN value to the routine
     */
    fun setHomeoraway(value: Int?): Unit = setValue(FowCareerRecords.HOMEORAWAY, value)

    /**
     * Set the <code>startDate</code> parameter IN value to the routine
     */
    fun setStartdate(value: String?): Unit = setValue(FowCareerRecords.STARTDATE, value)

    /**
     * Set the <code>endDate</code> parameter IN value to the routine
     */
    fun setEnddate(value: String?): Unit = setValue(FowCareerRecords.ENDDATE, value)

    /**
     * Set the <code>season</code> parameter IN value to the routine
     */
    fun setSeason(value: String?): Unit = setValue(FowCareerRecords.SEASON, value)

    /**
     * Set the <code>matchResult</code> parameter IN value to the routine
     */
    fun setMatchresult(value: Int?): Unit = setValue(FowCareerRecords.MATCHRESULT, value)

    /**
     * Set the <code>runs_limit</code> parameter IN value to the routine
     */
    fun setRunsLimit(value: Int?): Unit = setValue(FowCareerRecords.RUNS_LIMIT, value)

    /**
     * Set the <code>sort_by</code> parameter IN value to the routine
     */
    fun setSortBy(value: Int?): Unit = setValue(FowCareerRecords.SORT_BY, value)

    /**
     * Set the <code>sort_direction</code> parameter IN value to the routine
     */
    fun setSortDirection(value: String?): Unit = setValue(FowCareerRecords.SORT_DIRECTION, value)

    /**
     * Set the <code>start_row</code> parameter IN value to the routine
     */
    fun setStartRow(value: Int?): Unit = setValue(FowCareerRecords.START_ROW, value)

    /**
     * Set the <code>page_size</code> parameter IN value to the routine
     */
    fun setPageSize(value: Int?): Unit = setValue(FowCareerRecords.PAGE_SIZE, value)
}
