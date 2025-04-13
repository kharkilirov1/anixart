package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p023ob.C3696Vf;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.B9 */
/* loaded from: classes2.dex */
public class C3191B9 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL(String.format(Locale.US, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", "reports", "open_id", Long.valueOf(new C3696Vf.d.a().f44290x)));
    }
}
