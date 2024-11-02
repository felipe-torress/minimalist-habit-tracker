package com.example.habittracker.core.data.repository

import com.example.habittracker.core.model.data.Artist

interface ProfileRepository {

    /**
     * Gets artist profile data
     * @param artistId The Artist ID
     */
    fun getArtistProfile(artistId: String): Artist

    /**
     * Gets artist profile image
     * @param artistId The Artist ID
     */
    fun getArtistProfileImage(artistId: String): ProfileImage
}