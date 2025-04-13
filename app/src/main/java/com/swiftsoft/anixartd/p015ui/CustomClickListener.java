package com.swiftsoft.anixartd.p015ui;

import android.os.Handler;
import android.view.View;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.RunnableC0915a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CustomClickListener.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/CustomClickListener;", "Landroid/view/View$OnClickListener;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class CustomClickListener implements View.OnClickListener {

    /* renamed from: b */
    public static boolean f27398b = true;

    /* renamed from: c */
    @NotNull
    public static final Handler f27399c = new Handler();

    /* compiled from: CustomClickListener.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/CustomClickListener$Companion;", "", "Ljava/lang/Runnable;", "ENABLE_AGAIN", "Ljava/lang/Runnable;", "", "enabled", "Z", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    public abstract void mo15317a(@NotNull View view);

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        if (f27398b) {
            f27398b = false;
            f27399c.postDelayed(RunnableC0915a.f9316d, 500L);
            mo15317a(view);
        }
    }
}
