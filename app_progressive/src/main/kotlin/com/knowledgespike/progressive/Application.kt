package com.knowledgespike.progressive

import com.knowledgespike.shared.logging.LoggerDelegate
import kotlinx.coroutines.runBlocking
import org.jooq.SQLDialect

class Application {
    companion object {
        private val log by LoggerDelegate()

        var dialect = SQLDialect.DEFAULT

        @JvmStatic
        fun main(args: Array<String>) = runBlocking {

        }

    }
}