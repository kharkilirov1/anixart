package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ps0 implements id1 {

    /* renamed from: a */
    @NonNull
    private final Context f53642a;

    /* renamed from: b */
    @NonNull
    private final n71 f53643b = new n71();

    /* renamed from: c */
    @NonNull
    private final LinkedList f53644c;

    public ps0(@NonNull Context context, @NonNull hc1 hc1Var) {
        this.f53642a = context.getApplicationContext();
        this.f53644c = m27373a(hc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.id1
    /* renamed from: a */
    public final void mo22386a(long j2, long j3) {
        Iterator it = this.f53644c.iterator();
        while (it.hasNext()) {
            os0 os0Var = (os0) it.next();
            float m27106a = os0Var.m27106a();
            String m27107b = os0Var.m27107b();
            if (m27106a <= j3) {
                se1.f54656c.m28240a(this.f53642a).m28239a(m27107b);
                it.remove();
            }
        }
    }

    @NonNull
    /* renamed from: a */
    private LinkedList m27373a(@NonNull hc1 hc1Var) {
        LinkedList linkedList = new LinkedList();
        C5083fl m25116a = hc1Var.m25116a();
        long m24614d = m25116a.m24614d();
        Objects.requireNonNull(this.f53643b);
        ArrayList m26814a = n71.m26814a(m25116a);
        ArrayList arrayList = new ArrayList();
        Iterator it = m26814a.iterator();
        while (it.hasNext()) {
            j71 j71Var = (j71) it.next();
            if ("progress".equals(j71Var.m25813a())) {
                arrayList.add(j71Var);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            j71 j71Var2 = (j71) it2.next();
            String m25815c = j71Var2.m25815c();
            VastTimeOffset m25814b = j71Var2.m25814b();
            os0 os0Var = null;
            if (m25814b != null) {
                Long valueOf = VastTimeOffset.EnumC6270b.f57986a.equals(m25814b.m30765c()) ? Long.valueOf((long) m25814b.m30766d()) : null;
                if (VastTimeOffset.EnumC6270b.f57987b.equals(m25814b.m30765c())) {
                    valueOf = Long.valueOf((long) ((m25814b.m30766d() / 100.0f) * m24614d));
                }
                if (valueOf != null) {
                    os0Var = new os0(m25815c, valueOf.longValue());
                }
            }
            if (os0Var != null) {
                linkedList.add(os0Var);
            }
        }
        return linkedList;
    }
}
