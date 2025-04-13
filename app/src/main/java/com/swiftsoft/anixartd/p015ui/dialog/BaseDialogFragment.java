package com.swiftsoft.anixartd.p015ui.dialog;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import moxy.MvpAppCompatDialogFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "Lmoxy/MvpAppCompatDialogFragment;", "<init>", "()V", "BaseDialogListener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class BaseDialogFragment extends MvpAppCompatDialogFragment {

    /* renamed from: b */
    public BaseDialogListener f27606b;

    /* renamed from: c */
    @NotNull
    public Map<Integer, View> f27607c = new LinkedHashMap();

    /* compiled from: BaseDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface BaseDialogListener {
        /* renamed from: y3 */
        boolean mo15336y3(@Nullable String str, @NotNull String str2, @NotNull Intent intent);
    }

    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27607c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        super.onAttach(context);
        if (context instanceof BaseDialogListener) {
            this.f27606b = (BaseDialogListener) context;
        }
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo15410n3();
    }

    /* renamed from: u3 */
    public final boolean m15411u3(@NotNull String str, @NotNull Intent intent) {
        BaseDialogListener baseDialogListener = this.f27606b;
        if (baseDialogListener != null) {
            return baseDialogListener.mo15336y3(getTag(), str, intent);
        }
        Intrinsics.m32189r("baseDialogListener");
        throw null;
    }
}
