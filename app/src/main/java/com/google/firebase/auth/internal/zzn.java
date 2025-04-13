package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeMultiFactorInfo;
import com.google.firebase.auth.MultiFactorInfo;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzn extends ActionCodeMultiFactorInfo {
    public zzn(String str, MultiFactorInfo multiFactorInfo) {
        Preconditions.m8129d(str);
        Objects.requireNonNull(multiFactorInfo, "null reference");
    }
}
