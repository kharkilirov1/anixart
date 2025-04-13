package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.I7 */
/* loaded from: classes2.dex */
public class C3364I7 implements InterfaceC3703Vm<File, C3339H7>, InterfaceC3678Um<File> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
    @Nullable
    /* renamed from: a */
    public C3339H7 mo17917a(@NonNull File file) {
        String m19260a = C3681V0.m19260a(file);
        if (!TextUtils.isEmpty(m19260a)) {
            try {
                return new C3339H7(m19260a);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
    /* renamed from: b */
    public void mo17875b(@NonNull File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
