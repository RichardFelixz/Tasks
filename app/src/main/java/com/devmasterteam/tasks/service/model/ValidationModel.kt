package com.devmasterteam.tasks.service.model

class ValidationModel(message: String = "") {

    private var status: Boolean = true
    private var message: String = ""

    init {
        if (message != "") {
            this.message = message
            this.status = false
        }

    }

    fun status() = status
    fun message() = message


}