package com.example.myapplication.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Joke :: class], version = 2)
abstract class StaticDataBase : RoomDatabase() {
    abstract fun JokeDao(): JokeDao

    companion object{
        @Volatile
        lateinit var INSTANCE: AppDataBase

        fun initDatabase(context: Context){
            val instance = Room.databaseBuilder(
                context.applicationContext,
                AppDataBase::class.java,
                "static_db"
            )
                .fallbackToDestructiveMigration()
                .build()
            INSTANCE = instance
        }
    }


}