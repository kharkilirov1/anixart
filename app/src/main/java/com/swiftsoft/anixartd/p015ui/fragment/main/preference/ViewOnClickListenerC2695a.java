package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.preference.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2695a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f28393b;

    /* renamed from: c */
    public final /* synthetic */ Object f28394c;

    public /* synthetic */ ViewOnClickListenerC2695a(Fragment fragment, int i2) {
        this.f28393b = i2;
        this.f28394c = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28393b) {
            case 0:
                AdditionalPreferenceFragment this$0 = (AdditionalPreferenceFragment) this.f28394c;
                KProperty<Object>[] kPropertyArr = AdditionalPreferenceFragment.f28289r;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15438c4().mo15323a3();
                break;
            case 1:
                AppearancePreferenceFragment this$02 = (AppearancePreferenceFragment) this.f28394c;
                KProperty<Object>[] kPropertyArr2 = AppearancePreferenceFragment.f28297r;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.m15438c4().mo15323a3();
                break;
            case 2:
                ChangeLoginPreferenceFragment this$03 = (ChangeLoginPreferenceFragment) this.f28394c;
                KProperty<Object>[] kPropertyArr3 = ChangeLoginPreferenceFragment.f28302h;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.m15437u3().mo15323a3();
                break;
            case 3:
                DataPreferenceFragment this$04 = (DataPreferenceFragment) this.f28394c;
                KProperty<Object>[] kPropertyArr4 = DataPreferenceFragment.f28316t;
                Intrinsics.m32179h(this$04, "this$0");
                this$04.m15438c4().mo15323a3();
                break;
            case 4:
                MainPreferenceFragment this$05 = (MainPreferenceFragment) this.f28394c;
                KProperty<Object>[] kPropertyArr5 = MainPreferenceFragment.f28327r;
                Intrinsics.m32179h(this$05, "this$0");
                this$05.m15438c4().mo15323a3();
                break;
            case 5:
                NotificationsPreferenceFragment this$06 = (NotificationsPreferenceFragment) this.f28394c;
                KProperty<Object>[] kPropertyArr6 = NotificationsPreferenceFragment.f28332E;
                Intrinsics.m32179h(this$06, "this$0");
                this$06.m15438c4().mo15323a3();
                break;
            case 6:
                PlaybackPreferenceFragment this$07 = (PlaybackPreferenceFragment) this.f28394c;
                KProperty<Object>[] kPropertyArr7 = PlaybackPreferenceFragment.f28353r;
                Intrinsics.m32179h(this$07, "this$0");
                this$07.m15438c4().mo15323a3();
                break;
            case 7:
                ProfilePreferenceFragment this$08 = (ProfilePreferenceFragment) this.f28394c;
                KProperty<Object>[] kPropertyArr8 = ProfilePreferenceFragment.f28361t;
                Intrinsics.m32179h(this$08, "this$0");
                this$08.m15438c4().mo15323a3();
                break;
            default:
                ProfileReleaseNotificationPreferencesFragment this$09 = (ProfileReleaseNotificationPreferencesFragment) this.f28394c;
                KProperty<Object>[] kPropertyArr9 = ProfileReleaseNotificationPreferencesFragment.f28382i;
                Intrinsics.m32179h(this$09, "this$0");
                this$09.m15437u3().mo15323a3();
                break;
        }
    }
}
