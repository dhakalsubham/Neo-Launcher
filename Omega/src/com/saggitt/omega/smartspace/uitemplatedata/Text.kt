package com.saggitt.omega.smartspace.uitemplatedata

import android.text.TextUtils

data class Text(
    val text: CharSequence,
    val truncateAtType: TextUtils.TruncateAt?,
    val maxLines: Int,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Text) return false
        val that: Text = other
        return truncateAtType == that.truncateAtType && SmartspaceUtils.isEqual(
            text,
            that.text
        ) && maxLines == that.maxLines
    }
}