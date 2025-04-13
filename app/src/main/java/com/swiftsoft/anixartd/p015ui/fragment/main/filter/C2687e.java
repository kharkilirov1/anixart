package com.swiftsoft.anixartd.p015ui.fragment.main.filter;

import android.view.View;
import android.widget.AdapterView;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.filter.FilterFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.appeal.ReleaseVideoAppealFragment;
import com.swiftsoft.anixartd.utils.AppCompatAutoCompleteTextView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.filter.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2687e implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f28209b;

    /* renamed from: c */
    public final /* synthetic */ Object f28210c;

    /* renamed from: d */
    public final /* synthetic */ Object f28211d;

    public /* synthetic */ C2687e(View view, BaseFragment baseFragment, int i2) {
        this.f28209b = i2;
        this.f28210c = view;
        this.f28211d = baseFragment;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        String str = "";
        switch (this.f28209b) {
            case 0:
                View view2 = (View) this.f28210c;
                FilterFragment this$0 = (FilterFragment) this.f28211d;
                FilterFragment.Companion companion = FilterFragment.f28149U;
                Intrinsics.m32179h(view2, "$view");
                Intrinsics.m32179h(this$0, "this$0");
                ((AppCompatAutoCompleteTextView) view2.findViewById(C2507R.id.tEpisodes)).clearFocus();
                this$0.f28179l = i2 != 0 ? Integer.valueOf(i2) : null;
                return;
            case 1:
                View view3 = (View) this.f28210c;
                FilterFragment this$02 = (FilterFragment) this.f28211d;
                FilterFragment.Companion companion2 = FilterFragment.f28149U;
                Intrinsics.m32179h(view3, "$view");
                Intrinsics.m32179h(this$02, "this$0");
                ((AppCompatAutoCompleteTextView) view3.findViewById(C2507R.id.tSort)).clearFocus();
                this$02.f28180m = i2 != 0 ? Integer.valueOf(i2) : null;
                return;
            case 2:
                View view4 = (View) this.f28210c;
                FilterFragment this$03 = (FilterFragment) this.f28211d;
                FilterFragment.Companion companion3 = FilterFragment.f28149U;
                Intrinsics.m32179h(view4, "$view");
                Intrinsics.m32179h(this$03, "this$0");
                ((AppCompatAutoCompleteTextView) view4.findViewById(C2507R.id.tCountry)).clearFocus();
                if (i2 != 0) {
                    String[] strArr = this$03.f28151A;
                    if (strArr == null) {
                        Intrinsics.m32189r("countries");
                        throw null;
                    }
                    str = strArr[i2];
                }
                this$03.f28181n = str;
                return;
            case 3:
                View view5 = (View) this.f28210c;
                FilterFragment this$04 = (FilterFragment) this.f28211d;
                FilterFragment.Companion companion4 = FilterFragment.f28149U;
                Intrinsics.m32179h(view5, "$view");
                Intrinsics.m32179h(this$04, "this$0");
                ((AppCompatAutoCompleteTextView) view5.findViewById(C2507R.id.tSeason)).clearFocus();
                this$04.f28182o = i2 != 0 ? Integer.valueOf(i2) : null;
                return;
            case 4:
                View view6 = (View) this.f28210c;
                FilterFragment this$05 = (FilterFragment) this.f28211d;
                FilterFragment.Companion companion5 = FilterFragment.f28149U;
                Intrinsics.m32179h(view6, "$view");
                Intrinsics.m32179h(this$05, "this$0");
                ((AppCompatAutoCompleteTextView) view6.findViewById(C2507R.id.tEpisodeDuration)).clearFocus();
                this$05.f28183p = i2 != 0 ? Integer.valueOf(i2) : null;
                return;
            case 5:
                View view7 = (View) this.f28210c;
                FilterFragment this$06 = (FilterFragment) this.f28211d;
                FilterFragment.Companion companion6 = FilterFragment.f28149U;
                Intrinsics.m32179h(view7, "$view");
                Intrinsics.m32179h(this$06, "this$0");
                ((AppCompatAutoCompleteTextView) view7.findViewById(C2507R.id.tCategory)).clearFocus();
                this$06.f28174g = i2 != 0 ? Long.valueOf(i2) : null;
                return;
            case 6:
                View view8 = (View) this.f28210c;
                FilterFragment this$07 = (FilterFragment) this.f28211d;
                FilterFragment.Companion companion7 = FilterFragment.f28149U;
                Intrinsics.m32179h(view8, "$view");
                Intrinsics.m32179h(this$07, "this$0");
                ((AppCompatAutoCompleteTextView) view8.findViewById(C2507R.id.tStatus)).clearFocus();
                this$07.f28175h = i2 != 0 ? Long.valueOf(i2) : null;
                return;
            case 7:
                View view9 = (View) this.f28210c;
                FilterFragment this$08 = (FilterFragment) this.f28211d;
                FilterFragment.Companion companion8 = FilterFragment.f28149U;
                Intrinsics.m32179h(view9, "$view");
                Intrinsics.m32179h(this$08, "this$0");
                ((AppCompatAutoCompleteTextView) view9.findViewById(C2507R.id.tStudio)).clearFocus();
                if (i2 != 0) {
                    String[] strArr2 = this$08.f28191x;
                    if (strArr2 == null) {
                        Intrinsics.m32189r("studios");
                        throw null;
                    }
                    str = strArr2[i2];
                }
                this$08.f28178k = str;
                return;
            default:
                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) this.f28210c;
                ReleaseVideoAppealFragment this$09 = (ReleaseVideoAppealFragment) this.f28211d;
                ReleaseVideoAppealFragment.Companion companion9 = ReleaseVideoAppealFragment.f28840l;
                Intrinsics.m32179h(this$09, "this$0");
                ((AppCompatAutoCompleteTextView) appCompatAutoCompleteTextView.m16294a(C2507R.id.release_video_category)).clearFocus();
                this$09.f28846h = i2;
                return;
        }
    }
}
