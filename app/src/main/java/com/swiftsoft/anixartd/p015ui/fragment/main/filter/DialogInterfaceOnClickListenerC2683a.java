package com.swiftsoft.anixartd.p015ui.fragment.main.filter;

import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.p015ui.activity.swiftplayer.SwiftPlayerActivity;
import com.swiftsoft.anixartd.p015ui.fragment.main.filter.FilterFragment;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.filter.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2683a implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f28199b;

    /* renamed from: c */
    public final /* synthetic */ Object f28200c;

    /* renamed from: d */
    public final /* synthetic */ Object f28201d;

    public /* synthetic */ DialogInterfaceOnClickListenerC2683a(View view, FilterFragment filterFragment, int i2) {
        this.f28199b = i2;
        this.f28200c = view;
        this.f28201d = filterFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.f28199b) {
            case 0:
                FilterFragment this$0 = (FilterFragment) this.f28201d;
                View view = (View) this.f28200c;
                FilterFragment.Companion companion = FilterFragment.f28149U;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(view, "$view");
                if (this$0.f28185r.isEmpty()) {
                    ((TextInputEditText) view.findViewById(C2507R.id.tProfileListExclusions)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                    return;
                }
                TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(C2507R.id.tProfileListExclusions);
                Collection<String> values = this$0.f28185r.values();
                Intrinsics.m32178g(values, "selectedProfileListExclusions.values");
                textInputEditText.setText(CollectionsKt.m31989B(values, ", ", null, null, 0, null, null, 62, null), TextView.BufferType.EDITABLE);
                return;
            case 1:
                View view2 = (View) this.f28200c;
                FilterFragment this$02 = (FilterFragment) this.f28201d;
                FilterFragment.Companion companion2 = FilterFragment.f28149U;
                Intrinsics.m32179h(view2, "$view");
                Intrinsics.m32179h(this$02, "this$0");
                ((TextInputEditText) view2.findViewById(C2507R.id.tProfileListExclusions)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                String[] strArr = this$02.f28155E;
                if (strArr == null) {
                    Intrinsics.m32189r("profileLists");
                    throw null;
                }
                this$02.f28159I = new boolean[strArr.length];
                this$02.f28185r.clear();
                return;
            case 2:
                FilterFragment this$03 = (FilterFragment) this.f28201d;
                View view3 = (View) this.f28200c;
                FilterFragment.Companion companion3 = FilterFragment.f28149U;
                Intrinsics.m32179h(this$03, "this$0");
                Intrinsics.m32179h(view3, "$view");
                if (this$03.f28187t.isEmpty()) {
                    ((TextInputEditText) view3.findViewById(C2507R.id.tAgeRating)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                    return;
                }
                TextInputEditText textInputEditText2 = (TextInputEditText) view3.findViewById(C2507R.id.tAgeRating);
                Collection<String> values2 = this$03.f28187t.values();
                Intrinsics.m32178g(values2, "selectedAgeRatings.values");
                textInputEditText2.setText(CollectionsKt.m31989B(values2, ", ", null, null, 0, null, null, 62, null), TextView.BufferType.EDITABLE);
                return;
            case 3:
                View view4 = (View) this.f28200c;
                FilterFragment this$04 = (FilterFragment) this.f28201d;
                FilterFragment.Companion companion4 = FilterFragment.f28149U;
                Intrinsics.m32179h(view4, "$view");
                Intrinsics.m32179h(this$04, "this$0");
                ((TextInputEditText) view4.findViewById(C2507R.id.tAgeRating)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                String[] strArr2 = this$04.f28158H;
                if (strArr2 == null) {
                    Intrinsics.m32189r("ageRatings");
                    throw null;
                }
                this$04.f28161K = new boolean[strArr2.length];
                this$04.f28187t.clear();
                return;
            case 4:
                FilterFragment this$05 = (FilterFragment) this.f28201d;
                View view5 = (View) this.f28200c;
                FilterFragment.Companion companion5 = FilterFragment.f28149U;
                Intrinsics.m32179h(this$05, "this$0");
                Intrinsics.m32179h(view5, "$view");
                if (this$05.f28186s.isEmpty()) {
                    ((TextInputEditText) view5.findViewById(C2507R.id.tTypes)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                    return;
                }
                TextInputEditText textInputEditText3 = (TextInputEditText) view5.findViewById(C2507R.id.tTypes);
                Collection<Type> values3 = this$05.f28186s.values();
                Intrinsics.m32178g(values3, "selectedTypes.values");
                textInputEditText3.setText(CollectionsKt.m31989B(values3, ", ", null, null, 0, null, new Function1<Type, CharSequence>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.FilterFragment$onFilterLoaded$5$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public CharSequence invoke(Type type) {
                        Type value = type;
                        Intrinsics.m32179h(value, "value");
                        return value.getName();
                    }
                }, 30, null), TextView.BufferType.EDITABLE);
                return;
            case 5:
                View view6 = (View) this.f28200c;
                FilterFragment this$06 = (FilterFragment) this.f28201d;
                FilterFragment.Companion companion6 = FilterFragment.f28149U;
                Intrinsics.m32179h(view6, "$view");
                Intrinsics.m32179h(this$06, "this$0");
                ((TextInputEditText) view6.findViewById(C2507R.id.tTypes)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                Type[] typeArr = this$06.f28156F;
                if (typeArr == null) {
                    Intrinsics.m32189r("types");
                    throw null;
                }
                this$06.f28160J = new boolean[typeArr.length];
                this$06.f28186s.clear();
                return;
            default:
                SwiftPlayerActivity this$07 = (SwiftPlayerActivity) this.f28201d;
                Uri uri = (Uri) this.f28200c;
                SwiftPlayerActivity.TYPE type = SwiftPlayerActivity.f27540L;
                Intrinsics.m32179h(this$07, "this$0");
                if (i2 == 0) {
                    this$07.f27568q = 0L;
                }
                Intrinsics.m32178g(uri, "uri");
                this$07.m15353y4(uri);
                return;
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC2683a(Object obj, Object obj2, int i2) {
        this.f28199b = i2;
        this.f28201d = obj;
        this.f28200c = obj2;
    }
}
