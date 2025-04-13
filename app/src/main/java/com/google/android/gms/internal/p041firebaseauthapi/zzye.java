package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.internal.p041firebaseauthapi.zzyd;
import com.google.android.gms.internal.p041firebaseauthapi.zzye;
import java.io.IOException;
import java.util.logging.Logger;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public abstract class zzye<MessageType extends zzye<MessageType, BuilderType>, BuilderType extends zzyd<MessageType, BuilderType>> implements zzabc {
    public int zza = 0;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabc
    /* renamed from: a */
    public final byte[] mo8621a() {
        try {
            zzzx zzzxVar = (zzzx) this;
            int mo8619D = zzzxVar.mo8619D();
            byte[] bArr = new byte[mo8619D];
            Logger logger = zzzf.f17142b;
            zzzb zzzbVar = new zzzb(bArr, 0, mo8619D);
            zzzxVar.m9655i(zzzbVar);
            if (zzzbVar.m9589A() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException(C0000a.m16m("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabc
    /* renamed from: b */
    public final zzyu mo8622b() {
        try {
            zzzx zzzxVar = (zzzx) this;
            int mo8619D = zzzxVar.mo8619D();
            zzyu zzyuVar = zzyu.f17120c;
            byte[] bArr = new byte[mo8619D];
            Logger logger = zzzf.f17142b;
            zzzb zzzbVar = new zzzb(bArr, 0, mo8619D);
            zzzxVar.m9655i(zzzbVar);
            if (zzzbVar.m9589A() == 0) {
                return new zzyr(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException(C0000a.m16m("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e2);
        }
    }

    /* renamed from: e */
    public int mo9487e() {
        throw null;
    }

    /* renamed from: f */
    public void mo9488f(int i2) {
        throw null;
    }
}
