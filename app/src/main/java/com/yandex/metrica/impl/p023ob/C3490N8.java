package com.yandex.metrica.impl.p023ob;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.N8 */
/* loaded from: classes2.dex */
public class C3490N8 implements InterfaceC3440L8 {

    /* renamed from: a */
    private final C4386w8 f43463a;

    public C3490N8(C4386w8 c4386w8) {
        this.f43463a = c4386w8;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3440L8
    @Nullable
    /* renamed from: a */
    public SQLiteDatabase mo18481a() {
        try {
            return this.f43463a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3440L8
    /* renamed from: a */
    public void mo18482a(@Nullable SQLiteDatabase sQLiteDatabase) {
    }
}
