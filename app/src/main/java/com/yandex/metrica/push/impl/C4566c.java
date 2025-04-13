package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.push.impl.c */
/* loaded from: classes2.dex */
public class C4566c {

    /* renamed from: a */
    @NonNull
    private final Context f47361a;

    /* renamed from: b */
    @NonNull
    private final String f47362b;

    /* renamed from: c */
    private final SparseArray<b> f47363c;

    /* renamed from: com.yandex.metrica.push.impl.c$a */
    public class a implements b {
        public a(C4566c c4566c) {
        }

        @Override // com.yandex.metrica.push.impl.C4566c.b
        /* renamed from: a */
        public void mo21528a(@NonNull SharedPreferences sharedPreferences) {
            sharedPreferences.edit().remove("com.yandex.metrica.push.token").remove("com.yandex.metrica.push.token.last.update.time").apply();
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.c$b */
    public interface b {
        /* renamed from: a */
        void mo21528a(@NonNull SharedPreferences sharedPreferences);
    }

    public C4566c(@NonNull Context context, @NonNull String str) {
        SparseArray<b> sparseArray = new SparseArray<>();
        this.f47363c = sparseArray;
        sparseArray.put(1, new a(this));
        this.f47361a = context;
        this.f47362b = context.getPackageName() + str;
        m21523b();
    }

    /* renamed from: b */
    private void m21523b() {
        int i2 = m21524a().getInt("storage_version", 0);
        if (i2 < 1) {
            while (i2 <= 1) {
                b bVar = this.f47363c.get(i2);
                if (bVar != null) {
                    bVar.mo21528a(m21524a());
                }
                i2++;
            }
            m21524a().edit().putInt("storage_version", 1).apply();
        }
    }

    @NonNull
    /* renamed from: a */
    public SharedPreferences m21524a() {
        return this.f47361a.getSharedPreferences(this.f47362b, 0);
    }

    @NonNull
    /* renamed from: a */
    public C4566c m21525a(@NonNull String str, @Nullable String str2) {
        m21524a().edit().putString(str, str2).apply();
        return this;
    }

    @NonNull
    /* renamed from: a */
    public C4566c m21526a(@NonNull String str, boolean z) {
        m21524a().edit().putBoolean(str, z).apply();
        return this;
    }

    @Nullable
    /* renamed from: a */
    public Boolean m21527a(@NonNull String str) {
        if (m21524a().contains(str)) {
            return Boolean.valueOf(m21524a().getBoolean(str, false));
        }
        return null;
    }
}
