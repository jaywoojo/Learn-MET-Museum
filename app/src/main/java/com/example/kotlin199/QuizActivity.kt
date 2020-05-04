package com.example.kotlin199

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity

import com.example.kotlin199.R

class QuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.learn_activity)

        /**
        class Helper(context: Context,
                                   factory: SQLiteDatabase.CursorFactory?) :
                SQLiteOpenHelper(context, DATABASE_NAME,
                        factory, DATABASE_VERSION) {
            override fun onCreate(db: SQLiteDatabase) {
                val CREATE_PRODUCTS_TABLE = ("CREATE TABLE " +
                        TABLE_NAME + "("
                        + COLUMN_ID + " INTEGER PRIMARY KEY," +
                        COLUMN_NAME
                        + " TEXT" + ")")
                db.execSQL(CREATE_PRODUCTS_TABLE)
            }
            override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
                db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
                onCreate(db)
            }
            fun addName(name: Name) {
                val values = ContentValues()
                values.put(COLUMN_NAME, name.userName)
                val db = this.writableDatabase
                db.insert(TABLE_NAME, null, values)
                db.close()
            }
            fun getAllName(): Cursor? {
                val db = this.readableDatabase
                return db.rawQuery("SELECT * FROM $TABLE_NAME", null)
            }
            companion object {
                private val DATABASE_VERSION = 1
                private val DATABASE_NAME = "mindorksName.db"
                val TABLE_NAME = "name"
                val COLUMN_ID = "_id"
                val COLUMN_NAME = "username"
            }
        }
         */




        /**
         * Button asianartButton = findViewById(R.id.asianartButton);
         * asianartButton.setOnClickListener(v -> {
         * Intent x = new Intent(this, AsianartActivity.class);
         * startActivity(x);
         * finish();
         * });
         *
         * Button europeanButton = findViewById(R.id.europeanButton);
         * europeanButton.setOnClickListener(v -> {
         * Intent x = new Intent(this, EuropeanArtActivity.class);
         * startActivity(x);
         * finish();
         * });
         */


    }
}

