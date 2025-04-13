package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3834b2;
import java.util.EnumSet;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.Rd */
/* loaded from: classes2.dex */
public class C3594Rd implements InterfaceC3669Ud {

    /* renamed from: c */
    private static final EnumSet<C3834b2.d> f43819c = EnumSet.of(C3834b2.d.OFFLINE);

    /* renamed from: a */
    private InterfaceC4400wm f43820a = new C4270rm();

    /* renamed from: b */
    private final Context f43821b;

    public C3594Rd(@NonNull Context context) {
        this.f43821b = context;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3669Ud
    /* renamed from: a */
    public boolean mo18965a() {
        InterfaceC4400wm interfaceC4400wm = this.f43820a;
        Context context = this.f43821b;
        Objects.requireNonNull((C4270rm) interfaceC4400wm);
        return !f43819c.contains(C3834b2.m19630a(context));
    }
}
