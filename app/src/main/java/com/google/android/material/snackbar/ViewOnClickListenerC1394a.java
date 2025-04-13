package com.google.android.material.snackbar;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.PopupMenu;
import com.stfalcon.imageviewer.StfalconImageViewer;
import com.stfalcon.imageviewer.viewer.builder.BuilderData;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.C2682e;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.TorlookFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.C2721e;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.schedule.ScheduleFragment;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioButton;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1394a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f18875b;

    /* renamed from: c */
    public final /* synthetic */ Object f18876c;

    /* renamed from: d */
    public final /* synthetic */ Object f18877d;

    public /* synthetic */ ViewOnClickListenerC1394a(Object obj, Object obj2, int i2) {
        this.f18875b = i2;
        this.f18876c = obj;
        this.f18877d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f18875b) {
            case 0:
                Snackbar snackbar = (Snackbar) this.f18876c;
                View.OnClickListener onClickListener = (View.OnClickListener) this.f18877d;
                int[] iArr = Snackbar.f18859B;
                Objects.requireNonNull(snackbar);
                onClickListener.onClick(view);
                snackbar.m10365b(1);
                break;
            case 1:
                View view2 = (View) this.f18876c;
                CollectionCommentsRepliesFragment this$0 = (CollectionCommentsRepliesFragment) this.f18877d;
                CollectionCommentsRepliesFragment.Companion companion = CollectionCommentsRepliesFragment.f27934o;
                Intrinsics.m32179h(this$0, "this$0");
                ((TextView) view2.findViewById(C2507R.id.textViewReply)).setText((CharSequence) null);
                RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(C2507R.id.replyPanel);
                Intrinsics.m32178g(relativeLayout, "view.replyPanel");
                ViewsKt.m16372e(relativeLayout);
                this$0.m15466c4().f26137d.f28982k = null;
                break;
            case 2:
                TorlookFragment this$02 = (TorlookFragment) this.f18876c;
                View view3 = (View) this.f18877d;
                TorlookFragment.Companion companion2 = TorlookFragment.f28119i;
                Intrinsics.m32179h(this$02, "this$0");
                PopupMenu popupMenu = new PopupMenu(this$02.requireContext(), (AppCompatImageView) view3.findViewById(C2507R.id.search_query_popup), 8388613, C2507R.attr.popupMenuStyle, C2507R.style.CustomPopupMenuStyle);
                Iterator<String> it = this$02.m15502c4().f26352c.f29066g.iterator();
                while (it.hasNext()) {
                    popupMenu.f1394b.add(it.next());
                }
                popupMenu.f1395c.m653g();
                popupMenu.f1396d = new C2682e(this$02);
                break;
            case 3:
                Profile profile = (Profile) this.f18876c;
                ProfileFragment this$03 = (ProfileFragment) this.f18877d;
                ProfileFragment.Companion companion3 = ProfileFragment.f28458k;
                Intrinsics.m32179h(profile, "$profile");
                Intrinsics.m32179h(this$03, "this$0");
                ArrayList arrayList = new ArrayList();
                arrayList.add(profile.getAvatar());
                StfalconImageViewer.Builder builder = new StfalconImageViewer.Builder(this$03.getContext(), arrayList, new C2721e(this$03));
                builder.f25213b.f25267b = 0;
                AppCompatImageView appCompatImageView = (AppCompatImageView) this$03.m15560A3(C2507R.id.avatar);
                BuilderData<T> builderData = builder.f25213b;
                builderData.f25272g = appCompatImageView;
                builderData.f25269d = false;
                builder.m14018a();
                break;
            case 4:
                View view4 = (View) this.f18876c;
                ReleaseCommentsRepliesFragment this$04 = (ReleaseCommentsRepliesFragment) this.f18877d;
                ReleaseCommentsRepliesFragment.Companion companion4 = ReleaseCommentsRepliesFragment.f28688o;
                Intrinsics.m32179h(this$04, "this$0");
                ((TextView) view4.findViewById(C2507R.id.textViewReply)).setText((CharSequence) null);
                RelativeLayout relativeLayout2 = (RelativeLayout) view4.findViewById(C2507R.id.replyPanel);
                Intrinsics.m32178g(relativeLayout2, "view.replyPanel");
                ViewsKt.m16372e(relativeLayout2);
                this$04.m15612e4().f27084d.f29278k = null;
                break;
            case 5:
                View view5 = (View) this.f18876c;
                ScheduleFragment this$05 = (ScheduleFragment) this.f18877d;
                KProperty<Object>[] kPropertyArr = ScheduleFragment.f28889g;
                Intrinsics.m32179h(this$05, "this$0");
                LinearLayout linearLayout = (LinearLayout) view5.findViewById(C2507R.id.error_layout);
                Intrinsics.m32178g(linearLayout, "view.error_layout");
                ViewsKt.m16372e(linearLayout);
                this$05.m15645c4().m15203a();
                break;
            default:
                CustomRadioGroup this$06 = (CustomRadioGroup) this.f18876c;
                View child = (View) this.f18877d;
                int i2 = CustomRadioGroup.f30537c;
                Intrinsics.m32179h(this$06, "this$0");
                Intrinsics.m32179h(child, "$child");
                this$06.m16470a();
                this$06.setSelectedButtonToSelectedState((CustomRadioButton) child);
                CustomRadioGroup.OnRadioButtonListener onRadioButtonListener = this$06.f30538b;
                if (onRadioButtonListener != null) {
                    onRadioButtonListener.onClick(child);
                    break;
                }
                break;
        }
    }
}
