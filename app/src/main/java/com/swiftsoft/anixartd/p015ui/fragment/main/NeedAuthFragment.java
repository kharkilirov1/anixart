package com.swiftsoft.anixartd.p015ui.fragment.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import moxy.MvpAppCompatFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NeedAuthFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/NeedAuthFragment;", "Lmoxy/MvpAppCompatFragment;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NeedAuthFragment extends MvpAppCompatFragment {

    /* renamed from: c */
    public static final /* synthetic */ int f27882c = 0;

    /* renamed from: b */
    @NotNull
    public Map<Integer, View> f27883b = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_need_auth, viewGroup, false);
        ((MaterialButton) inflate.findViewById(C2507R.id.reg_button)).setOnClickListener(new ViewOnClickListenerC2625a(this, 10));
        return inflate;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27883b.clear();
    }
}
