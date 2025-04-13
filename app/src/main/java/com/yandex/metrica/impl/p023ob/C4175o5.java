package com.yandex.metrica.impl.p023ob;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p022ac.CrashpadServiceHelper;

/* renamed from: com.yandex.metrica.impl.ob.o5 */
/* loaded from: classes2.dex */
public class C4175o5 extends AbstractC4279s5 {

    /* renamed from: b */
    private final InterfaceC3678Um<String> f46060b;

    /* renamed from: com.yandex.metrica.impl.ob.o5$a */
    public class a implements InterfaceC3678Um<String> {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(@NonNull String str) {
            String str2 = str;
            if (C3658U2.m19211a(21)) {
                CrashpadServiceHelper.m17803a(str2);
            }
        }
    }

    public C4175o5(@NonNull C3940f4 c3940f4) {
        this(c3940f4, new a());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4149n5
    /* renamed from: a */
    public boolean mo17815a(@NonNull C4066k0 c4066k0) {
        Bundle m20209k = c4066k0.m20209k();
        if (m20209k == null) {
            return true;
        }
        String string = m20209k.getString("payload_crash_id");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        this.f46060b.mo17875b(string);
        return true;
    }

    public C4175o5(@NonNull C3940f4 c3940f4, @NonNull InterfaceC3678Um<String> interfaceC3678Um) {
        super(c3940f4);
        this.f46060b = interfaceC3678Um;
    }
}
