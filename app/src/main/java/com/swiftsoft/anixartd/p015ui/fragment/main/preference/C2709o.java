package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.os.Bundle;
import androidx.preference.Preference;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.p015ui.dialog.ChoosePlayerRewindTimeDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.KodikVideoQualityFragment;
import com.yandex.div2.C3033a;
import com.yandex.metrica.YandexMetrica;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.preference.o */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2709o implements Preference.OnPreferenceClickListener, Preference.OnPreferenceChangeListener {

    /* renamed from: b */
    public final /* synthetic */ int f28431b;

    /* renamed from: c */
    public final /* synthetic */ PlaybackPreferenceFragment f28432c;

    public /* synthetic */ C2709o(PlaybackPreferenceFragment playbackPreferenceFragment, int i2) {
        this.f28431b = i2;
        this.f28432c = playbackPreferenceFragment;
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeListener
    /* renamed from: a */
    public boolean mo3394a(Preference preference, Object obj) {
        switch (this.f28431b) {
            case 2:
                PlaybackPreferenceFragment this$0 = this.f28432c;
                KProperty<Object>[] kPropertyArr = PlaybackPreferenceFragment.f28353r;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(preference, "preference");
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                Prefs prefs = this$0.m15545m4().f26543a;
                C3033a.m17749k(prefs.f25344a, "IS_REMEMBERING_TYPE_SOURCE", ((Boolean) obj).booleanValue());
                return true;
            case 3:
                PlaybackPreferenceFragment this$02 = this.f28432c;
                KProperty<Object>[] kPropertyArr2 = PlaybackPreferenceFragment.f28353r;
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32179h(preference, "preference");
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                Prefs prefs2 = this$02.m15545m4().f26543a;
                C3033a.m17749k(prefs2.f25344a, "ONLY_HORIZONTAL_ORIENTATION", ((Boolean) obj).booleanValue());
                return true;
            default:
                PlaybackPreferenceFragment this$03 = this.f28432c;
                KProperty<Object>[] kPropertyArr3 = PlaybackPreferenceFragment.f28353r;
                Intrinsics.m32179h(this$03, "this$0");
                Intrinsics.m32179h(preference, "preference");
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                Prefs prefs3 = this$03.m15545m4().f26543a;
                C3033a.m17749k(prefs3.f25344a, "AUTO_PLAY", ((Boolean) obj).booleanValue());
                return true;
        }
    }

    @Override // androidx.preference.Preference.OnPreferenceClickListener
    /* renamed from: c */
    public boolean mo3395c(Preference preference) {
        switch (this.f28431b) {
            case 0:
                PlaybackPreferenceFragment this$0 = this.f28432c;
                KProperty<Object>[] kPropertyArr = PlaybackPreferenceFragment.f28353r;
                Intrinsics.m32179h(this$0, "this$0");
                Integer valueOf = Integer.valueOf(this$0.m15545m4().f26543a.m14070m());
                ChoosePlayerRewindTimeDialogFragment choosePlayerRewindTimeDialogFragment = new ChoosePlayerRewindTimeDialogFragment();
                Bundle bundle = new Bundle();
                if (valueOf != null) {
                    bundle.putInt("SELECTED_PLAYER_REWIND_TIME", valueOf.intValue());
                }
                choosePlayerRewindTimeDialogFragment.setArguments(bundle);
                choosePlayerRewindTimeDialogFragment.show(this$0.getChildFragmentManager(), "PLAYER_REWIND_TIME_TAG");
                break;
            default:
                PlaybackPreferenceFragment this$02 = this.f28432c;
                KProperty<Object>[] kPropertyArr2 = PlaybackPreferenceFragment.f28353r;
                Intrinsics.m32179h(this$02, "this$0");
                YandexMetrica.reportEvent("Переход в раздел Качество видео Kodik");
                int m14076s = this$02.m15545m4().f26543a.m14076s();
                KodikVideoQualityFragment kodikVideoQualityFragment = new KodikVideoQualityFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("SELECTED_KODIK_VIDEO_QUALITY_VALUE", m14076s);
                kodikVideoQualityFragment.setArguments(bundle2);
                kodikVideoQualityFragment.show(this$02.getChildFragmentManager(), "KODIK_VIDEO_QUALITY_TAG");
                break;
        }
        return true;
    }
}
