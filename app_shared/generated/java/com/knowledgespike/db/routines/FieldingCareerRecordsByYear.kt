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
open class FieldingCareerRecordsByYear : AbstractRoutine<java.lang.Void>("fielding_career_records_by_year", Cricketarchive.CRICKETARCHIVE) {
    companion object {

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.team_id</code>.
         */
        val TEAM_ID: Parameter<Int?> = Internal.createParameter("team_id", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.opponents_id</code>.
         */
        val OPPONENTS_ID: Parameter<Int?> = Internal.createParameter("opponents_id", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.match_type</code>.
         */
        val MATCH_TYPE: Parameter<String?> = Internal.createParameter("match_type", SQLDataType.VARCHAR(20), false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.match_subtype</code>.
         */
        val MATCH_SUBTYPE: Parameter<String?> = Internal.createParameter("match_subtype", SQLDataType.VARCHAR(20), false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.ground_id</code>.
         */
        val GROUND_ID: Parameter<Int?> = Internal.createParameter("ground_id", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.homecountry_id</code>.
         */
        val HOMECOUNTRY_ID: Parameter<Int?> = Internal.createParameter("homecountry_id", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.homeOrAway</code>.
         */
        val HOMEORAWAY: Parameter<Int?> = Internal.createParameter("homeOrAway", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.startDate</code>.
         */
        val STARTDATE: Parameter<String?> = Internal.createParameter("startDate", SQLDataType.CLOB, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.endDate</code>.
         */
        val ENDDATE: Parameter<String?> = Internal.createParameter("endDate", SQLDataType.CLOB, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.season</code>.
         */
        val SEASON: Parameter<String?> = Internal.createParameter("season", SQLDataType.VARCHAR(10), false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.matchResult</code>.
         */
        val MATCHRESULT: Parameter<Int?> = Internal.createParameter("matchResult", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.dismissals_limit</code>.
         */
        val DISMISSALS_LIMIT: Parameter<Int?> = Internal.createParameter("dismissals_limit", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.sort_by</code>.
         */
        val SORT_BY: Parameter<Int?> = Internal.createParameter("sort_by", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.sort_direction</code>.
         */
        val SORT_DIRECTION: Parameter<String?> = Internal.createParameter("sort_direction", SQLDataType.VARCHAR(5), false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.start_row</code>.
         */
        val START_ROW: Parameter<Int?> = Internal.createParameter("start_row", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_year.page_size</code>.
         */
        val PAGE_SIZE: Parameter<Int?> = Internal.createParameter("page_size", SQLDataType.INTEGER, false, false)
    }

    init {
        addInParameter(FieldingCareerRecordsByYear.TEAM_ID)
        addInParameter(FieldingCareerRecordsByYear.OPPONENTS_ID)
        addInParameter(FieldingCareerRecordsByYear.MATCH_TYPE)
        addInParameter(FieldingCareerRecordsByYear.MATCH_SUBTYPE)
        addInParameter(FieldingCareerRecordsByYear.GROUND_ID)
        addInParameter(FieldingCareerRecordsByYear.HOMECOUNTRY_ID)
        addInParameter(FieldingCareerRecordsByYear.HOMEORAWAY)
        addInParameter(FieldingCareerRecordsByYear.STARTDATE)
        addInParameter(FieldingCareerRecordsByYear.ENDDATE)
        addInParameter(FieldingCareerRecordsByYear.SEASON)
        addInParameter(FieldingCareerRecordsByYear.MATCHRESULT)
        addInParameter(FieldingCareerRecordsByYear.DISMISSALS_LIMIT)
        addInParameter(FieldingCareerRecordsByYear.SORT_BY)
        addInParameter(FieldingCareerRecordsByYear.SORT_DIRECTION)
        addInParameter(FieldingCareerRecordsByYear.START_ROW)
        addInParameter(FieldingCareerRecordsByYear.PAGE_SIZE)
    }

    /**
     * Set the <code>team_id</code> parameter IN value to the routine
     */
    fun setTeamId(value: Int?): Unit = setValue(FieldingCareerRecordsByYear.TEAM_ID, value)

    /**
     * Set the <code>opponents_id</code> parameter IN value to the routine
     */
    fun setOpponentsId(value: Int?): Unit = setValue(FieldingCareerRecordsByYear.OPPONENTS_ID, value)

    /**
     * Set the <code>match_type</code> parameter IN value to the routine
     */
    fun setMatchType(value: String?): Unit = setValue(FieldingCareerRecordsByYear.MATCH_TYPE, value)

    /**
     * Set the <code>match_subtype</code> parameter IN value to the routine
     */
    fun setMatchSubtype(value: String?): Unit = setValue(FieldingCareerRecordsByYear.MATCH_SUBTYPE, value)

    /**
     * Set the <code>ground_id</code> parameter IN value to the routine
     */
    fun setGroundId(value: Int?): Unit = setValue(FieldingCareerRecordsByYear.GROUND_ID, value)

    /**
     * Set the <code>homecountry_id</code> parameter IN value to the routine
     */
    fun setHomecountryId(value: Int?): Unit = setValue(FieldingCareerRecordsByYear.HOMECOUNTRY_ID, value)

    /**
     * Set the <code>homeOrAway</code> parameter IN value to the routine
     */
    fun setHomeoraway(value: Int?): Unit = setValue(FieldingCareerRecordsByYear.HOMEORAWAY, value)

    /**
     * Set the <code>startDate</code> parameter IN value to the routine
     */
    fun setStartdate(value: String?): Unit = setValue(FieldingCareerRecordsByYear.STARTDATE, value)

    /**
     * Set the <code>endDate</code> parameter IN value to the routine
     */
    fun setEnddate(value: String?): Unit = setValue(FieldingCareerRecordsByYear.ENDDATE, value)

    /**
     * Set the <code>season</code> parameter IN value to the routine
     */
    fun setSeason(value: String?): Unit = setValue(FieldingCareerRecordsByYear.SEASON, value)

    /**
     * Set the <code>matchResult</code> parameter IN value to the routine
     */
    fun setMatchresult(value: Int?): Unit = setValue(FieldingCareerRecordsByYear.MATCHRESULT, value)

    /**
     * Set the <code>dismissals_limit</code> parameter IN value to the routine
     */
    fun setDismissalsLimit(value: Int?): Unit = setValue(FieldingCareerRecordsByYear.DISMISSALS_LIMIT, value)

    /**
     * Set the <code>sort_by</code> parameter IN value to the routine
     */
    fun setSortBy(value: Int?): Unit = setValue(FieldingCareerRecordsByYear.SORT_BY, value)

    /**
     * Set the <code>sort_direction</code> parameter IN value to the routine
     */
    fun setSortDirection(value: String?): Unit = setValue(FieldingCareerRecordsByYear.SORT_DIRECTION, value)

    /**
     * Set the <code>start_row</code> parameter IN value to the routine
     */
    fun setStartRow(value: Int?): Unit = setValue(FieldingCareerRecordsByYear.START_ROW, value)

    /**
     * Set the <code>page_size</code> parameter IN value to the routine
     */
    fun setPageSize(value: Int?): Unit = setValue(FieldingCareerRecordsByYear.PAGE_SIZE, value)
}
