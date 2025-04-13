package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5751sl;
import com.yandex.mobile.ads.impl.ui1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class cf0 extends i11 {

    /* renamed from: m */
    private final ap0 f49221m = new ap0();

    @Override // com.yandex.mobile.ads.impl.i11
    /* renamed from: a */
    public final w41 mo23247a(byte[] bArr, int i2, boolean z) throws y41 {
        C5751sl m28305a;
        this.f49221m.m22582a(i2, bArr);
        ArrayList arrayList = new ArrayList();
        while (this.f49221m.m22579a() > 0) {
            if (this.f49221m.m22579a() < 8) {
                throw new y41("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int m22595h = this.f49221m.m22595h();
            if (this.f49221m.m22595h() == 1987343459) {
                ap0 ap0Var = this.f49221m;
                int i3 = m22595h - 8;
                CharSequence charSequence = null;
                C5751sl.a aVar = null;
                while (i3 > 0) {
                    if (i3 < 8) {
                        throw new y41("Incomplete vtt cue box header found.");
                    }
                    int m22595h2 = ap0Var.m22595h();
                    int m22595h3 = ap0Var.m22595h();
                    int i4 = m22595h2 - 8;
                    String m28104a = s91.m28104a(ap0Var.m22587c(), ap0Var.m22588d(), i4);
                    ap0Var.m22593f(i4);
                    i3 = (i3 - 8) - i4;
                    if (m22595h3 == 1937011815) {
                        aVar = ui1.m29008a(m28104a);
                    } else if (m22595h3 == 1885436268) {
                        charSequence = ui1.m29007a(null, m28104a.trim(), Collections.emptyList());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    m28305a = aVar.m28304a(charSequence).m28305a();
                } else {
                    Pattern pattern = ui1.f55509a;
                    ui1.C5867d c5867d = new ui1.C5867d();
                    c5867d.f55524c = charSequence;
                    m28305a = c5867d.m29022a().m28305a();
                }
                arrayList.add(m28305a);
            } else {
                this.f49221m.m22593f(m22595h - 8);
            }
        }
        return new df0(arrayList);
    }
}
