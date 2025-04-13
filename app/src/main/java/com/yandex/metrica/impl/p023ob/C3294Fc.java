package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Fc */
/* loaded from: classes2.dex */
public class C3294Fc extends AbstractC3884d0 {

    /* renamed from: b */
    @NonNull
    private final C3949fd f42906b;

    public C3294Fc(@Nullable AbstractC3884d0 abstractC3884d0, @NonNull C3949fd c3949fd) {
        super(abstractC3884d0);
        this.f42906b = c3949fd;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3884d0
    /* renamed from: b */
    public void mo18099b(@Nullable Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            this.f42906b.mo18726b((C3949fd) location);
        }
    }
}
