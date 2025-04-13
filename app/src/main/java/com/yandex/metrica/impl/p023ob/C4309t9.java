package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.sql.SQLException;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.t9 */
/* loaded from: classes2.dex */
public class C4309t9 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(@NonNull SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.delete("reports", "session_id = ?", new String[]{String.valueOf(-2L)});
        sQLiteDatabase.delete("sessions", "id = ?", new String[]{String.valueOf(-2L)});
    }
}
