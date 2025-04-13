package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.V8 */
/* loaded from: classes2.dex */
public class C3689V8 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS reports");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sessions");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
    }
}
