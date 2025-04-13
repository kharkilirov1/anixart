package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzfi implements zzgc {

    /* renamed from: b */
    public static final zzfo f16116b = new zzfg();

    /* renamed from: a */
    public final zzfo f16117a;

    public zzfi() {
        zzfo zzfoVar;
        zzfo[] zzfoVarArr = new zzfo[2];
        zzfoVarArr[0] = zzen.f16101a;
        try {
            zzfoVar = (zzfo) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzfoVar = f16116b;
        }
        zzfoVarArr[1] = zzfoVar;
        zzfh zzfhVar = new zzfh(zzfoVarArr);
        Charset charset = zzev.f16107a;
        this.f16117a = zzfhVar;
    }

    @Override // com.google.android.gms.internal.auth.zzgc
    /* renamed from: a */
    public final <T> zzgb<T> mo8427a(Class<T> cls) {
        Class<?> cls2;
        Class<?> cls3 = zzgd.f16149a;
        if (!zzeq.class.isAssignableFrom(cls) && (cls2 = zzgd.f16149a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        zzfn mo8396a = this.f16117a.mo8396a(cls);
        if (mo8396a.mo8433w()) {
            if (zzeq.class.isAssignableFrom(cls)) {
                zzgp<?, ?> zzgpVar = zzgd.f16152d;
                zzeh<?> zzehVar = zzej.f16093a;
                return new zzfu(zzgpVar, zzej.f16093a, mo8396a.mo8431u());
            }
            zzgp<?, ?> zzgpVar2 = zzgd.f16150b;
            zzeh<?> zzehVar2 = zzej.f16094b;
            if (zzehVar2 != null) {
                return new zzfu(zzgpVar2, zzehVar2, mo8396a.mo8431u());
            }
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        if (zzeq.class.isAssignableFrom(cls)) {
            if (!(mo8396a.mo8432v() == 1)) {
                return zzft.m8440r(mo8396a, zzfw.f16139b, zzfe.f16112b, zzgd.f16152d, null, zzfm.f16121b);
            }
            zzfv zzfvVar = zzfw.f16139b;
            zzfe zzfeVar = zzfe.f16112b;
            zzgp<?, ?> zzgpVar3 = zzgd.f16152d;
            zzeh<?> zzehVar3 = zzej.f16093a;
            return zzft.m8440r(mo8396a, zzfvVar, zzfeVar, zzgpVar3, zzej.f16093a, zzfm.f16121b);
        }
        if (!(mo8396a.mo8432v() == 1)) {
            return zzft.m8440r(mo8396a, zzfw.f16138a, zzfe.f16111a, zzgd.f16151c, null, zzfm.f16120a);
        }
        zzfv zzfvVar2 = zzfw.f16138a;
        zzfe zzfeVar2 = zzfe.f16111a;
        zzgp<?, ?> zzgpVar4 = zzgd.f16150b;
        zzeh<?> zzehVar4 = zzej.f16094b;
        if (zzehVar4 != null) {
            return zzft.m8440r(mo8396a, zzfvVar2, zzfeVar2, zzgpVar4, zzehVar4, zzfm.f16120a);
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
