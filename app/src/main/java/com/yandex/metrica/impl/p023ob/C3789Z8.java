package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p023ob.C3515O8;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.Z8 */
/* loaded from: classes2.dex */
public class C3789Z8 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_id_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS api_level_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS startup");
        sQLiteDatabase.execSQL(C3515O8.a.b.f43546b);
        sQLiteDatabase.execSQL(C3515O8.a.InterfaceC6997a.f43544b);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
    }
}
