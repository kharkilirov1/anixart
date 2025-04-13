package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p023ob.C3515O8;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.Y8 */
/* loaded from: classes2.dex */
public class C3764Y8 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS startup (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL(C3515O8.a.b.f43545a);
        sQLiteDatabase.execSQL(C3515O8.a.InterfaceC6997a.f43543a);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}
