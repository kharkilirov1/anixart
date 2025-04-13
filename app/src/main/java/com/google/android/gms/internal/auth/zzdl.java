package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdl;
import com.google.android.gms.internal.auth.zzdm;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public abstract class zzdl<MessageType extends zzdm<MessageType, BuilderType>, BuilderType extends zzdl<MessageType, BuilderType>> implements zzfp {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzfp
    /* renamed from: N0 */
    public final /* bridge */ /* synthetic */ zzfp mo8343N0(zzfq zzfqVar) {
        if (((zzeo) this).f16102b.getClass().isInstance(zzfqVar)) {
            return mo8345b((zzdm) zzfqVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // 
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    /* renamed from: b */
    public abstract BuilderType mo8345b(MessageType messagetype);
}
