package com.knowledgespike.shared.data


data class TeamParams(
    val teamIds: List<Int>,
    val opponentIds: List<Int>,
    val team: String,
    val opponents: String,
    val matchType: String,
    val matchSubType: String,
)

fun getTeamParams(
    teamsAndOpponents: TeamsAndOpponents,
    matchType: String,
    matchSubType: String
): Pair<TeamParams, TeamParams> {
    val teamParamA = TeamParams(
        teamsAndOpponents.teamIds,
        teamsAndOpponents.opponentIds,
        teamsAndOpponents.teamName,
        teamsAndOpponents.opponentsName,
        matchType,
        matchSubType
    )
    val teamParamB = TeamParams(
        teamsAndOpponents.opponentIds,
        teamsAndOpponents.teamIds,
        teamsAndOpponents.opponentsName,
        teamsAndOpponents.teamName,
        matchType,
        matchSubType
    )

    return Pair(teamParamA, teamParamB)
}
