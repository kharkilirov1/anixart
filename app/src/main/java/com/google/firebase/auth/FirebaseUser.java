package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p041firebaseauthapi.zzwq;
import com.google.firebase.FirebaseApp;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public abstract class FirebaseUser extends AbstractSafeParcelable implements UserInfo {
    @NonNull
    /* renamed from: O0 */
    public abstract FirebaseUser mo12243O0();

    @NonNull
    /* renamed from: R0 */
    public abstract FirebaseUser mo12244R0(@NonNull List list);

    @NonNull
    /* renamed from: Z0 */
    public abstract zzwq mo12245Z0();

    @NonNull
    /* renamed from: e1 */
    public abstract String mo12246e1();

    @NonNull
    /* renamed from: f1 */
    public abstract String mo12247f1();

    @Nullable
    /* renamed from: j1 */
    public abstract List mo12248j1();

    @Nullable
    /* renamed from: m */
    public abstract String mo12249m();

    @NonNull
    /* renamed from: n */
    public abstract MultiFactor mo12250n();

    /* renamed from: n1 */
    public abstract void mo12251n1(@NonNull zzwq zzwqVar);

    @NonNull
    /* renamed from: o */
    public abstract List<? extends UserInfo> mo12252o();

    /* renamed from: o1 */
    public abstract void mo12253o1(@NonNull List list);

    @Nullable
    /* renamed from: p */
    public abstract String mo12254p();

    @NonNull
    /* renamed from: q */
    public abstract String mo12255q();

    /* renamed from: v */
    public abstract boolean mo12256v();

    @NonNull
    /* renamed from: w */
    public abstract FirebaseApp mo12257w();
}
