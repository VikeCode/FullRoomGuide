package com.vikecode.fullroomguide.feature_contact.data.data_source

import com.vikecode.fullroomguide.feature_contact.domain.model.Contact

data class ContactState(
    val contacts: List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val isAddingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME
){
    val isSaveEnabled: Boolean
        get() = firstName.isNotBlank() && lastName.isNotBlank() && phoneNumber.isNotBlank()
}