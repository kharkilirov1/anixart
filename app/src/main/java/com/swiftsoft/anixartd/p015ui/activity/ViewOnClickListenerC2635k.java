package com.swiftsoft.anixartd.p015ui.activity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.p015ui.fragment.main.bookmarks.BookmarksFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.discover.DiscoverFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.home.HomeFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.NotificationsPreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.layout.ProfileMainNotificationPreferenceLayout;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.Calendar;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.activity.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2635k implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f27519b;

    /* renamed from: c */
    public final /* synthetic */ Object f27520c;

    /* renamed from: d */
    public final /* synthetic */ Object f27521d;

    /* renamed from: e */
    public final /* synthetic */ Object f27522e;

    public /* synthetic */ ViewOnClickListenerC2635k(Object obj, Object obj2, Object obj3, int i2) {
        this.f27519b = i2;
        this.f27520c = obj;
        this.f27521d = obj2;
        this.f27522e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27519b) {
            case 0:
                MainActivity this$0 = (MainActivity) this.f27520c;
                OnBottomSheet onBottomSheet = (OnBottomSheet) this.f27521d;
                BottomSheetDialog dialog = (BottomSheetDialog) this.f27522e;
                KProperty<Object>[] kPropertyArr = MainActivity.f27425n;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(onBottomSheet, "$onBottomSheet");
                Intrinsics.m32179h(dialog, "$dialog");
                this$0.m15333u4().m14314c(onBottomSheet.f30176a);
                dialog.cancel();
                return;
            case 1:
                String action = (String) this.f27520c;
                BookmarksFragment this$02 = (BookmarksFragment) this.f27521d;
                String value = (String) this.f27522e;
                KProperty<Object>[] kPropertyArr2 = BookmarksFragment.f27896i;
                Intrinsics.m32179h(action, "$action");
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32179h(value, "$value");
                view.performHapticFeedback(1);
                Integer m33910j0 = StringsKt.m33910j0(action);
                int intValue = m33910j0 != null ? m33910j0.intValue() : 0;
                if (intValue == 1) {
                    Context requireContext = this$02.requireContext();
                    Intrinsics.m32178g(requireContext, "requireContext()");
                    Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext);
                    builder.f30150b = 2;
                    builder.m16318j(C2507R.string.information);
                    builder.f30152d = value;
                    builder.m16315g(C2507R.string.close);
                    builder.f30159k = true;
                    builder.m16317i();
                    return;
                }
                if (intValue == 2) {
                    Dialogs dialogs = Dialogs.f30143a;
                    Context requireContext2 = this$02.requireContext();
                    Intrinsics.m32178g(requireContext2, "requireContext()");
                    dialogs.m16307f(requireContext2, value);
                    return;
                }
                if (intValue == 3) {
                    Long m33912l0 = StringsKt.m33912l0(value);
                    if (m33912l0 != null) {
                        this$02.m15437u3().mo15324d2(ReleaseFragment.f28714t.m15625a(m33912l0.longValue()), null);
                        return;
                    }
                    return;
                }
                if (intValue == 4) {
                    Long m33912l02 = StringsKt.m33912l0(value);
                    if (m33912l02 != null) {
                        this$02.m15437u3().mo15324d2(CollectionFragment.f27978k.m15478a(m33912l02.longValue()), null);
                        return;
                    }
                    return;
                }
                if (intValue != 5) {
                    return;
                }
                if (value.length() > 0) {
                    Common common = new Common();
                    Context requireContext3 = this$02.requireContext();
                    Intrinsics.m32178g(requireContext3, "requireContext()");
                    common.m16300e(requireContext3, value);
                    return;
                }
                return;
            case 2:
                String action2 = (String) this.f27520c;
                DiscoverFragment this$03 = (DiscoverFragment) this.f27521d;
                String value2 = (String) this.f27522e;
                KProperty<Object>[] kPropertyArr3 = DiscoverFragment.f28062g;
                Intrinsics.m32179h(action2, "$action");
                Intrinsics.m32179h(this$03, "this$0");
                Intrinsics.m32179h(value2, "$value");
                view.performHapticFeedback(1);
                Integer m33910j02 = StringsKt.m33910j0(action2);
                int intValue2 = m33910j02 != null ? m33910j02.intValue() : 0;
                if (intValue2 == 1) {
                    Context requireContext4 = this$03.requireContext();
                    Intrinsics.m32178g(requireContext4, "requireContext()");
                    Dialogs.MaterialDialog.Builder builder2 = new Dialogs.MaterialDialog.Builder(requireContext4);
                    builder2.f30150b = 2;
                    builder2.m16318j(C2507R.string.information);
                    builder2.f30152d = value2;
                    builder2.m16315g(C2507R.string.close);
                    builder2.f30159k = true;
                    builder2.m16317i();
                    return;
                }
                if (intValue2 == 2) {
                    Dialogs dialogs2 = Dialogs.f30143a;
                    Context requireContext5 = this$03.requireContext();
                    Intrinsics.m32178g(requireContext5, "requireContext()");
                    dialogs2.m16307f(requireContext5, value2);
                    return;
                }
                if (intValue2 == 3) {
                    Long m33912l03 = StringsKt.m33912l0(value2);
                    if (m33912l03 != null) {
                        this$03.m15437u3().mo15324d2(ReleaseFragment.f28714t.m15625a(m33912l03.longValue()), null);
                        return;
                    }
                    return;
                }
                if (intValue2 == 4) {
                    Long m33912l04 = StringsKt.m33912l0(value2);
                    if (m33912l04 != null) {
                        this$03.m15437u3().mo15324d2(CollectionFragment.f27978k.m15478a(m33912l04.longValue()), null);
                        return;
                    }
                    return;
                }
                if (intValue2 != 5) {
                    return;
                }
                if (value2.length() > 0) {
                    Common common2 = new Common();
                    Context requireContext6 = this$03.requireContext();
                    Intrinsics.m32178g(requireContext6, "requireContext()");
                    common2.m16300e(requireContext6, value2);
                    return;
                }
                return;
            case 3:
                String action3 = (String) this.f27520c;
                HomeFragment this$04 = (HomeFragment) this.f27521d;
                String value3 = (String) this.f27522e;
                KProperty<Object>[] kPropertyArr4 = HomeFragment.f28249k;
                Intrinsics.m32179h(action3, "$action");
                Intrinsics.m32179h(this$04, "this$0");
                Intrinsics.m32179h(value3, "$value");
                view.performHapticFeedback(1);
                Integer m33910j03 = StringsKt.m33910j0(action3);
                int intValue3 = m33910j03 != null ? m33910j03.intValue() : 0;
                if (intValue3 == 1) {
                    Context requireContext7 = this$04.requireContext();
                    Intrinsics.m32178g(requireContext7, "requireContext()");
                    Dialogs.MaterialDialog.Builder builder3 = new Dialogs.MaterialDialog.Builder(requireContext7);
                    builder3.f30150b = 2;
                    builder3.m16318j(C2507R.string.information);
                    builder3.f30152d = value3;
                    builder3.m16315g(C2507R.string.close);
                    builder3.f30159k = true;
                    builder3.m16317i();
                    return;
                }
                if (intValue3 == 2) {
                    Dialogs dialogs3 = Dialogs.f30143a;
                    Context requireContext8 = this$04.requireContext();
                    Intrinsics.m32178g(requireContext8, "requireContext()");
                    dialogs3.m16307f(requireContext8, value3);
                    return;
                }
                if (intValue3 == 3) {
                    Long m33912l05 = StringsKt.m33912l0(value3);
                    if (m33912l05 != null) {
                        this$04.m15437u3().mo15324d2(ReleaseFragment.f28714t.m15625a(m33912l05.longValue()), null);
                        return;
                    }
                    return;
                }
                if (intValue3 == 4) {
                    Long m33912l06 = StringsKt.m33912l0(value3);
                    if (m33912l06 != null) {
                        this$04.m15437u3().mo15324d2(CollectionFragment.f27978k.m15478a(m33912l06.longValue()), null);
                        return;
                    }
                    return;
                }
                if (intValue3 != 5) {
                    return;
                }
                if (value3.length() > 0) {
                    Common common3 = new Common();
                    Context requireContext9 = this$04.requireContext();
                    Intrinsics.m32178g(requireContext9, "requireContext()");
                    common3.m16300e(requireContext9, value3);
                    return;
                }
                return;
            case 4:
                NotificationsPreferenceFragment this$05 = (NotificationsPreferenceFragment) this.f27520c;
                AlertDialog dialog2 = (AlertDialog) this.f27521d;
                Context context = (Context) this.f27522e;
                KProperty<Object>[] kPropertyArr5 = NotificationsPreferenceFragment.f28332E;
                Intrinsics.m32179h(this$05, "this$0");
                Intrinsics.m32179h(dialog2, "$dialog");
                Intrinsics.m32179h(context, "$context");
                boolean[] zArr = this$05.f28344v;
                if (zArr == null) {
                    Intrinsics.m32189r("selectionProfileLists");
                    throw null;
                }
                if (!ArraysKt.m31965o(zArr, true)) {
                    Dialogs dialogs4 = Dialogs.f30143a;
                    String string = this$05.getString(C2507R.string.error);
                    Intrinsics.m32178g(string, "getString(R.string.error)");
                    String string2 = this$05.getString(C2507R.string.notifications_no_list_selected);
                    Intrinsics.m32178g(string2, "getString(R.string.notifications_no_list_selected)");
                    dialogs4.m16306c(context, string, string2, (r12 & 8) != 0 ? "Ок" : null, null);
                    return;
                }
                List<Integer> list = this$05.f28345w;
                if (list == null) {
                    Intrinsics.m32189r("profileStatusNotificationPreferences");
                    throw null;
                }
                list.clear();
                boolean[] zArr2 = this$05.f28344v;
                if (zArr2 == null) {
                    Intrinsics.m32189r("selectionProfileLists");
                    throw null;
                }
                int length = zArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    if (zArr2[i2]) {
                        List<Integer> list2 = this$05.f28345w;
                        if (list2 == null) {
                            Intrinsics.m32189r("profileStatusNotificationPreferences");
                            throw null;
                        }
                        list2.add(Integer.valueOf(i3));
                    }
                    i2++;
                    i3 = i4;
                }
                List<Integer> list3 = this$05.f28345w;
                if (list3 == null) {
                    Intrinsics.m32189r("profileStatusNotificationPreferences");
                    throw null;
                }
                int size = list3.size();
                String[] strArr = this$05.f28340r;
                if (strArr == null) {
                    Intrinsics.m32189r("profileLists");
                    throw null;
                }
                if (size == strArr.length) {
                    ProfileMainNotificationPreferenceLayout profileMainNotificationPreferenceLayout = this$05.f28347y;
                    if (profileMainNotificationPreferenceLayout == null) {
                        Intrinsics.m32189r("profileMainNotificationPreference");
                        throw null;
                    }
                    profileMainNotificationPreferenceLayout.m15553R(1);
                } else {
                    ProfileMainNotificationPreferenceLayout profileMainNotificationPreferenceLayout2 = this$05.f28347y;
                    if (profileMainNotificationPreferenceLayout2 == null) {
                        Intrinsics.m32189r("profileMainNotificationPreference");
                        throw null;
                    }
                    profileMainNotificationPreferenceLayout2.m15553R(2);
                }
                List<Integer> list4 = this$05.f28345w;
                if (list4 == null) {
                    Intrinsics.m32189r("profileStatusNotificationPreferences");
                    throw null;
                }
                this$05.m15542u4(false, list4);
                dialog2.dismiss();
                return;
            case 5:
                String action4 = (String) this.f27520c;
                ProfileFragment this$06 = (ProfileFragment) this.f27521d;
                String value4 = (String) this.f27522e;
                ProfileFragment.Companion companion = ProfileFragment.f28458k;
                Intrinsics.m32179h(action4, "$action");
                Intrinsics.m32179h(this$06, "this$0");
                Intrinsics.m32179h(value4, "$value");
                view.performHapticFeedback(1);
                Integer m33910j04 = StringsKt.m33910j0(action4);
                int intValue4 = m33910j04 != null ? m33910j04.intValue() : 0;
                if (intValue4 == 1) {
                    Context requireContext10 = this$06.requireContext();
                    Intrinsics.m32178g(requireContext10, "requireContext()");
                    Dialogs.MaterialDialog.Builder builder4 = new Dialogs.MaterialDialog.Builder(requireContext10);
                    builder4.f30150b = 2;
                    builder4.m16318j(C2507R.string.information);
                    builder4.f30152d = value4;
                    builder4.m16315g(C2507R.string.close);
                    builder4.f30159k = true;
                    builder4.m16317i();
                    return;
                }
                if (intValue4 == 2) {
                    Dialogs dialogs5 = Dialogs.f30143a;
                    Context requireContext11 = this$06.requireContext();
                    Intrinsics.m32178g(requireContext11, "requireContext()");
                    dialogs5.m16307f(requireContext11, value4);
                    return;
                }
                if (intValue4 == 3) {
                    Long m33912l07 = StringsKt.m33912l0(value4);
                    if (m33912l07 != null) {
                        this$06.m15437u3().mo15324d2(ReleaseFragment.f28714t.m15625a(m33912l07.longValue()), null);
                        return;
                    }
                    return;
                }
                if (intValue4 == 4) {
                    Long m33912l08 = StringsKt.m33912l0(value4);
                    if (m33912l08 != null) {
                        this$06.m15437u3().mo15324d2(CollectionFragment.f27978k.m15478a(m33912l08.longValue()), null);
                        return;
                    }
                    return;
                }
                if (intValue4 != 5) {
                    return;
                }
                if (value4.length() > 0) {
                    Common common4 = new Common();
                    Context requireContext12 = this$06.requireContext();
                    Intrinsics.m32178g(requireContext12, "requireContext()");
                    common4.m16300e(requireContext12, value4);
                    return;
                }
                return;
            case 6:
                Profile profile = (Profile) this.f27520c;
                ProfileFragment this$07 = (ProfileFragment) this.f27521d;
                String registerDate = (String) this.f27522e;
                ProfileFragment.Companion companion2 = ProfileFragment.f28458k;
                Intrinsics.m32179h(profile, "$profile");
                Intrinsics.m32179h(this$07, "this$0");
                Intrinsics.m32179h(registerDate, "$registerDate");
                if (profile.getLastActivityTime() != 0) {
                    AppCompatImageView isOnlineMore = (AppCompatImageView) this$07.m15560A3(C2507R.id.isOnlineMore);
                    Intrinsics.m32178g(isOnlineMore, "isOnlineMore");
                    ViewsKt.m16372e(isOnlineMore);
                    TextView onProfile$lambda$26$lambda$25 = (TextView) this$07.m15560A3(C2507R.id.regDate);
                    Intrinsics.m32178g(onProfile$lambda$26$lambda$25, "onProfile$lambda$26$lambda$25");
                    onProfile$lambda$26$lambda$25.setVisibility(0);
                    onProfile$lambda$26$lambda$25.setText("зарегистрирован(а) " + registerDate);
                    return;
                }
                return;
            default:
                EditText view2 = (EditText) this.f27520c;
                DatePickerDialog.OnDateSetListener dateSetListener = (DatePickerDialog.OnDateSetListener) this.f27521d;
                Calendar calendar = (Calendar) this.f27522e;
                Time time = Time.f30247a;
                Intrinsics.m32179h(view2, "$view");
                Intrinsics.m32179h(dateSetListener, "$dateSetListener");
                Intrinsics.m32179h(calendar, "$calendar");
                new DatePickerDialog(view2.getContext(), dateSetListener, calendar.get(1), calendar.get(2), calendar.get(5)).show();
                return;
        }
    }
}
