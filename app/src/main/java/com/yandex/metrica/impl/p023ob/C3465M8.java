package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.impl.ob.M8 */
/* loaded from: classes2.dex */
public class C3465M8 implements InterfaceC3440L8 {

    /* renamed from: a */
    private final Context f43400a;

    /* renamed from: b */
    private final String f43401b;

    /* renamed from: c */
    @NonNull
    private final C3265E8 f43402c;

    /* renamed from: d */
    @NonNull
    private final C3855bn f43403d;

    /* renamed from: e */
    private C4386w8 f43404e;

    @VisibleForTesting
    public C3465M8(@NonNull Context context, @NonNull String str, @NonNull C3855bn c3855bn, @NonNull C3265E8 c3265e8) {
        this.f43400a = context;
        this.f43401b = str;
        this.f43403d = c3855bn;
        this.f43402c = c3265e8;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3440L8
    @Nullable
    @WorkerThread
    /* renamed from: a */
    public synchronized SQLiteDatabase mo18481a() {
        C4386w8 c4386w8;
        try {
            this.f43403d.m19663a();
            c4386w8 = new C4386w8(this.f43400a, this.f43401b, this.f43402c);
            this.f43404e = c4386w8;
        } catch (Throwable unused) {
            return null;
        }
        return c4386w8.getWritableDatabase();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3440L8
    @WorkerThread
    /* renamed from: a */
    public synchronized void mo18482a(@Nullable SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        C3658U2.m19209a((Closeable) this.f43404e);
        this.f43403d.m19664b();
        this.f43404e = null;
    }
}
