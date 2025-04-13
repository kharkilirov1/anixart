package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.internal.p041firebaseauthapi.zzzt;
import com.google.android.gms.internal.p041firebaseauthapi.zzzx;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public class zzzt<MessageType extends zzzx<MessageType, BuilderType>, BuilderType extends zzzt<MessageType, BuilderType>> extends zzyd<MessageType, BuilderType> {

    /* renamed from: b */
    public final zzzx f17167b;

    /* renamed from: c */
    public zzzx f17168c;

    /* renamed from: d */
    public boolean f17169d = false;

    public zzzt(MessageType messagetype) {
        this.f17167b = messagetype;
        this.f17168c = (zzzx) messagetype.mo8970l(4, null, null);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyd
    public final Object clone() throws CloneNotSupportedException {
        zzzt zzztVar = (zzzt) this.f17167b.mo8970l(5, null, null);
        zzztVar.m9644g(mo8617C());
        return zzztVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabd
    /* renamed from: d */
    public final /* synthetic */ zzabc mo8624d() {
        return this.f17167b;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyd
    /* renamed from: e */
    public final zzyd clone() {
        zzzt zzztVar = (zzzt) this.f17167b.mo8970l(5, null, null);
        zzztVar.m9644g(mo8617C());
        return zzztVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyd
    /* renamed from: f */
    public final /* synthetic */ zzyd mo9486f(zzye zzyeVar) {
        m9644g((zzzx) zzyeVar);
        return this;
    }

    /* renamed from: g */
    public final zzzt m9644g(zzzx zzzxVar) {
        if (this.f17169d) {
            m9647j();
            this.f17169d = false;
        }
        zzzx zzzxVar2 = this.f17168c;
        zzabk.f16313c.m8674a(zzzxVar2.getClass()).mo8656g(zzzxVar2, zzzxVar);
        return this;
    }

    /* renamed from: h */
    public final MessageType m9645h() {
        MessageType mo8617C = mo8617C();
        if (mo8617C.m9656j()) {
            return mo8617C;
        }
        throw new zzace();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabb
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType mo8617C() {
        if (this.f17169d) {
            return (MessageType) this.f17168c;
        }
        zzzx zzzxVar = this.f17168c;
        zzabk.f16313c.m8674a(zzzxVar.getClass()).mo8652c(zzzxVar);
        this.f17169d = true;
        return (MessageType) this.f17168c;
    }

    /* renamed from: j */
    public void m9647j() {
        zzzx zzzxVar = (zzzx) this.f17168c.mo8970l(4, null, null);
        zzabk.f16313c.m8674a(zzzxVar.getClass()).mo8656g(zzzxVar, this.f17168c);
        this.f17168c = zzzxVar;
    }
}
