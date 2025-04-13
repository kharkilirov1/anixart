package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div.core.view2.divs.tabs.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2877a implements BaseDivTabbedCardUi.Input {

    /* renamed from: a */
    public final /* synthetic */ int f32711a;

    /* renamed from: b */
    public final /* synthetic */ List f32712b;

    public /* synthetic */ C2877a(List list, int i2) {
        this.f32711a = i2;
        this.f32712b = list;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
    /* renamed from: a */
    public final List mo17084a() {
        switch (this.f32711a) {
            case 0:
                List list = this.f32712b;
                Intrinsics.m32179h(list, "$list");
                return list;
            case 1:
                List list2 = this.f32712b;
                Intrinsics.m32179h(list2, "$list");
                return list2;
            default:
                List list3 = this.f32712b;
                Intrinsics.m32179h(list3, "$list");
                return list3;
        }
    }
}
