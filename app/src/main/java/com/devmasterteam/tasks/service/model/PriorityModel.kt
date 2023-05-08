package com.devmasterteam.tasks.service.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Priority")
class PriorityModel {

    @SerializedName("Id")
    @PrimaryKey
    var id: Int = 0

    @SerializedName("Description")
    var description: String = ""

}