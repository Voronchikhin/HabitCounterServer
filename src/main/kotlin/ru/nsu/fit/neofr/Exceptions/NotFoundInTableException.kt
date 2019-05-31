package ru.nsu.fit.neofr.Exceptions

class NotFoundInTableException(id : Int, tableName : String) :
        Exception(id.toString() + "not foubd in " + tableName)