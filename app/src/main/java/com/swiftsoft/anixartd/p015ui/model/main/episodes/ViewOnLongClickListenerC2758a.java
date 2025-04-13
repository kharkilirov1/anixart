package com.swiftsoft.anixartd.p015ui.model.main.episodes;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.model.main.episodes.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC2758a implements View.OnLongClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f29720b;

    /* renamed from: c */
    public final /* synthetic */ EpisodeModel f29721c;

    public /* synthetic */ ViewOnLongClickListenerC2758a(EpisodeModel episodeModel, int i2) {
        this.f29720b = i2;
        this.f29721c = episodeModel;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f29720b) {
            case 0:
                EpisodeModel this$0 = this.f29721c;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15967v2().mo14585b(this$0.f29691q, !this$0.f29689o);
                break;
            default:
                EpisodeModel this$02 = this.f29721c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.m15967v2().mo14585b(this$02.f29691q, !this$02.f29689o);
                break;
        }
        return true;
    }
}
