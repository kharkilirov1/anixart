package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.YandexMetrica;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.a9 */
/* loaded from: classes2.dex */
public class C3815a9 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS api_level_info (API_LEVEL INT )");
        ContentValues contentValues = new ContentValues();
        contentValues.put("API_LEVEL", Integer.valueOf(YandexMetrica.getLibraryApiLevel()));
        sQLiteDatabase.insert("api_level_info", "API_LEVEL", contentValues);
    }
}
