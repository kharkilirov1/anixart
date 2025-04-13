package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p023ob.C3456M;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.w9 */
/* loaded from: classes2.dex */
public class C4387w9 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", "reports", "battery_charge_type", Integer.valueOf(C3456M.b.a.UNKNOWN.m18537a())));
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s TEXT", "reports", "collection_mode"));
        sQLiteDatabase.execSQL(String.format(locale, "UPDATE %s SET %s = \"\" WHERE %s == %d AND %2$s != \"\" AND %2$s IS NOT NULL", "reports", "value", "type", Integer.valueOf(EnumC4067k1.EVENT_TYPE_START.m20218b())));
    }
}
