package com.example.androidar;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class SQLiteAdapter {

    // Вводим используемые значения и переменные:
    public static final String DATABASE_NAME = "MY_DATABASE";
    public static final String DATABASE_TABLE = "MY_TABLE";
    public static final int DATABASE_VERSION = 1;
    public static final String KEY_CONTENT = "Content";

    // Создаем таблицу с данными MY_DATABASE:
    private static final String SCRIPT_CREATE_DATABASE = "create table " + DATABASE_TABLE +" ( " +KEY_CONTENT+ ");" ;

    private SQLiteHelper sqLiteHelper;
    private SQLiteDatabase sqLiteDatabase;
    private Context context;

    public SQLiteAdapter(Context c){context = c;
    }

    // Читаем данные с базы данных:
    public SQLiteAdapter openToRead() throws android.database.SQLException {
        sqLiteHelper = new SQLiteHelper(context, DATABASE_NAME, null, DATABASE_VERSION);
        sqLiteDatabase = sqLiteHelper.getReadableDatabase();
        return this;
    }

    // Записываем данные в базу данных:
    public SQLiteAdapter openToWrite() throws android.database.SQLException {
        sqLiteHelper = new SQLiteHelper(context, DATABASE_NAME, null, DATABASE_VERSION);
        sqLiteDatabase = sqLiteHelper.getWritableDatabase();
        return this;
    }

    // Закрываем sqLiteHelper:
    public void close(){sqLiteHelper.close();
    }

    // Вставляем введенное содержимое в базу:
    public long insert(String content){
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_CONTENT, content);
        return sqLiteDatabase.insert(DATABASE_TABLE, null, contentValues);
    }

    // Удаляем все содержимое базы данных:
    public int deleteAll(){return sqLiteDatabase.delete(DATABASE_TABLE, null, null);
    }

    // Делаем запрос на получение текстовых данных с базы, отображаемых в виде столбца:
    public String queueAll(){
        String[] columns = new String[]{KEY_CONTENT};
        Cursor cursor = sqLiteDatabase.query(DATABASE_TABLE, columns,null, null, null, null, null);
        String result = "";

        int index_CONTENT = cursor.getColumnIndex(KEY_CONTENT);
        for(cursor.moveToFirst(); !(cursor.isAfterLast()); cursor.moveToNext()){
            result = result + cursor.getString(index_CONTENT) + "\n";
        }
        return result;
    }

    public class SQLiteHelper extends SQLiteOpenHelper {
        public SQLiteHelper(Context context, String name,CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        // Метод, создающий таблицу для хранения данных:
        @Override
        public void onCreate(SQLiteDatabase db) {db.execSQL(SCRIPT_CREATE_DATABASE);
        }

        // Метод для обновления базы данных, оставим пустым:
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }
    }
}