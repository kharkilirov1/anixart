package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
abstract class zzi extends com.google.android.gms.common.internal.zzy {

    /* renamed from: b */
    public final int f15922b;

    public zzi(byte[] bArr) {
        Preconditions.m8126a(bArr.length == 25);
        this.f15922b = Arrays.hashCode(bArr);
    }

    /* renamed from: q */
    public static byte[] m8253q(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        IObjectWrapper mo8203x;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzz)) {
            try {
                com.google.android.gms.common.internal.zzz zzzVar = (com.google.android.gms.common.internal.zzz) obj;
                if (zzzVar.mo8202v() == this.f15922b && (mo8203x = zzzVar.mo8203x()) != null) {
                    return Arrays.equals(mo8254t(), (byte[]) ObjectWrapper.m8284t(mo8203x));
                }
                return false;
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15922b;
    }

    /* renamed from: t */
    public abstract byte[] mo8254t();

    @Override // com.google.android.gms.common.internal.zzz
    /* renamed from: v */
    public final int mo8202v() {
        return this.f15922b;
    }

    @Override // com.google.android.gms.common.internal.zzz
    /* renamed from: x */
    public final IObjectWrapper mo8203x() {
        return new ObjectWrapper(mo8254t());
    }
}
