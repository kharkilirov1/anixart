package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.k9 */
/* loaded from: classes2.dex */
public class C4075k9 extends AbstractC3540P8 {

    /* renamed from: a */
    private static final String f45609a;

    static {
        StringBuilder m24u = C0000a.m24u("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT ");
        m24u.append(EnumC4462z6.FOREGROUND.m21291a());
        m24u.append(",");
        m24u.append("app_environment");
        m24u.append(" TEXT DEFAULT '");
        C0000a.m2C(m24u, "{}", "',", "app_environment_revision", " INTEGER DEFAULT ");
        f45609a = C0000a.m19p(m24u, 0L, " )");
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN app_environment TEXT DEFAULT '{}'");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN app_environment_revision INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE reports RENAME TO reports_backup");
        sQLiteDatabase.execSQL(f45609a);
        Cursor cursor = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM reports_backup", null);
            while (rawQuery.moveToNext()) {
                try {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(rawQuery, contentValues);
                    String asString = contentValues.getAsString("environment");
                    contentValues.remove("environment");
                    contentValues.put("error_environment", asString);
                    sQLiteDatabase.insert("reports", null, contentValues);
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                    C3658U2.m19207a(cursor);
                    throw th;
                }
            }
            C3658U2.m19207a(rawQuery);
            sQLiteDatabase.execSQL("DROP TABLE reports_backup");
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
