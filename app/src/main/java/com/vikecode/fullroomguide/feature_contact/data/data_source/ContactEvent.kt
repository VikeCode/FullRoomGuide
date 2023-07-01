package com.vikecode.fullroomguide.feature_contact.data.data_source

import com.vikecode.fullroomguide.feature_contact.domain.model.Contact

sealed interface ContactEvent{
    object SaveContact: ContactEvent
    data class SetFirstName(val firstName: String): ContactEvent
    data class SetLastName(val lastName: String): ContactEvent
    data class SetPhoneNumber(val phoneNumber: String): ContactEvent
    object ShowDialog: ContactEvent
    object HideDialog: ContactEvent
    data class SortContacts(val sortType: SortType): ContactEvent
    data class DeleteContacts(val contact: Contact): ContactEvent
}