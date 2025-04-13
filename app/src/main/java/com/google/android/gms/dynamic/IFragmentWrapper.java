package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public interface IFragmentWrapper extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @Override // com.google.android.gms.internal.common.zzb
        /* renamed from: i */
        public final boolean mo8121i(int i2, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i3) throws RemoteException {
            switch (i2) {
                case 2:
                    IObjectWrapper mo8257B = mo8257B();
                    parcel2.writeNoException();
                    zzc.m8559b(parcel2, mo8257B);
                    return true;
                case 3:
                    Bundle mo8281x = mo8281x();
                    parcel2.writeNoException();
                    int i4 = zzc.f16248a;
                    if (mo8281x == null) {
                        parcel2.writeInt(0);
                    } else {
                        parcel2.writeInt(1);
                        mo8281x.writeToParcel(parcel2, 1);
                    }
                    return true;
                case 4:
                    int mo8280w = mo8280w();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo8280w);
                    return true;
                case 5:
                    IFragmentWrapper mo8272j = mo8272j();
                    parcel2.writeNoException();
                    zzc.m8559b(parcel2, mo8272j);
                    return true;
                case 6:
                    IObjectWrapper mo8273k = mo8273k();
                    parcel2.writeNoException();
                    zzc.m8559b(parcel2, mo8273k);
                    return true;
                case 7:
                    boolean mo8259D = mo8259D();
                    parcel2.writeNoException();
                    int i5 = zzc.f16248a;
                    parcel2.writeInt(mo8259D ? 1 : 0);
                    return true;
                case 8:
                    String mo8270X1 = mo8270X1();
                    parcel2.writeNoException();
                    parcel2.writeString(mo8270X1);
                    return true;
                case 9:
                    IFragmentWrapper mo8274l = mo8274l();
                    parcel2.writeNoException();
                    zzc.m8559b(parcel2, mo8274l);
                    return true;
                case 10:
                    int mo8279v = mo8279v();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo8279v);
                    return true;
                case 11:
                    boolean mo8263F = mo8263F();
                    parcel2.writeNoException();
                    int i6 = zzc.f16248a;
                    parcel2.writeInt(mo8263F ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper mo8275m0 = mo8275m0();
                    parcel2.writeNoException();
                    zzc.m8559b(parcel2, mo8275m0);
                    return true;
                case 13:
                    boolean mo8258C = mo8258C();
                    parcel2.writeNoException();
                    int i7 = zzc.f16248a;
                    parcel2.writeInt(mo8258C ? 1 : 0);
                    return true;
                case 14:
                    boolean mo8267L1 = mo8267L1();
                    parcel2.writeNoException();
                    int i8 = zzc.f16248a;
                    parcel2.writeInt(mo8267L1 ? 1 : 0);
                    return true;
                case 15:
                    boolean mo8260D0 = mo8260D0();
                    parcel2.writeNoException();
                    int i9 = zzc.f16248a;
                    parcel2.writeInt(mo8260D0 ? 1 : 0);
                    return true;
                case 16:
                    boolean mo8269T0 = mo8269T0();
                    parcel2.writeNoException();
                    int i10 = zzc.f16248a;
                    parcel2.writeInt(mo8269T0 ? 1 : 0);
                    return true;
                case 17:
                    boolean mo8266L = mo8266L();
                    parcel2.writeNoException();
                    int i11 = zzc.f16248a;
                    parcel2.writeInt(mo8266L ? 1 : 0);
                    return true;
                case 18:
                    boolean mo8271a0 = mo8271a0();
                    parcel2.writeNoException();
                    int i12 = zzc.f16248a;
                    parcel2.writeInt(mo8271a0 ? 1 : 0);
                    return true;
                case 19:
                    boolean mo8262E = mo8262E();
                    parcel2.writeNoException();
                    int i13 = zzc.f16248a;
                    parcel2.writeInt(mo8262E ? 1 : 0);
                    return true;
                case 20:
                    mo8278u1(IObjectWrapper.Stub.m8283q(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    int i14 = zzc.f16248a;
                    mo8265G(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    int i15 = zzc.f16248a;
                    mo8268Q(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    int i16 = zzc.f16248a;
                    mo8277o0(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    int i17 = zzc.f16248a;
                    mo8276m2(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    mo8282x0((Intent) zzc.m8558a(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    mo8264F0((Intent) zzc.m8558a(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    mo8261D1(IObjectWrapper.Stub.m8283q(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    @NonNull
    /* renamed from: B */
    IObjectWrapper mo8257B() throws RemoteException;

    /* renamed from: C */
    boolean mo8258C() throws RemoteException;

    /* renamed from: D */
    boolean mo8259D() throws RemoteException;

    /* renamed from: D0 */
    boolean mo8260D0() throws RemoteException;

    /* renamed from: D1 */
    void mo8261D1(@NonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: E */
    boolean mo8262E() throws RemoteException;

    /* renamed from: F */
    boolean mo8263F() throws RemoteException;

    /* renamed from: F0 */
    void mo8264F0(@NonNull Intent intent, int i2) throws RemoteException;

    /* renamed from: G */
    void mo8265G(boolean z) throws RemoteException;

    /* renamed from: L */
    boolean mo8266L() throws RemoteException;

    /* renamed from: L1 */
    boolean mo8267L1() throws RemoteException;

    /* renamed from: Q */
    void mo8268Q(boolean z) throws RemoteException;

    /* renamed from: T0 */
    boolean mo8269T0() throws RemoteException;

    @Nullable
    /* renamed from: X1 */
    String mo8270X1() throws RemoteException;

    /* renamed from: a0 */
    boolean mo8271a0() throws RemoteException;

    @Nullable
    /* renamed from: j */
    IFragmentWrapper mo8272j() throws RemoteException;

    @NonNull
    /* renamed from: k */
    IObjectWrapper mo8273k() throws RemoteException;

    @Nullable
    /* renamed from: l */
    IFragmentWrapper mo8274l() throws RemoteException;

    @NonNull
    /* renamed from: m0 */
    IObjectWrapper mo8275m0() throws RemoteException;

    /* renamed from: m2 */
    void mo8276m2(boolean z) throws RemoteException;

    /* renamed from: o0 */
    void mo8277o0(boolean z) throws RemoteException;

    /* renamed from: u1 */
    void mo8278u1(@NonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: v */
    int mo8279v() throws RemoteException;

    /* renamed from: w */
    int mo8280w() throws RemoteException;

    @Nullable
    /* renamed from: x */
    Bundle mo8281x() throws RemoteException;

    /* renamed from: x0 */
    void mo8282x0(@NonNull Intent intent) throws RemoteException;
}
