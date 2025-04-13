package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.Mn */
/* loaded from: classes2.dex */
public class C3480Mn extends AbstractC3230Cn<String> {
    public C3480Mn(int i2, @NonNull String str, @NonNull C3379Im c3379Im) {
        super(i2, str, c3379Im);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3555Pn
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String mo17985a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (bytes.length <= super.m17943b()) {
                return str;
            }
            String str2 = new String(bytes, 0, super.m17943b(), "UTF-8");
            try {
                if (this.f42683c.m21337c()) {
                    this.f42683c.m21336c("\"%s\" %s exceeded limit of %d bytes", super.m17942a(), str, Integer.valueOf(super.m17943b()));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
