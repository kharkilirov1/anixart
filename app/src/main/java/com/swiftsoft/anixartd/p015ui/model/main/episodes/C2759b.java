package com.swiftsoft.anixartd.p015ui.model.main.episodes;

import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupMenu;
import com.swiftsoft.anixartd.C2507R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.model.main.episodes.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2759b implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f29722a;

    /* renamed from: b */
    public final /* synthetic */ Context f29723b;

    /* renamed from: c */
    public final /* synthetic */ EpisodeModel f29724c;

    public /* synthetic */ C2759b(Context context, EpisodeModel episodeModel, int i2) {
        this.f29722a = i2;
        this.f29723b = context;
        this.f29724c = episodeModel;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f29722a) {
            case 0:
                Context context = this.f29723b;
                EpisodeModel this$0 = this.f29724c;
                Intrinsics.m32179h(this$0, "this$0");
                CharSequence title = menuItem.getTitle();
                if (!(Intrinsics.m32174c(title, context.getString(C2507R.string.watch_mark_add)) ? true : Intrinsics.m32174c(title, context.getString(C2507R.string.watch_mark_remove)))) {
                    if (Intrinsics.m32174c(title, context.getString(C2507R.string.report))) {
                        this$0.m15967v2().mo14591h(this$0.f29691q);
                        break;
                    }
                } else {
                    this$0.m15967v2().mo14585b(this$0.f29691q, !this$0.f29689o);
                    break;
                }
                break;
            default:
                Context context2 = this.f29723b;
                EpisodeModel this$02 = this.f29724c;
                Intrinsics.m32179h(this$02, "this$0");
                CharSequence title2 = menuItem.getTitle();
                if (!(Intrinsics.m32174c(title2, context2.getString(C2507R.string.watch_mark_add)) ? true : Intrinsics.m32174c(title2, context2.getString(C2507R.string.watch_mark_remove)))) {
                    if (Intrinsics.m32174c(title2, context2.getString(C2507R.string.report))) {
                        this$02.m15967v2().mo14591h(this$02.f29691q);
                        break;
                    }
                } else {
                    this$02.m15967v2().mo14585b(this$02.f29691q, !this$02.f29689o);
                    break;
                }
                break;
        }
        return true;
    }
}
