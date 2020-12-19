package com.example.myapplication.data.repository

enum class Status
{
    RUNNING,
    SUCCESS,
    FAILED
}

class NetworkState (val status : Status, val  msg : String )
{
    companion object{
        val LOADED : NetworkState
        val LOADING : NetworkState
        val ERROR :  NetworkState
        val ENDOFIST : NetworkState

        init {
            LOADED = NetworkState(Status.SUCCESS, "SUCCESS")
            LOADING= NetworkState(Status.RUNNING, "LOADING")
            ERROR = NetworkState(Status.FAILED, "Something Went Wrong")
            ENDOFIST = NetworkState(Status.FAILED, "You have reached the end !")
        }
    }
}