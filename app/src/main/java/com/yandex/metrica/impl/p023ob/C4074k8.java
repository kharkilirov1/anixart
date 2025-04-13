package com.yandex.metrica.impl.p023ob;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.k8 */
/* loaded from: classes2.dex */
class C4074k8 {

    /* renamed from: a */
    @NonNull
    public final String f45605a;

    /* renamed from: b */
    public final boolean f45606b;

    /* renamed from: c */
    public final boolean f45607c;

    /* renamed from: d */
    @Nullable
    public final C3738X7 f45608d;

    public C4074k8(@NonNull String str, boolean z, @Nullable C3738X7 c3738x7) {
        this(str, z, c3738x7, C3658U2.m19211a(23) && Process.is64Bit());
    }

    @VisibleForTesting
    public C4074k8(@NonNull String str, boolean z, @Nullable C3738X7 c3738x7, boolean z2) {
        this.f45605a = str;
        this.f45607c = z;
        this.f45608d = c3738x7;
        this.f45606b = z2;
    }
}
