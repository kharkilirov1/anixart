package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.widget.tabs.TabItemLayout;
import com.yandex.div.internal.widget.tabs.TabsLayout;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div.core.view2.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2856b implements ViewFactory {

    /* renamed from: a */
    public final /* synthetic */ int f31799a;

    /* renamed from: b */
    public final /* synthetic */ Object f31800b;

    public /* synthetic */ C2856b(Object obj, int i2) {
        this.f31799a = i2;
        this.f31800b = obj;
    }

    @Override // com.yandex.div.internal.viewpool.ViewFactory
    /* renamed from: a */
    public final View mo16909a() {
        switch (this.f31799a) {
            case 0:
                DivViewCreator this$0 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$0, "this$0");
                return new DivLineHeightTextView(this$0.f31675a, null, 0, 6);
            case 1:
                DivViewCreator this$02 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$02, "this$0");
                return new DivStateLayout(this$02.f31675a, null, 0, 6);
            case 2:
                DivViewCreator this$03 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$03, "this$0");
                return new DivFrameLayout(this$03.f31675a, null, 0, 6);
            case 3:
                DivViewCreator this$04 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$04, "this$0");
                return new DivPagerIndicatorView(this$04.f31675a, null, 0, 6);
            case 4:
                DivViewCreator this$05 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$05, "this$0");
                return new DivSliderView(this$05.f31675a, null, 0, 6);
            case 5:
                DivViewCreator this$06 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$06, "this$0");
                return new DivInputView(this$06.f31675a);
            case 6:
                DivViewCreator this$07 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$07, "this$0");
                return new DivSelectView(this$07.f31675a);
            case 7:
                DivViewCreator this$08 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$08, "this$0");
                return new DivVideoView(this$08.f31675a, null, 0, 6);
            case 8:
                DivViewCreator this$09 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$09, "this$0");
                return new DivImageView(this$09.f31675a, null, 0, 6);
            case 9:
                DivViewCreator this$010 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$010, "this$0");
                return new DivGifImageView(this$010.f31675a, null, 0, 6);
            case 10:
                DivViewCreator this$011 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$011, "this$0");
                return new DivFrameLayout(this$011.f31675a, null, 0, 6);
            case 11:
                DivViewCreator this$012 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$012, "this$0");
                return new DivLinearLayout(this$012.f31675a, null, 0, 6);
            case 12:
                DivViewCreator this$013 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$013, "this$0");
                return new DivWrapLayout(this$013.f31675a);
            case 13:
                DivViewCreator this$014 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$014, "this$0");
                return new DivGridLayout(this$014.f31675a, null, 0, 6);
            case 14:
                DivViewCreator this$015 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$015, "this$0");
                return new DivRecyclerView(this$015.f31675a, null, 0, 6);
            case 15:
                DivViewCreator this$016 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$016, "this$0");
                return new DivPagerView(this$016.f31675a, null, 0, 6);
            case 16:
                DivViewCreator this$017 = (DivViewCreator) this.f31800b;
                Intrinsics.m32179h(this$017, "this$0");
                return new TabsLayout(this$017.f31675a, null, 2);
            default:
                DivTabsBinder this$018 = (DivTabsBinder) this.f31800b;
                Intrinsics.m32179h(this$018, "this$0");
                return new TabItemLayout(this$018.f32649i, null, 2);
        }
    }
}
