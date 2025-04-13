package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.internal.p041firebaseauthapi.zzyd;
import com.google.android.gms.internal.p041firebaseauthapi.zzye;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public abstract class zzyd<MessageType extends zzye<MessageType, BuilderType>, BuilderType extends zzyd<MessageType, BuilderType>> implements zzabb {
    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabb
    /* renamed from: L0 */
    public final /* synthetic */ zzabb mo8618L0(zzabc zzabcVar) {
        if (((zzzt) this).f17167b.getClass().isInstance(zzabcVar)) {
            return mo9486f((zzye) zzabcVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // 
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract zzyd clone();

    /* renamed from: f */
    public abstract zzyd mo9486f(zzye zzyeVar);
}
