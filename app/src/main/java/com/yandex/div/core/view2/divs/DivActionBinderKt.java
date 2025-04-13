package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.swiftsoft.anixartd.C2507R;
import kotlin.Metadata;

/* compiled from: DivActionBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivActionBinderKt {
    /* renamed from: a */
    public static final boolean m16973a(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Object tag = viewGroup.getTag(C2507R.id.div_penetrating_longtap_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        return (bool == null ? false : bool.booleanValue()) || m16973a(viewGroup);
    }
}
