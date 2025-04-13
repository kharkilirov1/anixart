package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.components.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2065f implements Provider {

    /* renamed from: b */
    public static final /* synthetic */ C2065f f22532b = new C2065f(0);

    /* renamed from: c */
    public static final /* synthetic */ C2065f f22533c = new C2065f(1);

    /* renamed from: a */
    public final /* synthetic */ int f22534a;

    public /* synthetic */ C2065f(int i2) {
        this.f22534a = i2;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f22534a) {
            case 0:
                return null;
            default:
                return Collections.emptySet();
        }
    }
}
