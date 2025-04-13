package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.m9 */
/* loaded from: classes2.dex */
public class C4127m9 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN connection_type INTEGER DEFAULT 2");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN cellular_connection_type TEXT ");
    }
}
