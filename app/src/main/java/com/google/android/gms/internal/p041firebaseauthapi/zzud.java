package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import java.lang.reflect.Type;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzud {
    /* renamed from: a */
    public static Object m9410a(String str, Type type) throws zzry {
        if (type == String.class) {
            try {
                zzvt zzvtVar = new zzvt();
                zzvtVar.m9465b(str);
                if (!TextUtils.isEmpty(zzvtVar.f16910b)) {
                    return zzvtVar.f16910b;
                }
                throw new zzry("No error message: " + str);
            } catch (Exception e2) {
                throw new zzry("Json conversion failed! ".concat(String.valueOf(e2.getMessage())), e2);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            zzuf zzufVar = (zzuf) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0]);
            try {
                zzufVar.mo9412a(str);
                return zzufVar;
            } catch (Exception e3) {
                throw new zzry("Json conversion failed! ".concat(String.valueOf(e3.getMessage())), e3);
            }
        } catch (Exception e4) {
            throw new zzry("Instantiation of JsonResponse failed! ".concat(type.toString()), e4);
        }
    }
}
