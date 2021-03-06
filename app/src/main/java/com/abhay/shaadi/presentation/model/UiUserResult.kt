package com.abhay.shaadi.presentation.model

import android.os.Parcelable
import androidx.annotation.Keep
import androidx.databinding.ObservableBoolean
import kotlinx.android.parcel.Parcelize

@Parcelize
@Keep
data class UiUserResult(
    val userId: String,
    val fullName: String,
    val gender: String,
    val fullAddress: String,
    val city: String,
    val state: String,
    val country: String,
    val imageUrlCountry: String,
    val email: String,
    val age: String,
    val phone: String,
    val cell: String,
    val thumbImageUrl: String,
    val largeImageUrl: String,
    val nationality: String,
    val pageSize: Int,
    var isAccepted: ObservableBoolean,
    var isDeclined: ObservableBoolean,
    val dateFavoriteAdded: Long
) : Parcelable {

    companion object {
        private const val DEFAULT_EMPTY = ""
        private const val DEFAULT_SIZE = 0

        fun create() = UiUserResult(
            userId = DEFAULT_EMPTY,
            fullName = DEFAULT_EMPTY,
            gender = DEFAULT_EMPTY,
            fullAddress = DEFAULT_EMPTY,
            city = DEFAULT_EMPTY,
            state = DEFAULT_EMPTY,
            country = DEFAULT_EMPTY,
            imageUrlCountry = DEFAULT_EMPTY,
            email = DEFAULT_EMPTY,
            age = DEFAULT_EMPTY,
            phone = DEFAULT_EMPTY,
            cell = DEFAULT_EMPTY,
            thumbImageUrl = DEFAULT_EMPTY,
            largeImageUrl = DEFAULT_EMPTY,
            nationality = DEFAULT_EMPTY,
            pageSize = DEFAULT_SIZE,
            isAccepted = ObservableBoolean(false),
            isDeclined = ObservableBoolean(),
            dateFavoriteAdded = DEFAULT_SIZE.toLong()
        )
    }
}