package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.charset.Charset;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzaau implements zzabp {

    /* renamed from: b */
    public static final zzaba f16284b = new zzaas();

    /* renamed from: a */
    public final zzaba f16285a;

    public zzaau() {
        zzaba zzabaVar;
        zzaba[] zzabaVarArr = new zzaba[2];
        zzabaVarArr[0] = zzzs.f17166a;
        try {
            zzabaVar = (zzaba) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzabaVar = f16284b;
        }
        zzabaVarArr[1] = zzabaVar;
        zzaat zzaatVar = new zzaat(zzabaVarArr);
        Charset charset = zzaad.f16259a;
        this.f16285a = zzaatVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabp
    /* renamed from: a */
    public final zzabo mo8604a(Class cls) {
        Class cls2;
        Class cls3 = zzabq.f16323a;
        if (!zzzx.class.isAssignableFrom(cls) && (cls2 = zzabq.f16323a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        zzaaz mo8602a = this.f16285a.mo8602a(cls);
        if (mo8602a.mo8614w()) {
            if (zzzx.class.isAssignableFrom(cls)) {
                zzacf zzacfVar = zzabq.f16326d;
                zzzl zzzlVar = zzzn.f17153a;
                return new zzabg(zzacfVar, zzzn.f17153a, mo8602a.mo8612u());
            }
            zzacf zzacfVar2 = zzabq.f16324b;
            zzzl zzzlVar2 = zzzn.f17154b;
            if (zzzlVar2 != null) {
                return new zzabg(zzacfVar2, zzzlVar2, mo8602a.mo8612u());
            }
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        if (zzzx.class.isAssignableFrom(cls)) {
            if (!(mo8602a.mo8613v() == 1)) {
                return zzabf.m8632H(mo8602a, zzabi.f16312b, zzaaq.f16280b, zzabq.f16326d, null, zzaay.f16289b);
            }
            zzabh zzabhVar = zzabi.f16312b;
            zzaaq zzaaqVar = zzaaq.f16280b;
            zzacf zzacfVar3 = zzabq.f16326d;
            zzzl zzzlVar3 = zzzn.f17153a;
            return zzabf.m8632H(mo8602a, zzabhVar, zzaaqVar, zzacfVar3, zzzn.f17153a, zzaay.f16289b);
        }
        if (!(mo8602a.mo8613v() == 1)) {
            return zzabf.m8632H(mo8602a, zzabi.f16311a, zzaaq.f16279a, zzabq.f16325c, null, zzaay.f16288a);
        }
        zzabh zzabhVar2 = zzabi.f16311a;
        zzaaq zzaaqVar2 = zzaaq.f16279a;
        zzacf zzacfVar4 = zzabq.f16324b;
        zzzl zzzlVar4 = zzzn.f17154b;
        if (zzzlVar4 != null) {
            return zzabf.m8632H(mo8602a, zzabhVar2, zzaaqVar2, zzacfVar4, zzzlVar4, zzaay.f16288a);
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
