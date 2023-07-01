package com.vikecode.fullroomguide.feature_contact.domain.repository

import com.vikecode.fullroomguide.feature_contact.domain.model.Contact

sealed interface ContactRepository{

    fun upsertContact(contact: Contact)
}