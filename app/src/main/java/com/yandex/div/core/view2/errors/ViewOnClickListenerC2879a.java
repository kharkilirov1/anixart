package com.yandex.div.core.view2.errors;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div.core.view2.errors.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2879a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f32915b;

    /* renamed from: c */
    public final /* synthetic */ Object f32916c;

    public /* synthetic */ ViewOnClickListenerC2879a(Object obj, int i2) {
        this.f32915b = i2;
        this.f32916c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32915b) {
            case 0:
                DetailsViewGroup this$0 = (DetailsViewGroup) this.f32916c;
                int i2 = DetailsViewGroup.f32871e;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.f32872b.invoke();
                break;
            case 1:
                DetailsViewGroup this$02 = (DetailsViewGroup) this.f32916c;
                int i3 = DetailsViewGroup.f32871e;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.f32873c.invoke();
                break;
            default:
                ErrorView this$03 = (ErrorView) this.f32916c;
                Intrinsics.m32179h(this$03, "this$0");
                ErrorModel errorModel = this$03.f32893c;
                errorModel.m17117a(ErrorViewModel.m17118a(errorModel.f32888g, true, 0, 0, null, null, 30));
                break;
        }
    }
}
