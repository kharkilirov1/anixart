package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.cn */
/* loaded from: classes2.dex */
public class C3881cn {

    /* renamed from: c */
    @Nullable
    @SuppressLint
    private static volatile C3881cn f44891c;

    /* renamed from: a */
    @NonNull
    private final Context f44892a;

    /* renamed from: b */
    private final Map<String, C3829an> f44893b = new HashMap();

    @VisibleForTesting
    public C3881cn(@NonNull Context context) {
        this.f44892a = context;
    }

    @NonNull
    /* renamed from: a */
    public static C3881cn m19686a(@NonNull Context context) {
        if (f44891c == null) {
            synchronized (C3881cn.class) {
                if (f44891c == null) {
                    f44891c = new C3881cn(context);
                }
            }
        }
        return f44891c;
    }

    @NonNull
    /* renamed from: a */
    public C3829an m19687a(@NonNull String str) {
        if (!this.f44893b.containsKey(str)) {
            synchronized (this) {
                if (!this.f44893b.containsKey(str)) {
                    this.f44893b.put(str, new C3829an(new ReentrantLock(), new C3855bn(this.f44892a, str)));
                }
            }
        }
        return this.f44893b.get(str);
    }
}
