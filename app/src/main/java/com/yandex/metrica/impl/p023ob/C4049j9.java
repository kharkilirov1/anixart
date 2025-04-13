package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.j9 */
/* loaded from: classes2.dex */
public class C4049j9 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN environment TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN user_info TEXT ");
        StringBuilder sb = new StringBuilder();
        sb.append("ALTER TABLE ");
        sb.append("reports");
        C0000a.m1B(sb, " ADD COLUMN ", "session_type", " INTEGER DEFAULT ");
        EnumC4462z6 enumC4462z6 = EnumC4462z6.FOREGROUND;
        sb.append(enumC4462z6.m21291a());
        sQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append("reports");
        C0000a.m1B(sb2, " SET ", "session_type", " = ");
        EnumC4462z6 enumC4462z62 = EnumC4462z6.BACKGROUND;
        sb2.append(enumC4462z62.m21291a());
        sb2.append(" WHERE ");
        sb2.append("session_id");
        sb2.append(" = ");
        sb2.append(-2L);
        sQLiteDatabase.execSQL(sb2.toString());
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN server_time_offset INTEGER ");
        StringBuilder sb3 = new StringBuilder();
        C0000a.m2C(sb3, "ALTER TABLE ", "sessions", " ADD COLUMN ", "type");
        sb3.append(" INTEGER DEFAULT ");
        sb3.append(enumC4462z6.m21291a());
        sQLiteDatabase.execSQL(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("UPDATE ");
        C0000a.m2C(sb4, "sessions", " SET ", "type", " = ");
        sb4.append(enumC4462z62.m21291a());
        sb4.append(" WHERE ");
        sb4.append("id");
        sb4.append(" = ");
        sb4.append(-2L);
        sQLiteDatabase.execSQL(sb4.toString());
    }
}
