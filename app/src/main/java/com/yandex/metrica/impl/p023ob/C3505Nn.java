package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Nn */
/* loaded from: classes2.dex */
public class C3505Nn extends AbstractC3230Cn<String> {
    public C3505Nn(int i2, @NonNull String str) {
        this(i2, str, C3379Im.m18338g());
    }

    public C3505Nn(int i2, @NonNull String str, @NonNull C3379Im c3379Im) {
        super(i2, str, c3379Im);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3555Pn
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String mo17985a(@Nullable String str) {
        if (str == null || str.length() <= super.m17943b()) {
            return str;
        }
        String substring = str.substring(0, super.m17943b());
        if (this.f42683c.m21337c()) {
            this.f42683c.m21336c("\"%s\" %s size exceeded limit of %d characters", super.m17942a(), str, Integer.valueOf(super.m17943b()));
        }
        return substring;
    }
}
