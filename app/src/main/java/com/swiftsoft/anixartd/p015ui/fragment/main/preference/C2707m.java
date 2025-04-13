package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import androidx.preference.Preference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.preference.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2707m implements Preference.OnPreferenceChangeListener, Preference.OnPreferenceClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f28426b;

    /* renamed from: c */
    public final /* synthetic */ NotificationsPreferenceFragment f28427c;

    public /* synthetic */ C2707m(NotificationsPreferenceFragment notificationsPreferenceFragment, int i2) {
        this.f28426b = i2;
        this.f28427c = notificationsPreferenceFragment;
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeListener
    /* renamed from: a */
    public boolean mo3394a(Preference preference, Object obj) {
        NotificationsPreferenceFragment this$0 = this.f28427c;
        KProperty<Object>[] kPropertyArr = NotificationsPreferenceFragment.f28332E;
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(preference, "preference");
        if (Intrinsics.m32174c(obj, 1)) {
            List<Integer> list = this$0.f28345w;
            if (list == null) {
                Intrinsics.m32189r("profileStatusNotificationPreferences");
                throw null;
            }
            list.clear();
            String[] strArr = this$0.f28340r;
            if (strArr == null) {
                Intrinsics.m32189r("profileLists");
                throw null;
            }
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                int i4 = i3 + 1;
                List<Integer> list2 = this$0.f28345w;
                if (list2 == null) {
                    Intrinsics.m32189r("profileStatusNotificationPreferences");
                    throw null;
                }
                list2.add(Integer.valueOf(i3));
                i2++;
                i3 = i4;
            }
            this$0.m15534m4();
            List<Integer> list3 = this$0.f28345w;
            if (list3 == null) {
                Intrinsics.m32189r("profileStatusNotificationPreferences");
                throw null;
            }
            this$0.m15542u4(false, list3);
        } else if (Intrinsics.m32174c(obj, 2)) {
            this$0.m15536o4();
        } else if (Intrinsics.m32174c(obj, 3)) {
            this$0.m15542u4(true, null);
        }
        return true;
    }

    @Override // androidx.preference.Preference.OnPreferenceClickListener
    /* renamed from: c */
    public boolean mo3395c(Preference preference) {
        switch (this.f28426b) {
            case 1:
                NotificationsPreferenceFragment this$0 = this.f28427c;
                KProperty<Object>[] kPropertyArr = NotificationsPreferenceFragment.f28332E;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.m15536o4();
                break;
            default:
                NotificationsPreferenceFragment this$02 = this.f28427c;
                KProperty<Object>[] kPropertyArr2 = NotificationsPreferenceFragment.f28332E;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.m15438c4().mo15324d2(new ProfileReleaseNotificationPreferencesFragment(), null);
                break;
        }
        return true;
    }
}
