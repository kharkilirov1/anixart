package com.google.android.exoplayer2.database;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.exoplayer2.util.Log;

/* loaded from: classes.dex */
public class StandaloneDatabaseProvider extends SQLiteOpenHelper implements DatabaseProvider {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 16 + String.valueOf(string2).length());
                    sb.append("DROP ");
                    sb.append(string);
                    sb.append(" IF EXISTS ");
                    sb.append(string2);
                    String sb2 = sb.toString();
                    try {
                        sQLiteDatabase.execSQL(sb2);
                    } catch (SQLException e2) {
                        String valueOf = String.valueOf(sb2);
                        Log.m7585b("SADatabaseProvider", valueOf.length() != 0 ? "Error executing ".concat(valueOf) : new String("Error executing "), e2);
                    }
                }
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        query.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
