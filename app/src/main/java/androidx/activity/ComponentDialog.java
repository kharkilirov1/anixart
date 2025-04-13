package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.StyleRes;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.swiftsoft.anixartd.C2507R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ComponentDialog.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "activity_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public class ComponentDialog extends Dialog implements LifecycleOwner, OnBackPressedDispatcherOwner {

    /* renamed from: b */
    @Nullable
    public LifecycleRegistry f214b;

    /* renamed from: c */
    @NotNull
    public final OnBackPressedDispatcher f215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComponentDialog(@NotNull Context context, @StyleRes int i2) {
        super(context, i2);
        Intrinsics.m32179h(context, "context");
        this.f215c = new OnBackPressedDispatcher(new RunnableC0042c(this, 1));
    }

    /* renamed from: a */
    public static void m305a(ComponentDialog this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.m32179h(view, "view");
        m307c();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public final LifecycleRegistry m306b() {
        LifecycleRegistry lifecycleRegistry = this.f214b;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
        this.f214b = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    /* renamed from: c */
    public final void m307c() {
        Window window = getWindow();
        Intrinsics.m32176e(window);
        window.getDecorView().setTag(C2507R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        Intrinsics.m32176e(window2);
        View decorView = window2.getDecorView();
        Intrinsics.m32178g(decorView, "window!!.decorView");
        decorView.setTag(C2507R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public final Lifecycle getLifecycle() {
        return m306b();
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @NotNull
    /* renamed from: getOnBackPressedDispatcher, reason: from getter */
    public final OnBackPressedDispatcher getF215c() {
        return this.f215c;
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onBackPressed() {
        this.f215c.m311b();
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        m306b().m3199f(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onStart() {
        super.onStart();
        m306b().m3199f(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onStop() {
        m306b().m3199f(Lifecycle.Event.ON_DESTROY);
        this.f214b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        m307c();
        super.setContentView(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        m307c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.m32179h(view, "view");
        m307c();
        super.setContentView(view, layoutParams);
    }
}
