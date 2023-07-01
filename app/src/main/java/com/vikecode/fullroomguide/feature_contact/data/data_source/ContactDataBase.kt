package com.vikecode.fullroomguide.feature_contact.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.vikecode.fullroomguide.feature_contact.domain.model.Contact

@Database(
    entities = [Contact::class],
    version = 1
)
abstract class ContactDataBase: RoomDatabase() {

    abstract val dao: ContactDao

}