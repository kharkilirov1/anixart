package com.swiftsoft.anixartd.p015ui.fragment.main.episodes;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.appcompat.widget.PopupMenu;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.EpisodesFragment;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.episodes.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2679b implements ActivityResultCallback, PopupMenu.OnMenuItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ EpisodesFragment f28131b;

    public /* synthetic */ C2679b(EpisodesFragment episodesFragment) {
        this.f28131b = episodesFragment;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    /* renamed from: a */
    public void mo314a(Object obj) {
        EpisodesFragment this$0 = this.f28131b;
        ActivityResult activityResult = (ActivityResult) obj;
        EpisodesFragment.Companion companion = EpisodesFragment.f28080m;
        Intrinsics.m32179h(this$0, "this$0");
        if (activityResult.f239b != -1) {
            System.out.println((Object) "not ok :c");
            return;
        }
        Intent intent = activityResult.f240c;
        if (intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("EPISODE_VALUE");
        Episode episode = serializableExtra instanceof Episode ? (Episode) serializableExtra : null;
        int intExtra = intent.getIntExtra("SELECTED_EPISODE_ACTION_VALUE", 0);
        int intExtra2 = intent.getIntExtra("SELECTED_PLAYER_OR_DOWNLOADER_VALUE", 0);
        if (episode == null) {
            return;
        }
        if (intExtra == 0) {
            this$0.m15496m4().m14576k(episode.getUrl(), intExtra2);
        } else {
            if (intExtra != 1) {
                return;
            }
            this$0.m15496m4().m14573g(episode, intExtra2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        return true;
     */
    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onMenuItemClick(android.view.MenuItem r3) {
        /*
            r2 = this;
            com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment r0 = r2.f28131b
            com.swiftsoft.anixartd.ui.fragment.main.episodes.EpisodesFragment$Companion r1 = com.swiftsoft.anixartd.p015ui.fragment.main.episodes.EpisodesFragment.f28080m
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.Intrinsics.m32179h(r0, r1)
            int r3 = r3.getItemId()
            r1 = 1
            switch(r3) {
                case 2131363149: goto L1b;
                case 2131363150: goto L12;
                default: goto L11;
            }
        L11:
            goto L22
        L12:
            com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter r3 = r0.m15496m4()
            r0 = 0
            r3.m14579n(r0)
            goto L22
        L1b:
            com.swiftsoft.anixartd.presentation.main.episodes.EpisodesPresenter r3 = r0.m15496m4()
            r3.m14579n(r1)
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.fragment.main.episodes.C2679b.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
