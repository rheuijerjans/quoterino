package com.rheuijer.quoterino

import java.io.File
import java.util.*

/**
 * Reads all lines from a file and returns the lines as a list.
 */
fun readQuotesFromFile(path: String): List<String> {

    val file = File(path)
    val quotes: MutableList<String> = mutableListOf()

    file.forEachLine { quotes.add(it) }

    return quotes
}

/**
 * Takes a random element from a List.
 */
fun <E> List<E>.takeRandom(): E {
    val random = Random()
    val i = random.nextInt(this.size)
    return this[i]
}