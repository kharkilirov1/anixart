package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.Q8 */
/* loaded from: classes2.dex */
public class C3565Q8 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}
