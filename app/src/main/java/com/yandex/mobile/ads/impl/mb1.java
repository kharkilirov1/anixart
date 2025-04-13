package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
public final class mb1 {
    static {
        C5411ls.m26526a("goog.exo.database");
    }

    /* renamed from: a */
    public static void m26607a(SQLiteDatabase sQLiteDatabase, int i2, String str, int i3) throws C5239im {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i2));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i3));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e2) {
            throw new C5239im(e2);
        }
    }

    /* renamed from: a */
    public static void m26608a(SQLiteDatabase sQLiteDatabase, String str) throws C5239im {
        try {
            if (s91.m28109a(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
            }
        } catch (SQLException e2) {
            throw new C5239im(e2);
        }
    }

    /* renamed from: a */
    public static int m26606a(SQLiteDatabase sQLiteDatabase, int i2, String str) throws C5239im {
        try {
            if (!s91.m28109a(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i2), str}, null, null, null);
            try {
                if (query.getCount() == 0) {
                    query.close();
                    return -1;
                }
                query.moveToNext();
                int i3 = query.getInt(0);
                query.close();
                return i3;
            } finally {
            }
        } catch (SQLException e2) {
            throw new C5239im(e2);
        }
    }
}
