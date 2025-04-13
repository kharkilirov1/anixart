package com.google.android.exoplayer2.upstream;

import com.google.common.base.Predicate;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.upstream.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C1166c implements Predicate {

    /* renamed from: c */
    public static final /* synthetic */ C1166c f14542c = new C1166c(0);

    /* renamed from: d */
    public static final /* synthetic */ C1166c f14543d = new C1166c(1);

    /* renamed from: b */
    public final /* synthetic */ int f14544b;

    public /* synthetic */ C1166c(int i2) {
        this.f14544b = i2;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.f14544b) {
            case 0:
                if (((String) obj) != null) {
                }
                break;
            default:
                if (((Map.Entry) obj).getKey() != null) {
                }
                break;
        }
        return false;
    }
}
