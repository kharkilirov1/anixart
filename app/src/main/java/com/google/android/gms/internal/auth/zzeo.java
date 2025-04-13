package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzeo;
import com.google.android.gms.internal.auth.zzeq;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public class zzeo<MessageType extends zzeq<MessageType, BuilderType>, BuilderType extends zzeo<MessageType, BuilderType>> extends zzdl<MessageType, BuilderType> {

    /* renamed from: b */
    public final MessageType f16102b;

    /* renamed from: c */
    public MessageType f16103c;

    /* renamed from: d */
    public boolean f16104d = false;

    public zzeo(MessageType messagetype) {
        this.f16102b = messagetype;
        this.f16103c = (MessageType) messagetype.mo8405d(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdl
    /* renamed from: a */
    public final zzdl clone() {
        zzeo zzeoVar = (zzeo) this.f16102b.mo8405d(5, null, null);
        zzeoVar.m8399c(mo8398B());
        return zzeoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdl
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ zzdl mo8345b(zzdm zzdmVar) {
        m8399c((zzeq) zzdmVar);
        return this;
    }

    /* renamed from: c */
    public final BuilderType m8399c(MessageType messagetype) {
        if (this.f16104d) {
            MessageType messagetype2 = (MessageType) this.f16103c.mo8405d(4, null, null);
            zzfy.f16140c.m8469a(messagetype2.getClass()).mo8450c(messagetype2, this.f16103c);
            this.f16103c = messagetype2;
            this.f16104d = false;
        }
        MessageType messagetype3 = this.f16103c;
        zzfy.f16140c.m8469a(messagetype3.getClass()).mo8450c(messagetype3, messagetype);
        return this;
    }

    @Override // com.google.android.gms.internal.auth.zzdl
    public final Object clone() throws CloneNotSupportedException {
        zzeo zzeoVar = (zzeo) this.f16102b.mo8405d(5, null, null);
        zzeoVar.m8399c(mo8398B());
        return zzeoVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfp
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public MessageType mo8398B() {
        if (this.f16104d) {
            return this.f16103c;
        }
        MessageType messagetype = this.f16103c;
        zzfy.f16140c.m8469a(messagetype.getClass()).mo8449b(messagetype);
        this.f16104d = true;
        return this.f16103c;
    }

    @Override // com.google.android.gms.internal.auth.zzfr
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzfq mo8401k() {
        return this.f16102b;
    }
}
