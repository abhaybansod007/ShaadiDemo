package com.abhay.shaadi.domain.mapper

import com.abhay.shaadi.data.datasource.remote.model.RemoteUserResult
import com.abhay.shaadi.domain.model.DomainUserResult

class RandomUsersMapper {

    companion object {
        const val EMPTY_DEFAULT = ""
        const val BOOLEAN_DEFAULT = false
        const val INT_DEFAULT = 0
    }

    fun RemoteUserResult.fromRemoteToDomain(pageSize: Int) = DomainUserResult(
        userId = login?.uuid ?: EMPTY_DEFAULT,
        fullName = name?.run { "$first $last" } ?: EMPTY_DEFAULT,
        gender = gender ?: EMPTY_DEFAULT,
        address = location?.run { "${street?.name} ${street?.number}" } ?: EMPTY_DEFAULT,
        city = location?.city ?: EMPTY_DEFAULT,
        state = location?.state ?: EMPTY_DEFAULT,
        country = location?.country ?: EMPTY_DEFAULT,
        email = email ?: EMPTY_DEFAULT,
        age = "${dob?.age}",
        phone = phone ?: EMPTY_DEFAULT,
        cell = cell ?: EMPTY_DEFAULT,
        thumbImageUrl = picture?.medium ?: EMPTY_DEFAULT,
        largeImageUrl = picture?.large ?: EMPTY_DEFAULT,
        nationality = nat ?: EMPTY_DEFAULT,
        pageSize = pageSize,
        isFavorite = BOOLEAN_DEFAULT,
        isAccept = BOOLEAN_DEFAULT,
        dateFavoriteAdded = INT_DEFAULT.toLong()
    )
}