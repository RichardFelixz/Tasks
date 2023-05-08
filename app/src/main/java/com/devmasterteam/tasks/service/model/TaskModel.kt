package com.devmasterteam.tasks.service.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = TaskModel.TABLE_NAME)
class TaskModel : Serializable{

    companion object {
        const val TABLE_NAME = "Task"
    }

    @SerializedName("Id")
    var id: Int = 0

    @SerializedName("PriorityId")
    var priorityId: Int = 0

    @SerializedName("Description")
    var description: String = ""

    @SerializedName("DuoDate")
    var duoDate: String = ""

    @SerializedName("Complete")
    var complete: Boolean = false

}