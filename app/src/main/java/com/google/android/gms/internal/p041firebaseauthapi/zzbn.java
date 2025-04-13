package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzbn {

    /* renamed from: a */
    public final Class f16406a;

    /* renamed from: c */
    public zzbo f16408c;

    /* renamed from: b */
    public ConcurrentMap f16407b = new ConcurrentHashMap();

    /* renamed from: d */
    public final zzge f16409d = zzge.f16513b;

    public /* synthetic */ zzbn(Class cls, zzbm zzbmVar) {
        this.f16406a = cls;
    }

    /* renamed from: a */
    public final zzbn m8868a(Object obj, zzkx zzkxVar, boolean z) throws GeneralSecurityException {
        byte[] array;
        if (this.f16407b == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (zzkxVar.m9247x() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        zzbs zzbsVar = new zzbs(zzkxVar.m9245r().m9223u(), zzkxVar.m9248y());
        int m9248y = zzkxVar.m9248y() - 2;
        if (m9248y != 1) {
            if (m9248y != 2) {
                if (m9248y == 3) {
                    array = zzas.f16392a;
                } else if (m9248y != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzkxVar.m9244q()).array();
        } else {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzkxVar.m9244q()).array();
        }
        zzbo zzboVar = new zzbo(obj, array, zzkxVar.m9248y(), zzbsVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzboVar);
        byte[] bArr = zzboVar.f16411b;
        zzbq zzbqVar = new zzbq(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
        List list = (List) this.f16407b.put(zzbqVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(zzboVar);
            this.f16407b.put(zzbqVar, Collections.unmodifiableList(arrayList2));
        }
        if (z) {
            if (this.f16408c != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f16408c = zzboVar;
        }
        return this;
    }
}
