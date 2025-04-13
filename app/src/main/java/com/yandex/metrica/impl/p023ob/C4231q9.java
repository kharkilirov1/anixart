package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.q9 */
/* loaded from: classes2.dex */
public class C4231q9 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", "reports", "encrypting_mode", Integer.valueOf(EnumC4141mn.NONE.m20405a())));
        sQLiteDatabase.execSQL(String.format(locale, "UPDATE %s SET %s = %d where %s=%d", "reports", "encrypting_mode", Integer.valueOf(EnumC4141mn.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER.m20405a()), "type", Integer.valueOf(EnumC4067k1.EVENT_TYPE_IDENTITY.m20218b())));
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN profile_id TEXT ");
    }
}
