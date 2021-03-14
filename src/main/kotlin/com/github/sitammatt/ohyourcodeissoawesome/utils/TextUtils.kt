package com.github.sitammatt.ohyourcodeissoawesome.utils

import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable

@Nullable
fun extractWordFrom(@NotNull text: String, index: Int): String? {
    val length = text.length
    if (length <= 0 || index < 0 || index > length) {
        return null
    }
    var begin = index
    while (begin > 0 && Character.isJavaIdentifierPart(text[begin - 1])) {
        begin--
    }
    var end = index
    while (end < length && Character.isJavaIdentifierPart(text[end])) {
        end++
    }
    return if (end <= begin || begin == 0 && end == length) {
        null // fix issue 5: komplettem text ausschliessen
    } else text.substring(begin, end)
}