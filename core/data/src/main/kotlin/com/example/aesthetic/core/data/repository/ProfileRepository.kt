package com.example.aesthetic.core.data.repository

import com.example.aesthetic.core.model.data.Artist
import com.example.aesthetic.core.model.data.ProfileImage

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