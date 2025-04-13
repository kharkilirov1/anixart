package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.u9 */
/* loaded from: classes2.dex */
public class C4335u9 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(@NonNull SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", "reports", "global_number", 0));
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", "reports", "number_of_type", 0));
    }
}
