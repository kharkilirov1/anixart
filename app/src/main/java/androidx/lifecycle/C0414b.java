package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewModelProvider.kt */
/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0414b {
    @NotNull
    /* renamed from: a */
    public static ViewModel m3248a(ViewModelProvider.Factory factory, @NotNull Class modelClass, @NotNull CreationExtras extras) {
        Intrinsics.m32179h(modelClass, "modelClass");
        Intrinsics.m32179h(extras, "extras");
        return factory.mo3071a(modelClass);
    }
}
