package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.Yb */
/* loaded from: classes2.dex */
public abstract class AbstractC3767Yb {

    /* renamed from: com.yandex.metrica.impl.ob.Yb$a */
    public static class a extends AbstractC3767Yb {
        @Override // com.yandex.metrica.impl.p023ob.AbstractC3767Yb
        @TargetApi
        /* renamed from: b */
        public C3792Zb mo19446b(@NonNull FeatureInfo featureInfo) {
            return new C3792Zb(featureInfo.name, featureInfo.version, m19447c(featureInfo));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Yb$b */
    public static class b extends AbstractC3767Yb {
        @Override // com.yandex.metrica.impl.p023ob.AbstractC3767Yb
        /* renamed from: b */
        public C3792Zb mo19446b(@NonNull FeatureInfo featureInfo) {
            return new C3792Zb(featureInfo.name, -1, m19447c(featureInfo));
        }
    }

    /* renamed from: a */
    public C3792Zb m19445a(@NonNull FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return mo19446b(featureInfo);
        }
        int i2 = featureInfo.reqGlEsVersion;
        return i2 == 0 ? mo19446b(featureInfo) : new C3792Zb("openGlFeature", i2, m19447c(featureInfo));
    }

    /* renamed from: b */
    public abstract C3792Zb mo19446b(FeatureInfo featureInfo);

    /* renamed from: c */
    public boolean m19447c(FeatureInfo featureInfo) {
        return (featureInfo.flags & 1) != 0;
    }
}
