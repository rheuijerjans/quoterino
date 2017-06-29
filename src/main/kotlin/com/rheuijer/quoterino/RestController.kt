package com.rheuijer.quoterino

import org.joda.time.DateTime
import org.joda.time.DateTimeConstants
import org.joda.time.Period
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.io.File

@RestController
class RestController {

    @Value("\${my.path}")
    lateinit private var path: String

    @RequestMapping("/countdown")
    fun hoeLangMoetRickNogWerken(): String {

        val tNow = DateTime()
        val tEnd = DateTime(2017, 6, 29, 16, 0)
        val period = Period(tNow, tEnd)

        return "${period.days} days, ${period.hours} hours en ${period.minutes} minutes!"
    }

    @RequestMapping("/whatDay")
    fun welkeDagIsHet(): String {

        val tNow = DateTime()

        return when (tNow.dayOfWeek().get()) {
            DateTimeConstants.MONDAY -> "Mario Monday"
            DateTimeConstants.TUESDAY -> "Toscano Tuesday"
            DateTimeConstants.WEDNESDAY -> "Mario Mittwoch"
            DateTimeConstants.THURSDAY -> "Toscano Thursday"
            DateTimeConstants.FRIDAY -> "Black Sabbath Friday"
            else -> {
                "Weekend!"
            }
        }
    }

    @RequestMapping("/inspireMe")
    fun randomQuote(): String {
        return readQuotesFromFile(path).takeRandom()
    }

    @RequestMapping("/allQuotes")
    fun allQuotes(): List<String> {
        return readQuotesFromFile(path)
    }

    @RequestMapping("/addQuote")
    fun addQuote(@RequestParam(value="quote", defaultValue="") quote: String) {

        if (quote.isEmpty()) error("no request param")

        val file = File(path)
        file.appendText(System.lineSeparator())
        file.appendText(quote)
    }

}


