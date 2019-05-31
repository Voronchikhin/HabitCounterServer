package ru.nsu.fit.neofr.exceptions

class NotFoundInTableException(id : Int, tableName : String) :
        Exception(id.toString() + "not found in " + tableName)