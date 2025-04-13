package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.p2 */
/* loaded from: classes2.dex */
public abstract class AbstractC4198p2<T> {

    /* renamed from: a */
    @NonNull
    public final Context f46097a;

    /* renamed from: b */
    @NonNull
    private final String f46098b;

    /* renamed from: c */
    @NonNull
    private final String f46099c;

    public AbstractC4198p2(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        this.f46097a = context;
        this.f46098b = str;
        this.f46099c = str2;
    }

    @Nullable
    /* renamed from: a */
    public T m20522a() {
        int identifier = this.f46097a.getResources().getIdentifier(this.f46098b, this.f46099c, this.f46097a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return mo18603a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public abstract T mo18603a(int i2);
}
