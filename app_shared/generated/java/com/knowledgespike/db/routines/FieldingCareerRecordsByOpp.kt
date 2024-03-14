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
open class FieldingCareerRecordsByOpp : AbstractRoutine<java.lang.Void>("fielding_career_records_by_opp", Cricketarchive.CRICKETARCHIVE) {
    companion object {

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.team_id</code>.
         */
        val TEAM_ID: Parameter<Int?> = Internal.createParameter("team_id", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.opponents_id</code>.
         */
        val OPPONENTS_ID: Parameter<Int?> = Internal.createParameter("opponents_id", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.match_type</code>.
         */
        val MATCH_TYPE: Parameter<String?> = Internal.createParameter("match_type", SQLDataType.VARCHAR(20), false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.match_subtype</code>.
         */
        val MATCH_SUBTYPE: Parameter<String?> = Internal.createParameter("match_subtype", SQLDataType.VARCHAR(20), false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.ground_id</code>.
         */
        val GROUND_ID: Parameter<Int?> = Internal.createParameter("ground_id", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.homecountry_id</code>.
         */
        val HOMECOUNTRY_ID: Parameter<Int?> = Internal.createParameter("homecountry_id", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.homeOrAway</code>.
         */
        val HOMEORAWAY: Parameter<Int?> = Internal.createParameter("homeOrAway", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.startDate</code>.
         */
        val STARTDATE: Parameter<String?> = Internal.createParameter("startDate", SQLDataType.CLOB, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.endDate</code>.
         */
        val ENDDATE: Parameter<String?> = Internal.createParameter("endDate", SQLDataType.CLOB, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.season</code>.
         */
        val SEASON: Parameter<String?> = Internal.createParameter("season", SQLDataType.VARCHAR(10), false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.matchResult</code>.
         */
        val MATCHRESULT: Parameter<Int?> = Internal.createParameter("matchResult", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.dismissals_limit</code>.
         */
        val DISMISSALS_LIMIT: Parameter<Int?> = Internal.createParameter("dismissals_limit", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.sort_by</code>.
         */
        val SORT_BY: Parameter<Int?> = Internal.createParameter("sort_by", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.sort_direction</code>.
         */
        val SORT_DIRECTION: Parameter<String?> = Internal.createParameter("sort_direction", SQLDataType.VARCHAR(5), false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.start_row</code>.
         */
        val START_ROW: Parameter<Int?> = Internal.createParameter("start_row", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>cricketarchive.fielding_career_records_by_opp.page_size</code>.
         */
        val PAGE_SIZE: Parameter<Int?> = Internal.createParameter("page_size", SQLDataType.INTEGER, false, false)
    }

    init {
        addInParameter(FieldingCareerRecordsByOpp.TEAM_ID)
        addInParameter(FieldingCareerRecordsByOpp.OPPONENTS_ID)
        addInParameter(FieldingCareerRecordsByOpp.MATCH_TYPE)
        addInParameter(FieldingCareerRecordsByOpp.MATCH_SUBTYPE)
        addInParameter(FieldingCareerRecordsByOpp.GROUND_ID)
        addInParameter(FieldingCareerRecordsByOpp.HOMECOUNTRY_ID)
        addInParameter(FieldingCareerRecordsByOpp.HOMEORAWAY)
        addInParameter(FieldingCareerRecordsByOpp.STARTDATE)
        addInParameter(FieldingCareerRecordsByOpp.ENDDATE)
        addInParameter(FieldingCareerRecordsByOpp.SEASON)
        addInParameter(FieldingCareerRecordsByOpp.MATCHRESULT)
        addInParameter(FieldingCareerRecordsByOpp.DISMISSALS_LIMIT)
        addInParameter(FieldingCareerRecordsByOpp.SORT_BY)
        addInParameter(FieldingCareerRecordsByOpp.SORT_DIRECTION)
        addInParameter(FieldingCareerRecordsByOpp.START_ROW)
        addInParameter(FieldingCareerRecordsByOpp.PAGE_SIZE)
    }

    /**
     * Set the <code>team_id</code> parameter IN value to the routine
     */
    fun setTeamId(value: Int?): Unit = setValue(FieldingCareerRecordsByOpp.TEAM_ID, value)

    /**
     * Set the <code>opponents_id</code> parameter IN value to the routine
     */
    fun setOpponentsId(value: Int?): Unit = setValue(FieldingCareerRecordsByOpp.OPPONENTS_ID, value)

    /**
     * Set the <code>match_type</code> parameter IN value to the routine
     */
    fun setMatchType(value: String?): Unit = setValue(FieldingCareerRecordsByOpp.MATCH_TYPE, value)

    /**
     * Set the <code>match_subtype</code> parameter IN value to the routine
     */
    fun setMatchSubtype(value: String?): Unit = setValue(FieldingCareerRecordsByOpp.MATCH_SUBTYPE, value)

    /**
     * Set the <code>ground_id</code> parameter IN value to the routine
     */
    fun setGroundId(value: Int?): Unit = setValue(FieldingCareerRecordsByOpp.GROUND_ID, value)

    /**
     * Set the <code>homecountry_id</code> parameter IN value to the routine
     */
    fun setHomecountryId(value: Int?): Unit = setValue(FieldingCareerRecordsByOpp.HOMECOUNTRY_ID, value)

    /**
     * Set the <code>homeOrAway</code> parameter IN value to the routine
     */
    fun setHomeoraway(value: Int?): Unit = setValue(FieldingCareerRecordsByOpp.HOMEORAWAY, value)

    /**
     * Set the <code>startDate</code> parameter IN value to the routine
     */
    fun setStartdate(value: String?): Unit = setValue(FieldingCareerRecordsByOpp.STARTDATE, value)

    /**
     * Set the <code>endDate</code> parameter IN value to the routine
     */
    fun setEnddate(value: String?): Unit = setValue(FieldingCareerRecordsByOpp.ENDDATE, value)

    /**
     * Set the <code>season</code> parameter IN value to the routine
     */
    fun setSeason(value: String?): Unit = setValue(FieldingCareerRecordsByOpp.SEASON, value)

    /**
     * Set the <code>matchResult</code> parameter IN value to the routine
     */
    fun setMatchresult(value: Int?): Unit = setValue(FieldingCareerRecordsByOpp.MATCHRESULT, value)

    /**
     * Set the <code>dismissals_limit</code> parameter IN value to the routine
     */
    fun setDismissalsLimit(value: Int?): Unit = setValue(FieldingCareerRecordsByOpp.DISMISSALS_LIMIT, value)

    /**
     * Set the <code>sort_by</code> parameter IN value to the routine
     */
    fun setSortBy(value: Int?): Unit = setValue(FieldingCareerRecordsByOpp.SORT_BY, value)

    /**
     * Set the <code>sort_direction</code> parameter IN value to the routine
     */
    fun setSortDirection(value: String?): Unit = setValue(FieldingCareerRecordsByOpp.SORT_DIRECTION, value)

    /**
     * Set the <code>start_row</code> parameter IN value to the routine
     */
    fun setStartRow(value: Int?): Unit = setValue(FieldingCareerRecordsByOpp.START_ROW, value)

    /**
     * Set the <code>page_size</code> parameter IN value to the routine
     */
    fun setPageSize(value: Int?): Unit = setValue(FieldingCareerRecordsByOpp.PAGE_SIZE, value)
}
