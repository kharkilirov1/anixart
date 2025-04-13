package com.swiftsoft.anixartd.p015ui.activity.swiftplayer;

import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.PopupMenu;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.PlaybackParameters;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.Quality;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.activity.swiftplayer.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2642f implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f27598b;

    /* renamed from: c */
    public final /* synthetic */ SwiftPlayerActivity f27599c;

    public /* synthetic */ C2642f(SwiftPlayerActivity swiftPlayerActivity, int i2) {
        this.f27598b = i2;
        this.f27599c = swiftPlayerActivity;
    }

    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f27598b) {
            case 0:
                SwiftPlayerActivity this$0 = this.f27599c;
                Intrinsics.m32179h(this$0, "this$0");
                List<String> list = this$0.f27545D;
                CharSequence title = menuItem.getTitle();
                Intrinsics.m32179h(list, "<this>");
                int indexOf = list.indexOf(title);
                if (indexOf != -1) {
                    Quality quality = Quality.f30236a;
                    this$0.f27566o = Quality.f30237b.indexOf(this$0.f27545D.get(indexOf));
                    this$0.f27567p = indexOf;
                    ExoPlayer exoPlayer = this$0.f27556e;
                    if (exoPlayer == null) {
                        Intrinsics.m32189r("player");
                        throw null;
                    }
                    this$0.f27568q = exoPlayer.getCurrentPosition();
                    ((TextView) this$0.m15347s4(C2507R.id.tvQualSelected)).setText(String.valueOf(menuItem.getTitle()));
                    this$0.m15351w4();
                }
                return true;
            default:
                SwiftPlayerActivity this$02 = this.f27599c;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.f27550I = 1.0f;
                switch (menuItem.getItemId()) {
                    case C2507R.id.speed100 /* 2131362852 */:
                        this$02.f27550I = 1.0f;
                        this$02.m15350v4().f27299b.m14057M(3);
                        break;
                    case C2507R.id.speed125 /* 2131362853 */:
                        this$02.f27550I = 1.25f;
                        this$02.m15350v4().f27299b.m14057M(4);
                        break;
                    case C2507R.id.speed150 /* 2131362854 */:
                        this$02.f27550I = 1.5f;
                        this$02.m15350v4().f27299b.m14057M(5);
                        break;
                    case C2507R.id.speed175 /* 2131362855 */:
                        this$02.f27550I = 1.75f;
                        this$02.m15350v4().f27299b.m14057M(6);
                        break;
                    case C2507R.id.speed200 /* 2131362856 */:
                        this$02.f27550I = 2.0f;
                        this$02.m15350v4().f27299b.m14057M(7);
                        break;
                    case C2507R.id.speed25 /* 2131362857 */:
                        this$02.f27550I = 0.25f;
                        this$02.m15350v4().f27299b.m14057M(0);
                        break;
                    case C2507R.id.speed250 /* 2131362858 */:
                        this$02.f27550I = 2.5f;
                        this$02.m15350v4().f27299b.m14057M(8);
                        break;
                    case C2507R.id.speed300 /* 2131362859 */:
                        this$02.f27550I = 3.0f;
                        this$02.m15350v4().f27299b.m14057M(9);
                        break;
                    case C2507R.id.speed50 /* 2131362860 */:
                        this$02.f27550I = 0.5f;
                        this$02.m15350v4().f27299b.m14057M(1);
                        break;
                    case C2507R.id.speed75 /* 2131362861 */:
                        this$02.f27550I = 0.75f;
                        this$02.m15350v4().f27299b.m14057M(2);
                        break;
                }
                ((TextView) this$02.m15347s4(C2507R.id.tvSpeedSelected)).setText(String.valueOf(menuItem.getTitle()));
                PlaybackParameters playbackParameters = new PlaybackParameters(this$02.f27550I, 1.0f);
                ExoPlayer exoPlayer2 = this$02.f27556e;
                if (exoPlayer2 != null) {
                    exoPlayer2.mo5726d(playbackParameters);
                    return true;
                }
                Intrinsics.m32189r("player");
                throw null;
        }
    }
}
